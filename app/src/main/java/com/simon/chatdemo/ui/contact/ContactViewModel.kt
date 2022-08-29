package com.simon.chatdemo.ui.contact

import android.content.Context
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class ContactViewModel @Inject constructor(@ApplicationContext appContext: Context) : ViewModel() {


}