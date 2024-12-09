package hu.szamalk;

import java.util.Random;

public class Tabla {
    private char[][] T;
    private char uresCella;

    public Tabla(char üresCella) {
        this.T = new char[8][8];
        this.uresCella = üresCella;

//        for (char[] row : T) {
//            for (char i : row) {
//                T[i] = üresCella;
//            }
//        }

        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++){
                this.T[i][j] = uresCella;
            }
        }
    }


}