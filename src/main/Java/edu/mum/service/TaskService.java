package edu.mum.service;
import edu.mum.domain.Task;

import java.util.List;

public interface TaskService{
    public Task saveTask(Task task);
    public Task deleteTask(Task task);
    public Task updateTask(Task task);
    public Task readTask(Task task);
    public List<Task> getAllTask();
}
