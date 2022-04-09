<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Model.customer"%>
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
form {
position:fixed;
left:50%;
top:50%;
transform:translate(-50%, -50%);
background:rgba(0,0,0,0.5) ;
text-align:center;
font-color:#fff;
font-size:20px ;
font-family: "微軟正黑體" , sans-serif;
border-radius:5px;
padding : 40 px;
width : 50%;
}
h1{
color: #fff;
}
input{
color:black;
}
td{
color:#fff;
}

</style>

</head>
<body>
<h1 align=center>Knowledge cafe會員註冊</h1>
<form action="registerController" method="post">
<table width=500 align=center>
<tr>
<td colspan=2 align="center"><h3>註冊</h3>
<tr><td colspan=2>
<hr>
			<tr>
				<td width=150 height=50 align=center>姓名 :
				<td><input type="text" name="name">
			<tr>
				<td width=150 height=50 align=center>帳號 :
				<td><input type="text" name="username">
			<tr>
				<td width=100 height=50 align=center>密碼 :
				<td><input type="password" name="password">
			<tr>
				<td width=100 height=50 align=center>地址 :
				<td><input type="text" name="address">
			<tr>
				<td width=100 height=50 align=center>電話 :
				<td><input type="text" name="phone">
		
				<tr>
				<td colspan=2>
				<hr>
 			<tr>
 			<td colspan=2 align=center>
 			<input type="submit" value="ok">


</table>

</form>
</body>
</html>