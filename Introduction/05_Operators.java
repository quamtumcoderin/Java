

class Operators {
    public static void main(String[] args) {
        // Java Operators
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;

        // Arithmetic Operators
        int x = 10;
        int y = 3;
        int z = 5;

        System.out.println(x + y); // Addition
        System.out.println(x - y); // Subtraction
        System.out.println(x * y); // Multiplication
        System.out.println(x / y); // Division
        System.out.println(x % y); // Modulus
        System.out.println(z++); // Increment
        System.out.println(z--); // Decrement

        // Real-Life Example
        int peopleInRoom = 0;

        peopleInRoom++; // +1 person
        peopleInRoom++; // +1 person
        peopleInRoom++; // +1 person

        System.out.println(peopleInRoom);

        peopleInRoom--; // -1 person

        System.out.println(peopleInRoom);

        // Assigment Operators
        x = 10;
        System.out.println(x);

        x += 5;
        System.out.println(x);

        x -= 5;
        System.out.println(x);

        x *= 5;
        System.out.println(x);

        x /= 5;
        System.out.println(x);

        x %= 2;
        System.out.println(x);

        // Real-Life Example
        int savings = 100;
        savings += 50;
        System.out.println("Total savings: " + savings);

        // Comparison Operators
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        // Real-Life Examples
        int age = 18;

        System.out.println(age >= 18); // true, old enough to vote
        System.out.println(age < 18); //false, not old enough

        int passwordLegth = 5;
        System.out.println(passwordLegth >= 8); // false, too short
        System.out.println(passwordLegth < 8); // true, needs more characters

        // Logical Operators
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(!false);
        System.out.println(!true);

        // Real-Life Example
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));

        // Java Operator Precedence
        int result1 = 2 + 3 * 4;
        int result2 = (2 + 3) * 4;

        System.out.println(result1);
        System.out.println(result2);
    }
}