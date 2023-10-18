package com.borja.android.todoapp.addtasks.data.di

import android.content.Context
import androidx.room.Room
import com.borja.android.todoapp.addtasks.data.TaskDao
import com.borja.android.todoapp.addtasks.data.TodoDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    fun provideTaksDao(todoDataBase: TodoDataBase):TaskDao{
        return todoDataBase.taskDao()
    }
    @Provides
    @Singleton
    fun provideTodoDatabase(@ApplicationContext appContext: Context): TodoDataBase {
        return Room.databaseBuilder(appContext, TodoDataBase::class.java, "TaskDatabase").build()
    }
}