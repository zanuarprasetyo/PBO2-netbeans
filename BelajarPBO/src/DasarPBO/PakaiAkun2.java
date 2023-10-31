package DasarPBO;
public class PakaiAkun2 {
    public static void main(String[]args){
        Akun Akunku=new Akun();
        Akun AkunAnda=new Akun();
        
        Akunku.isiData("Muhammad Zanuar Prasetyo", "Jl. Rukem", 100500);
        Akunku.tampil();
        AkunAnda.isiData("Bagus Satrio Wibowo", "Jl. Manggis", 90700);
        AkunAnda.tampil();
    }
    
}
