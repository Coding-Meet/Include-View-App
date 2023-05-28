package com.example.includeviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.includeviewapp.databinding.ActivityIncludeViewBindingBinding

class IncludeViewBindingActivity : AppCompatActivity() {

    private val includeViewBinding : ActivityIncludeViewBindingBinding by lazy {
        ActivityIncludeViewBindingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(includeViewBinding.root)

        // Item 1
        includeViewBinding.item1.printBtn.setOnClickListener {
            if (includeViewBinding.item1.edText.text.toString().trim().isEmpty()){
                includeViewBinding.item1.edText.error = "Required"
            }else{
                includeViewBinding.item1.textTxt.text = includeViewBinding.item1.edText.text.toString().trim()
            }
        }

        // Item 2
        includeViewBinding.item2.printBtn.setOnClickListener {
            if (includeViewBinding.item2.edText.text.toString().trim().isEmpty()){
                includeViewBinding.item2.edText.error = "Required"
            }else{
                includeViewBinding.item2.textTxt.text = includeViewBinding.item2.edText.text.toString().trim()
            }
        }

        // Item 3
        includeViewBinding.item3.printBtn.setOnClickListener {
            if (includeViewBinding.item3.edText.text.toString().trim().isEmpty()){
                includeViewBinding.item3.edText.error = "Required"
            }else{
                includeViewBinding.item3.textTxt.text = includeViewBinding.item3.edText.text.toString().trim()
            }
        }

    }
}