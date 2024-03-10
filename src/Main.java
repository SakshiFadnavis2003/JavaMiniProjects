import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello Java");

        /*
        *
            Class

            A class is a group of objects sharing common properties and methods.
            Classes encapsulate data and behavior.
            Variables

            Variables are containers holding data and should have unique names.
            They store information necessary for program execution.
            Data Types

            Data types determine the type and size of data associated with variables.
            Primitive data types store simple values, while non-primitive data types store complex values.
            String Class

            Strings are immutable non-primitive data types in Java.
            They offer various methods like concatenation, charAt, length, replace, and substring.
            Arrays

            Arrays are collections of elements of the same type.
            They can be created using the new keyword or initialized directly.
            Casting

            Casting is assigning values of one type to another.
            Implicit casting is done by Java automatically, while explicit casting is done by the programmer.
            Constants

            Constants are variables with fixed values and are declared using the final keyword.
            Operators

            Java has arithmetic, unary, assignment, comparison, and logical operators.
            These operators perform various operations on operands.
            Math Class

            Math class provides functions for mathematical operations like max, min, and random.
            Taking Input

            Input can be taken using the Scanner class for various data types.
            Conditional Statements

            Conditional statements like if-else and switch are used for decision-making.
            Loops

            Loops execute a block of code repeatedly until a condition is met.
            For, while, and do-while loops are commonly used.
            Exception Handling (try-catch)

            Exception handling in Java is used to handle runtime errors and maintain normal flow.
            Methods/Functions

            Functions are blocks of code performing a specific task.
            They improve code readability, maintainability, and reduce redundancy.
            Main Function

            The main function serves as the entry point for the program execution.*/

        //variables - A variable in Java is a named storage location used to hold data that can be changed during program execution.
        String name = "Aman";
        String neighbor = "Akku";
        int age = 30;
        String friend = neighbor;

        //java datatype -
        //primitive - Primitive types in Java are basic data types like int, double, and boolean, representing simple values
        /* bytes stored
         * byte - 1
         * short - 2
         * int - 4
         * long - 8
         * float - 4
         * double - 8
         * char - 2
         * boolean - 1
         * */
        byte mother_age = 30;
        int phone = 1234567890;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = false;
        //non - primitive reference - non-primitive types, also known as reference types, are objects like String and arrays that hold references to complex data structures.

        //Strings - String is an immutable object representing a sequence of characters, utilizing features like the String Pool for memory efficiency, concatenation with the + operator, and numerous methods for manipulation and comparison.
        String Stname = new String("Adam");
        System.out.println(Stname.length());
        //concatenate
        String name1 = "Aman";
        String name2 = "Akku";
        String name3 = name1+name2;
        System.out.println(name3);

        //charAt
        System.out.println(name.charAt(0));

        //length
        System.out.println(name3.length());

        //replace
        System.out.println(name.replace('a','b'));
        System.out.println(name);

        //substring
        System.out.println(name.substring(0,2));
        //begin index - included
        //end index - not included

        //Arrays - arrays are fixed-size, ordered collections of elements of the same data type.
        int[] marks = new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        System.out.println(marks[0]);

        // Printing the whole array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }

        //length
        System.out.println(marks.length);

        //sort
        //Arrays class is used for sorting
        Arrays.sort(marks);
        // Printing the whole array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }

        //1D array
        int[] physics = {75,25,98};

        //2D array
        int[][] finalMarks = {{97,98,95},{95,94,38}};
        System.out.println(finalMarks[0][0]);

        //casting - Casting in Java refers to the process of converting a value from one data type to another
        //implicit - implicit casting automatically performed by the compiler for compatible types
        double price = 100.00;
        double finalPrice = price +18;
        System.out.println(finalPrice);

        //explicit - explicit casting requiring manual specification by the programmer for incompatible types.
        int p =100;
