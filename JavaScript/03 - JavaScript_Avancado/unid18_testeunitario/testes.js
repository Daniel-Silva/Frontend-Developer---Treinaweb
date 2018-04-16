var Player = function(name){
    this.name  = name;
    this.level = 0;
}

Player.prototype.levelUp = function(){
    this.level++;
}


QUnit.test('Testando um Player', function(assert){
    var player1 = new Player('Daniel');
    var player2 = new Player('Matheus');
    var player3 = new Player('Daniel');
    
    assert.expect(3);
    assert.notDeepEqual(player1, player2, 'Player1 é diferente de Player2');
    assert.deepEqual(player1, player3, 'Player1 é igual ao Player3');
    
});


QUnit.test('Testando propiedades do Player', function(assert){
    var player1 = new Player('Flávia');    
    var player2 = new Player('Matheus');    
    var player3 = new Player('Lena');
    
    assert.expect(4);
    assert.equal(player1.name, 'Flávia', 'Player1.name = Flávia');
    assert.equal(player2.name, 'Matheus', 'Player2.name = Matheus');
    
    player1.levelUp();
    player2.levelUp();
    player2.levelUp();
    
    assert.equal(player1.level, 1, 'Player1.level = 1');
    assert.equal(player2.level, 2, 'Player2.level = 2');
});