package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.ItemTodoBinding
import com.example.todolist.fragments.TodoItem
import com.example.todolist.repository.TodoItemsRepository

class TodoItemAdapter : RecyclerView.Adapter<TodoItemAdapter.TodoItemHolder>() {

    private var todoItems = ArrayList<TodoItem>()

    class TodoItemHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = ItemTodoBinding.bind(item)
        fun bind(todoItem: TodoItem) = with(binding) {
            todoTextView.text = todoItem.textTodoItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return TodoItemHolder(view)
    }

    override fun onBindViewHolder(holder: TodoItemHolder, position: Int) {
        holder.bind(todoItems[position])
    }

    override fun getItemCount(): Int {
        return todoItems.size
    }

    fun addTodo(item: TodoItem) {
        todoItems.add(item)
        notifyDataSetChanged()
    }

//    fun addTodo(data: List<TodoItem>) {
//        todoItems = data
//        notifyDataSetChanged()
//    }
}