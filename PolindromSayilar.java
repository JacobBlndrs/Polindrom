import java.util.Scanner;

public class PolindromSayilar {
    static boolean isPolindrom(int number){
        int tempNumber=number;
        int reverseNumber=0;
        int lastNumber;

        while(tempNumber != 0 ){
            lastNumber=tempNumber%10;
            reverseNumber=(reverseNumber * 10 )+lastNumber;
            tempNumber/=10;

        }
        if (reverseNumber==number){

            System.out.println(number+" "+"Sayısı polindrom bir sayıdır");
            return true;
        }else {
            System.out.println(number+" "+"Sayısı polindrom bir sayı değildir.");
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(isPolindrom(9889));
    }
}

