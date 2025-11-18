class DataTypes {
    public static void main(String[] args) {
        // Java Data Types
        int myInt = 5;
        float myfloat = 5.99f;
        char myCharacter = 'A';
        boolean myBool = true;
        String myString = "Hello";

        // myInt = "Hello"; -> Error
        // myString = 34; -> Error

        // Integer Types
        byte myByte = 100; // -128 to 127
        System.out.println(myByte);

        short myShort = 5000; // -32768 to 32767
        System.out.println(myShort);

        int myNum = 100000; // -2147483648 to 2147483647
        System.out.println(myNum);

        long myLong = 15000000000L; // -9223372036854775808 to 9223372036854775807
        System.out.println(myLong);

        // Floating Point Types
        float myFlt = 5.75f; // 6 - 7 decimals
        System.out.println(myFlt);

        double myDouble = 19.99d; // 16 decimals
        System.out.println(myDouble);

        // Scientific Numbers
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // Boolean Types
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Characters
        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // Strings
        String greeting = "Hello World";
        System.out.println(greeting);

        // Real-Life Example
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost: " + totalCost + currency);

        // The var Keyword
        var x = 5;
        System.out.println(x);

        // Example with Different Types
        var myIntVar = 5;
        var myDoubleVar = 9.98;
        var myCharVar = 'D';
        var myBoolVar = true;
        var myStringVar = "Hello";
    }
}