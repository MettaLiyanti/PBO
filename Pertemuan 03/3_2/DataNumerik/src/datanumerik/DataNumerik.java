package datanumerik;

public class DataNumerik {

    public static void main(String[] args) {
        
//        int x = 17;
//        x = 24;
//        x = 64-7;
//          System.out.println("x: "+x); // x diambil dari terakhir kali di assign
//        x=x+1;
//        x+=1;
//        x++;
//          System.out.println("x berikutnya: "+x);
        
//        int a = 19;
//        int b = a;
//        b++;
//          System.out.println("a: "+a);
//          System.out.println("b: "+b);
        
        // Operator Matematika Standar
//        int num1 = 23;
//        int num2 = 4;
//        // Penjumlahan
//        int sum = num1+num2;
//          System.out.println("Hasil penjumlahan: "+sum); // 27
//        // Pengurangan
//        int diff = num1-num2;
//          System.out.println("Hasil pengurangan: "+diff); // 19
//        // Perkalian
//        int prod = num1*num2;
//          System.out.println("Hasil perkalian: "+prod); // 92
//        // Pembagian
//        int quot = num1/num2;
//          System.out.println("Hasil pembagian: "+quot); 
//        // seharusnya 5.75, tapi yang keluar 5 akibat tipe data int
//        // Modulus (Sisa Hasil Bagi)
//        int mod = num1%num2;
//          System.out.println("Hasil modulus: "+mod); // 3

//        // Kombinasi operator untuk melakukan assignment
//        int m = 6, n = 2;
//        m+=n; // sama artinya dgn m = m+n = 6+2
//          System.out.println("m stlh += : "+m); // 8
//        m-=n; // m = 8-2
//          System.out.println("m stlh -= : "+m); // 6
//        m*=n; // m = 6*2
//          System.out.println("m stlh *= : "+m); // 12
//        m/=n; // m = 12/2
//          System.out.println("m stlh /= : "+m); // 6
//        m%=n; // m = 6%2
//          System.out.println("m stlh %= : "+m); // 0

//        // Operator Increment dan Decrement
//        // Increment (++)
//        // - Pre-increment (++i)
//        int id1 = 6;
//            System.out.println("id1: " + (++id1)); // 7
//        // - Post-increment (i++)
//        int id2 = 6;
//            System.out.println("id2: " + (id2++)); // 6
//            System.out.println("id2: " + id2); // 7
//        // Decrement -- berlaku hal yg sama dgn increment
        
//        // Contoh lain increment 
//        int count = 15;
//        int q, r, s, t;
//        q = count++;
//        r = count;
//        s = ++count;
//        t = count;
//          System.out.println(q+" "+r+" "+s+" "+t);

//        // Masalah pada operasi pembagian
//        int x = 9/2;
//          System.out.println(x); // 4
//        // mencoba ubah variabel hasil menjadi tipe data double
//        double y = 9/2;
//          System.out.println(y); // 4.0, belum terpecah
//        // membuat salah satu operannya bernilai double
//        double z = 9/2.0; // atau 9.0/2
//          System.out.println(z); // sip, masalah terpecahkan
        
//        // Keyword "final"
//        final double PI = 3.141592; // nama variabelnya huruf kapital semua
////        PI = 3.0; // akan muncul error, krn tdk boleh diubah
//        System.out.println(PI);

        // Tanda kurung dalam operasi matematika
        int jum1 = 10+20+30/3;
            System.out.println(jum1); // 40
        int jum2 = (10+20+30)/3;
            System.out.println(jum2); // 20
        
    }
    
}
