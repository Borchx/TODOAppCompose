package com.borja.android.todoapp.addtasks.domain

import com.borja.android.todoapp.addtasks.data.TaskRepository
import com.borja.android.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository){

    suspend operator fun invoke(taskModel: TaskModel){
        taskRepository.update(taskModel)
    }
}