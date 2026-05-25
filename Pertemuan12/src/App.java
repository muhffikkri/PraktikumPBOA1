import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Map<Integer, String> mahasiswaMap = new HashMap<>();
        
        mahasiswaMap.put(1, "Adi");
        mahasiswaMap.put(2, "Bambang");
        mahasiswaMap.put(3, "Cici");
        mahasiswaMap.put(4, "Didi");
        
        mahasiswaMap.forEach((nim, nama) -> System.out.println("Nim : " + String.valueOf(nim) + " Nama : " + nama));


        
    }
}
