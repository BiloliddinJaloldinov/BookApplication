package uz.gita.exam9.data.remote.request

data class RegisterRequest (
        val phone:String,
        val password:String,
        val lastName:String,
        val firstName:String,
)