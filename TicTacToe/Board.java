package DesignPattern.TicTacToe;

public class Board {

    int rows;
    int cols;
    Cell[][] cells;

    Board(int rows,int cols){
        cells=new Cell[rows][cols];
    }

}
