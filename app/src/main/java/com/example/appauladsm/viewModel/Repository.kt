package com.example.appauladsm.viewModel

import com.example.appauladsm.roomDB.Pessoa
import com.example.appauladsm.roomDB.PessoaDataBase

class Repository(private val db: PessoaDataBase) {
    suspend fun upsertPessoa(pessoa: Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)
    }

    fun getAllPessoa(): List<Pessoa> {
        return db.pessoaDao().getAllPessoa()
    }
}