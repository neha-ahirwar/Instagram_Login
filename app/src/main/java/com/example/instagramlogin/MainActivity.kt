package com.example.instagramlogin
//20BCT0335 NEHA AHIRWAR
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramlogin.ui.theme.InstagramLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LogIn()
                }
            }
        }
    }
}
//from android studio
// from github
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogIn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp)
    ) {
        Image(painterResource(id = R.drawable.instagram), contentDescription = "")

        Text(
            text = "Sign up to see photos and videos from your friends",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )


        Button(
            onClick = {},
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painterResource(id = R.drawable.face),
                contentDescription = "Cart button icon",
                modifier = Modifier.size(20.dp)
            )

            Text(
                text = "Log in with facebook",
                Modifier.padding(start = 10.dp),
                color = Color.White
            )
        }


        Column() {
            Text(
                text = "OR",
                Modifier.padding(start = 170.dp),
                fontWeight = FontWeight.Bold
            )
        }


        Column() {
            var text by remember { mutableStateOf(TextFieldValue("")) }
            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                placeholder = { Text(text = "Mobile number or email address") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(4.dp))

            var text1 by remember { mutableStateOf(TextFieldValue("")) }
            TextField(
                value = text1,
                onValueChange = {
                    text1 = it
                },
                placeholder = { Text(text = "Full Name") }, modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(4.dp))
            var text2 by remember { mutableStateOf(TextFieldValue("")) }
            TextField(
                value = text2,
                onValueChange = {
                    text2 = it
                },
                placeholder = { Text(text = "Username") }, modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(4.dp))
            var text3 by remember { mutableStateOf(TextFieldValue("")) }
            TextField(
                value = text3,
                onValueChange = {
                    text3 = it
                },
                placeholder = { Text(text = "Password") }, modifier = Modifier.fillMaxWidth()
            )
        }

        Text(text = "People who use our service may have uploaded")


        Row() {
            Text(
                text = "your contact information tp Instgram.",
                Modifier.padding(start = 20.dp),
                color = Color.Black
            )
            Text(text = "Learn", color= Color.Blue)
        }
        Text(
            text = "more",
            Modifier.padding(start = 150.dp),
            color = Color.Blue
        )


        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Text(text = "By signing up, you agree tp our")
            Text(text = "Terms, Privacy", color= Color.Blue)
        }
        Row() {
            Text(
                text = "Policy",
                Modifier.padding(start = 80.dp),
                color = Color.Blue
            )
            Spacer(modifier = Modifier.width(2.dp))
            Text(text = "and")
            Spacer(modifier = Modifier.width(2.dp))
            Text(text = "Cookies Policy", color= Color.Blue)
        }
        Button(
            onClick = {
                //your onclick code
            },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.fillMaxWidth()
        )

        {
            Text(text = "Sign Up", color = Color.White)
        }

        Row() {

            Text(
                text = "Have an account?",
                Modifier.padding(start = 90.dp),
                color = Color.Black
            )
            //Text(text = "Have an account?", color = Color.Black,Modifier.padding(start = 30.dp))
            Text(text = "Log in ", color = Color.Blue)
        }


    }

}
