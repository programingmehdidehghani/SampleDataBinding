package com.example.databinding

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import kotlinx.android.synthetic.main.activity_main.view.*

@BindingAdapter("loadImageFromUrl")
fun ImageView.loadImageFromUrl(profilePhoto : String){
    this.load(profilePhoto)
}

@BindingAdapter("setVisibility")
fun View.setViewVisibility(points : Int){
    if (points > 10){
       this.visibility = View.VISIBLE
    }  else{
       this.visibility = View.GONE
    }
    when(this){
        is  ImageView ->{
            
        }
        is  TextView ->{
            
        }

    }
}

//class MyBindingAdapter{

   // companion object{
    //    @BindingAdapter("loadImageFromUrl")
   //     @JvmStatic
    //    fun loadImageFromUrl(imageView: ImageView , profilePhoto : String){
    //        imageView.load(profilePhoto)
    //    }
  //  }

//}