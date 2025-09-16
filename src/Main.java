import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int linha = 3;
        int coluna = 3;
        int linha2=3;
        int coluna2=4;

        int dim=3;
        int dim2=3;
        double valorVector[] = {1,2,3};
        double valorVector2[] = {4,2,10};



        double valores[][] = {{1, 2,3}, {0,1,2}, {0,1,0}};

        double valores2[][] = {{1,-2,1,0}, {2,3,-1,5}, {3,1,2,11}};



        Matrix m = new Matrix (linha,coluna,valores );
        Matrix m2 = new Matrix (linha2,coluna2,valores2 );
        Vector v1 = new Vector (dim, valorVector);
        Vector v2 = new Vector (dim2, valorVector2);
        LinearAlgebra l = new LinearAlgebra();


                System.out.println("MATRIZES");
        System.out.println("  ");
        System.out.println("Matriz 01: ");
        m.mostrar();
        System.out.println("  ");
        System.out.println("Matriz 02: ");
        m2.mostrar();
        System.out.println("  ");
        System.out.println("Achar um elemento: ");
        System.out.println(m.get(1,1));

        System.out.println("  ");


        System.out.println("  ");
        System.out.println("Matriz 01 transposta:");
        l.mostrarMatriz(l.transpose(valores));
        System.out.println("  ");
        System.out.println("Matriz 02 transposta:");
        l.mostrarMatriz(l.transpose(valores2));

        System.out.println("Soma de matrizes: ");
        l.mostrarMatriz(l.sum(valores, valores2));
        System.out.println("  ");
        System.out.println("Método times de matrizes: ");
        l.mostrarMatriz(l.times(valores, valores2));
        System.out.println("  ");
        System.out.println("Método dot de matrizes: ");
        l.mostrarMatriz(l.dot(valores, valores2));
        System.out.println("  ");
        System.out.println("Método gauss da matriz 01: ");
        l.mostrarMatriz(l.gauss(valores));
        System.out.println("  ");
        System.out.println("Método gauss da matriz 02: ");
        l.mostrarMatriz(l.gauss(valores2));
        System.out.println("  ");
        System.out.println("Método solve da matriz 01: ");
        l.mostrarMatriz(l.solve(valores));

        System.out.println("  ");
        System.out.println("Método solve da matriz 02: ");
        l.mostrarMatriz(l.solve(valores2));

        System.out.println("Alterar um elemento ");
        m2.set(1,1, 5);
        System.out.println("  ");
        m2.mostrar();

        System.out.println("  ");
        System.out.println("VETORES ");
        System.out.println("  ");
        System.out.println("Vetor 01  ");
        v1.mostrarVector();
        System.out.println("  ");
        System.out.println("Vetor 02  ");
        v2.mostrarVector();
        System.out.println("  ");
        System.out.println("Transpose vector 01  ");
        l.mostrarVector(l.transposeVector(valorVector));
        System.out.println("  ");
        System.out.println("Transpose vector 02 ");
        l.mostrarVector(l.transposeVector(valorVector2));
        System.out.println("  ");
        System.out.println("Soma de vetores");
        l.mostrarVector(l.sumVector(valorVector2, valorVector));
        System.out.println("  ");
        System.out.println("Times de vetores");
        l.mostrarVector(l.timesVector(valorVector2, valorVector));







        }
    }