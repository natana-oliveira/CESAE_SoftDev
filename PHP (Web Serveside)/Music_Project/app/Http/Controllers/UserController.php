<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{

    public function getAllUsers()
    {
        $allUsers = User::all();
        return $allUsers;
    }

    public function allUsers()
    {
        $users = $this->getAllUsers();
        return view('users.all_user', compact('users'));  //retornar view de todos os utilizadores
    }

    public function viewUser($id)
    {
        $user = DB::table('users')
            ->where('users.id', $id)
            ->first();
        return view('users.view_user', compact('user'));
    }

    public function addUser()
    {
        $users = Db::table('users')->get();
        return view('users.add_user', compact('users'));
    }

    public function createUser(Request $request)
    {
        $request->validate([
            'name' => 'required|string|max:90',
            'email' => 'required|unique:users',
        ]);

        User::insert([
            'name' => $request->name,
            'email' => $request->email,
            'password' => Hash::make($request->password),
        ]);

        return redirect()->route('home')->with('message', 'User successfully added!');
    }

    public function updateUser(Request $request)
    {
        $request->validate([
            'name' => 'required|string|max:90',
            'userType' => 'required|integer|max:2',
        ]);

        User::where('id', $request->id)
            ->update([
                'name' => $request->name,
                'userType' => $request->userType,
            ]);

        return redirect()->route('user.all')->with('message', 'Update completed successfully!');
    }


    public function deleteUser($id)
    {
        Db::table('users')
            ->where('id', ($id))
            ->delete();
        return back()->with('message', 'User deleted successfully!');
    }

}
