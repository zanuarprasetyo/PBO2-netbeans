package DasarPBO;
import static java.lang.System.out;
public class konsumsiBB {
    public static void main(String[] args){
        
        mobilDemo satu = new mobilDemo();
        mobilDemo dua = new mobilDemo();
        double liter;
        int tempuh1, tempuh2;
        int jarak = 50;
        
        satu.merek = "Rush TRD Spoprtivo";
        satu.bahanBakar = "Pertamax Turbo 98";
        satu.tahunPembuatan = "2018";
        satu.voltangki = 15;
        satu.kpl = 17;
        liter = satu.perluBahanBakar(jarak); //parameter "jarak" direferensikan ke variabel "km"
        
        dua.merek = "Hino";
        dua.bahanBakar = "Solar";
        dua.tahunPembuatan = "2003";
        dua.voltangki = 25;
        dua.kpl = 15;
        
        out.println();
        out.println("   Perbandingan konsumsi BBM dua mobil     ");
        out.println("___________________________________________");
        out.println("Mobil Satu");
        out.println("Merek            : " + satu.merek);
        out.println("Bahan Bakar      : " + satu.bahanBakar);
        out.println("Tahun Dibuat     : " + satu.tahunPembuatan);
        tempuh1 = satu.tempuh();
        out.print ("Saat full tank, dapat menempuh jarak " + tempuh1); out.println("km");
        out.print("Untuk jarak "+ jarak +" km mobil perlu ");
        out.printf("%,.2f",liter); out.print("liter");
        out.println();
        out.println("___________________________________________");
        
        liter = dua.perluBahanBakar(jarak); //menimpa variabel yang sama
        
        
        out.println("Mobil Dua");
        out.println("Merek            : " + dua.merek);
        out.println("Bahan Bakar      : " + dua.bahanBakar);
        out.println("Tahun Dibuat     : " + dua.tahunPembuatan);
        tempuh2 = dua.tempuh();
        out.print ("Saat full tank, dapat menempuh jarak " + tempuh1); out.println("km");
        out.print("Untuk jarak "+ jarak +" km mobil perlu ");
        out.printf("%,.2f",liter); out.print("liter");
        out.println();
        out.println("___________________________________________");
        
    }
    
}
