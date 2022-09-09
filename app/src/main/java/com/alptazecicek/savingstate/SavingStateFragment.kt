package com.alptazecicek.savingstate

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alptazecicek.savingstate.databinding.FragmentSavingStateBinding


class SavingStateFragment : Fragment() {

    private lateinit var fragmentSavingStateBinding: FragmentSavingStateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.v("PATIKA", "onCreateView called")
        // Inflate the layout for this fragment

        fragmentSavingStateBinding = FragmentSavingStateBinding.inflate(inflater)
        return fragmentSavingStateBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState?.getString("textString") == null)
            fragmentSavingStateBinding.textView.text = "Enter a Name"
        else fragmentSavingStateBinding.textView.text = savedInstanceState
            .getString("textString").toString()

        fragmentSavingStateBinding.apply {
            save.setOnClickListener {
                textView.text = editTextTextPersonName.text.toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("textString", fragmentSavingStateBinding.textView.text.toString())
    }
}