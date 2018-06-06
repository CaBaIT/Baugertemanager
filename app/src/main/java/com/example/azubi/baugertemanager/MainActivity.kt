package com.example.azubi.baugertemanager

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_übersicht -> {
                message.setText(R.string.title_übersicht)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_ausgang -> {
                message.setText(R.string.title_ausgang)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_eingang -> {
                message.setText(R.string.title_eingang)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
