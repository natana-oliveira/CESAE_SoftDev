@extends('layout.femaster')

@section('content')

<br>
<br>
   <h2>Ver / Atualizar dados {{$myUser->name}}</h2>
   <br>

<form method="POST" action="{{route('users.update')}}">
    @csrf   {{-- um helper de validação do Laravel. antes do código receber dados funciona como barreira     --}}
    <input type="hidden" name="id" value="{{ $myUser ->id}}" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>  
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Nome</label>
        <input type="texto" value="{{ $myUser ->name}}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>       
        @error('name')  
        <div class="alert alert-danger">
            O nome que inseriu é invalido.  
        </div> 
        @enderror 
      </div>     
         <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Email</label>
        <input disabled type="email" value="{{  $myUser->email }}" name="email" class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" required>
        @error('email')   {{-- se tiver um erro no email --}}
        <div> O mail que inseriu já está registado</div>  {{-- apresenta essa mensagem --}}
        @enderror
      </div>

      <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Morada</label>
        <input value="{{ $myUser->address }}" type="text" name="address" class="form-control" id="exampleFormControlInput1">
        @error('address')   
        <div> Inválido</div>  
        @enderror
      </div>

      <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Telefone</label>
        <input value="{{ $myUser->phone }}" type="text" name="phone" class="form-control" id="exampleFormControlInput1">
        @error('phone')   
        <div> Inválido</div> 
        @enderror
      </div>


      <button type="submit" class="btn btn-primary">Actualizar</button>
</form>
@endsection