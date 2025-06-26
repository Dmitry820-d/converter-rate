package com.example.currencyconverter.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.fragment.app.FragmentActivity
import com.example.currencyconverter.ui.composable.MainScreen
import com.example.currencyconverter.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author d.borodin
 */

@AndroidEntryPoint
class MainActivity : FragmentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen(mainViewModel)
        }
    }
}
















