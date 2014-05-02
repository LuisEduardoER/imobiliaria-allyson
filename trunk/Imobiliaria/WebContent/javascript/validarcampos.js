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
	usuario =  document.getElementById('usuario');
	senha =  document.getElementById('senha');
	
	
	if(usuario.value==''){
		alert('usuario é obrigatório!');
		usuario.focus();
		return false;
	}
	if(senha.value==''){
		alert('Senha é obrigatório!');
		senha.focus();
		return false;
	}else{
		form.submit();
	}
	
}