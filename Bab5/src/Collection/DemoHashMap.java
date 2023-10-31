package Collection;
import java.util.HashMap;
import java.util.Iterator;
public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("penerbit", "PT Quadra");
        map.put("pengarang", "Fauziah");
        map.put("buku", "Pemrograman Berorientasi Objek");
                System.out.println("Sebelum diubah: ");
                Iterator<String> iter = map.keySet().iterator();
                while(iter.hasNext()) {
                    System.out.println(map.get(iter.next()));
                }
                System.out.println("                ");
                System.out.println("Setelah diubah: ");
                map.put("penerbit", "PT Yudhistira");
                for(String key : map.keySet()) {
                    System.out.println(map.get(key));
                }
    }
}
