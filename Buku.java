public class Buku {
    int id;
    String judul;
    String pengarang;
    int tahunTerbit;

    public Buku(int id, String judul, String pengarang, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
         
        Buku kimia = new Buku(6, "kimia", "dony", 2019);
        Buku matematika = new Buku(7, "matematika", "baraka", 2015);
        Buku gambar = new Buku(3, "gambar", "made", 2014);
        Buku informatika = new Buku(4, "informatika", "dipta", 2020);
        Buku bjawa = new Buku(1, "bjawa", "nauf", 2023);

        // kimia
        
        System.out.println(kimia.id);
        System.out.println(kimia.judul);
        System.out.println(kimia.pengarang);
        System.out.println(kimia.tahunTerbit);

        //matematika

        System.out.println(matematika.id);
        System.out.println(matematika.judul);
        System.out.println(matematika.pengarang);
        System.out.println(matematika.tahunTerbit);

        //gambar

        System.out.println(gambar.id);
        System.out.println(gambar.judul);
        System.out.println(gambar.pengarang);
        System.out.println(gambar.tahunTerbit);

        //informatika

        System.out.println(informatika.id);
        System.out.println(informatika.judul);
        System.out.println(informatika.pengarang);
        System.out.println(informatika.tahunTerbit);

        //bjawa

        System.out.println(bjawa.id);
        System.out.println(bjawa.judul);
        System.out.println(bjawa.pengarang);
        System.out.println(bjawa.tahunTerbit);
    






    }
}