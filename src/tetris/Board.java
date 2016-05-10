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

    public void setPolyFild(int row, int column, Poly poly){

        for (int i=0; i < poly.getPolyField().length; i ++ ){

            for (int j = 0; j < poly.getPolyField().length; j ++){
                setSquareType(i,j,poly.getPolyField()[i][j]);

            }
        }
    }

    public SquareType getSquareType(int row, int column){
        return field[row][column];
    }
    public void setSquareType(int row, int column, SquareType squareType){
        field[row][column]=squareType;
    }

    public int getRows(){
        return field.length;
    }

    public int getColumns(){
        return field[0].length;
    }


}
