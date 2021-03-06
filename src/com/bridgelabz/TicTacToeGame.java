package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    //Variables
    public static char playerSymbol;
    public static char cpuSymbol;
    public static int playerPos;
    public static int cpuPos;
    public static char exitCode='0';
    static char[] board = new char[10]; //board size of 10

    public static char[] createBoard() {
        for (int i = 0; i < board.length; i++) { //Iteration from 1 to 9
            board[i] = ' '; //initializing empty values
        }
        return board;
    }

       //Display the board
        public static void showBoard() {
            System.out.println("Board Display\n");
            System.out.println(" | "+board[1]+" "+board[2]+" "+board[3]+" |\n");
            System.out.println(" | "+board[4]+" "+board[5]+" "+board[6]+" |\n");
            System.out.println(" | "+board[7]+" "+board[8]+" "+board[9]+" |\n");
    }
    public static void winnerStatus(char symbol) {

        if(board[1]!=' ' && board[1]==board[2] && board[2]==board[3]) {
            if(board[1]==symbol) {
                System.out.println("\n PLAYER WINS THE GAME \n");
            }
            else {
                System.out.println("\n CPU WINS THE GAME \n");
            }
            exitCode='1';

        }


        else if(board[4]!=' ' && board[4]==board[5] && board[5]==board[6]) {
            if(board[4]==symbol) {
                System.out.println("\n PLAYER WINS THE GAME \n");
            }
            else {
                System.out.println("\n CPU WINS THE GAME \n");
            }
            exitCode='1';
        }


        else if(board[8]!=' ' && board[7]==board[8] && board[8]==board[9]) {
            if(board[8]==symbol) {
                System.out.println("\n PLAYER  WINS THE GAME  \n");

            }
            else {
                System.out.println("\n CPU  WINS THE GAME  \n");

            }
            exitCode='1';
        }


        else if(board[7]!=' ' && board[1]==board[4] && board[4]==board[7]) {
            if(board[7]==symbol) {
                System.out.println("\n PLAYER WINS THE GAME \n");

            }
            else {
                System.out.println("\n CPU WINS THE GAME  \n");

            }
            exitCode='1';
        }


        else if(board[2]!=' ' && board[2]==board[5] && board[5]==board[8]) {
            if(board[2]==symbol) {
                System.out.println("\n PLAYER WINS THE GAME \n");

            }
            else {
                System.out.println("\n  CPU WINS THE GAME  \n");

            }
            exitCode='1';
        }


        else if(board[6]!=' ' && board[3]==board[6] && board[6]==board[9]) {
            if(board[6]==symbol) {
                System.out.println("\n PLAYER ONE WINS THE GAME \n");

            }
            else {
                System.out.println("\n CPU ONE WINS THE GAME \n");

            }
            exitCode='1';
        }


        else if(board[5]!=' ' && board[1]==board[5] && board[5]==board[9]) {
            if(board[5]==symbol) {
                System.out.println("\n  PLAYER WINS THE GAME  \n");

            }
            else {
                System.out.println("\n CPU WINS THE GAME \n");

            }
            exitCode='1';
        }


        else if(board[3]!=' ' && board[3]==board[5] && board[5]==board[7]) {
            if(board[3]==symbol) {
                System.out.println("\n PLAYER WINS THE GAME \n");

            }
            else {
                System.out.println("\n  CPU WINS THE GAME  \n");

            }
            exitCode='1';
        }

    }

    //Function to choose symbol X or O
    public static void main(String[] args) {
       createBoard();
        System.out.println("Select the Letter you wanted \n  Press 1 . Choose X \n  Press 2 . Choose O\n\nEnter your Choice : ");
        Scanner scan =new Scanner(System.in); //Create scanner object
        int choice = scan.nextInt();
        switch(choice){
            case 1 : {
                playerSymbol='X';
                cpuSymbol='O';
                break;
            }
            case 2 :{
                playerSymbol='O';
                cpuSymbol='X';
                break;
            }
            default: {
                System.out.println("Invalid Choice . Retry Again!");
                return;
            }
        }
        TicTacToeGame.showBoard();


        int myToss;
        int tossWon;
        System.out.println("Choose\n 0. Heads\n 1. Tails\nEnter you choice [0-1] : ");
        myToss=scan.nextInt();
        Random rand1 = new Random();
        tossWon = rand1.nextInt(2);

        if(tossWon==myToss) {


            while(true) {

                System.out.println("\nSelect the position to in board from range [ 1 - 9 ] :");
                playerPos= scan.nextInt();

                switch(playerPos) {
                    case 0 : {if(board[1]==' ') { board[1]=playerSymbol;} break;}
                    case 1 : {if(board[2]==' ') { board[2]=playerSymbol;} break;}
                    case 2 : {if(board[3]==' ') { board[3]=playerSymbol;} break;}
                    case 3 : {if(board[4]==' ') { board[4]=playerSymbol;} break;}
                    case 4 : {if(board[5]==' ') { board[5]=playerSymbol;} break;}
                    case 5 : {if(board[6]==' ') { board[6]=playerSymbol;} break;}
                    case 6 : {if(board[7]==' ') { board[7]=playerSymbol;} break;}
                    case 7 : {if(board[8]==' ') { board[8]=playerSymbol;} break;}
                    case 8 : {if(board[9]==' ') { board[9]=playerSymbol;} break;}
                    default : System.out.println("Invalid Position ! Restart game"); return;
                }

                TicTacToeGame.showBoard();

                TicTacToeGame.winnerStatus(playerSymbol);

                if(exitCode==1) {
                    break;
                }

                boolean flag=false;
                while(true) {
                    Random rand = new Random();
                    int cpuPos = rand.nextInt(9);
                    switch(cpuPos) {
                        case 0 : {if(board[1]==' ') { board[1]=cpuSymbol; flag=true;} break;}
                        case 1 : {if(board[2]==' ') { board[2]=cpuSymbol; flag=true;} break;}
                        case 2 : {if(board[3]==' ') { board[3]=cpuSymbol; flag=true;} break;}
                        case 3 : {if(board[4]==' ') { board[4]=cpuSymbol; flag=true;} break;}
                        case 4 : {if(board[5]==' ') { board[5]=cpuSymbol; flag=true;} break;}
                        case 5 : {if(board[6]==' ') { board[6]=cpuSymbol; flag=true;} break;}
                        case 6 : {if(board[7]==' ') { board[7]=cpuSymbol; flag=true;} break;}
                        case 7 : {if(board[8]==' ') { board[8]=cpuSymbol; flag=true;} break;}
                        case 8 : {if(board[9]==' ') { board[9]=cpuSymbol; flag=true;} break;}
                    }
                    if(flag==true) {
                        break;
                    }

                }
                TicTacToeGame.showBoard();

                TicTacToeGame.winnerStatus(cpuSymbol);

                if(exitCode==1) {
                    break;
                }

            }

        }

        else {

            while(true){

                boolean flag=false;
                while(true) {
                    Random rand = new Random();
                    int cpuPos = rand.nextInt(9);
                    switch(cpuPos) {
                        case 0 : {if(board[1]==' ') { board[1]=cpuSymbol; flag=true;} break;}
                        case 1 : {if(board[2]==' ') { board[2]=cpuSymbol; flag=true;} break;}
                        case 2 : {if(board[3]==' ') { board[3]=cpuSymbol; flag=true;} break;}
                        case 3 : {if(board[4]==' ') { board[4]=cpuSymbol; flag=true;} break;}
                        case 4 : {if(board[5]==' ') { board[5]=cpuSymbol; flag=true;} break;}
                        case 5 : {if(board[6]==' ') { board[6]=cpuSymbol; flag=true;} break;}
                        case 6 : {if(board[7]==' ') { board[7]=cpuSymbol; flag=true;} break;}
                        case 7 : {if(board[8]==' ') { board[8]=cpuSymbol; flag=true;} break;}
                        case 8 : {if(board[9]==' ') { board[9]=cpuSymbol; flag=true;} break;}
                    }
                    if(flag==true) {
                        break;
                    }

                }
                TicTacToeGame.showBoard();
                TicTacToeGame.winnerStatus(cpuSymbol);

                if(exitCode==1) {
                    break;
                }

                System.out.println("\nSelect the position to in board from range [ 1 - 9 ] :");
                playerPos= scan.nextInt();

                switch(playerPos) {
                    case 0 : {if(board[1]==' ') { board[1]=playerSymbol;} break;}
                    case 1 : {if(board[2]==' ') { board[2]=playerSymbol;} break;}
                    case 2 : {if(board[3]==' ') { board[3]=playerSymbol;} break;}
                    case 3 : {if(board[4]==' ') { board[4]=playerSymbol;} break;}
                    case 4 : {if(board[5]==' ') { board[5]=playerSymbol;} break;}
                    case 5 : {if(board[6]==' ') { board[6]=playerSymbol;} break;}
                    case 6 : {if(board[7]==' ') { board[7]=playerSymbol;} break;}
                    case 7 : {if(board[8]==' ') { board[8]=playerSymbol;} break;}
                    case 8 : {if(board[9]==' ') { board[9]=playerSymbol;} break;}
                    default : System.out.println("Invalid Position ! Restart game"); return;
                }

                TicTacToeGame.showBoard();
                TicTacToeGame.winnerStatus(playerSymbol);

                if(exitCode==1) {
                    break;
                }

            }

        }

    }
}