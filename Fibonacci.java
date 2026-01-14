/** Implement Fibonacci Sequence in Java */
public class Fibonacci
{
    public static void main(String[] args) 
    {
        int number = 10;
        int result = fibonacci(number);

        System.out.println("The " + number + "th term of the Fibonacci sequence is " + result + ".");
    }

    // @param n of type integer is added to the previous two numbers behind of it and the @return is the result of that operation
    public static int fibonacci(int number) 
    {
        if (number <= 1) 
        {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}