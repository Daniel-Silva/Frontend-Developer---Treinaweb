

    var getPacientes = document.querySelectorAll('.paciente');
    
    for (i = 0; i < getPacientes.length; i++){
        var paciente = getPacientes[i];
        
        var pacientes = {
            getNome: paciente.querySelector('.info-nome'),
            getPeso: paciente.querySelector('.info-peso'),
            getAltura: paciente.querySelector('.info-altura'),
            getGordura: paciente.querySelector('.info-gordura'),
            getImc: paciente.querySelector('.info-imc'),
        }

        var nome = pacientes.getNome.textContent;
        var peso = pacientes.getPeso.textContent;
        var altura = pacientes.getAltura.textContent;
        var gordura = pacientes.getGordura.textContent;
        var imc = calcImc (peso, altura);
        var validPeso = pesoValid(peso);
        var validAltura = alturaValid(altura);

        if (!validPeso){
            pacientes.getPeso.textContent = 'Peso Inválido';
            paciente.classList.add('paciente-invalido');
        }
        if (!validAltura){
            pacientes.getAltura.textContent = 'Altura Inválida';
            paciente.classList.add('paciente-invalido')
        }
        if (validAltura && validPeso){
            pacientes.getImc.textContent = imc;
        }
    }


function calcImc (peso, altura) {
    var imc = 0;
    var imc = peso / (altura * altura);
    
    return imc.toFixed(2);
}

function pesoValid (peso) {
    if (peso > 0 && peso <= 580){
        return true;
    }else{
        return false;
    }
}

function alturaValid (altura) {
    if (altura > 0 && altura <= 2.55){
        return true;
    }else{
        return false;
    }
}


     

