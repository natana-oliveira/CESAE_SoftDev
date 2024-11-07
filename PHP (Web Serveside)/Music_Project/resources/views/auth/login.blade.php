@extends('layout.femaster')
 @section('content')

 <div class="container">
  <div class="section_title d-flex justify-content-center">
    <h1 class="secondary_title">Login</h1>
  </div>
  <div class="form-login d-flex justify-content-center" style="margin-top: 50px">
    <form method="POST" action="{{ route('login') }}">
      @csrf
      <div class="mb-3" style="min-width: 350px">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
      </div>
      <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password</label>
        <input name="password" type="password" class="form-control" id="exampleInputPassword1">
      </div>
      <button type="submit" class="btn btn-primary-purple" style="margin-bottom: 50px ">Submit</button>
      <div class="forgot-pass">
        <a href="{{route('password.request')}}">Forgot you password?</a>
      </div>
    </form>
  </div>
</div>
@endsection
