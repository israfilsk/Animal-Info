package com.example.animalname

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animal_info.*
import kotlinx.android.synthetic.main.animal_ticket.*

class AnimalInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_info)


        val bundle:Bundle = intent.extras

        val name = bundle.getString("name")
        val des = bundle.getString("des")
        val image = bundle.getInt("image")

        imageView2.setImageResource(image)
        textView.text = name
        textView3.text = des

    }
}
