// Every Java application must reside inside a class.
// The file name must exactly match the class name (HelloWorld.java).
public class  a {
    
    // The main method is the entry point where execution starts.
    public static void main(String[] args) {
        
        // // Prints the text inside quotes to the console.
        // System.out.println("Hello, World!");
        // String name = "vedant";
        // int age = 20;
        // double height = 5.7 ;
        // boolean student = true ;
        // char section = 'C';

        // System.out.println("my name is" + name + " wedekar and my age is"+ age +" , height is "+ height  +" , section is "+ section   +" and yes mf im student ");


        System.out.println("hello world ");
        System.out.println("im vedant n wedekar  ");

        int age = 20 ;
        String nme = "vedant";
        double poniter  = 9.15;
        boolean male  =  true ;  
        int a = 10 ;
        int b = 5 ;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        int num = 44 ;
        if(num % 2 == 0){
            System.out.println("number is even ");

        }else{
            System.out.println("number is odd ");
        }

        int larg = 10 ;
        int smal =  9 ;
        if (larg > smal ){
            System.out.println("number"  + larg + " is grater than  " + smal );
        }
        if(larg  < smal ){
            System.out.println("number"  + smal + " is grater than  " + larg );

        }else{
            System.out.println("both number are equal ");
        }

        int alpha = 10 ; int beta =  15 ; int gammma = 20 ; 
        if(beta < alpha || alpha > gammma ){
            System.out.println("alpha  is greater than any other ");

        }  
          if(beta > alpha || beta > gammma ){
            System.out.println("beta is greater than any other ");

        } 
        else {
            System.out.println("gamma is greater than any other ");
        }
    }
}
