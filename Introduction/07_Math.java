class Math {
    public static void main(String[] args) {
        // Math.max()
        int mathMax = java.lang.Math.max(5, 10);
        System.out.println(mathMax);

        // Math.min()
        int mathMin = java.lang.Math.min(5, 10);
        System.out.println(mathMin);

        // Math.sqrt()
        double mathSqrt = java.lang.Math.sqrt(64);
        System.out.println(mathSqrt);

        // Math.abs()
        double mathAbs = java.lang.Math.abs(-4.7);
        System.out.println(mathAbs);

        // Math.pow()
        double mathPow = java.lang.Math.pow(2, 8);
        System.out.println(mathPow);

        // Rounding Methods
        double mathRound = java.lang.Math.round(4.6);
        double mathCeil = java.lang.Math.ceil(4.1);
        double mathFloor = java.lang.Math.floor(4.9);

        System.out.println(mathRound);
        System.out.println(mathCeil);
        System.out.println(mathFloor);

        // Random Numbers
        double random = java.lang.Math.random();
        System.out.println(random);

        int randomNum = (int)(java.lang.Math.random() * 101);
        System.out.println(randomNum);
    }
}