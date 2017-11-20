package edu.mum.util;
import edu.mum.dao.impl.DaoImpl;
import edu.mum.service.impl.TaskServiceImpl;
import edu.mum.domain.Task;

import java.sql.Date;

public class ObjectFactory {
public static TaskServiceImpl getServiceObject(){
    return new TaskServiceImpl();
}
    public static DaoImpl getDaoObject(){
        return new DaoImpl();
    }

    public static Task getTaskObject(){
        return new Task();
    }
    public static Task getTaskObject(String name, Date due, String category,String status){
        return new Task(name,due,category,status);
    }

}
