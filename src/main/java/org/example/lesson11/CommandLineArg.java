package org.example.lesson11;

public class CommandLineArg {

    public static void main(String[]args){
        /*
         Sample Input 1:-path /something/there config-format json
         Sample Output 1:
         config-path=/something/there
         config-format=json
         */
        for(int i=0 ; i<args.length ; i+=2){
            System.out.println(args[i]+"="+args[i+1]);
        }
    }
}
