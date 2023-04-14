package com.example.androidproject
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class BmiCalcDialogClass: DialogFragment(R.layout.fragment_dialog_bmi_calc){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cancelBT : Button = view.findViewById(R.id.cancelBT);
        val showResBT: Button = view.findViewById(R.id.resBT)
        val heightEd: EditText = view.findViewById(R.id.heightInput)
        val weightEd: EditText = view.findViewById(R.id.weightInput)
        val resultTV: TextView = view.findViewById(R.id.resTV)


        showResBT.setOnClickListener{
            val height = heightEd.text.toString().toInt() / 100.0 // convert height from cm to meters
            val weight = weightEd.text.toString().toDouble()
            val bmi = weight / (height * height)
            val res = String.format("%.2f", bmi) // format BMI result to 2 decimal places
            resultTV.text = "BMI : $res"
        }


        cancelBT.setOnClickListener{
            dismiss()
        }
    }
}