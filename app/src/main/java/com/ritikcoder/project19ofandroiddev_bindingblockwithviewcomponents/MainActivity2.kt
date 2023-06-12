package com.ritikcoder.project19ofandroiddev_bindingblockwithviewcomponents

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.ritikcoder.project19ofandroiddev_bindingblockwithviewcomponents.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonForClickMe.setOnClickListener {
            addName(it)
        }

    }

    private fun addName(view: View) {
        binding.apply {
            //val editText= findViewById<EditText>(R.id.editTextForEnterName)
            //val textViewName= findViewById<TextView>(R.id.textViewName)
            //textViewName.text= editText.text
            textViewName.text = binding.editTextForEnterName.text

//            inValidateAll()

            //editText.visibility= View.GONE
            //view.visibility= View.GONE
            //textViewName.visibility= View.VISIBLE
            editTextForEnterName.visibility = View.GONE
            buttonForClickMe.visibility = View.GONE
            textViewName.visibility = View.VISIBLE
        }

        //Keyboard hiding of android phone.
        val keyboardHide = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        keyboardHide.hideSoftInputFromWindow(view.windowToken, 0)
    }
}