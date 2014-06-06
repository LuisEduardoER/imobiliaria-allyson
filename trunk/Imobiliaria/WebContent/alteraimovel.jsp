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
<%

	Imovel imovel =  (Imovel) session.getAttribute("imovel");
	
%>  
<div id="main_container">
  <div id="header">
    <div class="banner_adds"></div>
    <div class="menu">
      <ul>
        <li><a href="inicio.jsp">Inicio</a></li>
        <li><a href="cadastroimovel.jsp">Cadastrar Imóvel</a></li>
        <li><a href="ServletListaImovel">Pesquisar Imóvel</a></li>
      </ul>
    </div>
  </div>
   <div class="column1">
  <div class="left_box">
        <div class="top_left_box"> </div>
        <div class="center_left_box">
          <div class="box_title">Bem vindo</div>
          <div class="form">
            <div class="box_title">
              
</div>
            
             
            <div style="float:right; padding:10px 25px 0 0;">
            
            </div>
          </div>
        </div>
        <div class="bottom_left_box"> </div>
      </div>
</div>
 <div class="column2">
 <div class="left_box">
        <div class="top_left_box"> </div>
        <div class="center_left_box">
          <div class="box_title">Alterar Imóvel</div>
          <div class="form">
          <form action="ServletAlteraImovel" method="get">
          <input id="iid" type="hidden"class="form_input" name="iid" value="<%=imovel.getIdimovel()%>">
            <div class="form_row">
              <label class="left">Cidade: </label>
              <input type="text" class="form_input" name="cidade" id="cidade" />
            </div>
            <div class="form_row">
              <label class="left">Estado: </label>
              <input type="text" class="form_input" name="estado" id="estado"/>
            </div>
            <div class="form_row">
              <label class="left">Preço da venda: </label>
              <input type="text" class="form_input"  name="valvenda" id="valvenda" />
            </div>
            <div class="form_row">
              <label class="left">Preço da locação: </label>
              <input type="text" class="form_input"   name="vallocacao" id="vallocacao"/>
            </div>
            <div class="form_row">
              <label class="left">Tipo: </label>
              <select name="tipo" id="tipo" >
               <option value="apartamento">Apartamento</option>
               <option value="casa">Casa</option>
               <option value="flat">Flat</option>
  				<option value="terreno">Terreno</option>
           </select>
            </div>
            <div class="form_row">
              <label class="left_long">Pretende:</label>
              <input type="checkbox" name="pretende" id="pretende" value="vender"/>
              Vender
              <input type="checkbox" name="pretende" id="pretende" value="alugar"/>
              Alugar</div>
         
            <div style="float:right; padding:10px 25px 0 0;">
              <input type="button" value="alterar" onclick="validaImovel();"/>
            </div>
            </form>
          </div>
        </div>
        <div class="bottom_left_box"> </div>
      </div>
     
    </div>


</div>

</html>