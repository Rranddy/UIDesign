package com.task1.uidesign

data class PService (var PSName:String, var PSNRICNo: Int , var PSPolicyNo: String, var PSProcess: String){

    companion object{
        val business = ArrayList<Business>()
    }
}