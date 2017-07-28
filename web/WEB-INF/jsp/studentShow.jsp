<%--
  Created by IntelliJ IDEA.
  User: shadowolf
  Date: 2017/7/28
  Time: 18:46
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>Title</title>
    <meta name="Keywords" content="">
    <meta name="description" content="">
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }

        a {
            text-decoration: none;
            color: #111;
        }

        li {
            list-style: none;
        }

        body {
            background: #FFF;
            font-size: 14px;
            font-family: "微软雅黑";
            color: #666;
        }

        .container {
            width: 1200px;
            height: 300px;
            background: #EEE;
        }
    </style>
    <script type="text/javascript" src="<%=path %>/js/jquery-3.1.1.min.js"></script>
</head>
<body>
<table width="100%" border="1">
    <tr>
        <td>学号</td>
        <td>姓名</td>
    </tr>
    <tr>
        <td>${student.stu_id }</td>
        <td>${student.username }</td>
    </tr>
</table>

<script type="text/javascript">

</script>
</body>
</html>
