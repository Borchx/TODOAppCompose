package com.borja.android.todoapp.addtasks.ui.model

data class TaskModel (
    //val id:Long = System.currentTimeMillis(),
    val id:Int = System.currentTimeMillis().hashCode(),
    val task:String,
    var selected:Boolean = false
)