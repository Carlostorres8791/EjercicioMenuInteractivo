import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            //Mostrar Menu
            System.out.println("\n----- Menú Interactivo -----");
            System.out.println("1. Saludar");
            System.out.println("2. Calcular área de un círculo");
            System.out.println("3. Verificar si un número es par o impar");
            System.out.println("4. Cálculo del perímetro de un círculo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa tu nombre: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    saludarUsuario(nombre);
                    break;

                case 2:
                    System.out.println("Ingresa el radio del circulo para calcular su area ");
                    double radio = scanner.nextDouble();
                    double area = calculoAreaCirculo(radio);
                    System.out.println("El area del circulo es: "+area);
                    break;

                case 3:
                    System.out.println("Ingresa un numero: ");
                    int numero = scanner.nextInt();
                    parImpar(numero);
                    break;

                case 4:
                    System.out.println("Ingresa el radio del circulo para calcular su perimetro ");
                    double rad = scanner.nextDouble();
                    double perimetro = perimetroCirculo(rad);
                    System.out.println("El perimetro del circulo es: "+perimetro);
                    break;

                case 5:
                    System.out.println("Saliendo del programa... Hasta Pronto");
                    break;

                default:
                    System.out.println("Opcion no valida. Intenta de nuevo");
            }
        }while (opcion != 5);

        scanner.close();
    }

    //metodo para saludar al usuario
    public static void saludarUsuario(String nombre){
        System.out.println("Hola, "+nombre+". Bienvenido al programa");
    }

    //metodo para calcular el area de un circulo
    public static double calculoAreaCirculo(double radio){
        return Math.PI * radio * radio; //Formula Pi * radio al cuadrado
    }

    //Metodo para verificar si un numero es par o impar
    public static void parImpar(int numero){
        if (numero % 2 == 0) {
            System.out.println("El numero "+numero+" es par");
        }else {
            System.out.println("El numero "+numero+" es impar");
        }
    }

    //metodo para calcular el perimetro del circulo
    public static double perimetroCirculo(double radio){
        return Math.PI*radio*2;//formula perimetro del circulo
    }
}