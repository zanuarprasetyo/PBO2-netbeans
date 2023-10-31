package DasarPBO;
import static java.lang.System.out;
public class PakaiAkun {
    public static void main (String[] args) {
        Akun Akunku = new Akun();
        Akun AkunAnda = new Akun();
        //menyatakan (inisiasi) variabel objek Akunku
        Akunku.nama = "Muhammad Zanuar Prasetyo";
        Akunku.alamat = "Jl. Rukem";
        Akunku.saldo = 100500;
        
        //menyatakan (inisiasi) variabel objek AkunAnda
        AkunAnda.nama = "Bagus Satrio Wibowo";
        AkunAnda.alamat = "Jl. Manggis";
        AkunAnda.saldo = 90700;
        
        Akunku.tampil();
        
        out.print(" ditambah bunga Rp ");
        out.println(Akunku.getBunga(5));
        
        AkunAnda.tampil();
        double AndaBungaRata = 7;
        out.print(" ditambah bunga Rp ");
        double AndaBungaJumlah = AkunAnda.getBunga(AndaBungaRata);
        out.println(AndaBungaJumlah);
    }
    
}
