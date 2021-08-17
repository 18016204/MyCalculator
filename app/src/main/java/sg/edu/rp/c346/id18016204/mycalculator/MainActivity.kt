package sg.edu.rp.c346.id18016204.mycalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var Addition = false
    var minus = false
    var multiply = false
    var divide = false
    var new : String = ""
    var var1 = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

        fun btnOnClick(view: View){


            val btnSelected = view as Button
            when(btnSelected.id){
                button1.id ->{

                var result = textViewResult.text as String +"1"
                    textViewResult.setText("$result")
                }

                button2.id -> {
                    var result = textViewResult.text as String +"2"
                    textViewResult.setText("$result")
                }
                button3.id -> {
                    var result = textViewResult.text as String +"3"
                    textViewResult.setText("$result")
                }
                button4.id -> {
                    var result = textViewResult.text as String +"4"
                    textViewResult.setText("$result")
                }
                button5.id -> {
                    var result = textViewResult.text as String +"5"
                    textViewResult.setText("$result")
                }
                button6.id -> {
                    var result = textViewResult.text as String +"6"
                    textViewResult.setText("$result")
                }
                button7.id -> {
                    var result = textViewResult.text as String +"7"
                    textViewResult.setText("$result")
                }
                button8.id -> {
                    var result = textViewResult.text as String +"8"
                    textViewResult.setText("$result")
                }
                button9.id -> {
                    var result = textViewResult.text as String +"9"
                    textViewResult.setText("$result")
                }
                button0.id -> {
                    var result = textViewResult.text as String +"0"
                    textViewResult.setText("$result")
                }
                buttondot.id -> {
                    var result = textViewResult.text as String +"."
                    textViewResult.setText("$result")
                }


                buttonPlus.id -> {
            if(textViewResult.text == null ){
                textViewResult.setText("")
            }else{
                var1 = textViewResult.text.toString().toDouble()

                Addition = true

                textViewResult.setText(null)

            }
                }
                buttonMinus.id ->{
                    var1 = textViewResult.text.toString().toDouble()
                    minus = true
                    textViewResult.setText(null)
                }
                buttonMultiply.id ->{
                    var1 = textViewResult.text.toString().toDouble()
                    multiply = true
                    textViewResult.setText(null)
                }
                ButtonDivide.id -> {
                    var1 = textViewResult.text.toString().toDouble()
                    divide = true
                    textViewResult.setText(null)
                }


equal.id -> {

    if(Addition == true){
        var result = var1 +textViewResult.text.toString().toDouble()
        textViewResult.text = result.toString()
        Addition = false
    }else if(minus == true){
        var result = var1 - textViewResult.text.toString().toDouble()
        textViewResult.text = result.toString()
        minus = false
    }else if(multiply == true){
        var result = var1 * textViewResult.text.toString().toDouble()
        textViewResult.text = result.toString()
        multiply = false
    } else if(divide == true){
        var result = var1 / textViewResult.text.toString().toDouble()
        textViewResult.text = result.toString()
        divide = false
    }

}

                ac.id ->{
                    textViewResult.setText("")
                }

            }


        }

}