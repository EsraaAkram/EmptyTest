package com.esoapps.emptytest

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.esoapps.applixir.WebViewApplixirKotlin
import com.esoapps.applixir.loadApplixirAd
import com.esoapps.applixir.showApplixirAd


class MainActivity : AppCompatActivity() {


    //1
    private var clickIt: Button? = null
    private var webviewContainerRv: ConstraintLayout? = null
    private var webViewApplixirKotlin: WebViewApplixirKotlin? = null
    //2
    private val url = "https://js.appcdn.net/Android-test-1.html"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //3
        clickIt = findViewById(R.id.clickIt)
        webviewContainerRv = findViewById(R.id.webviewContainerRv)
        //4
        webViewApplixirKotlin = loadApplixirAd(webviewContainerRv, this, url)
        //5
        clickIt?.setOnClickListener {
            showApplixirAd(webviewContainerRv, webViewApplixirKotlin)

        }


    }


}