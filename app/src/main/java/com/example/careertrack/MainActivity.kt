package com.example.careertrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.DataBindingUtil
import com.example.careertrack.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private  var binding: ActivityMainBinding?=null
//    private var nameTextView:TextView? = null
//    private var phoneTextView: TextView? = null
//    private  var emailTextView: TextView? =null
//    private  var addressTextView: TextView? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.webview?.webViewClient = WebViewClient()
        binding?.webview?.settings?.javaScriptEnabled = true
        binding?.webview?.loadUrl("https://www.google.com")

//        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
////        binding?.nameTextView?.text="name: Taki Yasir"
//        binding?.emailTextView?.text="tyasir173005@bscse.uiu.ac.bd"
//        binding?.addressTextView?.text="Dhaka,Bangaldesh"
//        binding?.phoneTextView?.text="01749041177"

//        val nameTextView = findViewById<TextView>(R.id.nameTextView)
//        nameTextView.text = "android development"
//        nameTextView.setTextColor(resources.getColor(R.color.white))



//        nameTextView = findViewById(R.id.nameTextView)
//        phoneTextView = findViewById(R.id.phoneTextView)
//        emailTextView = findViewById(R.id.emailTextView)
//        addressTextView = findViewById(R.id.addressTextView)
//
//        nameTextView?.text = "Name: Taki Yasir"
//        phoneTextView?.text = "016712321312"
//        emailTextView?.text = "Dhaka"
//        val imageView = findViewById<ImageView>(R.id.imageView)
//        imageView.setImageDrawable(AppCompatResources.getDrawable(this,R.drawable.nature))
//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            Toast.makeText(this,"This is warning message",Toast.LENGTH_SHORT).show()
//        }

    }
}