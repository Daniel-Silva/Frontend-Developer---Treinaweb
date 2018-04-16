var MEUPACIENTE = {
    modelos: {},
    viewls: {},
    controles: {},
}

    // MODELOS

MEUPACIENTE.modelos.User = function(params){
    this.nome = params.nome;
    this.peso = params.peso;
    this.altura = params.altura;
    this.gordura = params.gordura;
    this.imc = params.imc;
    
};

    // VIEWLS

MEUPACIENTE.viewls.getPatients = (function(){
    var patient = document.querySelectorAll('.paciente');
    
    return {
        patient: patient
    }
       
})();

    // CONTROLES
    
MEUPACIENTE.controles.validDataPatients = (function(data){
    var dataPatients = data;
    for (index in dataPatients){
        var patients = dataPatients[index];
        for(i = 0; i < patients.length; i++){
            var patient = patients[i];
            
            var patientsObj = {
                getNome: patient.querySelector('.info-nome'),
                getPeso: patient.querySelector('.info-peso'),
                getAltura: patient.querySelector('.info-altura'),
                getGordura: patient.querySelector('.info-gordura'),
                getImc: patient.querySelector('.info-imc')
            }
            
            var nome = patientsObj.getNome.textContent;
            var peso = patientsObj.getPeso.textContent;
            var altura = patientsObj.getAltura.textContent;
            var imc = calcImc(peso, altura); 
            var weightValid = validWeight(peso, altura);
            var heightValid = validHeight(altura);
            
            if(!weightValid){
                patientsObj.getPeso.textContent = 'Peso Inválido';
                patient.classList.add('paciente-invalido')
            }
            if(!heightValid){
                patientsObj.getPeso.textContent = 'Altura Inválida';
                patient.classList.add('paciente-invalido')
            }
            if(weightValid && heightValid){
                patientsObj.getImc.textContent = imc;
            }
        }
        
    }
    
    function calcImc (peso, altura){
        var imc = 0;
        var imc = peso / (altura * altura);
        
        return imc.toFixed(2);
    }
    
    function validWeight (peso){
        if(peso <= 0 && peso >= 580){
            return true;
        }else{
            return false;
        }
    }
    
    function validHeight (altura){
        if(altura <=0 && altura >= 2.55 ){
            return true
        }else{
            return false
        }
    }
    
    
    
})(MEUPACIENTE.viewls.getPatients)