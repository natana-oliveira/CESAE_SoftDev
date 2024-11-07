@extends('layout.femaster')
@section('content')

<br>
<h3>Olá, {{ Auth::user ()->name}}</h3>  {{-- aparece o nome do usuário --}}


@auth  {{-- quando o user for autenticado --}}
 {{-- @if(Auth::user()->user_typer == 1) --}}
  {{-- e for do tipo 1 (ADM - definido na base de dados) --}}
{{-- @endif  --}} 
{{-- Pode fazer no front end ou no back end --}}

@if ($message)
<div class="alert alert-success">
  <h4>Boa, és admin desta app.</h4>
</div>
@endif 
@endauth 

, está no BackOffice 
@endsection