package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        Tabla t = new Tabla('a');
        t.elhelyez(10);
        System.out.println(t.megjelenit());
    }
}