package edu.mum.dao;
import edu.mum.domain.Task;
public interface TaskDao {
    public Task saveTask(Task task) throws Exception;
    public Task deleteTask(Task task);
    public Task updateTask(Task task);
    public Task readTask(Task task);
}
