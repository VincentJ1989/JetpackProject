package com.vincentj.jetpackproject.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.vincentj.jetpackproject.R
import kotlinx.android.synthetic.main.fragment_nav_main.*

class NavMainFragment : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nav_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        nav_home_btn.setOnClickListener(this)
        nav_found_btn.setOnClickListener(this)
        nav_mine_btn.setOnClickListener(this)
    }

    override fun onClick(pView: View?) {
        when (pView!!.id) {
            R.id.nav_home_btn -> navController.navigate(R.id.action_navMainFragment_to_navHomeFragment)
            R.id.nav_found_btn -> navController.navigate(R.id.action_navMainFragment_to_navFoundFragment)
            R.id.nav_mine_btn -> navController.navigate(R.id.action_navMainFragment_to_navMineFragment)
        }
    }
}
