import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        int diving=0;
        int total=0;

        for (int begin = 0; begin <= number; begin++){
            if(begin % 3 == 0 || begin % 4 == 0){
                diving++;
                total += begin;
            }
        }
        double avarage = total/diving;
        System.out.println("Avarage : " + avarage);


    }
}