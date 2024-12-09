package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        Tabla t = new Tabla(' ');
        t.elhelyez(10);
        System.out.println(t.megjelenit());
        System.out.println(t.uresSor(5));
        System.out.println(t.uresOszlop(1));
    }
}