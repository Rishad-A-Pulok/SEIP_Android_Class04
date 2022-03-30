package com.example.class04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {
    private lateinit var emailET: EditText
    private lateinit var passET: EditText
    private lateinit var loginBtn: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Toast.makeText(activity,"Welcome", Toast.LENGTH_SHORT).show()
        emailET = view.findViewById(R.id.mailET)
        passET = view.findViewById(R.id.passET)
        loginBtn = view.findViewById(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val email = emailET.text.toString()
            val pass = passET.text.toString()
            //TODO(validate field data)
            val bundle = Bundle().apply {
                putString("email_value",email) //apply() is a scope function. also(),run(),width(),length() are also scope function
                putString("password",pass)
            }
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment, bundle)
        }
    }
}