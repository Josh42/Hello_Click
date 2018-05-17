package fr.epita.helloclick

import android.gesture.Gesture
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var cpt: Int = 0


    fun sum(a: Int, b: Int): Int {
        return a + b
    }

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
                    Log.d("MainActivity", "Main button was clicked !")
                    cpt += 1
                }
            }
        }
    }
}
