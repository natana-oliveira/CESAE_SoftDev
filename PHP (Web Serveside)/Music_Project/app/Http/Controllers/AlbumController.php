<?php

namespace App\Http\Controllers;

use App\Models\Band;
use App\Models\Albun;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Storage;

class AlbumController extends Controller
{
    private function getAlbuns() //Pegar os albuns da base de dados
    {
        $albuns = DB::table('albuns')
            ->join('bands', 'bands_id', '=', 'bands.id')
            ->select('albuns.*', 'bands.name as band_name')
            ->distinct()
            ->get();

        return $albuns;
    }
    public function allAlbuns() //Lista todos os albuns
    {
        $albuns = $this->getAlbuns();
        return view('albuns.all_albuns', compact('albuns'));  //caminho da pasta e nome da view
    }

    public function addAlbum() //Retorna a view para add um album
    {
        $bands = DB::table('bands')
            ->select('bands.id as bands_id', 'bands.name as band_name')
            ->distinct()
            ->get();

        return view('albuns.add_album', compact('bands'));
    }

    public function createAlbum(Request $request)  //Adicionar um album
    {
        $bands = Band::all();

        $request->validate([
            'albumName' => 'required|string|max:50',
            'dateRelease' => 'required|integer|digits:4',
            'bands_id' => 'required|exists:bands,id',
        ]);

        $cover = null;
        if ($request->has('cover')) {
            $cover = Storage::putFile('uploadedImages', $request->cover); //adicionar a imagem na pasta "uploadedImages"
        }

        Albun::insert([
            'albumName' => $request->albumName,
            'cover' => $cover,
            'dateRelease' => $request->dateRelease,
            'bands_id' => $request->bands_id,
        ]);

        foreach ($bands as $myBand) {
            $myBand->num_albuns = Albun::where('bands_id', $myBand->id)->count();
            $myBand->save(); // Salvar as atualizações
        }

        return redirect()->route('album.all')->with('message', 'New album successfully created!');  //utiliza o name(rota)
    }

    public function viewAlbum($id)  //Ver um album pelo id
    {
        $bands = DB::table('bands')->get();
        $album = DB::table('albuns')
            ->where('albuns.id', $id)
            ->join('bands', 'bands_id', '=', 'bands.id')
            ->select('albuns.*', 'bands.name as band_name', )
            ->distinct()
            ->first();
        return view('albuns.view_albun', compact('album', 'bands'));  //utiliza o nome da pasta da view onde está
    }

    public function updateAlbum(Request $request)  //Atualizar album (na aba view)
    {
        $request->validate([
            'albumName' => 'required|string|max:50',
            'dateRelease' => 'required|integer|digits:4',
            'bands_id' => 'required|exists:bands,id',
        ]);

        $album = Albun::findOrFail($request->id);

        // $cover = null;
        if ($request->hasFile('cover')) {
            $cover = Storage::putFile('uploadedImages', $request->file('cover')); //adicionar a imagem na pasta "uploadedImages"
        } else {
            $cover = $album->cover;
        }

        Albun::where('id', $request->id)
            ->update([
                'albumName' => $request->albumName,
                'cover' => $cover,
                'dateRelease' => $request->dateRelease,
                'bands_id' => $request->bands_id,
            ]);

        return redirect()->route('album.all')->with('message', 'Update completed successfully!');  //utiliza o name(rota)
    }

    public function deleteAlbum($id)  //deletar album pelo id
    {
        DB::table('albuns')
            ->where('id', ($id))
            ->delete();
        return back()->with('message', 'Album deleted successfully!');
    }

    public function showAlbum($id)
    {
        $album = Albun::find($id);
        $bands = DB::table('bands')
            ->select('id', 'name')
            ->distinct()
            ->get();

        return view('albuns.show_album', compact('album', 'bands'));
    }


}
