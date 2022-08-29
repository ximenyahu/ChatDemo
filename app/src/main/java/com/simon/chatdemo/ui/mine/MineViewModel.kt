package com.simon.chatdemo.ui.mine

import android.content.Context
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class MineViewModel @Inject constructor(@ApplicationContext appContext: Context) : ViewModel() {


}