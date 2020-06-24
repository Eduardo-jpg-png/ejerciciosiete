package ejerciciosiete;
import java.util.Random;
import java.util.Scanner;
public class Ejerciciosiete {
    public static void main(String[] args) {
          int x=0, y=0;
        Scanner sc = new Scanner (System.in); 
        System.out.println("Introduce cantidad de filas");
        x=sc.nextInt();
        System.out.println("Introduce cantidad de columnas");
        y=sc.nextInt();
        int matriz[][]= new int [x][y];
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        inicializar(matriz);
        System.out.println("Array original");
        visualizar(matriz);     
        Arraytraspuesta(matriz, transpuesta);
        System.out.println("Array transpuesta");
        visualizar(transpuesta);     
        }  
      static void Arraytraspuesta(int[][] matriz, int[][] transpuesta){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }
    static void inicializar(int[][] matriz){
         Random r = new Random();
        int r1=0, r2=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Rango de numeros inicial");
        r1=sc.nextInt();
        System.out.println("Rango de numeros final");
        r2=sc.nextInt();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = r.nextInt(r2+r1); 
            }
        }
    }
    static void visualizar(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        }
}