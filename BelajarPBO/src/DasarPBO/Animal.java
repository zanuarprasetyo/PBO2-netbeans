package DasarPBO;
public class Animal {
    String nama;
    int umur;
    String jenishidup;
    
    public void setJenishidup(String jenishidup) {
        this.jenishidup = jenishidup;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void tampil(){
        System.out.println("Nama Hewan : "+ nama);
        System.out.println("Umur : "+ umur + "tahun");
        System.out.println("Habitat : "+ jenishidup +"\n");
    }
    public void tampil2(){
        System.out.println("Nama HP : "+ nama);
        System.out.println("Spek : "+ umur + "GB");
        System.out.println("Harga : "+ jenishidup +"\n");
    }
    public static void main(String args[]) {
        Animal jerapah=new Animal();
        jerapah.nama="jerarap";
        jerapah.umur=3;
        jerapah.jenishidup="Darat";
        jerapah.tampil();
        
        Animal kucing=new Animal();
        kucing.nama="kuchiang";
        kucing.umur=1;
        kucing.jenishidup="Darat";
        kucing.tampil();
        
        Animal hape=new Animal();
        hape.nama="Samsung A03";
        hape.umur=4;
        hape.jenishidup="1.500.000";
        hape.tampil2();
        
        Animal hape2=new Animal();
        hape2.nama="Wiko Harry";
        hape2.umur=4;
        hape2.jenishidup="1.000.000";
        hape2.tampil2();
    }
    
}
