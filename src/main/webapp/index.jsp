<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/7/3
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录与注册</title>
    <link rel="shortcut icon" href="WebContext/image/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="WebContext/css/login.css">
</head>

<body>
<%--容器--%>
<div class="container" name="container">
    <%--    注册--%>
    <div class="form-container sign-up-container" name="sign_up_container">
        <div class="form" name="form_register">
            <h2>注册</h2>
            <form action="RegisterServlet" method="post">
                <input type="text" name="username" id="username_register" placeholder="用户名">
                <input type="email" name="email" id="email_register" placeholder="邮箱">
                <input type="password" name="password" id="password_register" placeholder="密码">
                <button class="signUp" type="submit" onclick="Check()">注册！</button>
            </form>
        </div>
    </div>
    <%--    登录--%>
    <div class="form-container sign-in-container">
        <div class="form">
            <h2>登录</h2>
            <input type="text" name="username" id="username_login" placeholder="用户名">
            <input type="password" name="password" id="password_login" placeholder="密码">
            <a href="#" class="forget-password">忘记密码？</a>
            <button class="signIn">登录</button>
        </div>
    </div>
    <%--层外容器--%>
    <div class="overlay_container">
        <div class="overlay">
            <%--            左--%>
            <div class="overlay_panel overlay_left_container">
                <h2>你好（装作严肃）</h2>
                <p>但是你还是要注册（被打）</p>
                <button id="sign-in">登录</button>
            </div>
            <%--右--%>
            <div class="overlay_panel overlay_right_container">
                <h2>回来了？</h2>
                <p>但是你还是要登录（被打）</p>
                <button id="sign-up">注册</button>
            </div>
        </div>
    </div>
</div>


<script src="WebContext/js/login.js"></script>
</body>
</html>
