package com.example.includeviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.includeviewapp.databinding.ActivityIncludeViewBinding
import com.example.includeviewapp.databinding.ActivityIncludeViewDataBindingBinding

class IncludeViewDataBindingActivity : AppCompatActivity() {

    private val includeViewDataBindingActivity: ActivityIncludeViewDataBindingBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_include_view_data_binding)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Item 1
        includeViewDataBindingActivity.item1.printBtn.setOnClickListener {
            if (includeViewDataBindingActivity.item1.edText.text.toString().trim().isEmpty()) {
                includeViewDataBindingActivity.item1.edText.error = "Required"
            } else {
                includeViewDataBindingActivity.item1.titleTxt =
                    includeViewDataBindingActivity.item1.edText.text.toString().trim()
            }
        }


        // Item 2
        includeViewDataBindingActivity.item2.printBtn.setOnClickListener {
            if (includeViewDataBindingActivity.item2.edText.text.toString().trim().isEmpty()) {
                includeViewDataBindingActivity.item2.edText.error = "Required"
            } else {
                includeViewDataBindingActivity.item2.titleTxt =
                    includeViewDataBindingActivity.item2.edText.text.toString().trim()
            }
        }


        // Item 3
        includeViewDataBindingActivity.item3.printBtn.setOnClickListener {
            if (includeViewDataBindingActivity.item3.edText.text.toString().trim().isEmpty()) {
                includeViewDataBindingActivity.item3.edText.error = "Required"
            } else {
                includeViewDataBindingActivity.item3.titleTxt =
                    includeViewDataBindingActivity.item3.edText.text.toString().trim()
            }
        }

    }
}