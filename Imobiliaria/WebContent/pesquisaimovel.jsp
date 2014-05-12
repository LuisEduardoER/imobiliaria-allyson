<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="beans.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">




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
        <li><a href="inicio.jsp">Inicio</a></li>
        <li><a href="cadastroimovel.jsp">Cadastrar Imóvel</a></li>
        <li><a href="pesquisaimovel.jsp">Pesquisar Imóvel</a></li>
      </ul>
    </div>
  </div>
   <div class="column1">
  
</div>
 <div class="column4">
  <div class="left_box">
        <div class="top_left_box"> </div>
        <div class="center_left_box">
          <div class="box_title">Pesquisar Imovel</div>
          <div class="form">
          
          <form action="ServletListaImovel" method="get">
  	       
              <% 
	ArrayList<Imovel> lista = (ArrayList<Imovel>) session.getAttribute("lista");
	%>
            
  	       
		    <table border="1">
			<tr>
				<th> IdImovel </th>
				<th> tipo </th>
				<th> estado </th>
				<th> cidade </th>
				<th> valor venda </th>
			</tr>
			<%
			//for (Usuario u: lista){
			for(int i=0; i < lista.size(); i++){
				Imovel u  = lista.get(i);
			%>
			 
			<tr>
				<td> <%= u.getIdimovel() %> </td>
				<td> <%= u.getTipo() %> </td>
				<td> <%= u.getEstado() %> </td>
				<td> <%= u.getCidade() %> </td>
				<td> <%= u.getValvenda() %> </td>
				<td>  <a href="ServletExcluirImovel?id=<%= u.getIdimovel() %>"> Excluir </a> /  <a href="ServletAlterarImovel?id=<%= u.getIdimovel() %>">Alterar</a> </td>
			</tr>
		
			<%
				}
			%>
		
</table><input type="button" value="pesquisar" /></form>
           </div>
        </div>
        <div class="bottom_left_box"> </div>
      </div>
     
    </div>

</div>
</body>
</html>