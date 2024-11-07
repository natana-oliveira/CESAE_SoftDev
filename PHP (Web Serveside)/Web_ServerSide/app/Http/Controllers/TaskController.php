<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TaskController extends Controller
{

    public function allTasks(){

        $tasks = $this->getTasks();

      //  dd($tasks);

        return view('/tasks.all_tasks', compact ('tasks'));
    }


    public function viewTask($id){ // entra no viewTask

        $myTask = DB::table('tasks') 
        ->where('tasks.id', $id)
        ->join('users', 'user_id','=','users.id')
        ->select('tasks.*', 'users.name as usname')
        ->first();

        $users= DB::table('users')->get(); // querie que vai buscar todos os usuários

        return view('tasks.view_task', compact ('myTask','users'));  // retorna uma view (com compact da task)
        //depois construir a view
    }

    public function addTask(){
        $users = DB::table('users')->get(); // essa querie vai buscar todos os usuários

        return view('tasks.add_task', compact ('users'));
    }

    public function createTask(Request $request){  // importar request (pagar dados e enviar pra base de dados)
        $request->validate([ // é prerciso validar os dados
            'name' => 'required|string|max:50', 
            'description' => 'string|max:200',
            'user_id' => 'required|integer|exists:users,id' // o usuário tem que existir na tabela
            //integer é inteiro(número)
        ]);

        Task::insert([
            'name' => $request->name,
            'description' => $request->description,
            'user_id' => $request->user_id,
        ]);  
        
        return redirect()->route('tasks.all')->with('message', 'Boa, acabou de adicionar uma tarefa!');   
            //Quando inserir os dados retorna para a tabela de todas as tarefas e volta com uma mensagem
    }

    public function deleteTask($id) { //recebemos um id
        DB::table('tasks')  //querie
        ->where('id', ($id))
        ->delete();

        return back();
    }

    public function updateTask(Request $request){

        $request->validate([
            'name' => 'required|string|max:30',    
            'description' => 'string|max:200',
            'user_id' => 'required|integer|exists:users,id'  
        ]);

        Task::where('id', $request->id)
        ->update([
            'name' => $request->name,
            'description' => $request->description,
            'user_id' => $request->user_id,
        ]);

        return redirect()->route('tasks.all')->with('message', 'Tarefa actualizada');

    }

    
    public function getTasks(){        
        $tasks = DB::table('tasks')
        ->join('users', 'user_id', '=', 'users.id')
        ->select('tasks.*', 'users.name as usname')        
        -> get();

        return $tasks;
    }

}