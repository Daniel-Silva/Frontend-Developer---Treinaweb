$('div')
	.css({
		'background': 'lightblue',
		'color': 'red'
	});

$('td:last')
    .css('background', 'aquamarine');

/* FILTRANDO ELEMENTOS */

// first() - Retorna o primeiro elemento
// last() - Retorna o ultimo elemento
// end() - Concatena funções
// eq() - Retorna o elemento de acordo com o indice passado
// add() - Adiciona mais uma seleção
// not() - Nega o elemento que não deve ser selecionado
// slice() - Retorna um intervalo (indice inicial , indice final)
//has() - Retorna um elemento que contenha outro indicado na função


/* ELEMENTOS IRMÃOS */

// closest() - Retorna o elemento mais próximo do elemento selecionado
// siblings() - Retorna os irmãos do elemento selecionado
// next() - Retorna um elemento depois do elemento selecionado
// prev() -  Retorna um elemento anterior do elemento selecionado
// nextAll() -  Retorna todos os elementos depois do elemento selecionado
// prevAll() - Retorna todos os elementos anteriores do elemento selecionado
// nextUntil() - Retorna todos os elementos depois do elemento selecionado até o pornto de parada indicado na função
// prevUntil() - Retorna todos os elementos anteriores do elemento selecionado até o ponto de parada indicado na função

/* ELEMENTOS PAIS E FILHOS */

