package com.vincentj.jetpackproject.livedata

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.vincentj.jetpackproject.R
import com.vincentj.jetpackproject.livedata.adapter.RecyclerAdapter
import com.vincentj.jetpackproject.livedata.model.NicePlace
import com.vincentj.jetpackproject.livedata.viewmodel.LiveDataViewModel
import kotlinx.android.synthetic.main.activity_live_data.*

/**
 * MVVM+LiveData
 */
class LiveDataActivity : AppCompatActivity() {

    private lateinit var mAdapter: RecyclerAdapter
    private lateinit var liveDataViewModel: LiveDataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        initView()
    }

    private fun initView() {
        initViewModel()
        initRecyclerView()
        initFab()
    }

    private fun initViewModel() {
        liveDataViewModel = ViewModelProviders.of(this).get(LiveDataViewModel::class.java)
        liveDataViewModel.init()
        liveDataViewModel.nicePlaces.observe(this, Observer {
            mAdapter.notifyDataSetChanged()
        })

        liveDataViewModel.isUpdating.observe(this, Observer {
            if (it) {
                livedata_pb.visibility = View.VISIBLE
            } else {
                livedata_pb.visibility = View.GONE
                livedata_rv.scrollToPosition(liveDataViewModel.nicePlaces.value!!.size - 1)
            }
        })
    }

    private fun initRecyclerView() {
        mAdapter = RecyclerAdapter(this, liveDataViewModel.nicePlaces.value)
        livedata_rv.layoutManager = LinearLayoutManager(this)
        livedata_rv.adapter = mAdapter
    }

    private fun initFab() {
        livedata_fab.setOnClickListener {
            liveDataViewModel.addNewPlace(
                NicePlace(
                    "New",
                    "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565884113599&di=2b87e3a5d58995f55d0596b56336948b&imgtype=0&src=http%3A%2F%2Fpic44.nipic.com%2F20140718%2F3647151_075825568827_2.jpg"
                )
            )
        }
    }
}
