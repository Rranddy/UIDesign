package com.task1.uidesign

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

        val adapter = BAdapter(this, Business.business)
        recyclerView.adapter = adapter

        Business.business.add(Business("Chan Ching Lok","123456789874","A12546"))
        Business.business.add(Business("Chan Ching Lok","123456789874","A12546"))
        Business.business.add(Business("Chan Ching Lok","123456789874","A12546"))
    }
}
