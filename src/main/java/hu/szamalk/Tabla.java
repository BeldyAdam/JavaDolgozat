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

            if (T[rnd1][rnd2] == uresCella) {
                T[rnd1][rnd2] = 'K';
                i++;
            }
        }
    }

    public boolean uresSor(int sor) {
        int i = 0;
        while (i < T.length && !(T[sor][i] == 'K')) {
            i ++;
        }
        if(T[sor][i] == 'K'){
            return true;
        }else{
            return false;
        }//metodusba eltárolható
    }

    public boolean uresOszlop(int oszlop) {
        int i = 0;
        while (i < T.length && !(T[i][oszlop] == 'K')) {
            i ++;
        }
        if(T[oszlop][i] == 'K'){
            return true;
        }else{
            return false;
        } //metodusba eltárolható
    }

}