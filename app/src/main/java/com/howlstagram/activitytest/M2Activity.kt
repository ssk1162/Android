package com.howlstagram.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.howlstagram.activitytest.databinding.ActivityMain2Binding

class M2Activity : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

        lateinit var testViewModel : TestViewModel
//    var testViewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        testViewModel = ViewModelProvider(this)[TestViewModel::class.java]

        binding.viewModel = testViewModel

        binding.activity = this
        binding.lifecycleOwner = this

        onSet()

        Log.d("onCreate", "onCreate")
    }

    fun onSet() {
        testViewModel.aa.observe(this) {
            if(it) {
                startActivity(Intent(this, M3Activity::class.java))
            }
        }
    }

    fun aaaa() {
        testViewModel.aa.value = true
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("onRestart", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "onDestroy")
    }

}