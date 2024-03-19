# Checker Game

This Java program implements a simple version of the checker game. It includes classes for managing the game loop, representing the game board, pieces, moves, and players.

## CheckerBoard Class

The `CheckerBoard` class represents the game board and contains game logic. It includes methods for checking if the game is over, making moves, getting the current player, determining the winner, and printing the board.

## CheckerGame Class

The `CheckerGame` class manages the game loop and coordinates the players and the board. It includes a `play()` method that runs the game loop until it's over, printing the board, getting the current player's move, and moving pieces accordingly.

## Move Class

The `Move` class represents a move that a player can make in the game. It has properties for the starting and ending positions of a piece on the board.

## Piece Class

The `Piece` class represents a piece on the checkerboard. It has properties for color and whether it's a king. It also includes a method for making a piece a king.

## PieceColor Enum

The `PieceColor` enum represents the color of a piece, either black or white.

## Player Class

The `Player` class represents a player in the game. It includes properties for the player's name and color. The `getMove()` method is responsible for getting the player's move, which in this implementation returns a random move from the list of valid moves obtained from the `CheckerBoard` class.

## Note

This is a simplified version of the checker game and lacks advanced features such as capturing multiple pieces, jumping over opponents' pieces, and implementing specific rules for king pieces. It serves as a basic demonstration of the game's mechanics.

## Contributions

Contributions to enhance the game's functionality or add new features are welcome. Please feel free to fork the repository and submit a pull request.
