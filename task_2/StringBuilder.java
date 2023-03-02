public class Main {
    public static void main(String[] args) {
        String numbers = "Hello ";
        StringBuilder sb = new StringBuilder(numbers);
        System.out.println(sb.insert(6, "World"));
    }
}