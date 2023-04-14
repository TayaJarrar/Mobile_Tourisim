package com.example.tourisim

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.tourisim.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(BlankFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){

                R.id.home ->replaceFragment(BlankFragment())
                R.id.home2 ->replaceFragment(BlankFragment2())
                R.id.home3 ->replaceFragment(BlankFragment3())
                else ->{

                }
            }
            true

        }
    }

private fun replaceFragment(fragment: Fragment){
    val fragmentManager =supportFragmentManager

    val fragmentTransaction =fragmentManager.beginTransaction()
    fragmentTransaction.replace(R.id.frame_layout,fragment)
    fragmentTransaction.commit()

}


}