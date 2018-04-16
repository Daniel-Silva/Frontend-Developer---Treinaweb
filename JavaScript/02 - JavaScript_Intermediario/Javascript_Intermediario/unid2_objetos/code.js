function Pencil(color, length, msg){
    this.color = color;
    this.length = length;
    this.write = function(msg){
        console.log(msg)
    }
}

var myPencil = new Pencil('Red', 30);
var myPencil2 = new Pencil('Blue', 22);

console.log(myPencil)
console.log(myPencil2)

myPencil.write('Escrevendo em vermelho')
myPencil2.write('Escrevendo em azul')