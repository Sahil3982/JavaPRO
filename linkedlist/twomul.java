public class twomul {

    static int Twomul(int array[], int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] * array[j] == target) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 45, 6, 7, 7 };
        int target = 3;

        System.out.println(Twomul(array, target));
    }
}
