<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 12/8/18
  Time: 5:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add user</title>
</head>

<script type="text/javascript">
    function addUser(){
        var form = document.forms[0];
        form.action = "/crime_report/user/saveUser";
        form.method="post";
        form.submit();
    }
</script>
<body>


<h1>添加用户</h1>
<form action="" name="userForm">
    姓名：<input type="text" name="userName">
    年龄：<input type="text" name="password">
    <input type="button" value="添加" onclick="addUser()">
</form>

</body>
</html>
