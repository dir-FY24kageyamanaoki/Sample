package sample;

public class SwitchSample {

    public static void main(String[] args) {
        var score = 56;  //成績

        switch (score / 10) {
        case 10 -> System.out.println("完璧");
        case 8,9 -> System.out.println("よくできました");
        case 7,6 -> System.out.println("合格です");
        default -> System.out.println("励め");
        }
    }
}

