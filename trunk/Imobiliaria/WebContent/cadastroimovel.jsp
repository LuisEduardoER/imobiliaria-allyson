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
        <li><a href="inicio.jsp">Inicio</a></li>
        <li><a href="cadastroimovel.jsp">Cadastrar Im�vel</a></li>
        <li><a href="ServletListaImovel">Pesquisar Im�vel</a></li>
      </ul>
    </div>
  </div>
   <div class="column1">
  
</div>
 <div class="column2">
 <div class="left_box">
        <div class="top_left_box"> </div>
        <div class="center_left_box">
          <div class="box_title">Pesquisar Im�vel</div>
          <div class="form">
            <div class="form_row">
              <label class="left">Cidade: </label>
              <input type="text" class="form_input" name="cidade" id="cidade" />
            </div>
            <div class="form_row">
              <label class="left">Estado: </label>
              <input type="text" class="form_input" name="estado" id="estado"/>
            </div>
            <div class="form_row">
              <label class="left">Pre�o: </label>
              <input type="text" class="form_input" value="Valor da venda" name="valvenda" id="valvenda" />
            </div>
            <div class="form_row">
              <label class="left">Pre�o: </label>
              <input type="text" class="form_input" value="Valor da locacao"  name="vallocacao" id="vallocacao"/>
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
            </div>
            <div class="form_row">
              <input type="checkbox" name="pretende" id="pretende" />
              Comprar</div>
            <div class="form_row">
              <input type="checkbox" name="pretende" id="pretende" />
              Alugar</div>
           
            <div style="float:right; padding:10px 25px 0 0;">
              <input type="button" value="Cadastrar" />
            </div>
          </div>
        </div>
        <div class="bottom_left_box"> </div>
      </div>
     
    </div>


</div>

</html>