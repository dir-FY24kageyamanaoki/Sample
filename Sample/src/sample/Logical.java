package sample;

public class Logical {

    public static void main(String[] args) {
        int score = 43;  //成績
        
        // and:scoreが40以上、かつ50以下
        System.out.print("scoreが40以上、かつ50以下：");
        System.out.println(score >=40 && score <= 50);
        
        // or:scoreが40以上、または50以下
        System.out.print("scoreが40以上、または50以下:");
        System.out.println(score >=40 || score <= 50);
        
        // not:scoreが60以上でない
        System.out.print("scoreが60以上ではない:");
        System.out.println(!(score >= 60));
        
        
     

    }

}