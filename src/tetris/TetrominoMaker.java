package tetris;

import java.util.ArrayList;

/**
 * Project: TDDC69 lab 2.
 * Created by Samuel on 2016-05-06.
 */

public class TetrominoMaker {

    private SquareType[][] polyField;

    public int getNumberOfTypes(){
        return SquareType.values().length - 2;
    }

    public Poly getPoly(int n){

        switch (n){
            case 0:
                return createIPoly();
            case 1:
                return createOPoly();
            case 2:
                return createTPoly();
            case 3:
                return createSPoly();
            case 4:
                return createZPoly();
            case 5:
                return createJPoly();
            case 6:
                return createLPoly();
            default:
                return createOPoly();
        }
    }

    private Poly createIPoly() {
        SquareType[][] iField = new SquareType[4][4];

        iField[0][0]= SquareType.EMPTY;
        iField[1][0]= SquareType.EMPTY;
        iField[2][0]= SquareType.EMPTY;
        iField[3][0]= SquareType.I;

        iField[0][1]= SquareType.EMPTY;
        iField[1][1]= SquareType.EMPTY;
        iField[2][1]= SquareType.EMPTY;
        iField[3][1]= SquareType.I;

        iField[0][2]= SquareType.EMPTY;
        iField[1][2]= SquareType.EMPTY;
        iField[2][2]= SquareType.EMPTY;
        iField[3][2]= SquareType.I;

        iField[0][3]= SquareType.EMPTY;
        iField[1][3]= SquareType.EMPTY;
        iField[2][3]= SquareType.EMPTY;
        iField[3][3]= SquareType.I;

        return new Poly(iField, SquareType.I);
    }

    private Poly createOPoly() {
        SquareType[][] oField = new SquareType[2][2];

        oField[0][0]= SquareType.O;
        oField[1][0]= SquareType.O;
        oField[0][1]= SquareType.O;
        oField[1][1]= SquareType.O;

        return new Poly(oField, SquareType.O);
    }

    private Poly createTPoly() {
        SquareType[][] tField = new SquareType[3][3];

        tField[0][0]= SquareType.EMPTY;
        tField[1][0]= SquareType.EMPTY;
        tField[2][0]= SquareType.T;

        tField[0][1]= SquareType.EMPTY;
        tField[1][1]= SquareType.T;
        tField[2][1]= SquareType.T;

        tField[0][2]= SquareType.EMPTY;
        tField[1][2]= SquareType.EMPTY;
        tField[2][2]= SquareType.T;

        return new Poly(tField, SquareType.T);
    }
    
    private Poly createSPoly() {
        SquareType[][] sField = new SquareType[3][3];

        sField[0][0]= SquareType.EMPTY;
        sField[1][0]= SquareType.EMPTY;
        sField[2][0]= SquareType.S;

        sField[0][1]= SquareType.EMPTY;
        sField[1][1]= SquareType.S;
        sField[2][1]= SquareType.S;

        sField[0][2]= SquareType.EMPTY;
        sField[1][2]= SquareType.S;
        sField[2][2]= SquareType.EMPTY;

        return new Poly(sField, SquareType.T);
    }
    
    private Poly createZPoly() {
        SquareType[][] zField = new SquareType[3][3];

        zField[0][0]= SquareType.EMPTY;
        zField[1][0]= SquareType.Z;
        zField[2][0]= SquareType.EMPTY;

        zField[0][1]= SquareType.EMPTY;
        zField[1][1]= SquareType.Z;
        zField[2][1]= SquareType.Z;

        zField[0][2]= SquareType.EMPTY;
        zField[1][2]= SquareType.EMPTY;
        zField[2][2]= SquareType.Z;

        return new Poly(zField, SquareType.Z);
    }

    private Poly createJPoly() {
        SquareType[][] jField = new SquareType[3][3];

        jField[0][0]= SquareType.EMPTY;
        jField[1][0]= SquareType.J;
        jField[2][0]= SquareType.J;

        jField[0][1]= SquareType.EMPTY;
        jField[1][1]= SquareType.EMPTY;
        jField[2][1]= SquareType.J;

        jField[0][2]= SquareType.EMPTY;
        jField[1][2]= SquareType.EMPTY;
        jField[2][2]= SquareType.J;

        return new Poly(jField, SquareType.J);
    }

    private Poly createLPoly() {
        SquareType[][] lField = new SquareType[3][3];

        lField[0][0]= SquareType.EMPTY;
        lField[1][0]= SquareType.EMPTY;
        lField[2][0]= SquareType.L;

        lField[0][1]= SquareType.EMPTY;
        lField[1][1]= SquareType.EMPTY;
        lField[2][1]= SquareType.L;


        lField[0][2]= SquareType.EMPTY;
        lField[1][2]= SquareType.L;
        lField[2][2]= SquareType.L;

        return new Poly(lField, SquareType.L);
    }
}
