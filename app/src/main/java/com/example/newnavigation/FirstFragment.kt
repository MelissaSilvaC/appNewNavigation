package com.example.newnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val btnTelaII: Button = view.findViewById(R.id.tela1)
        val btnTelaIII : Button = view.findViewById(R.id.tela2)

        btnTelaII.setOnClickListener {

            Navigation.findNavController(btnTelaII).navigate(R.id.action_firstFragment_to_secondFragment)
        }



        btnTelaIII.setOnClickListener {
            Navigation.findNavController(btnTelaIII).navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        return view
    }

}