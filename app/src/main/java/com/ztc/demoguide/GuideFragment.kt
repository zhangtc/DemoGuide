package com.ztc.demoguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ztc.demoguide.databinding.GuideFragmentBinding

class GuideFragment : Fragment() {

    companion object {
        val ARGUMENT_KEY = "argument_index"
        fun newInstance(data: GuideData): GuideFragment {
            val guideFragment = GuideFragment()
            val bundle = Bundle()
            bundle.putSerializable(ARGUMENT_KEY, data)
            guideFragment.arguments = bundle
            return guideFragment

        }
    }


    private lateinit var viewModel: GuideViewModel
    private lateinit var binding: GuideFragmentBinding;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = GuideFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GuideViewModel::class.java)
        var data:GuideData = requireArguments().getSerializable(ARGUMENT_KEY) as GuideData
        viewModel.set(data);
        binding.data = viewModel;
        binding.setLifecycleOwner(this)


    }



}