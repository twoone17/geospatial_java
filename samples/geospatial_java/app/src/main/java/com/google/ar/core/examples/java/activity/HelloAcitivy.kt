package com.google.ar.core.examples.java.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.google.ar.core.examples.java.geospatial.R
import kotlinx.android.synthetic.main.activity_hello.*

class HelloActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

//        var button = findViewById<Button>(R.id.btnHello) extension으로 이 코드를 안써도 된다
        btnHello.setOnClickListener()
        {
            Toast.makeText(this, "토스트 메시지", Toast.LENGTH_SHORT).show()



        }

        //내용 작성하기
    }
}