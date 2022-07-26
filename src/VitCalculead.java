import java.util.Scanner;

public class VitCalculead {
    public static void main(String[] args) {
        double producPreice, WithVit, Vit=0.20;

        Scanner input = new Scanner(System.in);
        System.out.println("Place enter producPriece :" );
        producPreice = input.nextDouble();
        WithVit = producPreice + (producPreice*0.20);
        System.out.println(WithVit);


    }
}
