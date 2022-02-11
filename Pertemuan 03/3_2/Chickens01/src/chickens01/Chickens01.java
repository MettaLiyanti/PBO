
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int eggsPerChicken;
        int chickenCount;
        int totalEggs;
        
        //SKENARIO PERTAMA
        
        // Senin pagi 
        eggsPerChicken = 5;        
        chickenCount = 3;
        // Senin siang
        totalEggs = eggsPerChicken * chickenCount;
        
        // Selasa pagi
        chickenCount = chickenCount + 1; // bisa chickenCount += 1  atau chickenCount++
        // Selasa siang
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);
        // bisa juga totalEggs += (eggsPerChicken * chickenCount)
        
        // Rabu pagi
        chickenCount = chickenCount / 2;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);       
        
        System.out.println(totalEggs);
        
        
        // SKENAARIO KEDUA
        
        // Senin pagi 
        eggsPerChicken = 4;
        chickenCount = 8;
        // Senin siang
        totalEggs = eggsPerChicken * chickenCount;
        
        // Selasa pagi
        chickenCount = chickenCount += 1; 
        // Selasa siang
        totalEggs += (eggsPerChicken * chickenCount);
        
        // Rabu pagi
        chickenCount = chickenCount / 2;
        totalEggs += (eggsPerChicken * chickenCount);
        
        System.out.println(totalEggs);
        
    }   
}
