package com.example.androidproject
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.DialogFragment

class AboutUsDialogClass: DialogFragment(R.layout.fragment_dialog_about_us){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cancelBT : Button = view.findViewById(R.id.cancelBT);
        cancelBT.setOnClickListener{
            dismiss()
        }
    }
}