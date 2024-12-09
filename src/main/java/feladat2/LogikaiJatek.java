package feladat2;

import java.util.Arrays;

public class LogikaiJatek extends Jatek{
    private Babu[][] tabla;
    private int[] sorrend;
    private int babuDb;

    public LogikaiJatek() {
        this(3);
    }

    public LogikaiJatek(int babuDb) {
        if(babuDb >= 2 && babuDb < 15+1){
            this.babuDb = babuDb;
        }

        this.tabla = new Babu[4][5];
        this.sorrend = new int[10];
    }


    public boolean van8FelettEro(){
        return false;
    }

    @Override
    public void kezd(){
        System.out.println("Kezdés");
    }

    @Override
    public void ment(){
        System.out.println("Mentés");
    }

    @Override
    public void vege(){
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "babuDb=" + babuDb +
                '}';
    }
}
