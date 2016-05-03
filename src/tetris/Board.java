package tetris;

/**
 * Created with IntelliJ IDEA.
 * User: Samuel
 * Date: 2013-10-02
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
public class Board {

    private SquareType[][] field;

    public Board(int rows, int columns) {
        field = new SquareType[rows][columns];

    }
    public Board() {
        final int DEFAULT_ROWS = 20;
        final int DEFAULT_COLUMNS = 10;
        field = new SquareType[DEFAULT_ROWS][DEFAULT_COLUMNS];

    }

}
