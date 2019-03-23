package arysugiarto10.crudfire.ankokotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import org.jetbrains.anko.*
import arysugiarto10.crudfire.ankokotlin.R.color.colorAccent
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)
    }

    class MainActivityUI : AnkoComponent<MainActivity>{
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui)  {
            verticalLayout{
                padding = dip(16)

                val name = editText{
                    hint = "Who is your name?"
                }
                button("Say Hello"){
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE

                    onClick { toast("Hello, ${name.text}") }
                }
            }
        }

    }
}
