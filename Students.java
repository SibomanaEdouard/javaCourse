public class Students{
    public static void main(String[] args){
        // System.out.println("Hello guys this is me and that is you so welcome");
        int num=12;
        //decrement and increment are unary operatotors
        System.out.println(num++);
        System.out.println(num);

        //the bitwise operators
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a++<c);
        System.out.println(a);
        System.out.println(a<b&a++<c);
        System.out.println(a);

        //this is ternary operators
        int min=(a<c)? a:c;
        System.out.println(min);

        //let me deal with assignment operators
        a+=9;
        System.out.println("The value of a is "+a);
    }
}