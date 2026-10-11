// Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘StrukturBaris’. (15 Poin)        
import java.util.LinkedList;

public class Tugas1_BasisData {

    public static void main(String[] args) {


        int StrukturBaris = 21;

        System.out.println("StrukturBaris:" + StrukturBaris);

// Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘KataBaru’ yang berisi kata ‘Nama Awal Anda' (silahkan ubah dengan nama awal anda masing-masing). (15 Poin)
       String KataBaru = "Sumardi";

        System.out.println("KataBaru"+KataBaru); 

// Buatlah pendeklarasian array satu dimensi dengan nama ‘empatAngka’, tipe data integer, yang berisi angka (2 Digit Nim Awal Anda, 10, 20, 2 Digit Nim AkhirAnda). (15 Poin)
        int[] empatAngka = {5,10,20,69};

        System.out.println("empatAngka: {");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.println(empatAngka[i]);
            if (i<empatAngka.length - 1) {
                System.out.println(",");
            }
        }
        System.out.println("}"); 

// Buatlah pendeklarasian array dua dimensi dengan nama ‘Angka’, tipe data String, yang terdiri dari tiga baris dan tiga kolom, isi baris dan kolom berisi angka berikut (2 Digit Nim Awal Anda, 3, 5, 14, 19, 20, 22, 27, 2 Digit Nim AkhirAnda). (20 Poin)
        String[][] Angka = {
                { "05", "3", "5" },
                { "14", "19", "20" },
                { "22", "27", "69" }
        };

        System.out.println("Angka:");
        for (int i = 0; i < Angka.length; i++) {
            System.out.print("  Baris " + i + ": { ");
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j]);
                if (j < Angka[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" }");
        }


// Buatlah deklarasi linked list dengan nama 'listAngka' yang memiliki list (2 Digit Nim Awal Anda, 19, 44, 60, 2 Digit Nim AkhirAnda). (20 Poin)
        LinkedList<Integer> listAngka = new LinkedList<Integer>();
        listAngka.add(5); // 2 digit NIM awal (05)
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(69); // 2 digit NIM akhir

        System.out.println("listAngka:" + listAngka);
    }
}