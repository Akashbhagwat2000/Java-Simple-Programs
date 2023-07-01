public class Average {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 10, 12, 3};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
