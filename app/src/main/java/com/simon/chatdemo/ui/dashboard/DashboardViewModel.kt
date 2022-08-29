package com.simon.chatdemo.ui.dashboard

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(@ApplicationContext appContext: Context) :
    ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "工作台"
    }
    val text: LiveData<String> = _text
}