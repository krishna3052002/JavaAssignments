public class PowersOfTwo {
    public static void main(String[] args) {
        System.out.println("Powers of 2 from 2^0 to 2^20:");
        for (int i = 0; i <= 20; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }
    }
}
