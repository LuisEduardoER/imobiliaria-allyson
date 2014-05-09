<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="beans.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/teste.css">
<script src="javascript/validarcampos.js" type="text/javascript"></script>
</head>
<body>
<div id="main_container">
  <div id="header">
    <div class="banner_adds"></div>
    <div class="menu">
      <ul>
        <li><a href="cadastrousu.jsp"> cadastre-se</a></li>
        <li></li>
        <li></li>
        <li></li>
      </ul>
    </div>
  </div>
   <div class="column1">
  
</div>
 <div class="column2">
  <div class="left_box">
        <div class="top_left_box"> </div>
        <div class="center_left_box">
          <div class="box_title">Login</div>
          <div class="form">
          
          <form action="ServletLogin" method="post">
			 <div class="form_row">
              <label class="left">Usuário: </label>
              <input type="text" name="usuario" id="usuario"  />
            </div>
             <div class="form_row">
              <label class="left">Senha: </label>
              <input type="password" name="senha" id="senha"/>
            </div>
			<br>		
			<input type="button" value="Login" onclick="verificarcampos();">
		</form><a href="cadastrousu.jsp"> cadastre-se</a></div>
        </div>
        <div class="bottom_left_box"> </div>
      </div>
     
    </div>
	<div class="column3">
      
      
      
    </div>

</div>
</body>
</html>