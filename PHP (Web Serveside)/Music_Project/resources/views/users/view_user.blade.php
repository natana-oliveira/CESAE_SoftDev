@extends('layout.femaster')
@section('content')

<div class="container">
  <div class="section_title d-flex justify-content-center">
    <h1 class="secondary_title">Edit User</h1>
  </div>  
    <div class="form-login d-flex justify-content-center" style="margin-top: 50px">
      <form method="POST" action="{{ route('user.update') }}">
        @csrf
        <input type="hidden" name="id" value="{{ $user->id }}" id=""> 
        <div class="form-group col-md-6" style="min-width: 350px">
          <label for="exampleFormControlInput1" class="form-label">Name *</label>
          <input type="text" value="{{ $user -> name}}" name="name" class="form-control" id="inputLine" required>
          @error('name')
          <div class="alert alert-danger">
              Invalid name
          </div> 
          @enderror
        </div>
        <div class="form-group" style="margin-top: 15px">
          <label for="exampleFormControlInput1" class="form-label">User type*</label>
          <input type="number" value="{{ $user -> userType}}" name="userType" class="form-control" id="inputLine" required>
          <div class="row" style="margin-top: 20px">
            <p>0 - Registrado</p>
            <p>1 - Administrador</p>
          </div>@error('userType')  
          <div class="alert alert-danger">
              Invalid user type
          </div> 
          @enderror
        </div>            
        <div style="margin-top: 20px">
          <button type="submit" class="btn btn-primary-purple" style="margin-bottom: 50px ">Update</button>
        </div>
      </form>
    </div>
    
</div>
@endsection