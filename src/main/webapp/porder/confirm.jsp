<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Model.porder" import="Model.customer"%>
    <%
    int A=Integer.parseInt(request.getParameter("A"));
    int B=Integer.parseInt(request.getParameter("B"));
    int C=Integer.parseInt(request.getParameter("C"));
    int D=Integer.parseInt(request.getParameter("D"));
    int E=Integer.parseInt(request.getParameter("E"));
    int F=Integer.parseInt(request.getParameter("F"));
    porder p=new porder(A,B,C,D,E,F);
    customer c=(customer)session.getAttribute("cu");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>訂單確認</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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
order{

position:fixed;
left:50%;
top:50%;
transform:translate(-50%,-50%);
background:rgba(0,0,0,0.5) ;
text-align:center;
color: #fff;
font-family: "微軟正黑體" , sans-serif;
border-radius:5px;
padding : 40 px;
width : 50%;
}

</style>
</head>
<body>
<jsp:include page="title.jsp"/>
<table class="order" width=700 height=500 align=center border=2>
<h2 align=center>訂單數量與品項確認</h2>

 <tr><td align=center>HARIO V60 Drip Scale HARIO電子秤： <%=p.getA() %><br>
 <tr><td align=center>KALITA 蝶番付手沖壺 0.7公升 SWAN NECK KETTLE： <%=p.getB() %><br>
 <tr><td align=center>泰摩冰瞳濾杯TIMEMORE CRYSTAL EYE DRIPPER： <%=p.getC() %><br>
 <tr><td align=center>天堂鳥： <%=p.getD() %><br>
 <tr><td align=center>巴西 摩吉安娜： <%=p.getE() %><br>
 <tr><td align=center>耶加雪非日曬： <%=p.getF() %><br>
 <tr><td align=center>總金額：<%=p.getSum() %><br>
 <tr><td align=center>折扣後的金額：<%=p.getDiscountPrice() %> <br>
<a href="addPorderController">確定</a>
<tr><td height=100 align=center><jsp:include page="end.jsp"/>
</table>
<% session.setAttribute("P",p); %>
</body>
</html>