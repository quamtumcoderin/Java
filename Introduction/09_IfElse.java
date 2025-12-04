





class IfElse {
    public static void main(String[] args) {
        // Java Conditions and If Statements
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        }

        // The if Statement

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;

        if (x > y) {
            System.out.println("x is greater than y");
        }

        y = 20;

        if (x == y) {
            System.out.println("x is equal to y");
        }

        // Using Boolean Variables
        boolean isLightOn = true;

        if (isLightOn) {
            System.out.println("The light is on.");
        }

        isLightOn = false;

        if (isLightOn) {
            System.out.println("The light is on.");
        }

        System.out.println("This line runs no matter what, because it is outside the if statement.");

        // If Without Braces
        if (20 > 18) 
            System.out.println("20 is greater than 18");

        // Portential Problem
        x = 20;
        y = 18;

        if (x > y)
            System.out.println("x is greater than y");
            System.out.println("This line runs no matter what (not part of the if statement)");

        // The else Statement
        isRaining = false;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("No rain today, no need for an umbrella!");
        }

        // Another Example
        int time = 20;

        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Else If
        int weather = 2;

        if (weather == 1) {
            System.out.println("Bring and umbrella.");
        } else if (weather == 2) {
            System.out.println("Wear sunglasses.");
        } else {
            System.out.println("Just go outside normally.");
        }

        time = 22;

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        time = 14;

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Short Hand If...Else
        time = 20;

        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        System.out.println((time > 8) ? "Good day." : "Good evening.");

        // Nested Ternary
        time = 22;

        String message = (time < 12) ? "Good morning."
                        : (time < 18) ? "Good afternoon."
                        : "Good evening.";
        System.out.println(message);

        // Nested If
        x = 15;
        y = 25;

        if (x > 10) {
            System.out.println("x is greater than 10");

            if (y > 20) {
                System.out.println("y is also greater than 20");
            }
        }

        // Real-Life Example
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote.");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }

        // Logical Operators in Conditions
        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        }

        if (a > b || a > c) {
            System.out.println("At least one condition is true");
        }

        if (!(a > b)) {
            System.out.println("a is NOT greater than b");
        }

        // Real-Life Example
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        int doorCode = 1337;

        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        int myNum = 10;

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}