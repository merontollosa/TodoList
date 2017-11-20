
window.onload =function(){
    document.getElementById('todayDate').innerHTML = today;

}

function todayDate(){


}

    function saveTask() {
        if (!document.getElementById('task').value)
        {
            alert ("Please Enter a Task Name");

        }
        else if (!document.getElementById('datereq').value)

        {
            alert ("Please Enter a Required Date");

        }
        else if (document.getElementById("category").value==-1
            || document.getElementById('category').value==undefined)
                  alert("Please Select task category");
        else
            alert("Saved");

    }
    function clearTask(){
        document.getElementById('task').value="";
         document.getElementById('datereq').value="";
    }