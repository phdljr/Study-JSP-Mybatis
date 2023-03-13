<%--
  Created by IntelliJ IDEA.
  User: aromi
  Date: 2023-03-10
  Time: 오후 3:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script type="text/javascript">
      $(document).ready(showStudentList);

      function showStudentList(){
        let students = ${students};
        students.forEach(element => {
          let student = document.createElement("li");
          student.innerHTML = element['nickname'] + " " + element['pw'];
          $(".student-list").append(student)
        });
        // let students = ${students};
        // let student = document.createElement("li");
        // student.innerHTML = students['nickname'] + " " + students['pw'];
        // $(".student-list").append(student)
      }
    </script>
</head>
<body>
  <ul class="student-list"></ul>
</body>
</html>
