@extends('layout.femaster')
@section('content')
<div class="container">
  <div class="section_title">
  <h2 class="secondary_title">New band</h2>
</div>
<div class="container-form">  
<form method="POST" action="{{route('band.create')}}" enctype="multipart/form-data">
  @csrf 
  <div class="row row-form">
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Name *</label>
      <input type="text" name="name" class="form-control" id="inputLine" required>
      @error('name')
      <div class="alert alert-danger">
          Invalid name
      </div> 
      @enderror
    </div>
      <div class="form-group col-md-6">
        <label for="photo" style="padding-bottom: 5px">Band photo *</label>
        <input accept="image/*" type="file" name="photo" class="form-control" id="photo" required>
      </div>
    </div>
  <div class="row row-form">
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Origin *</label>
      <input type="text" name="origin" class="form-control" id="inputLine" required>
      @error('origin')  
      <div class="alert alert-danger">
          Invalid origin
      </div> 
      @enderror
    </div>
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Genre *</label>
      <input type="text" name="genre" class="form-control" id="inputLine" required>
      @error('genre')  
      <div class="alert alert-danger">
          Invalid genre
      </div> 
      @enderror
    </div>
  </div>
  <div class="row row-form">
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Year of formation *</label>
      <input type="number" name="yearFormation" class="form-control" id="inputLine" required>
      @error('yearFormation')  
      <div class="alert alert-danger">
          Invalid year
      </div> 
      @enderror
    </div>
  </div>
  <div class="d-flex justify-content-end confirmation-button">
  <button type="submit" class="btn btn-primary-purple">Save</button>
</div>
</form>
</div>
</div>
@endsection