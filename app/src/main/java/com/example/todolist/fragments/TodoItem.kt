package com.example.todolist.fragments

data class TodoItem(
    val idTodoItem: String,
    val textTodoItem: String,
    val importance: String,
    val deadline: String,
    val flag: Boolean,
    val dateOfCreation: String,
    val dateOfChange: String
)
