import java.util.*;
/**
 * Able to play Tic Tac Toe against a computer
 * 
 * @author (Tommy Guhn Lee) 
 * @version (Debugged, edited and translated by Chris Kim)
 */
public class TicTac
{
    // instance variables - replace the example below with your own
    private String Player_1_Name;
    private String Player_2_Name;
    private int Whose_Turn;   //1  // 1 means it's player 1's turn; 2 means it's player 2's turn; 
    private int Move; // Stores where the player wants to move 
    private int Total_Moves;   //0
    private char[] Board;  //9

    public TicTac()
    {
        Player_1_Name = "";
        Player_2_Name = "";
        Whose_Turn = 1;
        Move = 0;
        Total_Moves = 0;
        Board = new char[9];
        Scanner sc = new Scanner(System.in);
        
        for(int pos = 0;pos<9;pos++)
        {
            Board[pos] = (char)(pos+'0');
        }
        
        System.out.println("Player 1: Please enter your name.");
        Player_1_Name = sc.nextLine();
        System.out.println("Player 2: Please enter your computer's name.");
        Player_2_Name = sc.nextLine();  
        
        while (whoWon() == 0 && Total_Moves < 9)
        {
             // Show the board 
            showBoard();
            // Do this until the player chooses a valid move 
            do
            { 
                // Tell which player to move
                if (Whose_Turn == 1)
                {
                    System.out.println(Player_1_Name+": It's your turn.");
                    // Get the move
                    System.out.println("Enter the number of the spot where you'd like to move.");
                    Move = sc.nextInt();
                }
                else
                {
                    System.out.println(Player_2_Name+": It's your turn.");
                    Move = (int)(Math.random()*9);
                }
            } 
            while (moveIsValid(Move) != true);
            // Add 1 to Total_Moves
            Total_Moves++;
            // Change whose turn it is
            switch (Whose_Turn)
            {
                case 1:
                {
                    Board[Move] = 'X';
                    Whose_Turn = 2;
                    break;
                }
                case 2:
                {
                    Board[Move] = 'o';
                    Whose_Turn = 1;
                    break;
                }
            }
        }
        //Show the board
        showBoard();
    }
    public void showBoard()
    {
        System.out.println("");
        System.out.println(Board[0]+" | "+Board[1]+" | "+Board[2]);
        System.out.println("--+---+--");
        System.out.println(Board[3]+" | "+Board[4]+" | "+Board[5]);
        System.out.println("--+---+--");
        System.out.println(Board[6]+" | "+Board[7]+" | "+Board[8]);
        System.out.println("");
    }
    public boolean moveIsValid(int m)
    {
        return (Board[m] != 'X'&& Board[m] != 'o');   
    }
    public int whoWon()
    {
        if (Board[0] == Board[1] && Board[1] == Board[2])
        {
            if (Board[0] == 'X')
            {
                return 1; 
            }
            else
            {
                return 2; 
            }
        }
        if (Board[3] == Board[4] && Board[4] == Board[5])
        {
            if (Board[3] == 'X')
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
        if (Board[6] == Board[7] && Board[7] == Board[8])
        {
            if (Board[6] == 'X')
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }      
        if (Board[1] == Board[4] && Board[4] == Board[7])
        {
            if (Board[1] == 'X')
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
        if (Board[2] == Board[5] && Board[5] == Board[8])
        {
            if (Board[3] == 'X')
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
        if (Board[0] == Board[4] && Board[  4] == Board[8])
        {
            if (Board[0] == 'X')
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
        if (Board[2] == Board[4] && Board[4] == Board[6])
        {
            if (Board[2] == 'X')
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
        return 0;
    }
    public String accOneName()
    {
        return Player_1_Name;
    }
    public String accTwoName()
    {
        return Player_2_Name;
    }
    
    //driver
    public static void main()
    {
         TicTac game = new TicTac();
         int won = game.whoWon();
         if (won == 1)
         {
             System.out.println(game.accOneName()+" has won the game!");
         }
         else
         {
             if (won == 2)
             {
                 System.out.println(game.accTwoName()+"has won the game!");
             }
             else
             {
                 System.out.println("It's a tie game!");
             }
         }
    }
}
