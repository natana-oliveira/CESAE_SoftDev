<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\DashboardController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
})->name('bemvindos');

Route::get('/home', [IndexController::class, 'index'])->name('home.index');


Route::get('/ola', function () {  //nome do frontEnd
    return '<h1>Hello Turma de Software</h1>'; //nome da view
})->name('home.hello'); // caminho para chamar a rota


Route::get('/hello/{nome}', function ($nome) {
    return '<h1>Hello Turma de Software</h1>' . $nome;
});

// rotas de user
Route::get('/users/add', [UserController::class, 'addUser'])->name('users.add');
Route::post('/user/create', [UserController::class, 'createUser'])->name('user.create');
// precisa dos dois (get e post) porque antes de mandar os dados é preciso buscar a view para apresentar
// cada pedido é uma ação, precisamos de duas ações ver e enviar dados
Route::post('/users/update', [UserController::class, 'updateUser'])->name('users.update');

Route::get('/users/all', [UserController::class, 'allUsers'])->name('users.all');
Route::get('/users/view/{id}', [UserController::class, 'viewUser'])->name('users.view');
Route::get('/users/delete/{id}', [UserController::class, 'deleteUser'])->name('users.delete');


//rotas de tasks
Route::get('/tasks/all', [TaskController::class, 'allTasks'])->name('tasks.all');
//primeiro é o nome do frontEnd // segundo é o nome da função que chama view // caminho que chama a rota
Route::get('/tasks/view/{id}', [TaskController::class, 'viewTask'])->name('tasks.view');
Route::get('/tasks/delete/{id}', [TaskController::class, 'deleteTask'])->name('tasks.delete');
Route::get('tasks/add', [TaskController::class, 'addTask'])->name('tasks.add'); // visualizar a view
Route::post('tasks/create', [TaskController::class, 'createTask'])->name('tasks.create'); // enviar os dados
Route::post('/tasks/update', [TaskController::class, 'updateTask'])->name('tasks.update');

//rotas de backoffice
Route::get('/backoffice', [DashboardController::class, 'index'])->name('backoffice.view')->middleware('auth'); // para autenticar os users
//Costuma ser ...class, 'index'... porque é a pagina principal
//DashboardController::class, 'backOfficeView'


Route::fallback(function () {
    return view("main.fallback"); //não é preciso criar name para fallback porque ela é sempre chamado quando a pagina não é encontrada
});
