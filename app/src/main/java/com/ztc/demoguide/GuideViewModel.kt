package com.ztc.demoguide

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @Author:         zhangtc
 * @CreateDate:     2020/8/25 11:17 AM
 * @Description:    描述
 */

class GuideViewModel: ViewModel() {
    val data = MutableLiveData<GuideData>()

    fun set(data: GuideData) {
        this.data.value = data;
    }

}

/**
  * @params: resId 图片id
  * @Description: 自定义databinding,加载图片
  */
@BindingAdapter("android:src")
fun setSrc(view: ImageView, resId: Int) {
    view.setImageResource(resId)
}

/**
 * @params: topMargin 顶部外边距值
 * @Description: 自定义databinding顶部外边距
 */
@BindingAdapter("android:layout_marginTop")
fun setTopMarginTop(view: View, topMargin: Int): Unit {
    val layoutParams = view.getLayoutParams() as ViewGroup.MarginLayoutParams
    layoutParams.setMargins(
            layoutParams.leftMargin, topMargin,
            layoutParams.rightMargin, layoutParams.bottomMargin
    )
    view.setLayoutParams(layoutParams)
}

/**
 * @params: topMargin 底部外边距值
 * @Description: 自定义databinding底部外边距Ø
 */
@BindingAdapter("android:layout_marginBottom")
fun setTopMarginBottom(view: View, bottomMargin: Int): Unit {
    val layoutParams = view.getLayoutParams() as ViewGroup.MarginLayoutParams
    layoutParams.setMargins(
            layoutParams.leftMargin, layoutParams.topMargin,
            layoutParams.rightMargin, bottomMargin
    )
    view.setLayoutParams(layoutParams)
}
