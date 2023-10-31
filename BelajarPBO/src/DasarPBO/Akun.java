package DasarPBO;
import static java.lang.System.out;
public class Akun {
    String nama;
    String alamat;
    double saldo;
    
    public void isiData(String n, String al, double sal){
        nama=n;
        alamat=al;
        saldo=sal;
    }
    
    public void tampil(){
        out.println("Data Akun");
        out.println("Nama : " + nama);
        out.println("Alamat : " + alamat);
        out.printf("Saldo : %,.2f",saldo);
    }
    //method tipe return dan berparameter
    public double getBunga(double persenRata){
        return saldo * persenRata / 100;
    }
    
}
