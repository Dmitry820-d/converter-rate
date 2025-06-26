package com.example.currencyconverter.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.currencyconverter.ui.theme.GreenBackgroundLight
import com.example.currencyconverter.ui.utils.Screen
import com.example.currencyconverter.ui.viewmodel.MainViewModel

/**
 * @author d.borodin
 */

@Composable
fun MainScreen(viewModel: MainViewModel){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column {
            Box(
                modifier = Modifier.weight(0.12f).background(GreenBackgroundLight)
            ){
                TopBar(viewModel)
            }
            Box(
                modifier = Modifier.weight(0.88f)
            ){
                when(viewModel.stateCurrentScreen.value) {
                    Screen.RATE -> { RateScreen(viewModel) }
                    Screen.CHANGE -> { ChangeScreen(viewModel) }
                    Screen.TRANSACTION -> { TransactionScreen(viewModel) }
                }
            }
        }
    }
}