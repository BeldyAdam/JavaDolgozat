package hu.szamalk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Tabla t = new Tabla('#');
        System.out.println("4. feladat: Az üres tábla:\n" + t.megjelenit() + "\n");

        t.elhelyez(10);
        System.out.println("6. feladat: A feltötött tábla:\n" + t.megjelenit() + "\n");

        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + t.uresOszlopokSzama());
        System.out.println("Sorok: " + t.uresSorokSzama());


        filebaIras();

    }

    //feladat 10.
    public static void filebaIras() throws IOException {
        File file = new File("tablak64.txt");
        if (file.exists()) {
            file.delete();
        }

        FileWriter fw = new FileWriter(file);
        try {
            for (int i = 1; i <= 64; i++) {
                Tabla tF = new Tabla('*');
                tF.elhelyez(i);
                fw.write(tF.megjelenit() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        fw.close();
    }
}

//vége commit