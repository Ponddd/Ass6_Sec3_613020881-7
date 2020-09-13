package com.myweb.ass6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_three.view.*
import kotlinx.android.synthetic.main.fragment_two.view.btnF1
import kotlinx.android.synthetic.main.fragment_two.view.*

class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        view.btnF2.setOnClickListener() {
            var fragment: Fragment? = null
            fragment = OneFragment()
            replaceFragment1(fragment)
        }
        return view
    }

    fun replaceFragment1(someFragment: Fragment) {
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.FLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
