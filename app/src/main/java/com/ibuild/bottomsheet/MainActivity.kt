package com.ibuild.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.idBtnShowBottomSheet)
        button.setOnClickListener {
            showBottomSheet()
        }

    }

    private fun showBottomSheet() {
        val dialog = BottomSheetDialog(this)

        val view = layoutInflater.inflate(R.layout.bottom_sheet, null)
       var image =  view.findViewById<ShapeableImageView>(R.id.userImage)
        var name =  view.findViewById<TextView>(R.id.userName)
        var number =  view.findViewById<TextView>(R.id.userNum)
        var ticketTypeValue =  view.findViewById<TextView>(R.id.ticketTypeValue)
        var seatValue =  view.findViewById<TextView>(R.id.seatValue)
        //set data here

//        Glide.with(this).load("imageUrlFromWeb").into(image) //get user image put it at imageUrlFromWeb
//
//        name.text = "" //get user name
//        number.text="" //get user number
//        ticketTypeValue.text="" //get ticket  type
//        seatValue.text="" //get seat  value

        dialog.setCancelable(false)
        dialog.setContentView(view)
        dialog.show()

    }
}