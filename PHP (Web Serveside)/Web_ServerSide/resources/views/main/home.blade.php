{{-- apaga tudo pra cima --}}
@extends('layout.femaster') {{-- essa secção extende do layout master --}}
@section('content')     {{-- aplicar a secção com mesmo nome criada no layout master --}}

   {{-- <h3>Hello. World, estamos nas Views.</h3> --}}
  <br>
  
  @auth
   <h3>Olá, {{ Auth::user ()->name}}</h3>          
   @endauth

   <br>
<h5> Tens disponiveis estes links:</h5>
<br>
<ul>
    <li><a href="{{route("bemvindos")}}">Vai pra casa!</a></li>
    <li><a href="{{route("users.all")}}">Todos os Utilizadores</a></li>
    <li><a href="{{route("users.add")}}">Adicionar Utilizador</a></li>
    <li><a href="{{route("tasks.all")}}">Todas as Tarefas</a></li>
</ul>

{{-- <h5>Dados do CESAE: </h5>
<p>Nome: {{$cesaeInfo['name']}}</p>
<p>Morada: {{$cesaeInfo['address']}}</p>
<p>E-mail: {{$cesaeInfo['email']}}</p> --}}



@endsection {{-- fechar a secção do layout master --}}

