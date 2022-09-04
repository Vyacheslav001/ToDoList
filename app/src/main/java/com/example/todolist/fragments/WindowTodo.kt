package com.example.todolist.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.todolist.R
import com.example.todolist.databinding.TodoWindowBinding

class WindowTodo : Fragment() {
    private var _binding: TodoWindowBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TodoWindowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO вынести код из onViewCreated
        with(binding) {
            context?.let {
                ArrayAdapter.createFromResource(
                    it.applicationContext,
                    R.array.importanceSpinnerArray,
                    android.R.layout.simple_spinner_item
                ).also { adapter ->
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    importanceSpinner.adapter = adapter
                }
            }
            importanceSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    parent?.getItemAtPosition(position)
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }
    }

//    @SuppressLint("SetTextI18n")
//    private fun renderData() {
//        with(binding) {
//            calendar.visibility = View.VISIBLE
//            calendar.setOnDateChangeListener { view, year, month, dayOfMonth ->
//                textDate.text = "$dayOfMonth.$month.$year"
//            }
//            calendar.visibility = View.INVISIBLE
//        }
//    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        fun newInstance() = WindowTodo()
    }
}