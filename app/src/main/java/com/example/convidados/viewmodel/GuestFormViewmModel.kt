package com.example.convidados

import androidx.lifecycle.ViewModel

class GuestFormViewmModel : ViewModel() {

    private val repository = GuestRepository.getIntance()
}