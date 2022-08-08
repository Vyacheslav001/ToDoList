package com.example.todolist.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.todolist.databinding.ListTodoBinding

class TodoList : Fragment() {
    private var _binding: ListTodoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ListTodoBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = TodoList()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}