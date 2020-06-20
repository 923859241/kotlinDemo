package com.example.switchbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchButton.setOnCheckedChangeListener{_,isChecked->
            if(isChecked){
                Toast.makeText(this,"On",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Off",Toast.LENGTH_SHORT).show()
            }
        }
    }

}
