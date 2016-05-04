package tetris;

/**
 * Created by Samuel on 2015-07-20.
 */

public class BoardTest{


    public BoardTest() {
        TetrisTextView tetrisTextView = new TetrisTextView();

        Board testboard = new Board();
        //System.out.println(testboard.getRows());
        //System.out.println(testboard.getColumns());

        for (int i=0; i < testboard.getRows(); i ++ ){
            //System.out.println("outer loop "+i);
            for (int j = 0; j < testboard.getColumns(); j ++){
                //System.out.println("inner loop "+j);
                testboard.setSquareType(i,j,SquareType.EMPTY);

            }

        }
        System.out.println(tetrisTextView.convertToText(testboard));
    }
}


