package sample;

public class Calc {

    public static void main(String[] args) {
        var num1 = 567;
        var num2 = 4867;
        
       //足し算
        var result1 = num1 + num2;
       //引き算
        var result2 = num1 - num2;
        //掛け算
        var result3 = num1 * num2;
        //割り算
        var result4 = num1 / num2;
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        
        
        System.out.println("num1 + num2 ="+result1);
        System.out.println("num1 - num2 ="+result2);
        System.out.println("num1 * num2 ="+result3);
        System.out.println("num1 / num2 ="+result4);
              

    }

}
