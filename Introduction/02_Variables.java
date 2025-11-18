class Variables {
    public static void main(String[] args) {
        // Declaring Variables
        String name = "John";
        System.out.println(name);

<<<<<<< HEAD
        int age = 27;
        System.out.println(age);

        int year;
        year = 2025;
        System.out.println(year);

        String day = "Monday";
        day = "Tuesday";
        System.out.println(day);

        // Final Variables
        final int DECEMBERDAYS = 31; // No change
        final String NAME = "Manolo"; // No change
=======
        int myNum = 15;
        System.out.println(myNum);

        int myOtherNum;
        myOtherNum = 15;
        System.out.println(myOtherNum);

        int myNum2 = 15;
        myNum2 = 20;
        System.out.println(myNum2);

        // Final Variables
        final int myNum3 = 15;
        // myNum3 = 20; -> Error

        // Other Types
        int myInt = 5;
        float myFloat = 5.99f;
        char myChar = 'A';
        boolean myBool = true;
        String myString = "Hello";

        // Print Varables
        System.out.println("Hello" + name);

        String firstname = "John";
        String lastName = "Doe";
        String fullName = firstname + " " + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        System.out.println("The sum is " + x + y);
        System.out.println("The sum is " + (x + y));

        // Declare Many Variables
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);

        // One Value to Multiple Variables
        a = b = c = 50;
        System.out.println(a + b + c);

        // Identifiers
        int minutesPerHour = 60; // Good
        int m = 60; // OK, but not easy to understand

        // Constants
        final int MINUTES_PER_HOUR = 60;
        final int BIRTHYEAR = 1980;

        // Real-Life Examples
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        int length = 4;
        int width = 6;
        int area;

        area = length * width;

        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // Display Variables
        String name2 = "John";
        System.out.println(name2);

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
>>>>>>> origin/main
    }
}