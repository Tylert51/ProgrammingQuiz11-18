public class Question2 {
    public static void main(String[] args) {
        System.out.println(createSequence(0, 2, 10));
        System.out.println(createSequence(5, 3, 5));
    }


    public static String createSequence(int a, int b, int n) {
        int counter = a + b;
        String result = (counter + " ");
        for (int i = 1; i < n; i++) {
            counter += (int) (Math.pow(2,i) * b);
            result += counter + " ";
        }
        return result;
    }
}
