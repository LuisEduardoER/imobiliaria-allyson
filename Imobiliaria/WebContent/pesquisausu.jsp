<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="beans.Usuario" %>
<%@ page import="java.util.*" %>

<% 
	List<Usuario> lista = (List<Usuario>) session.getAttribute("lista");
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
        <li><a href="inicio.html">Inicio</a></li>
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
          <div class="box_title">Pesquisar por Usuario</div>
          <div class="form">
          
          <form action="ServletListaUsuario" method="get">
  	       
              <input type="submit" value="pesquisar" />
            
  	       </form>
		    <table border="1">
			<tr>
				<th> usuario </th>
				<th> Senha </th>
			</tr>
			<%
			for (Usuario u: lista){
			%>
			
			<tr>
				<td> <%= u.getId() %> </td>
				<td> <%= u.getUsuario() %> </td>
				<td> <%= u.getSenha() %> </td>
			</tr>
		
			<%
				}
			%>
		
</table>
           </div>
        </div>
        <div class="bottom_left_box"> </div>
      </div>
     
    </div>
	<div class="column3">
      
      <div class="left_box">
        <div class="top_left_box"> </div>
        <div class="center_left_box">
          <div class="box_title">Pesquisar por nome</div>
          <div class="form">
          
         
            <div style="float:right; padding:10px 25px 0 0;">
              <input type="button" value="Enviar" ></div>
            </div>
        </div>
        <div class="bottom_left_box"> </div>
      </div>
    </div>

</div>
</body>
</html>