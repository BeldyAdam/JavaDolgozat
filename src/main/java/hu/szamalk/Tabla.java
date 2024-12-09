package hu.szamalk;

import java.util.Random;

public class Tabla {
    final Random rnd = new Random();
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

//3. feladat vége

    public String megjelenit() {
        String szoveg = "";
        for (char[] chars : T) {
            for (char karakter : chars) {
                szoveg += karakter;
            }
            szoveg += "\n";
        }
            return szoveg;
    }

    public void elhelyez(int N) {
        int i = 0;
        while (i < N) {
            int rnd1 = rnd.nextInt(0,8);
            int rnd2 = rnd.nextInt(0,8);

            if (T[rnd1][rnd2] == this.uresCella) {
                T[rnd1][rnd2] = 'K';
                i++;
            }
        }
    }


}