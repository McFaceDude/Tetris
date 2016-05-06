package tetris;

import javax.lang.model.type.UnknownTypeException;

/**
 * Created with IntelliJ IDEA.
 * User: Samuel
 * Date: 2013-10-03
 * Time: 19:29
 * To change this template use File | Settings | File Templates.
 */
public class TetrisTextView {

    public String convertToText(Board board){
        StringBuilder textField = new StringBuilder();
        for (int i=0; i < board.getRows(); i ++ ) {

            for (int j = 0; j < board.getColumns(); j++) {
                textField.append(squareTypeSymbol(board.getSquareType(i,j)));
            }

            textField.append("\n");
        }
        return textField.toString();
    }

    public static String squareTypeSymbol(SquareType squareType){

        switch (squareType){
            case I:
                return "# ";
            case O:
                return "% ";
            case T:
                return "& ";
            case S:
                return "@ ";
            case Z:
                return "$ ";
            case J:
                return "? ";
            case L:
                return "? ";
            case EMPTY:
                return "- ";
            case OUTSIDE:
                return "OUTSIDE";
            default:
                return "error";
        }
    }
}
