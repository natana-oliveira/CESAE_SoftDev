@extends('layout.femaster')
@section('content')

<div class="container">
  <div class="section_title d-flex justify-content-center">
    <h1 class="secondary_title">Register</h1>
  </div>
  
    <div class="form-login d-flex justify-content-center" style="margin-top: 50px">
      <form method="POST" action="{{ route('user.create') }}">
        @csrf
        <div class="form-group col-md-6" style="min-width: 350px">
          <label for="exampleFormControlInput1" class="form-label">Name *</label>
          <input type="text" name="name" class="form-control" id="inputLine" required>
          @error('name')
          <div class="alert alert-danger">
              Invalid name
          </div> 
          @enderror
        </div>
        <div class="form-group" style="margin-top: 15px">
          <label for="exampleFormControlInput1" class="form-label">Email*</label>
          <input type="email" name="email" class="form-control" id="inputLine" required>
          @error('email')  
          <div class="alert alert-danger">
              Invalid email
          </div> 
          @enderror
        </div>
        <div class="form-group" style="margin-top: 15px">
          <label for="exampleFormControlInput1" class="form-label">Password *</label>
          <input type="password" name="password" class="form-control" id="inputLine" required>
          @error('password')  
          <div class="alert alert-danger">
              Invalid password
          </div> 
          @enderror
        </div>       
        <div style="margin-top: 25px">
          <button type="submit" class="btn btn-primary-purple" style="margin-bottom: 50px ">Register</button>
        </div>
      </form>
    </div>
    
</div>
@endsection