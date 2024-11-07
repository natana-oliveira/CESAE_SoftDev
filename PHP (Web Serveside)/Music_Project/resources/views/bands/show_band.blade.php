@extends('layout.femaster')
@section('content')
<div class="container">
<div class="section_title">
  <h2 class="secondary_title">Band Details</h2>
</div>
<div class="container-form">  
  <form method="POST" action="{{route('band.show', ['id' => $band->id]) }}" enctype="multipart/form-data">
    @csrf 
    <div class="row">
      <div class="col-md-6">
        <div class="d-flex justify-content-center align-items-center">
        <div class="form-group" style="margin-bottom: 25px">
          @if($band->photo)     
          <img src="{{ asset('storage/' . $band->photo) }}" alt="Album Cover" style="max-width: 300px;">
          @endif 
        </div>
      </div>
      </div>      
      <div class="col-md-6">
        <div class="row row-form">
          <div class="form-group col-md-12">
            <label for="exampleFormControlInput1" class="form-label">Name</label>
            <input type="text"  value="{{ $band->name }}"  name="albumName" class="form-control" id="inputLine" disabled>
          </div>
        </div>
        <div class="row row-form">
          <div class="form-group col-md-6">
            <label for="exampleFormControlInput1" class="form-label">Origin</label>
            <input type="text"value="{{ $band->origin }}" name="origin" class="form-control" id="inputLine" disabled>
          </div>
          <div class="form-group col-md-6">
            <label for="exampleFormControlInput1" class="form-label">Genre</label>
            <input type="text" value="{{ $band->genre }}" name="genre" class="form-control" id="inputLine" disabled>
          </div>
        </div>
        <div class="row row-form">
          <div class="form-group col-md-6">
            <label for="exampleFormControlInput1" class="form-label">Year of formation</label>
            <input type="number" value="{{ $band->yearFormation }}" name="yearFormation" class="form-control" id="inputLine" disabled>
          </div>
          <div class="form-group col-md-6">
            <label for="exampleFormControlInput1" class="form-label">Number of albums *</label>
            <input type="number" value="{{ $band->num_albuns }}" name="num_albuns" class="form-control" id="inputLine" disabled>
          </div>
        </div>
      </div>
    </div>
    <div class="row" style="margin-top: 80px; text-align: center">
      <h2 class="secondary_title">Albums</h2>
      @if ($albuns)
        <table class="table table-bordered border-dark tabela" style="max-width: 800px; margin: auto
        ">
          <thead>
            <tr style="background-color: #2a2a2a">
              <th scope="col" class="col-1">Cover</th>
              <th scope="col" class="col-2">Name</th>
              <th scope="col" class="col-1">Release Year</th>
            </tr>
          </thead>
          <tbody>
            @foreach($albuns as $album)
            <tr class="align-middle">
              <td class="d-flex justify-content-center">
                <img src="{{ $album->cover ? asset('storage/' . $album->cover) : asset('images/uploadedImages') }}" alt="Cover Album" style="max-width: 120px; max-height: 120px; border-radius: 8px; border: #202020 solid 1px;">
              </td>
              <td style="font-weight: 600;">{{ $album->albumName}}</td>
              <td>{{ $album->dateRelease }}</td>
            </tr>
            @endforeach
          </tbody>
          @else
          <p>No albums available for this band.</p>
          @endif
        </div>
      </form>
    </div>
  </div>
@endsection