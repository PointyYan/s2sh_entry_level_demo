<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2018/5/20
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会员登录</title>
</head>
<body>
<s:form action="memberLogin" method="post">
    <s:textfield name="member.name" label="会员姓名"></s:textfield>
    <s:password name="member.password" label="会员口令"></s:password>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
