package com.fahreddinsevindir.todolist.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.fahreddinsevindir.todolist.data.TaskDao


class TasksViewModel @ViewModelInject constructor(
    private val taskDao: TaskDao
) : ViewModel(){

}