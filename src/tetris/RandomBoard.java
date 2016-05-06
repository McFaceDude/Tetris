package tetris;

import java.util.ArrayList;
import java.util.Random;

/**
 * Project: TDDC69 lab 2.
 * Created by Samuel on 2016-05-06.
 */

public class RandomBoard {

    private final Board  randomBoard = new Board();
    private Random random = new Random();

    public RandomBoard() {




        for (int i=0; i < randomBoard.getRows(); i ++ ){
            //System.out.println("outer loop "+i);
            for (int j = 0; j < randomBoard.getColumns(); j ++){
                //System.out.println("inner loop "+j);
                randomBoard.setSquareType(i,j,randomSquareType());

            }

        }


    }

    private SquareType randomSquareType(){
        return SquareType.values()[random.nextInt(SquareType.values().length - 1 ) ];
    }
    public Board getRandomBoard(){
        return randomBoard;
    }



}
