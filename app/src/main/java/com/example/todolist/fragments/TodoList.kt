package com.example.todolist.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.todolist.TodoItemAdapter
import com.example.todolist.databinding.ListTodoBinding
import com.example.todolist.replaceFragment
import com.example.todolist.repository.TodoItemsRepository

class TodoList : Fragment(), View.OnClickListener {
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

        //TODO вынести в отдельный метод
        binding.fab.setOnClickListener {
            replaceFragment(WindowTodo.newInstance())
        }
    }

    private fun init() {
        binding.apply {
            recyclerViewTodoList.adapter = adapter
            adapter.clearRecyclerView()
            todoItemsRepository.getTodoItems().forEach {
                adapter.addTodo(it)
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

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}
