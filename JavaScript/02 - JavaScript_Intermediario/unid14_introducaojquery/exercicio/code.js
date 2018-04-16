$(document).ready(function(){
    var $titulo = $('#titulo');
    $titulo.text('Iniciando com Jquery');
    
    var $conteudo = $('#conteudo');
    var $input = $('<input>', {id:'txt', value:'Daniel Silva'});
    
    $conteudo.append($input);
    
    var $nome = $input.val();
    
    console.log($nome+' está aprendendo Jquery');
    
})