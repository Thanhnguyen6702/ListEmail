package com.example.email

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rycview: RecyclerView = findViewById(R.id.rycview)
        rycview.layoutManager = LinearLayoutManager(this)
        val thanh = email("Thành Nguyễn","Xin chào tất cả các bạn mình là Thành đây hôm nay làm cho các bạn cái này","7:58 am")
        val huy = email("Huy Nguyễn","Xin chào tất cả các bạn mình là Huy đây .Mình là bạn của Thành :))","10:20 am")
        val vang = email("Vang Nguyễn","Xin chào tất cả các bạn mình là Vang đây .Mình là bạn của Huy và Thành :))","11:25 am")
        var listEmail: MutableList<email> = mutableListOf()
        listEmail.add(thanh)
        listEmail.add(huy)
        listEmail.add(vang)
        val adapter = AdapterEmail(listEmail)
        rycview.adapter = adapter

    }
}