package com.task1.uidesign

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = BAdapter(this,Business.business)
        recyclerView.adapter = adapter
        PSNum.setTextColor(Color.parseColor("#40FF0000"))

        PSNum.setOnClickListener{
            val adapter = PSAdapter(this, PService.policyService)
            recyclerView.adapter = adapter
            PSNum.setTextColor(Color.parseColor("#FF0000"))
            NBNum.setTextColor(Color.parseColor("#40FF0000"))
        }

        NBNum.setOnClickListener{
            val adapter = BAdapter(this,Business.business)
            recyclerView.adapter = adapter
            NBNum.setTextColor(Color.parseColor("#FF0000"))
            PSNum.setTextColor(Color.parseColor("#40FF0000"))
        }
        Business.business.add(Business("Chan Ching Lok","123456789874","A12546"))
        Business.business.add(Business("Chan Ching Lok","123456789874","A12546"))
        Business.business.add(Business("Chan Ching Lok","123456789874","A12546"))

        PService.policyService.add(PService("ching chong ling","123456789874","PS123456","deposit withdrawal"))
        PService.policyService.add(PService("ching chong ling","123456789874","PS123456","deposit withdrawal"))
        PService.policyService.add(PService("ching chong ling","123456789874","PS123456","deposit withdrawal"))
    }
}
