@extends('layout.femaster')
@section('content')

<br>
<br>
<h2>Adicionar tarefa</h2>
<br>
<div class="container">
    <form method="POST" action="{{ route('tasks.create') }}">
        @csrf  {{-- Token para impedir o sql injection --}}
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Tarefa</label>
            <input type="texto" value="{{ old('name') }}" name="name" class="form-control"
                id="exampleFormControlInput1" placeholder="Nome" required>
            @error('name')
                <div class="alert alert-danger">
                    Tarefa inválida
                </div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Descrição</label>
            <input value="{{ old('description') }}" type="text" name="description" class="form-control"
                id="exampleFormControlInput1">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Usuário</label>
          {{-- <input type="number" name="user_id" id=""> 
          @error('user_id')  
          <div class="alert alert-danger">
              Não pode atribuir tarefa a esse usuário!
          </div>
      @enderror --}}
          <select type="number" name="user_id" id=""> 
            {{-- select é um input que dá uma lista de "coisas" no caso de users--}}
              @foreach ($users as $user)             
                  <option value="{{ $user->id }}">
                      {{ $user->name }} </option>
                {{-- para cada um dos utilizadores no valor manda o id e no option busca o nome --}}       
              @endforeach
            </select>
          </div>
          <button type="submit" class="btn btn-primary">Enviar</button>
      </form>
      <br>
      <a class= "btn btn-success" href="{{ route('tasks.all') }}">Voltar</a>
      <br>
      <br>
      </div>
@endsection