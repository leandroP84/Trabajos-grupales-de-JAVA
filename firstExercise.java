
import javax.swing.*;
import java.util.Scanner;

public class firstExercise
{



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = "";

        System.out.println("Ingrese un numero para dirigirse al ejercicio correspondiente: ");
        int eleccion = sc.nextInt();
        if(eleccion == 1)
        {
            System.out.println("Ingrese su nombre ");
            System.out.println("Bienvenida " + name);
        }
        if(eleccion == 2)
        {
            name = JOptionPane.showInputDialog("Introduce tu nombre: ");
            System.out.println("Bienvenida " + name);
        }
        if(eleccion == 3)
        {
            float num1, num2;
            num1 = 30;
            num2 = 15;
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }
        if(eleccion == 4)
        {
            int num1, num2;
            num1 = 15;
            num2 = 30;
            if(num1 > num2)
            {
                System.out.println(num1 + " es mayor que " + num2);
            }
            else
            {
                if (num1 == num2)
                {
                    System.out.println(num1 + " es igual que " + num2);
                }
                else
                {
                    System.out.println(num2 + " es mayor que " + num1);
                }
            }

        }
        if(eleccion == 5)
        {
            int num = 0;
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            if(num % 2 == 0)
            {
                System.out.println(num + " es par.");
            }
            else
            {
                System.out.println(num + " es impar.");
            }

        }
        if(eleccion == 6)
        {
            float num = 0;
            float fin = 0;
            System.out.println("Ingrese el precio del producto: ");
            num = sc.nextInt();
            fin = num / 100 * 21;
            System.out.println("El precio incluyendo el IVA es de " + (num + fin));

        }
        if(eleccion == 7)
        {
            int i = 1;
            System.out.println("Numeros del 1 al 100:");
            while (i<101)
            {
                System.out.println(i);
                i = i + 1;
            }
        }
        if(eleccion == 8)
        {
            int num=0;
            for (int i = 0; i <= 99; i++ )
            {
                num = num + 1;
                System.out.println( num );
            }


        }
        if(eleccion == 9)
        {
            int num = 0;

            System.out.println("Los números divisibles por 2 son:");
            for (int i = 1; i <= 100; i++ )
            {
               num = (i % 2);
                if (num == 0)
               {
                   System.out.println(i);
               }
            }

            System.out.println("Los números divisibles por 3 son:");
            for (int i = 1; i <= 100; i++ )
            {
                num = (i % 3);
                if (num == 0)
                {
                    System.out.println(i);
                }
            }
        }
        if(eleccion == 10)
        {
            int num = -1;

            do
            {
                System.out.println("Ingrese un numero mayor a cero: ");
                num = sc.nextInt();

                if(num > 0)
                {
                    System.out.println( num + " es mayor que cero.");
                }
                if(num == 0)
                {
                    System.out.println( num + " es igual que cero.");
                }
            }
            while (num < 0);

        }
        if(eleccion == 11)
        {
            String pass = "12345";
            int tries = 3;
            String userPass = "";
            sc.nextLine();

            do
            {
                System.out.println("ingrese la contraseña");
                userPass = sc.nextLine();
                tries = tries - 1;
                System.out.println("Le quedan " + tries + " intentos.");
            }
            while (!userPass.equals(pass) && tries > 0 );

            if(userPass.equals(pass))
            {
                System.out.println(pass + " es correcta.");
            }
            else
            {
                System.out.println("Por favor siga intentando más tarde.");
            }

        }
        if(eleccion == 12)
        {
            int semana = 0;

            do
            {
                System.out.println("Ingrese un numero del 1 al 7 (dias de la semana): ");
                semana = sc.nextInt();
                switch (semana)
                {
                    case 1:
                        System.out.println("Lunes, día laboral.");
                        break;
                    case 2:
                        System.out.println("Martes, día laboral.");
                        break;
                    case 3:
                        System.out.println("Miercoles, día laboral.");
                        break;
                    case 4:
                        System.out.println("Jueves, día laboral.");
                        break;
                    case 5:
                        System.out.println("Viernes, día laboral.");
                        break;
                    case 6:
                        System.out.println("Sábado, fin de semana.");
                        break;
                    case 7:
                        System.out.println("Domingo, fin de semana.");
                        break;
                    default:
                        System.out.println("Día inválido.");
                        break;

                }
            }
            while (semana < 1 || semana > 7);



        }
        if(eleccion == 13)
        {
            int numero = 0;

            System.out.println("Ingrese un numero para comprobar si es primo: ");
            numero = sc.nextInt();

            if (numero == 0 || numero == 1 || numero == 4)
            {
                System.out.println(numero + " no es primo.");
            }
            if (numero == 2 || numero == 3 || numero == 5)
            {
                System.out.println(numero + " es primo.");
            }
            for (int x = 2; x < numero / 2; x++)
            {
                if (numero % x == 0)
                {
                    System.out.println(numero + " no es primo.");
                    break;
                }

                else
                {
                    System.out.println(numero + " es primo.");
                    break;
                }
            }

        }
        if(eleccion == 14)
        {
            int numero = 0;
            int intentos = 0;
            int random = (int) (Math.random()*100+1);
            while (numero != random)
            {
                System.out.println("adivine el numero entre el 1 y el 100");
                numero = sc.nextInt();
                intentos++;

                if (numero < 1 || numero > 100)
                {
                    System.out.println(numero + " no es válido.");
                    intentos= intentos -1;
                }
                if(numero < random)
                {
                    System.out.println(numero + " es muy bajo.");
                }
                else if (numero > random)
                {
                    System.out.println(numero + " es muy alto.");

                }
            }
            if (numero == random)
            {
                System.out.println(numero + " es correcto!");
                System.out.println("Encontrado en " + intentos + " intentos.");
            }

        }










    }
}
