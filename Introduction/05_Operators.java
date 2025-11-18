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
        
    }
}