
package method;

public class CalculatorTest4 {

    public static void main(String[] args) {
        
//        Calculator calc1 = new Calculator();
//        // Mengakses field dan method menggunakan operator titik (.)
//        calc1.tip = 0.10;
//        calc1.printTip();
        
//        Calculator calc2 = new Calculator();
//        // Menggunakan method yang bisa melakukan pass argumen
//        calc2.calculate(3, 2.0);
//        calc2.calculate(2.0, 3); // argumen terbalik terjadi compiler error
//            // jadi argumen yang dimasukkan harus sesuai urutan parameter
            
//        Calculator calc3 = new Calculator();
//        // method yg tdk menerima argumen
//        calc3.calculate0();
//        // method yg menerima satu atau lebih argumen
//        calc3.calculate1(12);
//        calc3.calculate2(24,4);
//        calc3.calculate3(22, 2, 3);

//        Calculator calc4 = new Calculator();
//        // memanggil method tipe void
//        calc4.printString();
//        // memanggil method tipe return
//        System.out.println(calc4.returnString());
//        System.out.println(calc4.sum(4, 5));
//        System.out.println(calc4.isGreater(9, 0));
        
        
        // dua macam kode di bwh mengeluarkan hasil yg sama
        //.
        int num1 = 1, num2 = 2;
        int result1 = num1 + num2;
        System.out.println(result1);
        //.
        int num3 = 1, num4 = 2;
        int result2 = sum(num3, num4);
        System.out.println(result2);
    }
        public static int sum(int x, int y){
        return (x+y);
    }
}
