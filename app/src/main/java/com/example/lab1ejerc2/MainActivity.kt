package com.example.lab1ejerc2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1ejerc2.ui.theme.Lab1Ejerc2Theme
import com.example.lab1ejerc2.ui.theme.Team

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1Ejerc2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val team = Team.MERCEDES

                   printTeamDetails(team)

                    Greeting("Android")
                }
            }
        }
    }
}

private fun printTeamDetails(team: Team){


 


    val message = when (team) {
        Team.MERCEDES -> "Mercedes is a dominant team in Formula 1."
        Team.REDBULLRACING -> "Red Bull is known for its strong performance."
        Team.FERRARI -> "Ferrari has a rich history in Formula 1."
        else -> {}
    }
    Log.d("LAB 2","Message: $message")


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab1Ejerc2Theme {
        Greeting("Android")
    }
}