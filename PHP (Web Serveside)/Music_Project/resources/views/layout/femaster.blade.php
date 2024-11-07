<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous" defer></script>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

  <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Fragment+Mono:ital@0;1&family=Inter:wght@100..900&display=swap" rel="stylesheet">
  
  <link rel="stylesheet" href="{{asset('css/style.css')}}">

  <title>Music HeartBeats</title>
</head>
<nav class="navbar navbar-expand-lg" style="background-color: transparent)">
  <div class="container-fluid">
    <a class="logo" href="{{route('home')}}"><img src="{{ asset('images/HeartBeatsLogo.png') }}" width="30%" alt=""></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        @auth
        <li class="nav-item">
            <a class="nav-link" href="{{ route('dashboard.view') }}">Dashboard</a>
        </li>
        @if (Auth::user()->userType == 1)
        <li class="nav-item">
            <a class="nav-link" href="{{ route('user.all') }}">Users</a>
        </li>
        @endif
        @endauth
        <li class="nav-item">
          <a class="nav-link" href="{{ route('bands.all') }}">Bands</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="{{ route('album.all') }}">Albuns</a>
        </li>         
      </ul>
      <div>
        @if (Route::has('login'))
        <ul class="navbar-nav">
          @auth
          <div style="color: #7144d8; font-size: 18px; margin-right:25px"><i class="bi bi-music-note-list"></i> Hi, {{ Auth::user ()->name}}! </div>
          <form action="{{ route('logout') }}" method="POST">
            @csrf
            <button type="submit" class="btn btn-nav">Logout</button>
          </form>
          @else
          <li class="nav-item">
            <a class="btn-link" href="{{ route('login') }}" ><i class="bi bi-person"></i> Login</a>    {{-- usa o metodo da rota --}}
          </li>
          <li class="nav-item">
            {{-- @if (Route::has('users.add')) --}}
            <a class="btn-link"  href="{{ route('user.add') }}"><i class="bi bi-person-add"></i> Register</a>
            {{-- @endif --}}
         </li>
         @endauth
        </ul>
        @endif
      </div>
      {{-- <form class="d-flex" role="search">
        <input class="form-control search mb-0" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success btn-search" type="submit"><i class="bi bi-search"></i></button>
      </form> --}}
    </div>
  </div>
</nav>
<body style="background-color: rgb(7, 7, 7)">  
    @yield('content')
</body>
</html>