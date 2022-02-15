package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.ImageView

class MainActivity() : AppCompatActivity(), View.OnClickListener, Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgbuku: ImageView = findViewById(R.id.imgBuku)
        imgbuku.setOnClickListener(this)

        val imgpulpen: ImageView = findViewById(R.id.imgPulpen)
        imgpulpen.setOnClickListener(this)

        val imgspidol: ImageView = findViewById(R.id.imgSpidol)
        imgspidol.setOnClickListener(this)

        val imgtipex: ImageView = findViewById(R.id.imgTipex)
        imgtipex.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.imgBuku -> {
                val buku = Intent(this, buku::class.java)
                startActivity(buku)
            }

            R.id.imgPulpen -> {
                val pulpen = Intent(this, pulpen::class.java)
                startActivity(pulpen)
            }

            R.id.imgSpidol -> {
                val spidol = Intent(this, spidol::class.java)
                startActivity(spidol)
            }

            R.id.imgTipex -> {
                val tipex = Intent(this, tipex::class.java)
                startActivity(tipex)
            }

        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}