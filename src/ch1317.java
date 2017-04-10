import java.util.Scanner;

/**
 * Created by EunHan on 2017-04-10.
 */
public class ch1317 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter the first complex number: ");
        Complex num1 = new Complex(kbd.nextDouble(), kbd.nextDouble());
        System.out.println("Enter the second complex number: ");
        Complex num2 = new Complex(kbd.nextDouble(), kbd.nextDouble());

        System.out.println(num1.toString() +" + "+num2.toString()+" = "+num1.add(num2));
        System.out.println(num1.toString() +" - "+num2.toString()+" = "+num1.subtract(num2));
        System.out.println(num1.toString() +" * "+num2.toString()+" = "+num1.multiply(num2));
        System.out.println(num1.toString() +" / "+num2.toString()+" = "+num1.divide(num2));
        System.out.println("|"+num1.toString()+"|" +" = "+num1.abs());



    }


}


