package com.vincentj.jetpackproject.nav


import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.vincentj.jetpackproject.R
import kotlinx.android.synthetic.main.fragment_nav_found.*
import java.math.BigDecimal

class NavFoundFragment : Fragment() {
    private lateinit var navController: NavController
    private lateinit var message: String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nav_found, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        initView()
    }

    private fun initView() {
        nav_found_input_et.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(pEt: Editable?) {
                message = pEt!!.toString()
            }
        })
        // set click biz
        nav_found_send_btn.setOnClickListener {
            if (!TextUtils.isEmpty(nav_found_input_et.text.toString())) {
                // 演示传参数(简单的参数+对象参数)
                val money = Money(BigDecimal(666))
                val bundle = bundleOf(
                    "message" to message,
                    "money" to money
                )

                navController.navigate(R.id.action_navFoundFragment_to_navFoundDetailFragment, bundle)
            } else {
                Toast.makeText(activity, "enter an amount", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