//        int fp = p + 18.0;    - not supported
        int fp = p + (int)18.99;
        System.out.println(fp);

        //Constants - Constants in Java are variables whose values cannot be changed once assigned, typically declared using the final keyword.
        int age1 = 30;
        int age2 =32;
        //can be changed

        final float PI = 3.14F;
        //cannot be changed

        //input?
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age : ");
//        int age_St = sc.nextInt();
        float age_St = sc.nextFloat();
        System.out.println(age_St);
        System.out.println("Input your word : ");
        String name4 = sc.next(); //takes input as only the first word
        System.out.println(name4);
        System.out.println("Input your line : ");
        String line = sc.nextLine(); //takes input as thw whole sentence
        System.out.println(line);

        // Operators: Symbols that perform operations on variables and values. They include arithmetic (+, -, *, /, %), assignment (=, +=, -=, etc.), logical (&&, ||, !), and comparison (==, !=, >, <, >=, <=) operators.
        // Arithmetic Operators: Perform mathematical operations such as addition, subtraction, multiplication, division, and modulus.
        int a  = 1;
        int b =2;
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;
        double c = 1;
        double d = 2;
        double ddiv = c/d;
        double rem = c%d;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(ddiv);
        System.out.println(rem);

        // Assignment Operators: Used to assign values to variables, including simple assignment as well as compound assignment operators like +=, -=, *=, /=.
        int numb=1;
        numb++;
        System.out.println(numb);
        ++numb;
        System.out.println(numb);

        // Logical Operators: Used to perform logical operations such as AND, OR, and NOT, typically used to evaluate boolean expressions.
        System.out.println(Math.min(5,6));
        //random
        System.out.println((int)(Math.random()*100));
//        and - && - all conditions should be true
        int s = 20;
        int v = 40;
        if(s<50 && v>10){
            System.out.println("true");
        }

        // or - || - only one condition should be true
        if(s<50 || v>10){
            System.out.println("true");
        }

        //not - ! - ulta pulta
        boolean Adult = false;
        if(!Adult){
            System.out.println("not Adult");
        }
        else{
            System.out.println("Adult");
        }

        // Comparison Operators: Used to compare two values or expressions and return a boolean result, including operators like ==, !=, >, <, >=, and <=.
        int t=3;
        int u=4;
        System.out.println(t==u);
        System.out.println(t!=u);
        System.out.println(t>u);
        System.out.println(t<u);
        System.out.println(t<=u);
        System.out.println(t>=u);

        //Conditional Statements
        boolean isSunUp = true;
        if(isSunUp==true){
            System.out.println("day");
        }
        else{
            System.out.println("false");
        }

        int age5 = 3;
        if(age5>18){
            System.out.println("can vote");
        }
        else{
            System.out.println("can't vote");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Kitna paisa hai tere paas ?");
        int cash = scan.nextInt();

        if(cash<10){
            System.out.println("bhag idhar se");
        } else if (cash>10 && cash<50) {
            System.out.println("pen kharidne aaya hai");
        }
        else{
            System.out.println("haeettt ameer");
        }

        //Switch Statements
        //A switch statement in Java allows a program to evaluate a variable against multiple cases and execute code based on the matched case, providing an alternative to if-else statements.
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("wed - sun");
                break;
        }

        //Loops
        // for loops: Iterates over a block of code a specified number of times.
        for(int i=0;i<10;i++){
            System.out.println(i+1);
        }

        for(int i=10;i>=1;i--){
            System.out.println(i);
        }

        // do-while loops: Executes a block of code at least once and repeats the execution as long as a specified condition is true.
        int k =10;
        do{
            System.out.println(k);
            k--;
        }
        while(k>=1);

        // while loops: Executes a block of code as long as a specified condition is true.
        int i = 10;
        while(i>=1){
            System.out.println(i);
            i--;
        }

        int number =0;
        do{
            System.out.println("input a number : ");
            number = sc.nextInt();
            System.out.println(number);
        }while (number>=0);

        // break: Terminates the nearest enclosing loop or switch statement and transfers control to the statement immediately following the terminated loop or switch.
        int in =0;
        while(true){
            System.out.println(in);
            in++;
            if(in>5){
                break;
            }
        }

        // continue: Skips the rest of the current iteration of a loop and continues with the next iteration.
        int inp =0;
        while(true){
            System.out.println(inp);
            inp++;
            if(inp>5){
                break;
            }
            if(inp==3){
                inp++;
                continue;
            }
        }

        // Exception Handling: A mechanism in Java that enables programmers to manage and respond to exceptional conditions (errors) that occur during program execution, allowing for graceful handling of errors and preventing program crashes.
        // TRY-CATCH: A construct in Java used to handle exceptions by enclosing a block of code (within the try block) that may potentially throw an exception, and providing one or more catch blocks to handle specific types of exceptions that might occur.
        int[] marks0 = {97,98,99};
        try{
            System.out.println(marks0[7]);
        }catch (Exception exception){

        }
        System.out.println("Helllooooowww");

        // Methods/Functions: Encapsulated blocks of code that perform specific tasks, allowing for code reusability, modularity, and abstraction by defining a set of actions that can be invoked and executed with specific inputs and optional return values.
        printJava();
        printName("AMAN");
        sum(3,4);
    }
    public static void printJava(){
        System.out.println("hello Java");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void sum(int a,int b){
        System.out.println(a+b);
    }
}