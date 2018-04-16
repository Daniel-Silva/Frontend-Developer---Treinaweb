window.onload = (function(){
    var form = document.getElementById('userForm');
    
     var getValue = function(id){
        return document.getElementById(id).value
    };
    
    var getElementsDOM = function(){
        var nome = getValue('nome');
        var idade = getValue('idade');
        var sexo = getValue('sexo');
        
        return new User({
            nome: nome,
            idade: idade,
            sexo: sexo
        });
    }
    
    var User = function(dados){
        this.nome = dados.nome;
        this.idade = dados.idade;
        this.sexo = dados.sexo;
        
        this.salvar = function(){
            console.log('O usuário '+this.nome+' foi cadastrado com sucesso!')
        }
    }
   
    
    form.addEventListener('submit', function(event){
        event.preventDefault();
        var user = getElementsDOM();
        user.salvar();        
    })
    
})