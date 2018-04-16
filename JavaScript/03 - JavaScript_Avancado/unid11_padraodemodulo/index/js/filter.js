var filter = document.querySelector('#filter');

filter.addEventListener('input', function(){
        
    var paciente = document.querySelectorAll('.paciente');
    
    
    if (this.value.length > 0){
        for(i = 0; i < paciente.length; i++){
            var pacientes = paciente[i];
            var getNome = pacientes.querySelector('.info-nome');
            var nome = getNome.textContent;
            var expressao = new RegExp(this.value, 'i');
            
            if (!expressao.test(nome)){
                pacientes.classList.add('invisible');
            }else{
                pacientes.classList.remove('invisible');
            }
        } 
    }else{
        for(i = 0; i < paciente.length; i++){
            var pacientes = paciente[i];
            pacientes.classList.remove('invisible');
        }
    }
    
})