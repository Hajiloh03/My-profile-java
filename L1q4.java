package l1q4;

public class L1q4 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June"};
        int[] sales = {2500, 1600, 2000, 2700, 3200, 800};

        System.out.println("=== Product A Sales Chart ===");
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s | %s (%d)\n", months[i], generateBar(sales[i]), sales[i]);
        }
    }

    
    public static String generateBar(int value) {
        StringBuilder bar = new StringBuilder();
        int length = value / 100;  
        for (int i = 0; i < length; i++) {
            bar.append("█");
        }
        return bar.toString();
    }
}