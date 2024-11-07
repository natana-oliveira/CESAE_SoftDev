@extends('layout.femaster')
@section('content')

<br>
<br>
   <h2>Ver / Atualizar Tarefa {{$myTask->name}}</h2>
   <br>

<form method="POST" action="{{route('tasks.update')}}">
    @csrf   {{-- um helper de validação do Laravel. antes do código receber dados funciona como barreira     --}}
    <input type="hidden" name="id" value="{{ $myTask->id }}" id="">    {{-- value="{{ $myTask->id }}" carrega o o nome que já tinha --}}
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Tarefa</label>
        <input type="texto" value="{{ $myTask -> name}}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>    
            {{-- value="{{ $myTask->name }}" carrega o o nome que já tinha --}}   
        @error('name')  
        <div class="alert alert-danger">
            A tarefa que inseriu é invalida.  
        </div> 
        @enderror 
      </div>     
      <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Descrição</label>
        <input value="{{ $myTask->description }}" type="text" name="description" class="form-control"
            id="exampleFormControlInput1">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Usuário</label>
        <select name="user_id" id="">
            <option value="" selected> Seleccione um User</option>
            @foreach ($users as $user)  {{-- carrega a lista de todos osutilizadores --}}
                <option  @if($user->id == $myTask->user_id) 
                    selected @endif value="{{ $user->id }}">
                    {{ $user->name }}                  
                </option>
  {{-- onde a id do user for igual ao id que está atribuido a tarefa --}}
            @endforeach
        </select>
        </div>
        <button type="submit" class="btn btn-primary">Actualizar</button>
    </form>
    <br>
    <a class= "btn btn-success" href="{{ route('tasks.all') }}">Voltar</a>
    <br>
    <br>
    </div>
@endsection