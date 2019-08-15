package com.vincentj.jetpackproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.vincentj.jetpackproject.livedata.LiveDataActivity
import com.vincentj.jetpackproject.nav.NavigationActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        main_nav_btn.setOnClickListener(this)
        main_livedata_btn.setOnClickListener(this)
    }

    override fun onClick(pView: View?) {
        when (pView!!.id) {
            // 跳转Navigation
            R.id.main_nav_btn -> startActivity(Intent(this, NavigationActivity::class.java))
            // 跳转LiveData
            R.id.main_livedata_btn -> startActivity(Intent(this, LiveDataActivity::class.java))
        }
    }
}
