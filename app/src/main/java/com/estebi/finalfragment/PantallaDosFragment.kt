package com.estebi.finalfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class PantallaDosFragment : Fragment(R.layout.fragment_pantalla_dos) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnIrTres = requireView().findViewById<Button>(R.id.btnPantallaTres)

    }
}