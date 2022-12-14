package com.example.convidados

class GuestRepository private constructor(){

    // Singleton
    companion object {
        private lateinit var repository: GuestRepository

        fun getIntance(): GuestRepository {
            if (!::repository.isInitialized) {
                repository = GuestRepository()
            }
            return repository
        }
    }

}