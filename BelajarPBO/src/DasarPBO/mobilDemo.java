package DasarPBO;
public class mobilDemo {
    String merek, bahanBakar, tahunPembuatan;
    int voltangki; //volume tangki kendaraan
    int kpl; //kilometer per liter
    
    //kembalikan nilai tempuh
    int tempuh(){
        return kpl * voltangki;
    }
    //hitung perlu bahan bakar dalam jarak tertentu
    double perluBahanBakar(int km){
        return (double) km / kpl;
    }
}
