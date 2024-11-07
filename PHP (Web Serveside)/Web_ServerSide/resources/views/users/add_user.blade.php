@extends('layout.femaster')
@section('content')

<br>
<br>
   <h2>Adicionar Utilizadores</h2>
   <br>
<div class="container">
      <form method="POST" action="{{route('user.create')}}">
        @csrf   {{-- um helper de validação do Laravel. antes do código receber dados funciona como barreira     --}}
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="texto" value="{{old('name')}}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required> 
             {{-- na função acedo pelo name. Name attribute não tem que ser necessariamente igual ao nome da coluna na tabela 
                    este atributo vai ser usado por uma função para popular a BD    
                    * name serve para mandar pro backend com esse nome
                    * value
            --}}

            @error('name')   {{-- se tiver um erro no email --}}
            <div class="alert alert-danger">
                O nome que inseriu é invalido.  
            </div> {{-- apresenta essa mensagem --}} 
            @enderror {{-- fechar erro --}}
          </div>
         

             <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input type="email" value="{{old('email')}}" name="email" class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" required>
            @error('email')   {{-- se tiver um erro no email --}}
            <div> O mail que inseriu já está registado</div>  {{-- apresenta essa mensagem --}}
            @enderror
          </div>
          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Password</label>
            <input type="password" name="password"  class="form-control" id="exampleFormControlInput1" placeholder="Password" required>
          </div>
          <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>
    <a class="btn btn-success" href="{{route('home.index')}}">Voltar</a>  {{-- não ter type="submit" é só nos botões--}}
    <br>
    <br>
    </div>

@endsection
