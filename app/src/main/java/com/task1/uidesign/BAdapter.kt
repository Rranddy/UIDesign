package com.task1.uidesign

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.business_list.view.*

class BAdapter (val context: Context, val business:List<Business>):RecyclerView.Adapter<BAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder{
        val view = LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int{
        return business.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int){
        val name = business[position]
        val NRICNo = business[position]
        val PolicyNo = business[position]
        holder.setData(name,NRICNo,PolicyNo,position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentBusiness:Business? = null
        var currentBNRICNo:Business? = null
        var currentBPolicyNo:Business? = null
        var currentBPosition: Int = 0

        fun setData(name:Business?,NRICNo: Business, PolicyNo: Business, Position:Int){
            itemView.BName.text=name!!.BName
            itemView.BNRICNo.text=NRICNo!!.BNRICNo
            itemView.BPolicyNo.text=PolicyNo!!.BPolicyNo

            this.currentBusiness=name
            this.currentBNRICNo=NRICNo
            this.currentBPolicyNo=PolicyNo
            this.currentBPosition=Position
        }
    }

}
