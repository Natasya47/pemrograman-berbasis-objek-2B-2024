package posttest1;
public class Biodata {
    // Atribut
    String Nama, Tanggal;
    int Umur;
    double BeratBadan;
    
    //constructor
    public Biodata(String Nama, int Umur, String Tanggal, double BeratBadan){
        this.Nama = Nama;
        this.Umur = Umur;
        this.Tanggal = Tanggal;
        this.BeratBadan = BeratBadan;
    }
    
    //Method
    public void diet(){
        System.out.println(Nama + "memulai diet");
    }
    public void diet2(){
        System.out.println("Dia mulai menjaga pola makannya");
    }
    public void diet3(){
        System.out.println("Dia juga rutin berolahraga");
    }
    public void diet4(){
        System.out.println("Akhirnya dia berhasil, berat badan nya turun drastis");
    }

    public class Biodata1{
    public static void main(String[] args) {
        Biodata Kania = new Biodata ("Kania", 19, "14 Desember 2023", 67.5);
        System.out.println("Nama : " + Kania.Nama);
        System.out.println("Umur : " + Kania.Umur);
        System.out.println("Tanggal : " + Kania.Tanggal);
        System.out.println("Berat Badan : " + Kania.BeratBadan);
        Kania.diet();
        System.out.println();
        Biodata anu = new Biodata ("Kania", 19, "15 Desember 2023", 67.5);
        System.out.println("Nama : " + anu.Nama);
        System.out.println("Umur : " + anu.Umur);
        System.out.println("Tanggal : " + anu.Tanggal);
        System.out.println("Berat Badan : " + anu.BeratBadan);
        anu.diet2();
        System.out.println();
        Biodata anu2 = new Biodata ("Kania", 19, "20 Januari 2024", 62.0);
        System.out.println("Nama : " + anu2.Nama);
        System.out.println("Umur : " + anu2.Umur);
        System.out.println("Tanggal : " + anu2.Tanggal);
        System.out.println("Berat Badan : " + anu2.BeratBadan);
        anu2.diet3();
        System.out.println();
        Biodata anu3 = new Biodata ("Kania", 19, "24 Juni 2024", 49.5);
        System.out.println("Nama : " + anu3.Nama);
        System.out.println("Umur : " + anu3.Umur);
        System.out.println("Tanggal : " + anu3.Tanggal);
        System.out.println("Berat Badan : " + anu3.BeratBadan);
        anu3.diet4();
    }   
    }
}
