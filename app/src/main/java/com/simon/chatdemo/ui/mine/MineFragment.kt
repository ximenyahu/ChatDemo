package com.simon.chatdemo.ui.mine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.simon.chatdemo.databinding.FragmentMineBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MineFragment : Fragment() {

    lateinit var binding: FragmentMineBinding

    val viewModel: MineViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMineBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}