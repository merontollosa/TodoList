<%--
  Created by IntelliJ IDEA.
  User: Meron
  Date: 11/19/2017
  Time: 12:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Task list</title>
    <script type="text/javascript" src="/../js/validation.js"></script>
    <link rel="stylesheet" type="text/css" href="/../css/task.css">
</head>
<body>
<header>
    <img src="/../image/todolist.jpg" alt="to do list" id="leftimage"/><span>Task list</span>
    <img src="/../image/todolist.jpg" alt="to do list" id="rightimage"/>
</header>
<fieldset>
    <legend>New Task</legend>
    <main>
        <div>
            <form action="TaskServlet" method="post">
                <p>
                    <label>New Task</label> <input type="text" required="required" name="task" class="large" placeholder="New Task Name" />
                </p>
                <p>
                    <label>Required by</label> <input type="date" required="required"  name="datereq" >
                </p>
                <p>
                    <label>Category</label>
                    <select name="category">
                        <option value="-1">Select Catagory</option>
                        <option value="Class">Class</option>
                        <option value="Work">Work </option>
                        <option value="social">Social </option>
                    </select>
                </p>
                <nav>
                    <input type="Submit" name="save" onclick="saveTask();" value="Save task">
                    <input type="reset" name="clear" value="Clear task"/>
                </nav>
            </form>
        </div>
    </main>
</fieldset>
<table id="tblTasks">
    <colgroup>
        <col>
        <col>
        <col>
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>Name</th>
        <th>Due</th>
        <th>Category</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Assigment</td>
        <td><time datetime="2017-11-02">2017-11-02</time></td>
        <td>Calss</td>
        <td><label><input type="checkbox" name="completed">Completed </label></td>
    </tr>
    <tr  class="completedTask"><td>Call to My son</td>
        <td><time datetime="2017-11-02">2017-11-02</time></td>
        <td>Family</td>
        <td><label><input type="checkbox" name="completed">Completed </label></td>
    </tr>
    <tr>
        <td>Meet friends for dinner</td><td><time datetime="2017-11-06">2017-11-06</time></td>
        <td>Personal</td>
        <td><label><input type="checkbox" name="completed">Completed </label></td>
    </tr>
    </tbody>
</table>
<nav>
    <a href="#">Add task</a>
</nav>

<footer>&copy;mtollosa  You have 1 complete Tasks and two open Task</footer>
</body>
</html>