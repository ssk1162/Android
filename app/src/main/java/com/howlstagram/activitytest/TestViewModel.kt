package com.howlstagram.activitytest

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel (application: Application) : AndroidViewModel(application) {

    var aa : MutableLiveData<Boolean> = MutableLiveData(false)

}