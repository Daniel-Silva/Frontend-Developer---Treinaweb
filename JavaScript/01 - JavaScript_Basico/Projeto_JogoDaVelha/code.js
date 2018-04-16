var divElement = document.querySelector('div'),
    tableElement = document.querySelector('table'),
    btnElement = document.querySelector('input');


var Game = {
    start: function(){
        this.field = [
            ['','',''],
            ['','',''],
            ['','','']
        ];
        this.currentPlayer = 'X';
        this.isFinished = false;
        this.round = 0;
        this.render();
    },
    render: function(){
        var template = '';
        this.field.forEach((line, lineIndex) => {
            template += '<tr>';
            line.forEach((column, columnIndex) => {
                template += '<td onClick="Game.setField(${lineIndex, columnIndex})">${column}</td>'
            })
            template += '</tr>'
        })
    }
}

Game.start();