import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ejercicio1
        //valor decimal
        double valorDecimal;
        Scanner input=new Scanner(System.in);
        valorDecimal = 2.0;
        System.out.println(valorDecimal);
        System.out.println(valorDecimal);
        int entero = (int) valorDecimal;
        System.out.println(entero);
        short decimalmenor = (short) valorDecimal;
        System.out.println(decimalmenor);
        long longg = (long) valorDecimal;
        System.out.println(longg);
        float flotante = (float) valorDecimal;
        System.out.println(flotante);
        String cadena =String.valueOf(valorDecimal);
        System.out.println(cadena);
        System.out.println(cadena.getClass());
        //ejercicio2

    }
}