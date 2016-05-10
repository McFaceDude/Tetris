package tetris;

/**
 * Project: TDDC69 lab 2.
 * Created by Samuel on 2016-05-06.
 */

public class Poly {


    private SquareType[][] polyField;
    private SquareType squareType;
    private SquareType[][] newArray;

    public Poly(SquareType[][] polyField, SquareType squareType) {
        this.polyField = polyField;
        this.squareType = squareType;
    }

    public void rotate(boolean direction){

        if (polyField.length == 3){
            if (direction){
                newArray[0][2] = polyField[0][0];
                newArray[1][2] = polyField[0][1];
                newArray[2][2] = polyField[0][2];

                newArray[0][1] = polyField[1][0];
                newArray[1][1] = polyField[1][1];
                newArray[2][1] = polyField[1][2];

                newArray[0][0] = polyField[2][0];
                newArray[1][0] = polyField[2][1];
                newArray[2][0] = polyField[2][2];
            }
            else {
                newArray[0][0] = polyField[0][2];
                newArray[0][1] = polyField[1][2];
                newArray[0][2] = polyField[2][2];

                newArray[1][0] = polyField[0][1];
                newArray[1][1] = polyField[1][1];
                newArray[1][2] = polyField[2][1];

                newArray[2][0] = polyField[0][0];
                newArray[2][1] = polyField[1][0];
                newArray[2][2] = polyField[2][0];
            }
            polyField = newArray;
        }
        else if (polyField.length == 4){
            if (direction){
                newArray[0][3] = polyField[0][0];
                newArray[1][3] = polyField[0][1];
                newArray[2][3] = polyField[0][2];
                newArray[3][3] = polyField[0][3];

                newArray[0][2] = polyField[1][0];
                newArray[1][2] = polyField[1][1];
                newArray[2][2] = polyField[1][2];
                newArray[3][2] = polyField[1][3];

                newArray[0][2] = polyField[2][0];
                newArray[1][2] = polyField[2][1];
                newArray[2][1] = polyField[2][2];
                newArray[3][1] = polyField[2][3];

                newArray[0][0] = polyField[3][0];
                newArray[1][0] = polyField[3][1];
                newArray[2][0] = polyField[3][2];
                newArray[3][0] = polyField[3][3];

            }
            else {
                newArray[0][0] = polyField[0][3];
                newArray[0][1] = polyField[1][3];
                newArray[0][2] = polyField[2][3];
                newArray[0][3] = polyField[3][3];

                newArray[1][0] = polyField[0][2];
                newArray[1][1] = polyField[1][2];
                newArray[1][2] = polyField[2][2];
                newArray[1][3] = polyField[3][2];

                newArray[2][0] = polyField[0][2];
                newArray[2][1] = polyField[1][2];
                newArray[2][2] = polyField[2][1];
                newArray[2][3] = polyField[3][1];

                newArray[3][0] = polyField[0][0];
                newArray[3][1] = polyField[1][0];
                newArray[3][2] = polyField[2][0];
                newArray[3][3] = polyField[3][0];
            }
            polyField = newArray;
        }
    }
    public SquareType[][] getPolyField() {
        return polyField;
    }
}
