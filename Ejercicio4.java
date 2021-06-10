import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){
        int i = 1, edad, mayor = 0, menor = 0, auxiliar;
        Scanner entrada = new Scanner(System.in);
        while(i <= 20){
            System.out.print("Ingrese edad " +i + ": ");
            auxiliar = entrada.nextInt();
            if(i == 1){
                mayor = auxiliar;
                menor = auxiliar;
            } else {
                if(auxiliar > mayor){
                    mayor = auxiliar;
                }
                if(auxiliar < menor){
                    menor = auxiliar;
                } 
            }
            i = i+1;
        }
        System.out.println("La persona de mayor edad tiene = " + mayor + " años");
        System.out.println("La persona de menor edad tiene = " + menor + " años");
    }
}