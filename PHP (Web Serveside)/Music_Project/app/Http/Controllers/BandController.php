<?php

namespace App\Http\Controllers;

use App\Models\Band;
use App\Models\Albun;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Storage;

class BandController extends Controller
{
    private function getBands() //Pegar as bandas da base de dados
    {
        $band = DB::table('bands')->get();
        return $band;
    }

    public function allBands() //Lista todas as bandas
    {
        $band = $this->getBands();

        // Associar a contagem dos albuns a banda (por default = 0)
        foreach ($band as $myBand) {
            $myBand->num_albuns = Albun::where('bands_id', $myBand->id)->count();
        }

        return view('bands.all_bands', compact('band')); //caminho da pasta e nome da view
    }

    public function addBand() //Retorna a view para add uma banda
    {
        $band = DB::table('bands')->get();
        return view('bands.add_band', compact('band'));
    }

    public function createBand(Request $request)  //Adicionar uma banda
    {
        $request->validate([
            'name' => 'required|string|max:50',
            'origin' => 'required|string|max:50',
            'genre' => 'required|string|max:50',
            'yearFormation' => 'required|digits:4',
        ]);

        $photo = null;
        if ($request->has('photo')) {
            $photo = Storage::putFile('uploadedImages', $request->photo); //adicionar a imagem na pasta "uploadedImages"
        }

        Band::insert([
            'name' => $request->name,
            'origin' => $request->origin,
            'genre' => $request->genre,
            'photo' => $photo,
            'yearFormation' => $request->yearFormation,
        ]);
        return redirect()->route('bands.all')->with('message', 'New band successfully created!');   //utiliza o name(rota)
    }

    public function viewBand($id)  //Ver uma banda pelo id
    {
        $band = DB::table('bands')
            ->where('id', $id)
            ->first();
        return view('bands.view_band', compact('band'));
    }

    public function updateBand(Request $request)  //Atualizar banda (na aba view)
    {
        $request->validate([
            'name' => 'required|string|max:50',
            'origin' => 'required|string|max:50',
            'genre' => 'required|string|max:50',
            'yearFormation' => 'required|digits:4',
        ]);

        $band = Band::findOrFail($request->id);

        if ($request->hasFile('photo')) {
            $photo = Storage::putFile('uploadedImages', $request->file('photo')); //adicionar a imagem na pasta "uploadedImages"
        } else {
            $photo = $band->photo;
        }

        Band::where('id', $request->id)
            ->update([
                'name' => $request->name,
                'origin' => $request->origin,
                'genre' => $request->genre,
                'photo' => $photo,
                'yearFormation' => $request->yearFormation,
            ]);
        return redirect()->route('bands.all')->with('message', 'Update completed successfully!');
    }

    public function deleteBand($id)  //deletar uma banda pelo id
    {
        DB::table('bands')
            ->where('id', ($id))
            ->delete();
        return back()->with('message', 'Band deleted successfully!');
    }

    public function showBand($id)
    {
        $band = Band::findOrFail($id);
        $albuns = Albun::where('bands_id', $band->id)->get(); //mostrar a lisat de albuns

        // dd($albuns);
        return view('bands.show_band', compact('band', 'albuns'));
    }


}
