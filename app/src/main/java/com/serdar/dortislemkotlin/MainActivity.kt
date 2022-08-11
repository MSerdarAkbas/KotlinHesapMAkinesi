package com.serdar.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.math.roundToInt
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    var ilkRakam: Double? = null
    var ikinciRakam: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun topla(view: View) {
        ilkRakam = text1.text.toString().toDoubleOrNull()
        ikinciRakam = text3.text.toString().toDoubleOrNull()
        if (ilkRakam == null || ikinciRakam == null) {
            textView.text = "rakamları doğru giriniz!!"
        } else {
            var sonuç = ilkRakam!! + ikinciRakam!!
            textView.text = "Sonuç = ${sonuç}"
        }
    }

    fun cikar(view: View) {
        ilkRakam = text1.text.toString().toDoubleOrNull()
        ikinciRakam = text3.text.toString().toDoubleOrNull()
        if (ilkRakam == null || ikinciRakam == null) {
            textView.text = "rakamları doğru giriniz!!"
        } else {
            var sonuç = ilkRakam!! - ikinciRakam!!
            textView.text = "Sonuç = ${sonuç}"
        }
    }

    fun carp(view: View) {
        ilkRakam = text1.text.toString().toDoubleOrNull()
        ikinciRakam = text3.text.toString().toDoubleOrNull()
        if (ilkRakam == null || ikinciRakam == null) {
            textView.text = "rakamları doğru giriniz!!"
        } else {
            var sonuç = ilkRakam!! * ikinciRakam!!
            textView.text = "Sonuç = ${sonuç}"
        }

    }

    fun bol(view: View) {
        ilkRakam = text1.text.toString().toDoubleOrNull()
        ikinciRakam = text3.text.toString().toDoubleOrNull()
        if (ilkRakam == null || ikinciRakam == null) {
            textView.text = "rakamları doğru giriniz!!"
        } else {
            var sonuç= ilkRakam!! / ikinciRakam!!
            textView.text = "Sonuç = ${sonuç}"
        }


    }

    fun sifirla (view: View) {
        text1.editableText.clear()
        text3.editableText.clear()
        textView.text = ""
                }

    fun karesi (view: View) {
        ilkRakam = text1.text.toString().toDoubleOrNull()
        ikinciRakam = text3.text.toString().toDoubleOrNull()
        if (ilkRakam == null || ikinciRakam == null) {
            textView.text = "rakamları doğru giriniz!!"
        } else {
            var sonuc1 = ilkRakam!! * ilkRakam!!
            var sonuc2 = ikinciRakam!! * ikinciRakam!!
            textView.text = "${ilkRakam}² = ${sonuc1}. \n ${ikinciRakam}² = ${sonuc2}"
        }

    }

    fun karekök (view: View) {
        ilkRakam = text1.text.toString().toDoubleOrNull()
        ikinciRakam = text3.text.toString().toDoubleOrNull()
        if (ilkRakam == null || ikinciRakam == null) {
            textView.text = "rakamları doğru giriniz!!"
        } else {
            var sonuc1 = sqrt(ilkRakam!!)
            var sonuc2 = sqrt(ikinciRakam!!)
            textView.text = "√¯${ilkRakam} = ${sonuc1}. \n √¯${ikinciRakam} = ${sonuc2}"
        }

    }

}