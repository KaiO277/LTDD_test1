package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Maytinh : AppCompatActivity() {

    public var add:Button? = null
    public var sub:Button? = null
    public var mul:Button? = null
    public var div:Button? = null
    public var num1:EditText? = null
    public var num2:EditText? = null
    public var a:Double = 0.0
    public var b:Double = 0.0
    public var c:Int = 0
    public var d:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maytinh)

        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        mul = findViewById(R.id.mul)
        div = findViewById(R.id.div)
        num1 = findViewById(R.id.number1)
        num2 = findViewById(R.id.number2)

        add!!.setOnClickListener {
            c = Integer.valueOf(num1!!.getText().toString())
            d = Integer.valueOf(num2!!.getText().toString())
            a = c.toDouble()
            b = d.toDouble()
            val result = a + b
            val textView = findViewById<TextView>(R.id.show)
            textView.text = result.toString()
        }
        sub!!.setOnClickListener {
            c = Integer.valueOf(num1!!.getText().toString())
            d = Integer.valueOf(num2!!.getText().toString())
            a = c.toDouble()
            b = d.toDouble()
            val result = a - b
            val textView = findViewById<TextView>(R.id.show)
            textView.text = result.toString()
        }
        mul!!.setOnClickListener {
            c = Integer.valueOf(num1!!.getText().toString())
            d = Integer.valueOf(num2!!.getText().toString())
            a = c.toDouble()
            b = d.toDouble()
            val result = a * b
            val textView = findViewById<TextView>(R.id.show)
            textView.text = result.toString()
        }
        div!!.setOnClickListener {
            c = Integer.valueOf(num1!!.getText().toString())
//            var a1 = a.toDouble()
            d = Integer.valueOf(num2!!.getText().toString())
            a = c.toDouble()
            b = d.toDouble()
            if (b==0.0){
                Toast.makeText(getApplicationContext(), "Number 2 khác 0",
                    Toast.LENGTH_SHORT).show()
            }else{
                val result = a/b
                val textView = findViewById<TextView>(R.id.show)
                textView.text = result.toString()
            }
        }
    }
}