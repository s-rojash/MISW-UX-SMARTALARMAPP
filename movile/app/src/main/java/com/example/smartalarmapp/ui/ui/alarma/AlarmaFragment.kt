package com.example.smartalarmapp.ui.ui.recordatorio

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.smartalarmapp.databinding.FragmentAlarmaBinding
import com.example.smartalarmapp.R
import com.example.smartalarmapp.ui.ui.alarma.alarma.AgregarAlarmaActivity
import com.example.smartalarmapp.ui.ui.alarma.lugar.LugarFragment

class AlarmaFragment : Fragment() {

    private var _binding: FragmentAlarmaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(AlarmaViewModel::class.java)

        _binding = FragmentAlarmaBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val view = binding.root
        val button: Button = view.findViewById(R.id.button_configurar)

        button.setOnClickListener { v ->
            val activity = v!!.context as AppCompatActivity;
            activity?.let{
                val intent = Intent (it, LugarFragment::class.java)
                it.startActivity(intent)
            }
        }

        val button2: View? = view.findViewById(R.id.imageView2)

        if (button2 != null) {
            button2.setOnClickListener { v ->
                val activity = v!!.context as AppCompatActivity;
                activity?.let{
                    val intent = Intent (it, AgregarAlarmaActivity::class.java)
                    it.startActivity(intent)
                }
            }
        }

        val button3: LinearLayout = view.findViewById(R.id.linearLayout)

        button3.setOnClickListener { v ->
            val activity = v!!.context as AppCompatActivity;
            activity?.let{
                val intent = Intent (it, AgregarAlarmaActivity::class.java)
                it.startActivity(intent)
            }
        }

        val button4: LinearLayout = view.findViewById(R.id.linearLayout2)

        button4.setOnClickListener { v ->
            val activity = v!!.context as AppCompatActivity;
            activity?.let{
                val intent = Intent (it, AgregarAlarmaActivity::class.java)
                it.startActivity(intent)
            }
        }

        val button5: LinearLayout = view.findViewById(R.id.linearLayout3)

        button5.setOnClickListener { v ->
            val activity = v!!.context as AppCompatActivity;
            activity?.let{
                val intent = Intent (it, AgregarAlarmaActivity::class.java)
                it.startActivity(intent)
            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
