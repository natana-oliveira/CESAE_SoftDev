<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class DashboardController extends Controller
{

  // public function __constructor() {
  //  $this->middleware("auth");      
  // }  só é preciso se não usarmos o middleware na rota. Escolher um dos dois para utilizar

  public function index()
  {

    //$isAdmin = null;
    $isAdmin = Auth::user()->user_type == User::TYPE_ADMIN ? true : false;
    // criar a variavel se é admin / gestor ...
    //se a condição se verificar é admin

    $message = null;

    if ($isAdmin) {
      $message = "Olá, és administrador";
    }

    return view('backoffice.view_backoffice', compact('message'));
  }


}
