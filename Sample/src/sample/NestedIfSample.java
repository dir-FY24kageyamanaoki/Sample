package sample;

public class NestedIfSample {

    public static void main(String[] args) {
        int number = 29;
        
        if (number >=20) {
            System.out.println("20以上");
            
            if (number < 40) {
                System.out.println("40以下");
                
                if (number == 30) {
                    System.out.println("30丁度");
                    
                    
                }
                
            }
            
        }

    }

}
