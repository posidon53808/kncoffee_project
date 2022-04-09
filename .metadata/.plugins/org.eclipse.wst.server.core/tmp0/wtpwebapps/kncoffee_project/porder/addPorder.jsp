<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Model.customer"%>
    <%customer c=(customer)session.getAttribute("cu");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style>
body{
width:100% ;
height: 100% ;
padding:0 ;
margin: 0;
background:url("page.jpg") ;
background-size:cover;
background-attachment:fixed;
background-position:center;
}
h1{color:red;
   font-weight: bold;}
   select{margin-top:10px;}
</style>
</head>
<body>
<jsp:include page="title.jsp"/>
<table width=700 align=center border=2>
<tr> <td height=600>
<form action="confirm.jsp" method="post">
 <table width=900 align=center border=3>
<tr><td colspan=3 align=center><h1>商品項目<h1><hr>

<tr><td align=center>HARIO V60 Drip Scale HARIO電子秤：<br>
<img src="photo/HARIO V60 Drip Scale HARIO電子秤.jpg"
 alt="HARIO V60 Drip Scale HARIO"
 width="200"
 height="200">
<select name="A">
<option value="0">0</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
</select>
<hr>
<td align=center>KALITA 蝶番付手沖壺 0.7公升 SWAN NECK KETTLE：<br>
<img src="photo/KALITA 蝶番付手沖壺 0.7公升 SWAN NECK KETTLE.jpg"
 alt="KALITA 蝶番付手沖壺 0.7公升 SWAN NECK KETTLE"
 width="200"
 height="200">
<select name="B">
<option value="0">0</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
</select><hr>
<td align=center>泰摩冰瞳濾杯TIMEMORE CRYSTAL EYE DRIPPER：<br>
<img src="photo/泰摩冰瞳濾杯TIMEMORE CRYSTAL EYE DRIPPER.jpg"
 alt="泰摩冰瞳濾杯TIMEMORE CRYSTAL EYE DRIPPER"
 width="200"
 height="200">
<select name="C">
<option value="0">0</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
</select>
<hr>
<tr><td align=center>天堂鳥-耳掛包：<br>
<img src="photo/天堂鳥.jpg"
 alt="天堂鳥-耳掛包"
 width="200"
 height="200">
<select name="D">
<option value="0">0</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
</select><hr>
<td align=center>巴西 摩吉安娜-耳掛包：<br>
<img src="photo/巴西 摩吉安娜.jpg"
 alt="巴西 摩吉安娜-耳掛包"
 width="200"
 height="200">
<select name="E">
<option value="0">0</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
</select><hr>
<td align=center>耶加雪非日曬-耳掛包：<br>
<img src="photo/耶加雪非日曬.jpg"
 alt="耶加雪非日曬-耳掛包"
 width="200"
 height="200">
<select name="F">
<option value="0">0</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>


</select>
<hr>
<tr><td colspan=3 align=center>
<input style=mb-3 type="submit" value="提交">
<a href="porder.jsp">回上一頁</a>







<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</table></form>
<tr><td height=100 align=center><jsp:include page="end.jsp"/>
</body>
</html>