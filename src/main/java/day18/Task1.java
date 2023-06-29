package day18;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {-402, -50, -249, -15, -665, -311};
        System.out.println(recursionSum(numbers, 0));
    }


    public static int recursionSum(int[] numbers, int index) {
        if(index == numbers.length - 1)
            return numbers[index];

        return numbers[index] + recursionSum(numbers, index + 1);
    }
}
