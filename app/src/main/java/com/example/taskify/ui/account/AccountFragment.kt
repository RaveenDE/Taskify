package com.example.taskify.ui.account

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

import com.example.taskify.LoginActivity
import com.example.taskify.MainActivity
import com.example.taskify.R
import com.example.taskify.databinding.FragmentAccountBinding
import com.example.taskify.ui.auth.AuthViewModel

@AndroidEntryPoint
class AccountFragment : Fragment() {

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = requireView().findViewById(R.id.nameTextField) as TextView
        textView.text = "Hello, " + user?.email


        }
    }
}