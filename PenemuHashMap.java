package Task_HashMap;

import java.util.HashMap;
import java.util.Map;

public class PenemuHashMap {
    public static void main(String[] args) {
        HashMap<String, Penemu> z = new HashMap<String, Penemu>();

        Penemu T = new Penemu("Teori Relativitas", "Exc");
        Penemu R = new Penemu("Peluruhan Radioactive", "Exc");
        Penemu N = new Penemu("Keseimbangan Nash", "Exc");

        z.put("Albert Einstein", T);
        z.put("Pierre Curie dan Maria Salomea Skłodowska-Curie", R);
        z.put("John Forbes Nash Jr.", N);

        for (Map.Entry b : z.entrySet()) {
            Penemu P = (Penemu) b.getValue();
            System.out.println(b.getKey() + ": " + P.getX());
        }
    }
}
