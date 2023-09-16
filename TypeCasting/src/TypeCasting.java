import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a decimal number " +
                "(Please write using a ',' like 3,66): ");
        //user ondalıklı sayıyı "." kullanarak yazarsa hata alacağım!
        //bilgisini verelim program patlamasın :)
        double myDoubleNumber = input.nextDouble();

        System.out.print("Please enter an integer: ");
        int myIntNumber = input.nextInt(); //tam sayı girdisi alındı.

        System.out.println("Type casted decimal number: "+ (int)myDoubleNumber);
        System.out.print("Type casted integer number: "+ (double)myIntNumber);
        //type casting yapıldı
    }
}
