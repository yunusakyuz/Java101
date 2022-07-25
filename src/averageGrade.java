import java.util.Scanner;

public class averageGrade {
    public static void main(String[] args) {
        int quiz, vize, ffinal;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("enter quiz grade : " );
        quiz = input. nextInt();
        System.out.println("enter vize grade : " );
        vize = input.nextInt();
        System.out.println("enter ffinal grade : " );
        ffinal = input.nextInt();

        average = (quiz*0.2) + (vize*0.3) + (ffinal*0.5);
        System.out.println("Your Grade" + average);
        String sonuc = (average >= 50) ? "gectiniz" : "Kaldiniz";
        System.out.println(sonuc);

    }
}
