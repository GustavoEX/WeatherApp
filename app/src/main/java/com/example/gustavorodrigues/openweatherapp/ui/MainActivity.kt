package com.example.gustavorodrigues.openweatherapp.ui

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.example.gustavorodrigues.openweatherapp.R
import com.example.gustavorodrigues.openweatherapp.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewAdapter: MainAdapter
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()

        setupViewModel()

//        btn_search.setOnClickListener {
//            viewModel.setLocation(
//                    et_location.text.toString()
//            )
//        }
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(this)
                .get(MainViewModel::class.java)
//        viewModel.mockData
//                .observe(this, Observer { response ->
//            if (response != null) {
//                viewAdapter.setData(response.list)
//            }
//        })
    }

    private fun setupRecyclerView() {
        viewAdapter = MainAdapter()
        recyclerview.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(DividerItemDecoration(this@MainActivity,
                    DividerItemDecoration.VERTICAL))
            adapter = viewAdapter
        }
    }
}
