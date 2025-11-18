class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing Casting
        myDouble = 9.78d;
        myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);

        // Real-Life Example
        int maxScore = 500;
        int userScore = 423;

        double percentage = (double) userScore / maxScore * 100.0d;
        System.out.println("User's percentage is " + percentage);
    }
}