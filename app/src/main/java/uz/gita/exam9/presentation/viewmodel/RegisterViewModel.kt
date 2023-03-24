package uz.gita.example.presentation.viewmodel

import androidx.lifecycle.LiveData

interface RegisterViewModel {
    val openVerifyScreenLiveData: LiveData<Unit>
    val progressLiveData: LiveData<Boolean>

    fun register(phone:String,password:String,lastName:String,firstName:String)

}