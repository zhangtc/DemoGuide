package com.ztc.demoguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.ztc.demoguide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding!!.setLifecycleOwner(this@MainActivity)

        //将viewpeage和adapter绑定
        val adapter = GuideViewPageAdapter(this);
        binding!!.vpGuide.adapter = adapter

        //注册监听viewpage页面的切换，使界面中的小圆点自由切换以及变色
        binding!!.vpGuide.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                binding!!.itemId = position

            }

        })
    }
}