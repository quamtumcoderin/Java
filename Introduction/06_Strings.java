class Strings {
    public static void main(String[] args) {
        // Java Strings
        String greeting = "Hello";

        // String Length
        String txt = "QWERTYUIOASDFGHKÑXVBNM";
        System.out.println("The length of the txt string is: " + txt.length());

        // More String Methods
        txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        // Finding a Character in a String
        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));

        txt = "Hello";
        System.out.println(txt.charAt(0));
        System.out.println(txt.charAt(4));

        // Comparing Strings
        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println(txt1.equals(txt2));
        System.out.println(txt3.equals(txt4));

        // Removing Whitespaces
        txt = "     Hello World     ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After: [" + txt.trim() + "]");

        // String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        // Concatenation in Sentences
        String name = "John";
        int age = 25;
        System.out.println("My name is " + name + " and I am " + age + " years old.");

        // The concat() method
        System.out.println(firstName.concat(lastName));

        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c);
        System.out.println(result);

        // Adding Numbers and Strings
        int x = 10;
        int y = 20;
        int z = x + y;

        System.out.println(z);

        String xs = "10";
        String ys = "20";
        String zs = xs + ys;

        System.out.println(zs);

        System.out.println(x + ys);

        // Special Characters
        txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        txt = "It\'s alriht.";
        System.out.println(txt);

        txt = "The character \\ is called backslash.";
        System.out.println(txt);

        txt = "New\nLine";
        System.out.println(txt);

        txt = "This\tTab";
        System.out.println(txt);
    }
}