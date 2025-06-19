package za.co.varsitycollege.st10484918.practicumexam1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } //ST10484918 JOSHUA LIAM AMOS IMAD5112//
    }

    // Creating and declearing variables for the app//
    val TextView = findViewById<TextView>(R.id.TextView)
    val Button1 = findViewById<Button>(R.id.Button1)
    val Button2 = findViewById<Button>(R.id.button2)
    val Button3 = findViewById<Button>(R.id.button3)
    val EditText = findViewById<EditText>(R.id.EditText)
    val TextView2 = findViewById<TextView>(R.id.TextView2)
    val Button4
        get() = findViewById<Button>(R.id.button4)

            //setOnClicklistener


            .layout
            .text
            .run() {
                val int = null
                val show = Toast.makeText(int, "Add Playlist", Toast.LENGTH_SHORT).show()
                val nameofplaylist = EditText.text.toString().trim()


                //when statements//
                when (nameofplaylist) {
                    "The song title" -> {
                        "Millions"
                    }

                    "The artist's name" -> {
                        "Young Thug"
                    }

                    "The rating(1-5)" -> {
                        4
                    }

                    "User comments" -> {
                        "Rap"
                    }

                    else -> {
                        "Please insert the given information"
                    }
                }
                when (nameofplaylist) {
                    "The song title" -> {
                        "Bad Blood"
                    }

                    "The artist's name" -> {
                        "Taylor Swift"
                    }

                    "The rating" -> {
                        1
                    }

                    "User comments" -> {
                        "Dance Song"
                    }

                    else -> {
                        "Please insert the given information"
                    }
                }
                when (nameofplaylist) {
                    "The song title" -> "Clouded"
                    "The artist's name" -> "Brent Faiyaz"
                    "The rating" -> 2
                    "User comments" -> "Best love song"
                    else -> "Please insert the given information"
                }
                when (nameofplaylist) {
                    "The song title" -> "Memories"
                    "The artist's name" -> "Maroon 5"
                    "The rating" -> 3
                    "User comments" -> "Song of memories that were lost"
                    else -> "please enter the given information"
                }
                Button2.setOnClickListener {
                    val int = null
                    Toast.makeText(int, "Navigate to next screen", Toast.LENGTH_SHORT).show()
                    val nameofplaylist = EditText.text.clear()
                }
                Button3.setOnClickListener {
                    val int = null
                    Toast.makeText(int, "Exit the app", Toast.LENGTH_SHORT).show()
                    val nameofplaylist = EditText.text.clear()
                }

                //Reset button setonclicker
                Button3.setOnClickListener {
                    //    var feedback = Answer1.text.toString().trim()
                    EditText.text.clear()
                    TextView2.text = "Reset App"
                }
            }
}


















