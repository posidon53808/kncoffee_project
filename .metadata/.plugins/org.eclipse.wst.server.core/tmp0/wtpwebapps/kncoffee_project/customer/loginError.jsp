<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Model.customer"%>
<%customer cu=(customer)session.getAttribute("cu") ;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"> 
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

aa{
font-size:20px;
font-color:black;
}
  </style>
  
</head>
<body>
<jsp:include page="title.jsp"/>
<table width=700 align=center border=2>
 
 <h1>帳號或密碼錯誤，請註冊</h1>
<h2><a href="login.jsp">重新登入</a><br></h2>
<h2><a href="register.jsp">註冊</a></h2>
</table></form>
<tr><td height=50 align=center><jsp:include page="end.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>