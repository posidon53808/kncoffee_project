<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5" import="Model.customer"%>
    <%customer c=(customer)session.getAttribute("cu");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>�q�槹��</title>
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
</style>
</head>
<body>
<jsp:include page="title.jsp"/>
<table width=700 align=center border=2>
<tr> <td height=400>
<form action="confirm.jsp" method="post">
 <table width=600 align=center border=2>
<h1><%=c.getName() %>�q��w�e�X!</h1><br>
<a href="porder.jsp">�^�ʪ�����</a><br>
</form>
<form action="logoutController" method="post">
<input type="submit" value="�n�X"></form>
<table width=700 align=center border=3><hr>
<tr><td>�I�ڤ覡�G�l���״�<td>�b���G700-454362-64626</td></tr>
<tr>*�I�ڪ`�N�ƶ�</tr>
<td><p>�Щ�U�q�椧�᪺�T�Ѥ��I��</p></td></table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<tr><td height=100 align=center><jsp:include page="end.jsp"/></table></form>
</body>
</html>