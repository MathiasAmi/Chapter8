import java.util.Scanner;

public class Chapter8{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] number = new double[3][4];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                number[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(number, i));
        }

    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < 4; i++){
            sum += m[columnIndex][i];
        }
        return sum;

    }
}
