var form = document.forms[0];

form.addEventListener('submit', function novoUsuario(event){
	event.preventDefault();
	var nome = document.getElementById('txNome').value;
	var email = document.getElementById('txtEmail').value;

	alert(nome+' '+email);
});