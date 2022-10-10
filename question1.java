package tothenew;

//functional interface for comparing two integer  values
@FunctionalInterface
interface operation1 {
    boolean compare(int a, int b);
}

//Functional interface for increment value by 1
@FunctionalInterface
interface operation2 {
    int incrementValue(int a);
}

//Functional interface for concatenate two strings
@FunctionalInterface
interface operation3 {
    String concatinateTwoStrings(String string1, String string2);
}

//Functional interface for converting string into uppercase
@FunctionalInterface
interface operation4 {
    String convertStringToUpperCase(String string);
}

public class question1 {
    public static void main(String[] args) {
        //lambda function of  operation 1 which returns a boolean
        operation1 operation1 = (int a, int b) -> {
            return a > b;
        };
        System.out.println(operation1.compare(8, 5)); //printing result by calling compare method

        operation2 operation2 = a -> ++a; //lambda function of  operation 2 which returns a integer value
        System.out.println(operation2.incrementValue(5));//printing result by calling incrementValue method

        operation3 operation3 = (a, b) -> a + b; //lambda function of  operation 3 which returns a string
        System.out.println(operation3.concatinateTwoStrings("Hello", "World"));//printing result by calling concatinateTwoStrings method

        operation4 operation4 = a -> a.toUpperCase(); //lambda function of  operation 4 which returns a string
        System.out.println(operation4.convertStringToUpperCase("hello world"));//printing result by calling convertStringToUpperCase method
    }
}