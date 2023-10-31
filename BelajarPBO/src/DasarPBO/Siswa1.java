package DasarPBO;
public class Siswa1 {
     String nama;
     int umur;
     char jeniskelamin;
     String kelas;
     String alamat;
     
      public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
      
       public void setKelas(String kelas) {
        this.kelas = kelas;
    }
       
        public void setNama(String nama) {
        this.nama = nama;
    }
        
         public void setJeniskelamin(char jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
         
          public void setUmur(int umur) {
        this.umur = umur ;
    }
        
           public void Cetakdata(){
         System.out.println("Nama : " + nama);
         System.out.println("umur : " + umur + "tahun");
         System.out.println("Jenis kelamin : " +jeniskelamin);
         System.out.println("Kelas : " +kelas);
         System.out.println("Alamat : " +alamat +"\n");
     }
           
           public static void main(String args[]) {
          Siswa1 Smk=new Siswa1 ();
          Smk.nama="Muhammad Ainul Hildan";
          Smk.umur=16;
          Smk.jeniskelamin='L';
          Smk.kelas="XI RPl 2";
          Smk.alamat="Umbulrejo";
          Smk.Cetakdata();
          
          Siswa1 Sma=new Siswa1 ();
          Sma.nama="Muhammad Zanuar Prasetyo";
          Sma.umur=16;
          Sma.jeniskelamin='L';
          Sma.kelas="XI RPl 2";
          Sma.alamat="WringinAgung";
          Sma.Cetakdata();
}}
