package casting01;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        //byte nilaiByte = 128;
        // error: incompatible types: possible lossy conversion from int to byte
        
        //Declare and initialize a short with a value of 128
        short nilaiShort = 128;
        
        //Create a print statement that casts this short to a byte
        System.out.println((byte)nilaiShort); // -128
        
        //Declare and initialize a byte with a value of 127
        byte nilaiByte = 127;
        //Add 1 to this variable and print it
        System.out.println(nilaiByte+1); // 128
        //Add 1 to this variable again and print it again
        System.out.println(nilaiByte+2); // 129    
    }    
}
