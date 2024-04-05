package sample;

public class IfSample {

    public static void main(String[] args) {
        var score = 100;  //成績
        
        if (score == 100) {
            System.out.println("もう教えることはない");
                
            } else if (score >=60) { System.out.println("あと一息");
                
            } else {
                System.out.println("出直してこい");
            }
        }
        

    }

