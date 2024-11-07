<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{
    public function allUsers(){
         $hello = 'Finalmente vamos para código';
         $helloAgain = 'cucu';

         $daysOfWeek = $this->getWeekDays();
         $info = $this->info();

    //    $users = $this->getContacts(); // função acessoria
    

    // filtro que vem do que colocamos no FrontEnd
    $search = request()->query('search') ? request()->query('search') : null;
    // define a variável $search e faz uma validação se no meu pedido encontrar atribui ao search esse valor se não o valor fica a nulo
    // Essa linha é um ternário (simplificação) da função abaixo
     
	//   $search = ''; 
    //   if(request()->query('search'){
    //         $search = request()->query('search');
    //   }else{
    //         $search = null;
    //   }

    // objeto que carregamos na tabela do F.End
    $users = DB::table('users');

    if($search) { // se tiver um search
        $users = $users // adiciona a querie o where
        -> where('name', 'like', "%{$search}%") //atenção que deve ser aspas no search
        -> orWhere('email', 'like', "%{$search}%"); 
    }

    $users = $users->get();


      //  dd($users);
      
        return view('users.all_user', compact(
            'hello',
            'helloAgain',
            'daysOfWeek',
            'info',
            'users'
        ));
    }

    public function viewUser($id){ //pego no id que clica e busca na base de dados o user

        $myUser = DB::table('users')
        ->where('id', $id)
        ->first();

        return view('users.view', compact('myUser'));
    }

    public function deleteUser($id) {

        Db::table('tasks')
        ->where('user_id', ($id))
        ->delete();

        Db::table('users')
        ->where('id', ($id))
        ->delete();

        return back();
    }

    public function addUser(){

        DB::table('users')
        ->updateOrInsert(
            [
                'email'=> 'Lais@gmail.com',
            ],
            [
                'name'=> 'Lais',
                'password'=> 'sarateste',
                'updated_at' => now(),
                'created_at' => now(),
        ]);


        $users = Db::table('users')
        ->get();

        $myUser = DB::table('users')
        ->where('password', '12345')
        ->first();

        // dd($myUser);

       return view('users.add_user');
    }

    public function createUser(Request $request){
       //   $request->all(); //traz toda a informação do pedido
      //   $request->email; //traz o input com o name email
      

      $request->validate([
        'name' => 'required|string|max:90',
        'email' => 'required|unique:users',       
    ]);

        User::insert([
        'name' => $request->name,  // lado esquerdo é a coluna no SQL e lado direito é a variavel
        'email' =>$request->email,
        'password'=> Hash::make($request->password), //o hash encripta a password  
    ]);

    return redirect()->route('users.all')->with('message', 'Boa, estamos a caminho de ter uma super app com utilizadores adicionados!');   //Quando inserir volta para a tabela de todos os utilizadores e volta com uma mensagem
}


public function updateUser(Request $request){

    //dd($request->all());
     $request->validate([
         'phone' => 'min:9|max:15',   
     ]);

    User::where('id', $request->id)
    ->update([
        'name' => $request->name,
        'address' => $request->address,
        'phone' => $request->phone,
    ]);  

    return redirect()->route('users.all')->with('message', 'Utilizador actualizado');  
}


    private function getWeekDays(){

        $daysofWeek = ['Segunda', 'Terça', 'Quarta', 'Quinta'];

        return $daysofWeek;
    }

    private function info(){

        $courseInfo = [
            'name' => 'Software Developer',
            'year' => 2024,
            'modules' => ['PHP', 'WebServices', 'Java'],
            ['Teste', 4, 'Sofia', 'João']
        ];

        return  $courseInfo;
    }

    private function getContacts(){
        // $users = [
        //     ['id'=>1, 'name'=>'Sara', 'phone'=>'91222222', 'email'=> 'sara@gmail.com'],
        //     ['id'=>2, 'name'=>'Joaquim','phone'=> '91222222',  'email'=>'Joaquim@gmail.com'],
        //     ['id'=>3, 'name'=>'Helder','phone'=> '91222222',  'email'=>'Helder@gmail.com'],
        //     ['id'=>4, 'name'=>'Bruno', 'phone'=>'91222222',  'email'=>'Bruno@gmail.com'],
        // ];

        $users = DB::table('users')
       // -> whereNull('updated_at')
        -> get();

       // $users = User::get();

        $adminType = User::TYPE_ADMIN;

        return $users;

    }
}