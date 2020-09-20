package com.ztc.demoguide

import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.io.Serializable


/**
 * @Author:         zhangtc
 * @CreateDate:     2020/8/24 2:55 PM
 * @Description:    描述
 */
data class GuideData(val index:Int, val res:Int, val title: String?,val subtitle:String?) : Serializable


