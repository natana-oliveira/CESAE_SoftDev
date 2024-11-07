<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration {
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::table('users', function (Blueprint $table) {
            $table->integer('user_typer')->after('name')->nullable();
            //por boa pratica devia ser default(0) ao inves de nullable para não dar erro nos outros
        });
    }

    // O MIGRATE CORRE AQUI

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {

        // O ROLLBACK CORRE AQUI

        Schema::table('users', function (Blueprint $table) {
            $table->dropColumn('user_type');
        });
    }
};
