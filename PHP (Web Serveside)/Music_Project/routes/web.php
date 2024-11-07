<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\BandController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\AlbumController;
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

//main view HOME
// Route::get('/', [IndexController::class, 'index'])->name('home.index');
Route::get('/', function () {
  return view('main.home');
})->name('home');


// ---------- DASHBOARD ADMIN ----------
Route::get('/home', [DashboardController::class, 'index'])->name('dashboard.view')->middleware(); // para autenticar os users

// --------------- BANDAS ---------------
Route::get('/bands/all', [BandController::class, 'allBands'])->name('bands.all');
Route::get('/bands/view{id}', [BandController::class, 'viewBand'])->name('band.view');
Route::get('/bands/addBand', [BandController::class, 'addBand'])->name('band.add');
Route::post('/bands/createBand', [BandController::class, 'createBand'])->name('band.create');
Route::post('/bands/update/{id}', [BandController::class, 'updateBand'])->name('band.update');
Route::get('/bands/delete/{id}', [BandController::class, 'deleteBand'])->name('band.delete');
Route::get('/bands/{id}', [BandController::class, 'showBand'])->name('band.show');

// --------------- ALBUNS ---------------
Route::get('/albuns/all', [AlbumController::class, 'allAlbuns'])->name('album.all');
Route::get('/albuns/view{id}', [AlbumController::class, 'viewAlbum'])->name('album.view');
Route::get('/albuns/addBand', [AlbumController::class, 'addAlbum'])->name('album.add');
Route::post('/albuns/createBand', [AlbumController::class, 'createAlbum'])->name('album.create');
Route::post('/albuns/update/{id}', [AlbumController::class, 'updateAlbum'])->name('album.update');
Route::get('/albuns/delete/{id}', [AlbumController::class, 'deleteAlbum'])->name('album.delete');
Route::get('/albums/{id}', [AlbumController::class, 'showAlbum'])->name('album.show');


// --------------- USERS ---------------
Route::get('/users/all', [UserController::class, 'allUsers'])->name('user.all')->middleware();
Route::get('/users/add', [UserController::class, 'addUser'])->name('user.add')->middleware();
Route::post('/users/create', [UserController::class, 'createUser'])->name('user.create')->middleware();
Route::post('/users/update', [UserController::class, 'updateUser'])->name('user.update')->middleware();
Route::get('/users/view/{id}', [UserController::class, 'viewUser'])->name('user.view')->middleware();
Route::get('/users/delete/{id}', [UserController::class, 'deleteUser'])->name('user.delete')->middleware();


///CRIAR
// Route::fallback(function () {
//     return view("main.fallback"); //não é preciso criar name para fallback porque ela é sempre chamado quando a pagina não é encontrada
// });
