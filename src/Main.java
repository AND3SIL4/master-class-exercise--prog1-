import java.util.Scanner;

/**
 * Escribir un programa que reciba dos argumentos
 * arg[0] = numero del estudiante
 * arg[1] = cantidad de notas del estudiante
 * Luego debe imprimir el promedio total de notas haciendo uso de matrices
 */

public class Main {
    public static void main(String[] args) {
        //Set the main variables
        int student = 0;
        int scores = 0;
        if (args.length >= 2) {
            student = Integer.parseInt(args[0]);
            scores = Integer.parseInt(args[1]);
        }

        //Create a global variable to set the data
        int[][] matrix = new int[student][scores];
        setData(matrix); //Call the function to set the data into the matrix
        calculateData(matrix); //Call the function to calculate the total score per student
    }

    //Method to set the data into the matrix
    public static void setData(int[][] matrix) {
        Scanner scanner = new Scanner(System.in); //Instance the class to get the user input
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("Type the score for student " + (row + 1));
                matrix[row][column] = scanner.nextInt();
            }
        }
    }
    //Method to calculate the score per student
    public static void calculateData(int[][] matrix){
        for (int row = 0; row < matrix.length; row++){
            int total = 0;
            for (int column = 0; column < matrix[row].length; column++){
                total += matrix[row][column];
            }
            int amount = matrix[row].length;
            System.out.println("The total for student " + (row + 1) + " is " + total / amount);
        }
    }
}