<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="beans.Usuario" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Usuario u =  (Usuario) request.getAttribute("u");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
        <li><a href="index.html">Inicio</a></li>
        <li><a href="cadastrousu.jsp">Cadastrar Usuário</a></li>
        <li><a href="#">Cadastrar Imóvel</a></li>
        <li><a href="pesquisausu.jsp">Pesquisar Usuario</a></li>
      </ul>
    </div>
  </div>
   <div class="column1">
  
</div>
 <div class="column2">
  <div class="left_box">
        <div class="top_left_box"> </div>
        <div class="center_left_box">
          <div class="box_title">Cadastro</div>
          <div class="form">
          
          <form action="ServletCadastro"  method="get">
            <div class="form_row">
              <label class="left">Usuário: </label>
              <input type="text" name="usuario" id="usuario"  />
            </div>
             <div class="form_row">
              <label class="left">Senha: </label>
              <input type="password" name="senha" id="senha"/>
            </div>
            <div style="float:right; padding:10px 25px 0 0;">
              <input type="button" value="Enviar"  onclick="validaCadastro();"></div>
            </form></div>
        </div>
        <div class="bottom_left_box"> </div>
      </div>
     
    </div>


</div>
</body>
</html>