        /* VARIAVEIS */
var btn = document.getElementById('btn');

        /* EVENTO DO BOTÃO */
btn.addEventListener('click', function(event){
    event.preventDefault();
    
    creatElementsTable(); //Chamando a função para criar table  

});

        /* FUNÇÃO PARA CRIAR A TABELA */
var creatElementsTable = function(){
    
    var tbody = document.getElementById('tbody-control');
    var form = document.querySelector('#form-control');    
    var paciente = getDataForm (form); // Salvando function na variável    
    var erro = validDataForm (paciente)
    
    if (erro.length > 0){
        var msgErro = document.querySelector('#msg-erro--input');
        
        msgErro.textContent = erro;
        
        return;
    }else{
        var msgErro = document.querySelector('#msg-erro--input');
        
        msgErro.textContent = erro;
    }
    
    // Criando a tabela com for
    for(tr = 0; tr < 1; tr++){
        
        var meuTr = document.createElement('tr');//Criando o tr
        
        meuTr.classList.add('paciente'); //Adicionando uma class ao tr
        
        // Criando os td com for
        for(td = 0; td < 5; td++){
            
            var linha = document.createElement('td');
            
            if ( td < 1 ){ //Verifica a posição do td
                var textoLinha = document.createTextNode(paciente.nome);
                linha.appendChild(textoLinha);
                linha.classList.add('info-nome'); 
                meuTr.appendChild(linha);
            }else if ( td < 2 ){ 
                var textoLinha = document.createTextNode(paciente.peso); 
                linha.appendChild(textoLinha); 
                linha.classList.add('info-peso'); 
                meuTr.appendChild(linha);
            }else if ( td < 3 ){ 
                var textoLinha = document.createTextNode(paciente.altura); 
                linha.appendChild(textoLinha); 
                linha.classList.add('info-altura'); 
                meuTr.appendChild(linha);
            }else if ( td < 4 ){ 
                var textoLinha = document.createTextNode(paciente.gordura); 
                linha.appendChild(textoLinha); 
                linha.classList.add('info-gordura'); 
                meuTr.appendChild(linha);
            }else if ( td < 5 ){
                var textoLinha = document.createTextNode(calcImc(paciente.peso, paciente.altura)); 
                linha.appendChild(textoLinha); 
                linha.classList.add('info-imc'); 
                meuTr.appendChild(linha); 
                break;
            }
            
            tbody.appendChild(meuTr); //adiciona o tr ao tbody do form
        }
    }
}

function getDataForm (form){
              /* OBJETOS */
    var formPaciente = {
        nome: form.nome.value,
        peso: +form.peso.value, // Este Obj recebe os valores do form
        altura: +form.altura.value,
        gordura: +form.gordura.value,
    }    
    return formPaciente;
}

function validDataForm (paciente) {
    
    var erros = [
        
    ]
    
    if ( !pesoValid(paciente.peso)){
        erros.push(' Peso inválido. Insira um valor válido no campo "peso"')
    }else{
        return '';
    }
    
    if ( !alturaValid(paciente.altura)){
        erros.push(' Altura inválida. Insira um valor válido no campo "altura"')
    }else{
        return '';
    }
    
    return erros;
}


    






