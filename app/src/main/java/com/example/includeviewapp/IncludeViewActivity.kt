package com.example.includeviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class IncludeViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_include_view)

        // Include View Item 1
        val item1 = findViewById<View>(R.id.itemView1)
//        val edTextItem1 = item1.findViewById<EditText>(R.id.edText)
//        val textTxtItem1 = item1.findViewById<TextView>(R.id.textTxt)
//        val printBtnItem1 = item1.findViewById<Button>(R.id.printBtn)
//
//        printBtnItem1.setOnClickListener {
//            if (edTextItem1.text.toString().trim().isEmpty()){
//                edTextItem1.error = "Required"
//            }else{
//                textTxtItem1.text = edTextItem1.text.toString().trim()
//            }
//        }




        // Include View Item 2
        val item2 = findViewById<View>(R.id.itemView2)
//        val edTextItem2 = item2.findViewById<EditText>(R.id.edText)
//        val textTxtItem2 = item2.findViewById<TextView>(R.id.textTxt)
//        val printBtnItem2 = item2.findViewById<Button>(R.id.printBtn)
//
//        printBtnItem2.setOnClickListener {
//            if (edTextItem2.text.toString().trim().isEmpty()){
//                edTextItem2.error = "Required"
//            }else{
//                textTxtItem2.text = edTextItem2.text.toString().trim()
//            }
//        }



        // Include View Item 3
        val item3 = findViewById<View>(R.id.itemView3)
//        val edTextItem3 = item3.findViewById<EditText>(R.id.edText)
//        val textTxtItem3 = item3.findViewById<TextView>(R.id.textTxt)
//        val printBtnItem3 = item3.findViewById<Button>(R.id.printBtn)
//
//        printBtnItem3.setOnClickListener {
//            if (edTextItem3.text.toString().trim().isEmpty()){
//                edTextItem3.error = "Required"
//            }else{
//                textTxtItem3.text = edTextItem3.text.toString().trim()
//            }
//        }

        /// how to reuse kotlin code and same feature

        reuseComp(item1)
        reuseComp(item2)
        reuseComp(item3)

    }



    fun reuseComp(item: View){
        val edTextItem = item.findViewById<EditText>(R.id.edText)
        val textTxtItem = item.findViewById<TextView>(R.id.textTxt)
        val printBtnItem = item.findViewById<Button>(R.id.printBtn)

        printBtnItem.setOnClickListener {
            if (edTextItem.text.toString().trim().isEmpty()){
                edTextItem.error = "Required"
            }else{
                textTxtItem.text = edTextItem.text.toString().trim()
            }
        }
    }
}