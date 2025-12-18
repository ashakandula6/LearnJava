public class operators {
    public static void main(String[] args){
        int x =10;
        int y =6;
        int z =3;
        double a = 10.5d;
        double b = 4.5d;


        System .out.println(x+y); //Addition
        System.out.println(x-y); //Subtraction
        System.out.println(x*y); //Multiplication
        System.out.println(x/y); //Division
        System.out.println(x%y); //Modulus
        System.out.println(x>y); //Greater than
        System.out.println(x<y); //Less than
        System.out.println(x>=y); //Greater than or equal to
        System.out.println(x<=y); //Less than or equal to

        System.out.println(a*b); //Multiplication
        System.out.println(a/b); //Division

        ++z; //Increment
        System.out.println(z);
        --z; //Decrement
        System.out.println(z);
        
    }
}

/* 
Order of Operations
Here are some common operators, from highest to lowest priority:

() - Parentheses
*, /, % - Multiplication, Division, Modulus
+, - - Addition, Subtraction
>, <, >=, <= - Comparison
==, != - Equality
&& - Logical AND
|| - Logical OR
= - Assignment 
*/