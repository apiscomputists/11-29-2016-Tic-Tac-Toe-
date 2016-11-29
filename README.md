# 11-29-2016-Tic-Tac-Toe-

Since a few days ago, Tommy had started programming a "tic-tac-toe" simulation as a personal project. Although his multiplayer version worked without any problem, his AI-version of the game did not function as he wanted to, as despite the outcome or the progress of the game was not affected, the code often went on sprawling a bunch of repetitive codes after player-1, the real person, has entered a move. Startled, Tommy asked Christopher for feedback, and eventually, this small tic-tac-toe game has been the central focus of our discussion today. 

After a while, we were able to identify the cause of the error: the showBoard() function, which serves to literally show the board on the command prompt, was located within a "do-while" section, a place where stuffs within the boundary is on a LOOP. Having found the main issue, Christopher had created a Java version of Tommy's code, which was written in C++. 

Members finished up the meeting by analyzing each component and function in Tommy's code. 

Our code can be found in the folder.
