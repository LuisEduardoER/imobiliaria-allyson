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
              
 <% 
	Usuario usuAutenticado =  (Usuario)session.getAttribute("usuAutenticado");
	out.print(usuAutenticado.getUsuario());
%></div>
            
             
            <div style="float:right; padding:10px 25px 0 0;">
            
            </div>
          </div>
        </div>
        <div class="bottom_left_box"> </div>
      </div>
  
  
      <div class="left_box">
       
      </div>
  
</div>
 <div class="column2">
      <div class="small_title">Imóveis que ninguém compra.</div>
      <div class="offer_box"> <a href="#"><img src="images/p1.jpg" width="130" height="98" class="img_left" alt="" border="0" /></a>
        <div class="offer_info"> <span>For Sale 150 000 $</span>
          <p class="offer"> &quot;Casa mal assombrada.&quot; </p>
          <div class="more"><a href="#">...more</a></div>
        </div>
      </div>
      <div class="offer_box"> <a href="#"><img src="images/p2.jpg" width="130" height="98" class="img_left" alt="" border="0" /></a>
        <div class="offer_info"> <span>For Sale 220 000 $</span>
          <p class="offer"> &quot;A xuxa passaou por aqui.&quot; </p>
          <div class="more"><a href="#">...more</a></div>
        </div>
      </div>
    </div>
 <div class="column3">
      <div class="small_title">  _</div>
      <div class="offer_box"> <a href="#"><img src="images/p1.jpg" width="130" height="98" class="img_left" alt="" border="0" /></a>
        <div class="offer_info"> <span>For Sale 150 000 $</span>
          <p class="offer"> &quot;Vizinhos traficantes.&quot; </p>
          <div class="more"><a href="#">...more</a></div>
        </div>
      </div>
      <div class="offer_box"> <a href="#"><img src="images/p2.jpg" width="130" height="98" class="img_left" alt="" border="0" /></a>
        <div class="offer_info"> <span>For Sale 220 000 $</span>
          <p class="offer"> &quot;Sem criatividade para descrições.&quot; </p>
          <div class="more"><a href="#">...more</a></div>
        </div>
      </div>
    </div>
<div class="column4">
    
    </div>

</div>

</html>