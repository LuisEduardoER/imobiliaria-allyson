/**
 * 
 */

function verificarcampos(){
	var form = document.forms[0];
	var usuario = document.getElementById('usuario');
	var senha = document.getElementById('senha');
	
	if(usuario.value == ''){
		alert('Informe o usu�rio');
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
	alert('Cadastro Conclu�do');
}


function validaCadastro(){
	
	var form = document.forms[0];
	cadusuario =  document.getElementById('cadusuario');
	cadsenha =  document.getElementById('cadsenha');
	
	
	if(cadusuario.value==''){
		alert('usuario � obrigat�rio!');
		usuario.focus();
		return false;
	}
	if(cadsenha.value==''){
		alert('Senha � obrigat�rio!');
		senha.focus();
		return false;
	}else{
		alert('Usu�rio Cadastrado!');
		form.submit();
	}
	
}