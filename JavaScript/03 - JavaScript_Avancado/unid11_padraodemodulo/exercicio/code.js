var MYAPP = {
    modelos: {},
    viewls: {},
    controles: {},
}

MYAPP.modelos.User = function(valores){
    this.nome = valores.nome;
    this.idade = valores.idade;
    this.sexo = valores.sexo;
    
    this.save = function(){
        return 'O usuário '+this.nome+' foi cadastrado com sucesso!';
    };
    
    this.isValid = function(){
        return this.nome && this.idade && this.sexo;
    }
};

MYAPP.controles.user = (function(User){
    var save = function(userJSON){
        var user = new User (userJSON);
        if(user.isValid()){
            console.log(user.save());    
        }else{
            console.log('Erro ao cadastrar')
        }
        
    }
    
    return {
        save: save,
    }
})(MYAPP.modelos.User);

MYAPP.viewls.user = (function(userController){
    var form = document.getElementById('userForm');
    
     var getValue = function(id){
        return document.getElementById(id).value
    };
    
    var getElementsDOM = function(){
        var nome = getValue('nome');
        var idade = getValue('idade');
        var sexo = getValue('sexo');
        
        return {
            nome: nome,
            idade: idade,
            sexo: sexo
        };
    }

    form.addEventListener('submit', function(event){
        event.preventDefault();
        userController.save(getElementsDOM())
    })
})(MYAPP.controles.user)

