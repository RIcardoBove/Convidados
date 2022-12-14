package com.example.convidados.viewmodel

import androidx.lifecycle.ViewModel
import com.example.convidados.repository.GuestRepository

class GuestFormViewmModel : ViewModel() {

    private val repository = GuestRepository.getIntance()
}