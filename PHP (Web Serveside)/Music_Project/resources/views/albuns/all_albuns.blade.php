@extends('layout.femaster')
@section('content')

<div class="container">
  <div class="section_title ">
    <h1 class="primary_title">ALBUNS</h1>
    @auth
    @if (Auth::user()->userType == 1)
    <a class="btn btn-primary-purple" href="{{ route('album.add') }}">New album</a>
    @endif
    @endauth
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
            <th scope="col" class="col-1">Cover</th>
            <th scope="col" class="col-2">Name</th>
            <th scope="col" class="col-2">Release Year</th>
            <th scope="col" class="col-2">Band</th>
            <th scope="col" class="col-1">Options</th>
          </tr>
        </thead>
        <tbody>
          @foreach ($albuns as $iten)
          <tr class="align-middle">
            <td class="d-flex justify-content-center">
              <img src="{{ $iten->cover ? asset('storage/' . $iten->cover) : asset('images/uploadedImages') }}" alt="Cover Album" style="max-width: 120px; max-height: 120px; border-radius: 8px; border: #202020 solid 1px;">
            </td>
            <td style="font-weight: 600;">{{ $iten->albumName}}</td>
            <td>{{ $iten->dateRelease }}</td>
            <td>{{ $iten->band_name }}</td>        
            <td class="align-middle">
              <div class="d-flex justify-content-center">
                <a class="icons-option"  href="{{route('album.show', $iten->id)}}"><i class="bi bi-eye" style="padding-right: 25px; font-size: 25px; color: #989898"></i></a>
                @auth
                <a class="icons-option"  href="{{route('album.view', $iten->id)}}"><i class="bi bi-pencil" style="padding-right: 25px; font-size: 20px; color: #989898"></i></a>
                @if (Auth::user()->userType == 1)
                <a class="icons-option"  href="{{route('album.delete', $iten->id)}}"><i class="bi bi-trash3" style="padding-right: 5px; font-size: 20px; color: #989898"></i></a>
                @endif
                @endauth
              </div>
            </td>
          </tr>
          @endforeach
        </tbody>
      </table>
    </div>
  </div>
@endsection