# Overview
This Java program implements a classic 2-player Tic-Tac-Toe game. Players take turns marking spaces on a 3x3 grid with their respective symbols (X or O). The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins the game. If the board is filled without a winner, the game ends in a draw.
## How to Run
 * Compile the Java code:
   * Ensure you have a Java Development Kit (JDK) installed.
   * Compile the main class (e.g., tictactoe.java) using the following command:
     javac tictactoe.java

 ## Run the program:
   * Execute the compiled class file:
     java tictactoe

## Gameplay
 * The game will prompt players to enter their symbols(X or O) respectively.
 * The game will ask players alernatively to place their respective symbols in the 3x3 grid by taking input from number 1 to 9.
 * Invalid moves (occupied spaces, out-of-bounds) will be rejected.
 * The game displays the current board state after each move.
 * The game announces the winner (or a draw) at the end of the game.
