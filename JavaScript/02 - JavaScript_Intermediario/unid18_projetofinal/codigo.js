$(document).ready(function(){

	var SNAKE = SNAKE || {
		view: {},
		controller: {},
		config: {}
	};

	(function initConfig(){
		this.$canvas = $('#snakeCanvas');
		this.gameWidth = this.$canvas.width();
		this.gameHeight = this.$canvas.height();
		this.cellWidth = 10;
		this.scoreTextStyle = '15px Verdana';
		this.color = {
			background: '#ffffff',
			boardBorder: '#2c3e50',
			score: '#895434',
			snake: {
				fill: '#e67e22',
				border: '#e357ee'
			},
			food: {
				fill: '#160a32',
				border: '#2e45ff'
			}
		}
	}).call(SNAKE.config);

	(function initView(config){
		var $canvas = config.$canvas[0],
			context = $canvas.getContext('2d');

		var paintCell = function(x, y, color){
			var cellWidth = config.cellWidth;

			context.fillStyle = color.fill;
			context.fillRect(x*cellWidth, y*cellWidth, cellWidth, cellWidth);
			context.strokeStyle = color.border;
			context.strokeRect(x*cellWidth, y*cellWidth, cellWidth, cellWidth);
		}

		var paintGameBoard = function(){
			var background  = config.color.background,
				gameWidth = config.gameWidth,
				gameHeight = config.gameHeight,
				boardBorder = config.color.boardBorder;

			context.fillStyle = background;
			context.fillRect(0,0,gameWidth,gameHeight);
			context.strokeStyle = boardBorder;
			context.strokeRect(0,0,gameWidth,gameHeight);
		}

		var paintSnake = function(snake){
			var snakeColor = config.color.snake;

			for(indice in snake){
				var snakeCell = snake[indice];
				paintCell(snakeCell.x, snakeCell.y, snakeColor);
			}
		}


		var paintScore = function(score){
			var scoreColor = config.color.score,
				scoreTextStyle = config.scoreTextStyle;

			context.font = scoreTextStyle;
			context.fillStyle = scoreColor;
			context.fillText(score,5,20);

		}

		paintGameBoard();
		paintScore(300);
	

	}).call(SNAKE.view, SNAKE.config);

	(function initController(){

	}).call(SNAKE.controller);

});