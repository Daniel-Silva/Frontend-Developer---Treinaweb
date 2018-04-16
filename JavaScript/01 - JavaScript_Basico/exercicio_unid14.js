window.onload = function(){
   var form = document.forms[0];
    
    var usuarios = [
        {
            nome: 'Daniel Silva',
            login: 'DanielSilva',
            senha: 'Daniel2017',
        },
        {
            nome: 'Flavia Silva',
            login: 'FlaviaSilva',
            senha: 'Flavia2017',
        }
    ]

    var validarUsuario = function(login, senha){
        for(indice in usuarios){
            var usuario = usuarios[indice];
            if(usuario.login === login && usuario.senha === senha){
                return true;
            }
        }
        return false;
    }

    var mostrarMensagem = function(tipo){
        var message = document.getElementById(tipo);
        message.style.display = 'block';
        var limparMensagem = function(){
            message.style.display = 'none';
            clearInterval(tempoDeVisibilidade);
        }
        var tempoDeVisibilidade = setTimeout(limparMensagem,2000);
    }

    form.addEventListener('submit', function(event){
        event.preventDefault();

        var login = document.getElementById('nome').value;
        var senha = document.getElementById('senha').value;

        if(validarUsuario(login, senha)){
            mostrarMensagem('success');
        }else{
            mostrarMensagem('error');
        }

    }); 
}



