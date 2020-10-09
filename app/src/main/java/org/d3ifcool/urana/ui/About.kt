package org.d3ifcool.urana.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.d3ifcool.urana.R
import org.d3ifcool.urana.databinding.FragmentAboutBinding

/**
 * A simple [Fragment] subclass.
 */
class About : Fragment() {

    lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_about, container, false)

        binding.btnBack.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_about_to_home2)
        }

        return binding.root
    }

}
