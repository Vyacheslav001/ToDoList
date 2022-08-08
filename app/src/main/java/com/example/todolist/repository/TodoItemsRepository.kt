package com.example.todolist.repository

import com.example.todolist.fragments.TodoItem

class TodoItemsRepository() {
    private val todoItems: MutableList<TodoItem> = mutableListOf(
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
    )

    fun addTodoItem(todo: TodoItem) {
        todoItems.add(todo)
    }
}