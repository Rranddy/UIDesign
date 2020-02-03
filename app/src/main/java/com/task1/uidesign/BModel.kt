package com.task1.uidesign

data class Business (var BName:String, var BNRICNo: String , var BPolicyNo: String){

    companion object{
        val business = ArrayList<Business>()
    }
}