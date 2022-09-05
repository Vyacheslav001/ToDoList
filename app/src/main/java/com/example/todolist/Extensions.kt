package com.example.todolist

import androidx.fragment.app.Fragment

fun Fragment.replaceFragment(fragment: Fragment) {
    requireActivity().supportFragmentManager.beginTransaction()
        .replace(id, fragment)
        .addToBackStack("")
        .commit()
}