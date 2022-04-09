<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Model.customer"%>
<%customer cu=(customer)session.getAttribute("cu") ;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"> 
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
p{
font-size:20px;
}
  </style>
  
</head>
<body>
<jsp:include page="title.jsp"/>
<table width=700 align=center border=2>

<tr> <td height=400>
<form action="confirm.jsp" method="post">
 <table width=600 align=center>
 <tr><td align=center>
 <div class="row">
 <div class="col-12" align=center >
 
 
  <h2><%=cu.getName() %>登入成功</h2>
<br>
<a href="../porder/porder.jsp">我想找商品</a>
</div>
<div class="activity" class="col-8" align=center  >
<hr>
<h2 >店周年慶活動</h2>
<p ><strong><mark>消費滿兩千打九五折</mark></strong></p>
<br>
<p>鬧鄰居咖啡即將買一周年，為了回饋長期支持我們的顧客
<p>即日起到3/31起，會員消費滿兩千</p><br>
<p>享九五折優惠</p>
<br>
<p>目前販賣的耳掛包種類會不定期更新，敬請期待</p>

<p>即日起加入會員有機會抽小禮物(耳掛包五入一組或是限量濾杯)</p>
<p>出示會員到店內消費打九折</p>
<br>
</div>

</table></form>
<tr><td height=50 align=center><jsp:include page="end.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>