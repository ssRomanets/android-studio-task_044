package com.example.task_044

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.task_044.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, saveInstanceState: Bundle?) {
        super.onViewCreated(view, saveInstanceState)
        binding.redButton.setOnClickListener{
            view.findNavController().navigate(R.id.action_mainFragment_to_redFragment)
        }
        binding.yellowButton.setOnClickListener{
            view.findNavController().navigate(R.id.action_mainFragment_to_yellowFragment)
        }
        binding.greenButton.setOnClickListener{
            view.findNavController().navigate(R.id.action_mainFragment_to_greenFragment)
        }
    }

}










