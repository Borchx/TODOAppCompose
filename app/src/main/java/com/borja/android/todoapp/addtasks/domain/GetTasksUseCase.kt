package com.borja.android.todoapp.addtasks.domain

import com.borja.android.todoapp.addtasks.data.TaskRepository
import com.borja.android.todoapp.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> {
        return taskRepository.tasks
    }
}