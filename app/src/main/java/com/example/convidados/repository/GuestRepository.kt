package com.example.convidados.repository

class GuestRepository private constructor(){

    // Singleton
    companion object {
        private lateinit var repository: GuestRepository

        fun getIntance(): GuestRepository {
            if (!Companion::repository.isInitialized) {
                repository = GuestRepository()
            }
            return repository
        }
    }

    fun save() {

    }

}