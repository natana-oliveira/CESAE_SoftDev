@extends('layout.femaster')
@section('content')

<br><br>

    <h2>Todos os utilizadores:</h2>
    <br>

    {{-- <p>{$hello</p>
    <p>$helloAgain</p>
    <p>$daysOfWeek[2]</p>
    <p>{{ $info['name'] }}</p>
    <p>{{ $info['modules'][0] }}</p> --}}


 {{-- *** FILTRO *** --}}
    <form method="GET">  {{-- tem que ser get --}}
       <input type="text" value="" name="search" id=""> 
       <button class="btn btn-info" type="submit">Procurar</button>
    </form>
    
   

    @if (session('message')) {{-- se tiver uma mensagem na sessão--}}
    <div class="alert alert-success">
        {{session('message')}}
    </div>
    @endif
<br><br>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Nome</th>
                <th scope="col">Morada</th>
                <th scope="col">Telefone</th>
                <th scope="col">Email</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($users as $user)
                <tr>
                    <td scope="row">{{ $user->id }}</td>
                    <td>{{ $user->name }}</td>
                    <td>{{ $user->address}}</td>
                    <td>{{ $user->phone }}</td>
                    <td>{{ $user->email }}</td>


                    <td><a href="{{route('users.view',$user->id)}}" class="btn btn-info">Ver / Actualizar</a></td>
                    <td><a href="{{ route('users.delete', $user->id) }}" class="btn btn-danger">Delete</a></td>     
                    
                    
                </tr>
            @endforeach
        </tbody>
    </table>
@endsection