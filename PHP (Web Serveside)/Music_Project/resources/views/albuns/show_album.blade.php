@extends('layout.femaster')
@section('content')
<div class="container">
  <div class="section_title">
    <h2 class="secondary_title">Album Details</h2>
  </div>
  <div class="container-form">
    <form method="POST" action="{{route('album.show', ['id' => $album->id]) }}" enctype="multipart/form-data">
      @csrf 
      <div class="row">
        <div class="col-md-6">
          <div class="d-flex justify-content-center align-items-center">
            <div class="form-group" style="margin-bottom: 25px">
              @if($album->cover)
              <img src="{{ asset('storage/' . $album->cover) }}" alt="Album Cover" style="max-width: 300px;">
              @endif
            </div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="row row-form">
            <div class="form-group col-md-12">
              <label for="exampleFormControlInput1" class="form-label">Name</label>
              <input type="text"  value="{{ $album->albumName }}"  name="albumName" class="form-control" id="inputLine" disabled>
            </div>
          </div>
          <div class="row row-form">
            <div class="form-group col-md-12">
              <label for="exampleFormControlInput1" class="form-label">Band</label>
              <select id="inputLine" name="bands_id" class="form-control" disabled>
                <option selected>Select...</option>
                @foreach ($bands as $band)
                <option value="{{ $band->id }}" @if($band->id == $album->bands_id) selected @endif>{{ $band->name }} </option>
                @endforeach
              </select>
            </div>
          </div>
          <div class="row row-form">
            <div class="form-group col-md-12">
              <label for="exampleFormControlInput1" class="form-label">Release Year</label>
              <input type="number" value="{{ $album->dateRelease }}" name="dateRelease" class="form-control" id="inputLine" disabled>
            </div>
          </div>
        </div>
      </div>
    </form>
  </div>
</div>
@endsection