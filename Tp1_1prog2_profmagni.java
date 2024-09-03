/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_1prog2_profmagni;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author juampi
 */
public class Tp1_1prog2_profmagni {

    double num1;
    double num2;
    String nombre;
    String input;
    
    public static void main(String[] args) {
        
        int option = 0;
        do {
            String menu = "Ingrese el número del ejercicio (del 1 al 14)\n"
                          + "Para salir, ingrese 0";
            String input = JOptionPane.showInputDialog(menu);
            try {
                option = Integer.parseInt(input);
                
                switch (option) {
                    
                    case 1:
                        JOptionPane.showMessageDialog(null, "Seleccionaste el ejercicio 1");
                        String nombre = "Juan Pablo";
                        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "Seleccionaste el ejercicio 2");
                        Scanner sc = new Scanner (System.in);
                        System.out.println("Ingrese su nombre");
                        nombre = sc.nextLine();
                        System.out.println("Bienvenido " + nombre);
                        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "Seleccionaste el ejercicio 3");
                        float num1 = 5;
                        float num2 = 2;
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        System.out.println("El resto de la division entre " + num1 + " y " + num2 + " es: " + (num1 % num2));
                        break;
                        
                    case 4:
                        JOptionPane.showMessageDialog(null, "Seleccionaste el ejercicio 4");
                        num1 = 4;
                        num2 = 3;
                        if (num1 > num2)
                            System.out.println(num1 + " es mayor que " + num2);
                         else
                        if (num1 < num2)
                            System.out.println(num1 + " es menor que " + num2);
                         else
                         System.out.println("Los numeros son iguales");
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "Seleccionaste el ejercicio 5");
                        Scanner sc5 = new Scanner(System.in);
                        System.out.println("Ingrese un numero");
                        num1 = sc5.nextInt();
                        if (num1 % 2 == 0)
                            System.out.println("El numero es divisible por 2");
                        else
                        System.out.println("El numero no es divisible por 2");
                        break;
                        
                    case 6:
                        JOptionPane.showMessageDialog(null, "Seleccionaste el ejercicio 6");
                        input = JOptionPane.showInputDialog(null, "Ingrese el precio del producto");
                        Double precio = Double.parseDouble(input);
                        precio = (precio + (precio * 0.21));
                        JOptionPane.showMessageDialog(null, "El precio con IVA de 21% es de: " + precio);
                        break;
                        
                    case 7:
                        num1 = 1;
                        while (num1 <= 100) {
                            System.out.println(num1);
                            num1 = num1 + 1;
                        }
                        break;
                        
                    case 8:
                        for (num1 = 1; num1 <= 100; num1++){
                            System.out.println(num1);
                        }
                        break;
                        
                    case 9:
                        int i;
                        for (i = 1; i <= 10; i++)
                            if (i % 2==0 || i % 3==0)
                                System.out.println(i);
                        break;
                        
                    case 10:
                        Scanner sc2 = new Scanner (System.in);
                        int numero;
                        do {
                            System.out.println("Ingrese un numero mayor o igual a 0");
                            numero = sc2.nextInt();
                        } while (numero < 0);
                        System.out.println("El numero es: " + numero);
                        break;
                    
                    case 11:
                        Boolean intento = false;
                        String password = "UTN2024";
                        int intentos = 0;
                        do {
                            input = JOptionPane.showInputDialog("Ingrese la contraseña");
                            intentos++;
                                if (input.equals(password)) {
                                    intento = true;
                                } else {
                                    intento = false;
                                }
                                if (intentos >= 3 && intento == false) {
                                    JOptionPane.showMessageDialog(null, "Ha sobrepasado los 3 intentos");
                                    break;
                                }
                        } while (intento==false);
                        if (intento==true)
                         JOptionPane.showMessageDialog(null, "Contrasena Correcta");
                        break;
                    
                    case 12:
                        int opcion12;
                        do {
                        input = JOptionPane.showInputDialog(null, "Ingrese un día de la semana\n"
                                           + "1. Lunes "
                                           + "2. Martes "
                                           + "3. Miercoles "       
                                           + "4. Jueves "       
                                           + "5. Viernes "       
                                           + "6. Sabado "
                                           + "7. Domingo ");       
                        opcion12 = Integer.parseInt(input);
                       
                        if (opcion12 < 1 || opcion12 > 7) {
                            JOptionPane.showMessageDialog(null, "Numero invalido. Ingrese un numero del 1 al 7");
                        }
                        } while (opcion12 < 1 || opcion12 > 7);
                        
                          switch (opcion12) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Es dia laboral");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Es dia laboral");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Es dia laboral");
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Es dia laboral");
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Es dia laboral");
                                break;
                            case 6:
                                JOptionPane.showMessageDialog(null, "No es dia laboral");
                                break;
                            case 7:
                                JOptionPane.showMessageDialog(null, "No es dia laboral");
                                break;
                                             }
                          
                    case 13:
                        String numeroPrimo = JOptionPane.showInputDialog("Ingrese un numero");
                        num1 = Integer.parseInt(numeroPrimo);
                        Boolean esPrimo = true;
                        
                        if (num1 <= 1)
                            esPrimo = false;
                        if (num1 <=3)
                            esPrimo = true;
                        if (num1 % 2 == 0 || num1 % 3 == 0)
                            esPrimo = false;
                       
                        for (int i13 = 5; i13 * i13 <= num1; i13 += 6) {
                         if (num1 % i13 == 0 || num1 % (i13 + 2) == 0)
                         esPrimo = true;
                        }
                        
                        if (esPrimo == true) {
                                JOptionPane.showMessageDialog(null, "es numero primo");
                        }
                        else
                                JOptionPane.showMessageDialog(null, "no es numero primo");
                        
                    case 14:
                        int intentosNum = 0;
                        int x = new Double(Math.random() * 100).intValue();
                        do {
                        Scanner adivinar = new Scanner (System.in);
                        System.out.println("Ingrese un numero");
                        num1 = adivinar.nextInt();
                        if (num1 > x)
                                System.out.println("Es muy alto");
                        if (num1 < x)
                                System.out.println("Es muy bajo");
                        intentosNum++;
                        } while (num1 != x);
                        System.out.println("Adivinaste. El numero era " + x + " y tuviste " + intentosNum + " intentos.");

                              
                                
                               
                }
                                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción inválida");
            }   
                     
        } while (option != 0);
    }
}
