class Booleans {
    public static void main(String[] args) {
        // Boolean Values
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Boolean Expressions
        int x = 10;
        int y = 9;

        System.out.println(x > y);
        System.out.println(10 > 9);

        x = 10;
        System.out.println(x == 10);
        System.out.println(10 == 15);

        // Real Life Example
        int myAge = 25;
        int votingAge = 18;

        System.out.println(myAge >= votingAge);

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}