package com.sls.exambro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sls.exambro.data.Screens
import com.sls.exambro.presentation.screens.HomeScreen
import com.sls.exambro.presentation.screens.LoginScreen
import com.sls.exambro.presentation.widget.BottomNavigationBar
import com.sls.exambro.ui.theme.ExambroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExambroTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screens.Main.route,
                ) {
                    composable(Screens.Login.route) {
                        LoginScreen()
                    }
                    composable(Screens.Main.route) {
                        BottomNavigationBar(navController = navController)
                    }
                }

            }
        }
    }
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
    ExambroTheme {
        Greeting("Android")
    }
}