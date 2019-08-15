package com.vincentj.jetpackproject.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vincentj.jetpackproject.R
import kotlinx.android.synthetic.main.fragment_nav_found_detail.*

class NavFoundDetailFragment : Fragment() {

    private lateinit var message: String
    private lateinit var money: Money

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        message = arguments!!.getString("message")
        money = arguments!!.getParcelable("money")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nav_found_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        nav_found_detail_tv.text = "$message:${money.amount}"
    }
}
