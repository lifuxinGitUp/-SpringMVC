<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/11/9
  Time: 下午4:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileUpload</title>
</head>
<body>
<form action="/fileUpload" enctype="multipart/form-data" method="post">
    选择文件:
    <input type="file" name="items_pic"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
