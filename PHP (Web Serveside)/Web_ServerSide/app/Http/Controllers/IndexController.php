<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;


class IndexController extends Controller
{
    public function index(){

        $cesaeInfo = $this->getCesaeInfo();

        return view('main.home', compact('cesaeInfo'));
    }

    private function getCesaeInfo(){
        $cesaeInfo = [
            'name'=> 'Cesae',
            'address' => 'Rua Ciríaco Cardoso 186, 4150-212 Porto',
            'email'=> 'cesae@cesae.pt'
        ];

        return $cesaeInfo;
    }

}

