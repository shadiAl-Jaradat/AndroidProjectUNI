package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chineseMealFragment = ShowChineseMeal()
        val americanMealFragment = ShowAmericanMeal()
        val italianMealFragment = ShowItalianMeal()


        val button: Button = findViewById(R.id.button)
        var choose: String = "chinese"
        val spinnerVal : Spinner = findViewById(R.id.spSelect)
        var spinnerOptions = arrayOf("chinese","american","italian")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,spinnerOptions)

        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                choose = spinnerOptions.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

        button.setOnClickListener{
            if(choose == "chinese"){
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.frameLayout, chineseMealFragment)
                    addToBackStack(null)
                    commit()
                }
            }
            else if(choose == "american"){
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.frameLayout, americanMealFragment)
                    addToBackStack(null)
                    commit()
                }
            }
            else if(choose == "italian"){
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.frameLayout, italianMealFragment)
                    addToBackStack(null)
                    commit()
                }
            }

        }



    }

}