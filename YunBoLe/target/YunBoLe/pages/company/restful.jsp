<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>企业方法测试</title>
</head>
<body>
<h2>注册测试</h2>
<form action="company/regist" method="post">
    <%--不执行post  执行put，需要加下面的语句--%>
    <input type="hidden" name="_method" value="PUT"/>
    companyId:<input type="text" name="companyId"><br>
    companyPwd:<input type="text" name="companyPwd"><br>
    companyTel:<input type="text" name="companyTel"><br>
    creationTime:<input type="text" name="creationTime"><br>
    <input type="submit" value="增加">
</form>

</body>
</html>
