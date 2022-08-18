package com.example.todolist.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.TodoItemAdapter
import com.example.todolist.databinding.ListTodoBinding
import com.example.todolist.repository.TodoItemsRepository

class TodoList : Fragment() {
    private var _binding: ListTodoBinding? = null
    private val binding get() = _binding!!
    private val adapter = TodoItemAdapter()
    private val todoItemsRepository = TodoItemsRepository()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ListTodoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.apply {
            recyclerViewTodoList.adapter = adapter
            for (item in todoItemsRepository.getTodoItems()) {
                adapter.addTodo(item)
            }
        }
    }

    companion object {
        fun newInstance() = TodoList()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
