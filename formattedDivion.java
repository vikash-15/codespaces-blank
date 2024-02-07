class formattedDivision {
    public static String FormattedDivision(int num1, int num2) {
        double result = (double) num1 / num2;
        String formatted = String.format("%.4f", result);
        return formatted;
    }

    public static void main(String[] args) {
        // keep this function call here
        System.out.println(FormattedDivision(123456789, 10000));
    }
}


