
package classjava;


public class StringClass {


    public static void main(String[] args) {
        String nama = "Yodi Keren";
//        int panjangNama = nama.length();
//        System.out.println("Panjang karakter nama: " + panjangNama);
        
        //method indexOF -> untuk mencari nomor index pada suatu karakter
//        String ind = "belajar.pbo 123";
//        int idx1 = ind.indexOf('a');
//        System.out.println("nomor index huruf a: " + idx1); //3
//        int idx2 = ind.indexOf('a',4);
//        System.out.println("nomor index huruf a dari index ke 4: " + idx2); // 5

        // method charAt() -> untuk menampilkan isi dari karakter iindex yang dimasukkan
//        char hurufnya = nama.charAt(8);
//        System.out.println("isi karakter di index ke 8: "+hurufnya); //e
//        System.out.println("isi karakter di index ke 5: "+nama.charAt(4)); // kosong aja karna hurufnya spasi
//
        // method substring() -> untuk menghasilkan bagian kata dari sebuah string
//        String tampung = nama.substring(5);
//        System.out.println("isi dari substring indeks ke 5 sampai selesai: "+tampung); //Keren
//        String tampung2 = nama.substring(0,3);
//        System.out.println("isi dari substring indeks ke 0 sampai 2 :"+tampung2); //Yod
        
        //method replace() -> untuk mengganti string tertentu dalam sebuah kata
//        String ganti = nama.replace('e', 'E');
//        System.out.println("Hasil ganti huruf: " + ganti); //Yodi KErEn
//        String ganti2 = nama.replace("Keren", "Keren Sekali Lho!");
//        System.out.println("Hasil ganti pattern: " + ganti2); //Yodi Keren Sekali Lho!
                
//        // penggabungan string dgn operator +
//        String namaSaya = "yodi "+"keren "+"sekali";
//        System.out.println("isi namaSaya: "+namaSaya);
//        // penggabungan string dgn mehod concat()
//        String satu = "satu1 ", dua = "dua2 ", tiga = "tiga3";
//        String gabungan = "ini gabungan "; 
//        gabungan = gabungan.concat(satu+dua+tiga);
//        System.out.println("isi gabungan: " + gabungan);
        
//        int a = 1, b = 2;
//        String aa = "yodi", bb = "YODI";
//        boolean c = a == b;
//        boolean cc = aa == bb;
//        System.out.println("hasil perbandingan a dan b: "+ c);
//        System.out.println("hasil perbandingan aa dan bb: "+ cc);

        // method compareTo()
//        int nilaiPerbandingan = "keren".compareTo("kere"); 
//        System.out.println("hasil perbandingan: " + nilaiPerbandingan); //1
//        int nilaiPerbandingan1 = "kere".compareTo("kere"); 
//        System.out.println("hasil perbandingan: " + nilaiPerbandingan1); //0
//        int nilaiPerbandingan2 = "kere".compareTo("keren"); 
//        System.out.println("hasil perbandingan: " + nilaiPerbandingan2); //-1
        
        // method equals
//        String namaku = "yodi", namaSaya = "yodi";
//        boolean hasilPerbandingan = namaku.equals(namaSaya);
//        System.out.println("hasil perbandingan nama: "+hasilPerbandingan); //true

//        RandomClass rand = new RandomClass();
//        rand.cariAcak();

        MathClass mtk = new MathClass();
        mtk.mathClass();
        
    }
}

    
    

