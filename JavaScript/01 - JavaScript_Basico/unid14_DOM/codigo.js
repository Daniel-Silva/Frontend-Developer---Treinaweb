/*
var txtNome = document.getElementById('txtNome');
var txtPassword = document.getElementById('txtPassword');

txtNome.style['background-color'] = '#c3c3c3';
txtPassword.style['background-color'] = '#c3c3c3';

console.log(txtNome.value);
console.log(txtPassword.value);

//var inputs = document.getElementsByTagName('input');
//console.log(inputs);

var inputs = document.getElementsByClassName('login-input');

console.log(inputs);
*/

//var div = document.getElementById('text');

//var html = '<h1>TreinaWeb</h1>';

//div.innerHTML = html;

//var p = document.createElement('P');
//var pTesto = document.createTextNode('Aprendendo a criar elementos');

//p.appendChild(pTesto);
//div.appendChild(p);

/*
// onsubmit
function logar(){
	var txtNome = document.getElementById('txtNome');
	var txtPassword = document.getElementById('txtPassword');

	alert(txtNome.value+' '+txtPassword.value);

	return false;
}
*/

var form = document.forms[0];

form.addEventListener('submit',function(event){
	var txtNome = document.getElementById('txtNome');
	var txtPassword = document.getElementById('txtPassword');

	alert(txtNome.value+' '+txtPassword.value);

	event.preventDefault();
});