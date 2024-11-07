@extends('layout.femaster')
@section('content')
@auth
<div class="container" > 
  <div class="animation">
    <div class="music">
    <div class="bar"></div>
    <div class="bar"></div>
    <div class="bar"></div>
    <div class="bar"></div>
    <div class="bar"></div>
    <div class="bar"></div>
    <div class="bar"></div>
    <div class="bar"></div>
    <div class="bar"></div>
    <div class="bar"></div>
  </div>
  </div> 
  <div class="id-dashboard">
    @auth
    @if (Auth::user()->userType == 1)
    <p>Bem vindo, Administrador!</p>
    @endif
    @endauth
  </div>
  <div class="row row-cols-1 row-cols-md-2 g-4">
    <div class="col d-flex justify-content-center">
      <a class="card-link" href="{{ route('bands.all') }}">      {{-- name nas rotas --}}
        <div class="card text-bg-dark text-center align-middle" style="padding: 0; max-width: 450px">
          <img src="{{ asset('images/music-band1.png') }}" class="card-img-top" alt="">
          <div class="overlay"></div>
          <div class="card-img-overlay d-flex flex-column justify-content-center"> 
            <h5 class="card-title" style="font-size: 52px; font-weight: 600;">BANDS</h5>
          </div>
        </div>
      </a>
    </div>
    <div class="col d-flex justify-content-center">
      <a class="card-link" href="{{ route('album.all') }}">      {{-- name nas rotas --}}
        <div class="card text-bg-dark text-center align-middle" style="padding: 0; max-width: 450px">
          <img src="{{ asset('images/vinyl-record2.jpg') }}" class="card-img-top" alt="">
          <div class="overlay"></div>
          <div class="card-img-overlay d-flex flex-column justify-content-center">
            <h5 class="card-title" style="font-size: 52px; font-weight: 600;">ALBUNS</h5>
          </div>
        </div>
      </a>
    </div>
  </div>
</div>
@endauth
@endsection

