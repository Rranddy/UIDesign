package com.task1.uidesign

data class Business (var BName:String, var BNRICNo: Int , var BPolicyNo: String){

        companion object{
            val business = ArrayList<Business>()
    }
}