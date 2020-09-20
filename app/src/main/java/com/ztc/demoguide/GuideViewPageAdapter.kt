package com.ztc.demoguide

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * @Author:         zhangtc
 * @CreateDate:     2020/8/25 11:47 AM
 * @Description:    描述
 */
class  GuideViewPageAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    //图片资源列表
    val res = fragment.resources.obtainTypedArray(R.array.array_guide_src)
    //标题字列表
    val titles = fragment.resources.getStringArray(R.array.array_guide_title)
    //副标题字列表
    val subtitles = fragment.resources.getStringArray(R.array.array_guide_sutitle)

    override fun getItemCount(): Int {
        return res.length()
    }

    override fun createFragment(position: Int): Fragment {
        var data:GuideData = GuideData(position, res.getResourceId(position,R.mipmap.ic_launcher),titles[position],subtitles[position])

        return GuideFragment.newInstance(data)
    }
}