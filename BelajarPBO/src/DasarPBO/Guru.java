package DasarPBO;
public class Guru {
    private String nip;
    private String nama;
    private boolean gender;
    private String alamat;
    
    public void setTitelNamaGuruRPL (String nama){
        this.nama = nama + ",S.kom";
    }
            
    public String getTitelNamaGuruRPL(){
        return nama;
    }
    void setGajiGuru(){
        int gaji = 1500000000;
    }
    
    public static void main(String args[]){
        Guru guru1=new Guru();
        guru1.setTitelNamaGuruRPL("Muhammad Zanuar Prasetyo");
        int lembur= 100000;
        int totalgaji=gaji+lembur;
    }
}
