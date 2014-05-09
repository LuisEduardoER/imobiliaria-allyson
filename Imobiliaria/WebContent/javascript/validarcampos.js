/**
 * 
 */

function verificarcampos(){
	var form = document.forms[0];
	var usuario = document.getElementById('usuario');
	var senha = document.getElementById('senha');
	
	if(usuario.value == ''){
		alert('Informe o usuário');
		usuario.focus();
		return false;}
	if(senha.value == ''){
		alert('Informe a senha');
		senha.focus();
		return false;
	}else{
		form.submit();
	}
}

function mostrar(id)
{
var e = document.getElementById(id);
if(e.style.display == 'block')
e.style.display = 'none';
else
e.style.display = 'block';
}

function cadastrar(){
	alert('Cadastro Concluído');
}


function validaCadastro(){
	
	var form = document.forms[0];
	cadusuario =  document.getElementById('cadusuario');
	cadsenha =  document.getElementById('cadsenha');
	
	
	if(cadusuario.value==''){
		alert('usuario é obrigatório!');
		usuario.focus();
		return false;
	}
	if(cadsenha.value==''){
		alert('Senha é obrigatório!');
		senha.focus();
		return false;
	}else{
		alert('Usuário Cadastrado!');
		form.submit();
	}
	
}

function validaImovel(){
	var form = document.forms[0];
	cidade = document.getElementById('cidade');
	estado = document.getElementById('estado');
	pretende = document.getElementById('pretende');
	valvenda = document.getElementById('valvenda');
	vallocacao = document.getElementById('vallocacao');
	
	if(cidade.value==''){
		alert('campo vazio!');
		cidade.focus();
		return false;
	}if(estado.value==''){
		alert('campo vazio!');
		estado.focus();
		return false;
	}if(pretende.value==''){
		alert('campo pretende vazio!');
		return false;
	}if(valvenda.value==''){
		alert('campo vazio!');
		valvenda.focus();
		return false;
	}if(vallocacao.value==''){
		alert('campo vazio!');
		vallocacao.focus();
		return false;
	}else{
		alert('Imóvel Cadastrado!');
		form.submit();
	}
	
}
