@extends('layout.femaster')
@section('content')

<div class="container">
  <div class="section_title">
    <h1 class="primary_title">USERS</h1>
    <a class="btn btn-primary-purple" href="{{ route('user.add') }}">Add user</a>
  </div>

<div class="table-contas">
  @if (session('message')) 
<div class="alert alert-dark">
  {{session('message')}}
</div>
@endif
  <table class="table table-bordered border-dark tabela">
    <thead>
      <tr style="background-color: #2a2a2a">
        <th scope="col" class="col-4">Name</th>
        <th scope="col" class="col-4">Email</th>
        <th scope="col" class="col-1">User Type</th>
        @auth
        <th scope="col" class="col-1">Options</th>
        @endauth
      </tr>
    </thead>
    <tbody>
      @foreach ($users as $iten)    
      <tr class="align-middle">        
        <td style="font-weight: 600;">{{ $iten->name}}</td>
        <td>{{ $iten->email}}</td>
        {{-- <td>{{ $iten->userType}}</td> --}}
        <td>
          @if($iten->userType === App\Models\User::TYPE_ADMIN)
          Administrador
          @elseif($iten->userType === App\Models\User::TYPE_REGIST)
          Registrado
          @endif
        </td>
        @auth
        @if (Auth::user()->userType == 1)
        <td class="align-middle">
          <div class="d-flex justify-content-center">
            <a href="{{route('user.view', $iten->id)}}"><i class="bi bi-pencil" style="padding-right: 25px; color: #989898"></i></a>            
            <a href="{{route('user.delete', $iten->id)}}"><i class="bi bi-trash3" style="padding-right: 5px; color: #989898"></i></a>
          </div>          
        </td>
        @endif
        @endauth
        </tr>
      @endforeach
    </tbody>
  </table>
</div>
@endsection