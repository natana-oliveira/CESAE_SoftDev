@extends('layout.femaster')
@section('content')


<br><br>
    <h2>Todas as tarefas:</h2>
    <br>

    @if (session('message')) {{-- se tiver uma mensagem na sessão--}}
    <div class="alert alert-success">
        {{session('message')}}
    </div>
    @endif

    <table class="table">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Nome</th>
                <th scope="col">Descrição</th>
                <th scope="col">Data</th>
                <th scope="col">Estado</th>
                <th scope="col">Nome</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($tasks as $item)
                <tr>
                    <td scope="row">{{ $item->id }}</td>
                    <td>{{ $item->name }}</td>
                    <td>{{ $item->description }}</td>
                    <td>{{ $item->due_at }}</td>
                    <td>{{ $item->status }}</td>
                    <td>{{ $item->usname }}</td>
                    <td><a class="btn btn-info" href="{{route('tasks.view',$item->id)}}" >Ver / Actualizar</a></td>  
                    <td><a href="{{ route('tasks.delete', $item->id) }}" class="btn btn-danger">Delete</a></td>      
                </tr>
            @endforeach
        </tbody>
    </table>
@endsection

