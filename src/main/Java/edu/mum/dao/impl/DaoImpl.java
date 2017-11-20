package edu.mum.dao.impl;

import edu.mum.dao.TaskDao;
import edu.mum.domain.Task;
import edu.mum.util.DBConnection;
import edu.mum.util.MysqlConnect;

import java.sql.*;

public class DaoImpl implements TaskDao {
    static final String WRITE_OBJECT_SQL = "INSERT INTO Task(name,due,category,status) VALUES (?,?,?,?)";
 MysqlConnect instance=MysqlConnect.getDbCon();
 Connection conn=instance.conn;
    public Task saveTask(Task task) throws Exception{
        instance.insert("INSERT INTO Task(name, due,category,status) " +
                "VALUES(" +task.getName()+","+task.getDue()+","+task.getCategory()+","+task.getStatus() +")");
        return null;

    }

    public Task deleteTask(Task task) {
        return null;
    }

    public Task updateTask(Task task) {
        return null;
    }

    public Task readTask(Task task) {
        return null;
    }

}
