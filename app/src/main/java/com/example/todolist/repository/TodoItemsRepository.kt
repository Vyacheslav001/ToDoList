package com.example.todolist.repository

import com.example.todolist.fragments.TodoItem

class TodoItemsRepository() {

    fun getTodoItems() = listOf<TodoItem>(
        TodoItem("1", "Написать приложение", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Прочитать книгу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Доделать коллекцию", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "sedafgja'fgkj';adfjmb|DLbm'l|Afgm  aerj g';kfg';mkab saedrhtgjhnhtedyhjthntyntynddyhnn hnjhkj,ldhmn hjkmfd ytd ukhjgh j hnjg pfdighbj a; k'gb ';karfgt hbarfdgthb'", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Продать коляску", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("1", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000")
    )

//    fun addTodoItem(todo: MutableList<TodoItem>): MutableList<TodoItem> {
//        for (item in todo){
//            return item
//        }
//    }
}