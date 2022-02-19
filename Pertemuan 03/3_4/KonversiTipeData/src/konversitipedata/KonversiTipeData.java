package konversitipedata;

public class KonversiTipeData {

    public static void main(String[] args) {
    
//        // Hati-hati dgn promosi
//        int a = 55555;
//        int b = 66666;
//        long c;
//        c = a * b;
//          System.out.println(c); // -591337666, tidak sesuai
//        // Solusi yg mungkin
//        int x = 55555;
//        long y = 66666; // ubah jadi tipe long
//        long z;
//        z = x * y;
//          System.out.println(z); // 3703629630, sudah tepat
        
//        // Hati-hati dgn casting
//        int myInt;
//        double myPercent = 66.3;
//        myInt = (int)myPercent; 
//            System.out.println(myInt);// Nilainya terpotong menjadi 66
//        long myLong = 123123456789L;
//        myInt = (int)myLong;
//            System.out.println(myInt); // -1430594795, tidak tepat
//        myLong = 50L;
//        myInt = (int)myLong;
//            System.out.println(myInt); // 50, tepat
            
//        // Casting
////        int a = 53, int b = 47;
////        byte c = a + b;
//        // operasi di atas ada error possible lossy conversion from int to byte 
//        // solusi dgn tipe data yg lebih besar
//        int aa=53, bb=47;
//        int cc = aa + bb;
//            System.out.println(cc);
//        // atau dgn casting
//        int aaa = 53, bbb = 47;
//        byte ccc = (byte) (aaa + bbb);
//            System.out.println(ccc);
            
//        // Promosi Otomatis
//        short o = 1; 
//        short p = 2;
////        short q = o + p; // ada error possible lossy conversion from int to short
//        // solusi dgn ubah tipe data q jadi int
//        int qq = o + p;
//            System.out.println(qq);
//        // atau casting pada hasil (o+p) pada baris assignment
//        short qqq = (short) (o+p);
//            System.out.println(qqq);

//        // Penggunaan pd Tipe Data Long
//        int ageYears = 19;
//        int ageDays = ageYears * 365;
//        long ageSeconds = ageYears * 365 * 24L * 60 * 60; // slh satu operan ada tipe long
//        System.out.println("Anda berusia " + ageDays + " hari.");
//        System.out.println("Anda berusia " + ageSeconds + " detik.");

//        // Penggunaan pd Tipe Data Double
////        int h = 16 + 1 + 5 + 2.0;       // compiler error
////        int i = (1 + 9 + 4 + 7) * 1.0; // compiler error
//        // solusi dgn mendeklarasi h dan hh jadi tipe double
//        double hh = 6 + 1 + 5 + 2.0;
//        double ii = (1 + 9 + 4 + 7) * 1.0;
//            System.out.println("hh: "+hh+", "+"ii: "+ii); // 14.0 21.0
//        // atau dgn casting hasilnya sebagai tipe int
//        int hhh = (int)(6 + 1 + 5 + 2.0);
//        int iii = (int)((1 + 9 + 4 + 7) * 1.0);
//            System.out.println("hhh: "+hhh+", "+"iii: "+iii); // 14 21
        
        // Assignment Tipe Data Float
////        float dataFloat1 = 32.7; // compiler error
//        // solusi dgn menambah karakter F di belakang nilai
//        float dataFloat2 = 32.7F;
//        // atau dgn casting 27.9 jadi tipe float
//        float dataFloat3 = (float) 32.7;

        // Parsing String
        int intVar1 = Integer.parseInt("100"); // konversi String ke int
        double doubleVar2 = Double.parseDouble("2.72"); // konversi String ke double

        
    }
    
}
