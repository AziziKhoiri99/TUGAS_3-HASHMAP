package Task_HashMap;

import java.util.HashMap;

public class Newton {
    public static void main(String[] args) {
        HashMap<Integer, String> law = new HashMap<Integer, String>();

        law.put(1, "Hukum Newton 1 adalah “Setiap benda akan mempertahankan keadaan diam atau bergerak lurus beraturan, kecuali ada gaya yang bekerja untuk mengubahnya”.");
        law.put(2, "Hukum Newton 2 adalah “Perubahan dari gerak selalu berbanding lurus terhadap gaya yang dihasilkan / bekerja, dan memiliki arah yang sama dengan garis normal dari titik singgung gaya benda”.");
        law.put(3, "Hukum Newton 3 adalah “Untuk setiap aksi selalu ada reaksi yang sama besar dan berlawanan arah: atau gaya dari dua benda pada satu sama lain selalu sama besar dan berlawanan arah”");
        law.put(4, "Hukum Newton 4 adalah “Kecantikan atau ketampanan berbanding terbalik dengan kecerdasan.”");

        System.out.println("Terdapat: " + law);
        System.out.println("Hukum Sebab-Akibat " + law.get(3));

        law.remove(4);
        System.out.println(": " + law);

        law.clear();
        System.out.println("Terdapat: " + law);
    }
}
