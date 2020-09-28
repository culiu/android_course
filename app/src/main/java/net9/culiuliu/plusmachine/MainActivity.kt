package net9.culiuliu.plusmachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var num1_et:EditText? = null
    private var num2_et:EditText? = null
    private var result_tv: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1_et = findViewById(R.id.num1_edit_text)
        num2_et = findViewById(R.id.num2_edit_text)
        result_tv = findViewById(R.id.result_text_view)
        Log.d("test", "onCreate() incurred")
    }

    override fun onStart() {
        super.onStart()
        Log.d("test", "onStart() incurred")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("test", "reStart() incurred")
    }

    override fun onResume() {
        super.onResume()
        Log.d("test", "onResume() incurred")
    }

    override fun onPause() {
        super.onPause()
        Log.d("test", "onPause() incurred")
    }

    override fun onStop() {
        super.onStop()
        Log.d("test", "onStop() incurred")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("test", "onDestroy() incurred")
    }

    fun do_plus(view: View) {
        var num1:Int = Integer.parseInt(num1_et?.text.toString())
        var num2:Int = Integer.parseInt(num2_et?.text.toString())
        result_tv?.setText("result: ${num1+num2}")
    }
}