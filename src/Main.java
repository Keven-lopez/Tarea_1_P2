import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void holamundo() {
        System.out.println("Hola mundo");
    }
    public static void sumar(){
        int num1, num2;
        System.out.println("Ingrese un numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }
    public static void par_impar() {

        int num1, resul;
        System.out.println("Ingrese un numero");
        num1 = sc.nextInt();
        resul = num1 % 2;
        if (resul == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
    public static void factorial(){
        int num1, result=1;
        System.out.println("Ingrese un numero");
        num1 = sc.nextInt();
        for (int i = 1; i <= num1 ; i++){
            result *= i;
        }
        System.out.println("El resultado es: " + result);
    }
    public static void tabla(){
        int num1;
        System.out.println("Ingrese un numero");
        num1 = sc.nextInt();
        System.out.println("Orden Ascendente: ");
        for (int i = 1; i <= 12 ; i++){
            int mult = num1 * i;
            System.out.print(mult + " \n");
        }
        System.out.println("\nOrden Descendente: ");
        for (int i = 12; i >= 1 ; i--){
            int mult = num1 * i;
            System.out.print(mult + " \n");
        }
    }
    public static void serie(){
        int num1, max=0, min=Integer.MAX_VALUE;
        System.out.println("Ingrese un numero (ingrese un numero negativo para salir):");
        do {
            num1 = sc.nextInt();
            if (num1 > max){
                max = num1;
            }
            else if (num1 < min && num1 > 0){
                min = num1;
            }
        } while (num1 > 0);
        System.out.println("El maximo es: " + max);
        System.out.println("El minimo es: " + min);
    }
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("Menu de opciones");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Sumar 2 numeros");
            System.out.println("3. Par or Impar");
            System.out.println("4. Factorial");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Maximo y Minimo de Una Serie");
            System.out.println("7. Salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    holamundo();
                    break;
                case 2:
                    sumar();
                    break;
                case 3:
                    par_impar();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    tabla();
                    break;
                case 6:
                    serie();
                    break;
                case 7:
                        System.out.println("Saliendo del programa");
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }while (opcion != 7);
        sc.close();
    }
}