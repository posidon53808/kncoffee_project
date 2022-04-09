<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Model.customer"%>
    <% customer cu=(customer)session.getAttribute("cu"); %>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<title>登入頁面</title>
<style>
body{
width:100% ;
height: 100% ;
padding:0 ;
margin: 0;
background:url("IMG_8457.jpg") ;
background-size:cover;
background-attachment:fixed;
background-position:center;
}
a {
position:fixed;
left:50%;
top:50%;
transform:translate(-50%, -50%);
background:rgba(0,0,0,0.5) ;
text-align:center;
color: #fff;
font-size:40px ;
font-family: "微軟正黑體" , sans-serif;
border-radius:5px;
padding : 40 px;
width : 50%;
}
a{
position:fixed;
left:50%;
top:50%;
transform:translate(-50%, -50%);
font-size:20px ;
font-family: "微軟正黑體" , sans-serif;
padding:5px;
border-radius: 4px;
margin: 0 auto;
width:50%;
color : #000 ;}


</style>

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
<a href="index.jsp">重新登入</a>
</body>

</html>