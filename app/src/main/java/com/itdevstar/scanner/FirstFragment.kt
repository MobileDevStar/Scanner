package com.itdevstar.scanner

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.itdevstar.scanner.databinding.FragmentFirstBinding
import com.itdevstar.scannerlib.CaptureActivity

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        binding.buttonScan.setOnClickListener {
            Toast.makeText(context, "This is a message", Toast.LENGTH_SHORT).show()
//            val toast = Toast.makeText(context, "Hello Javatpoint", Toast.LENGTH_LONG)
//            toast.show()
            startActivity(Intent(context, CaptureActivity::class.java)).apply {  }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}