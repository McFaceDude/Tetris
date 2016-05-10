package tetris;

/**
 * Created by Samuel on 2015-07-20.
 */

public class BoardTest{


    public BoardTest() {
        TetrisTextView tetrisTextView = new TetrisTextView();
        TetrominoMaker tetrominoMaker = new TetrominoMaker();

        Board testboard = new Board();

        for (int i=0; i < testboard.getRows(); i ++ ){

            for (int j = 0; j < testboard.getColumns(); j ++){
                testboard.setSquareType(i,j, SquareType.EMPTY);
            }
        }

        for (int i=0; i < testboard.getRows(); i ++ ){

            for (int j = 0; j < testboard.getColumns(); j ++){
                    if (i == 0 && j == 0){
                        testboard.setPolyFild(i,j, tetrominoMaker.getPoly(2));
                    }

            }

        }
        //testboard.setSquareType(0,0, tetrominoMaker.getPoly(0).getPolyField()[0][0]);

        System.out.println(tetrisTextView.convertToText(testboard));

        /*for (int i= 0; i < 10; i++){
            RandomBoard randomBoard = new RandomBoard();
            System.out.println(tetrisTextView.convertToText(randomBoard.getRandomBoard()));
        }*/

        //System.out.println(tetrisTextView.convertToText(tetrominoMaker.getPoly(0).getPolyField()));

    }
}


