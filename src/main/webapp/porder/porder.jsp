<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5" import="Model.customer"%>
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
 
 
  <h2><%=cu.getName() %>�q��</h2>

<a  href="addPorder.jsp" class="list-group-item">�s�W�q��</a>

</div>
<div class="activity" class="col-8" align=center  >
<hr>
<h2 class="bg-success">���P�~�y����</h2>
<p ><strong><mark>���O����d���E����</mark></strong></p>
<br>
<p>�x�F�~�@�اY�N�R�@�P�~�A���F�^�X��������ڭ̪��U��
<p>�Y��_��3/31�_�A�|�����O����d</p><br>
<p>�ɤE�����u�f</p>
<br>
<p>�ثe�c�檺�ձ��]�����|���w����s�A�q�д���</p>

<p>�Y��_�[�J�|�������|��p§��(�ձ��]���J�@�թάO���q�o�M)</p>
<p>�X�ܷ|���쩱�����O���E��</p>
<br>
</div>

</table></form>
<tr><td height=50 align=center><jsp:include page="end.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>