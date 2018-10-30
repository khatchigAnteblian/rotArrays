package rotatingarrays;

public class RotatingArrays {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        print(a);
        System.out.print("\n");
        int[][] b = rotate(a, false);
        print(b);
        System.out.print("\n");
        int[][] c = rotate(a, true);
        print(c);
    }
    
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // Rotate 90 degrees counter-clockwise
    // 3 6 9
    // 2 5 8
    // 1 4 7
    // Rotate 90 degrees clockwise
    // 7 4 1
    // 8 5 2
    // 9 6 3
    
    public static void print(int[][] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static int[][] rotate(int[][] array, boolean cClockwise) {
        int[][] result = new int[array.length][array.length];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                if (cClockwise) {
                    result[i][j] = array[j][array.length - 1 - i]; // counter clockwise
                } else {
                    result[i][j] = array[array.length - 1 - j][i]; // clockwise
                }
            }
        }
        return result;
    }
    
}
