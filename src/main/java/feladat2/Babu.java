package feladat2;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this(1, szin);
    }

    public Babu(int ero, String szin) {
        if(ero < 9+1 && ero > 0){
            this.ero = ero;
        }else{
            this.ero = 1;
        }
    }
}
