$(document).ready(function(){
    var $titulo = $('#titulo');
    $titulo.text('Daniel Silva');
    
    var $nome = $('#nome');
    console.log($nome);
    $nome.val('Matheus Silva');
    
    
    //Criando elementos com JQuery
    
    var $conteudo = $('#conteudo');
    var $titulo = $('<h1>', {text:'Texto inserido via JQuery'});
    
    $conteudo.append($titulo);
})