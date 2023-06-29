public class sec {
    public static void main(String[] args) {
        String[][] array = { { "1", "2", "3" }, { "9", "7", null } };
        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {                             // ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]);                // NumberFormatException
                sum += val;
            }
        }

        return sum;
    }
}
