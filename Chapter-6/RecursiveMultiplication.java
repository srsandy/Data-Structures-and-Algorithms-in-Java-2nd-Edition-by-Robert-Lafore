class RecursiveMultiplication {
    public static void main(String[] args) {
        if(args.length == 0) {
            final int mult1 = mult(2, 4);
            final int mult2 = mult(10, 5);
            final int mult3 = mult(5, 2);
            final int mult4 = mult(-2, 6);

            System.out.println("2 * 4: " + mult1);
            System.out.println("10 * 5: " + mult2);
            System.out.println("5 * 2: " + mult3);
            System.out.println("-2 * 6: " + mult4);
        } else if(args.length >= 2) {
            try {
                final int x = Integer.parseInt(args[0]);
                final int y = Integer.parseInt(args[1]);

                final int result = mult(x, y);
                System.out.println(x + " * " + y + " = " + result);
            } catch(NumberFormatException exc) {
                System.out.println("Please provide two integers as arguments!");
            }
        }
    }

    private static int mult(int x, int y) {
        if(y == 1) return x;
        return x + mult(x, (y - 1));
    }

}