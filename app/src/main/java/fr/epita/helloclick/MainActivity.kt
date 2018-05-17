package fr.epita.helloclick

import android.gesture.Gesture
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var cpt: Int = 0
    var If_Increas: Int = 0
    var increasment_size: Int = 1


    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    val toast = Toast.makeText( this@MainActivity,
            "you increase counter + 1 !",
            Toast.LENGTH_SHORT)
    //class MyCustomGestureClass(val name: String?) : Gesture(), View.OnClickListener {

    //}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CLICK_ME.setOnClickListener(this@MainActivity)

    }


    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.CLICK_ME -> {
                    Log.d("MainActivity", "Click me button was clicked !")
                    if (If_Increas == 0) {
                        cpt += increasment_size
                    }
                    else {
                        cpt -= increasment_size
                    }
                    toast.show()
                }
                R.id.RESET -> {
                    Log.d("MainActivity", "Reset button was clicked !")
                    cpt = 0
                }
                R.id.REVERSE -> {
                    Log.d("MainActivity", "reverse button was clicked !")
                    If_Increas = if (If_Increas == 0) {
                        1
                    } else {
                        0
                    }
                }

                R.id.BIG -> {
                    Log.d("MainActivity", "Big button was clicked !")
                    increasment_size = 10
                }

                R.id.NORMAL -> {
                    Log.d("MainActivity", "Reset button was clicked !")
                    increasment_size = 1
                }
            }
        }
    }
}
