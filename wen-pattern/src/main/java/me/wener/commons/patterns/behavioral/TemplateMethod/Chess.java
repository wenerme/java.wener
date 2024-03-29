package me.wener.commons.patterns.behavioral.TemplateMethod;

//Now we can extend this class in order
//to implement actual games:
class Chess extends Game
{

    /* Implementation of necessary concrete methods */
    void initializeGame()
    {
        // Initialize players
        // Put the pieces on the board
    }

    void makePlay(int player)
    {
        // Process a turn for the player
    }

    boolean endOfGame()
    {
        // Return true if in Checkmate or
        // Stalemate has been reached
        return false;
    }

    void printWinner()
    {
        // Display the winning player
    }
    /* Specific declarations for the chess game. */

    // ...
}
