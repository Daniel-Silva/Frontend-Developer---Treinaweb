var quandoPronto = (function(){
    
    var funcs = [];
    var pronto = false;
    
    function controladora (e){
        if(pronto) return;
        
        if(e.type === 'readystatechang' && document.readyState !== 'complete'){
            return;
        }
        
        for (i = 0; i < funcs.length; i++){
            funcs[i].call(document);
        }
        
        ready = true;
        funcs = null;
        
        if (document.addEventListener){
            document.addEventListener("DOMContentLoaded", controladora, false);       document.addEventListener("readystatechange", controladora, false);         window.addEventListener("load", controladora, false)
        }else{          
            alert("Esta função não é suportada pelo navegador!");     return;      
        }
        
        return function quandoPronto (f){
            if (pronto){
                f.call(document);
            }else{
                funcs.push(f);
            }
        }
    }
})();

var obj = document.getElementsByTagName('h2');

function cordenadas (event){
    var x = event.clientX;
    var y = event.clientY;
    
    console.log('Coordenadas de x: '+ x +' Coordenadas de y: '+y)
}

obj[0].addEventListener('click', cordenadas)