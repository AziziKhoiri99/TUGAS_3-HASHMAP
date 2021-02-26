package Task_HashMap;

import java.util.HashMap;

public class Psikolog {
    public static void main(String[] args) {
        HashMap<Integer, String> kepribadian = new HashMap<Integer, String>();

        kepribadian.put(1, "Sanguini");
        kepribadian.put(2, "Koleris");
        kepribadian.put(3, "Melankolis");
        kepribadian.put(4, "Plegmat");

        kepribadian.put(1, "Sanguinis");

        kepribadian.replace(4, "Plegmatis");

        System.out.println("Terdapat : " + kepribadian + " tipe Kepribadia Anak");
    }
}
