<%--
  Created by IntelliJ IDEA.
  User: 韩梁弟弟
  Date: 2019/8/6
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>修改类型</h1>

${category.id}

<form action="" method="post">
    <input type="hidden" name="id" value="${category.id}"><br/>
    名称：<input type="text" name="name" value="${category.name}"><br/>
    父类Id<input type="text" name="parentId" value="${category.parentId}"><br/>
    类别状态<input type="text" name="status" value="${category.status}"><br/>
    <input type="submit"  value="修改"><br/>

</form>
</body>
</html>
