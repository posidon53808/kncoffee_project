<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel= "stylesheet" type="text/css" href=";css/login.css"/>
<meta charset="BIG5">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<title>登入頁面</title>


</head>
<body>
<header>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">knowledgecafe</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">首頁 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">菜單</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">課程介紹</a>
      </li>
      
    </ul>
  </div>
</nav>
</header>
<form action="loginController" method="post" class="login">
<h1>登入</h1>
<i class="fa-regular fa-face-grin"></i>
<h2>帳號</h2>
<input type="text" name="username" placeholder="請輸入帳號">
<h2>密碼</h2>
<input type="password" name="password" placeholder="請輸入密碼">
<button type="submit">登入</button>
</form>
 <script src="js/jquery-3.4.1.js"></script>
    <script src="js/bootstrap.js"></script>
</body>

</html>