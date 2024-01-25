package com.orucmorgul.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.orucmorgul.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

    }

    fun toPlus (view: View){
        var sayi1 = binding.number1.text.toString().toDoubleOrNull()
        var sayi2 = binding.number2.text.toString().toDoubleOrNull()

        if (sayi1 != null && sayi2 != null){
            val result = sayi1 + sayi2
            binding.textView.text = "Result: ${result}"
        }
        else {
            binding.textView.text = "Please enter number"
        }
    }

    fun toMin (view: View){
        var sayi1 = binding.number1.text.toString().toDoubleOrNull()
        var sayi2 = binding.number2.text.toString().toDoubleOrNull()

        if (sayi1 != null && sayi2 != null){
            val result = sayi1 - sayi2
            binding.textView.text = "Result: ${result}"
        }
        else {
            binding.textView.text = "Please enter number"
        }
    }

    fun toDiv (view: View){
        var sayi1 = binding.number1.text.toString().toDoubleOrNull()
        var sayi2 = binding.number2.text.toString().toDoubleOrNull()

        if (sayi1 != null && sayi2 != null){
            val result = sayi1 / sayi2
            binding.textView.text = "Result: ${result}"
        }
        else {
            binding.textView.text = "Please enter number"
        }
    }

    fun toMult (view: View){
        var sayi1 = binding.number1.text.toString().toDoubleOrNull()
        var sayi2 = binding.number2.text.toString().toDoubleOrNull()

        if (sayi1 != null && sayi2 != null){
            val result = sayi1 * sayi2
            binding.textView.text = "Result: ${result}"
        }
        else {
            binding.textView.text = "Please enter number"
        }
    }

}