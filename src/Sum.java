import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter size of matrix:");
        size = scanner.nextInt();
        double arr[][] = new double[size][size];
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j <arr[i].length;j++){
                System.out.println("Enter value of elements row " + (i+1)+" column " + (j+1) + ":");
                arr[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i <arr.length;i++){
            System.out.println();
            for (int j = 0 ; j <arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
        }
        double sum = 0;
        System.out.println("Enter column to calculate sum:");
        int column = scanner.nextInt();
        for (int i = 0 ; i < arr.length;i++){
            for (int j = 0 ; j <arr[i].length;j++){
                if (j == column){
                    sum+= arr[i][column];
                }
            }
        }
        System.out.println("Sum of column "+column+" is " + sum);
    }
}

