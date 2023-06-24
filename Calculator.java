/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author Jon
 */
public class Calculator {

    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       try{
           System.out.println(calculate(scan));
           
       }catch (DivisionByZeroException | FactorielException | OperatoriException ex){
           System.out.println(ex);
       }
    }
    private static String calculate (Scanner scan) throws DivisionByZeroException, FactorielException, OperatoriException{
            System.out.println("Shtyp operatorin (+,-,/,*,!): ");
            String op =scan.nextLine().trim();
            switch(op){
            case"+":
            return add(scan);
            case"-":
            return substract(scan);
            case"/":
            return divide(scan);
            case"!":
            return factoriel(scan);
            case"*":
                return multiply(scan);
            default: 
                    throw new OperatoriException(op);
            }
    }
    
    private static String add(Scanner scan){
        System.out.print("Shtyp x: ");
        int x=scan.nextInt();
        System.out.print("Shtyp y: ");
        int y=scan.nextInt();
        return x+"+"+y+"="+(x+y);
    }
    private static String substract(Scanner scan){
        System.out.print("Shtyp x: ");
        int x=scan.nextInt();
        System.out.print("Shtyp y: ");
        int y=scan.nextInt();
        return x+"-"+y+"="+(x-y);
    }
     private static String divide(Scanner scan) throws DivisionByZeroException{
        System.out.print("Shtyp x: ");
        int x=scan.nextInt();
        System.out.print("Shtyp y: ");
        int y=scan.nextInt();
        if(y==0){
            throw new DivisionByZeroException();
        }
        return x+"/"+y+"="+(double)(x/y);
    } 
     private static String multiply(Scanner scan){
        System.out.print("Shtyp x: ");
        int x=scan.nextInt();
        System.out.print("Shtyp y: ");
        int y=scan.nextInt();
        return x+"*"+y+"="+(x*y);
     }
         private static String factoriel(Scanner scan) throws FactorielException{
        System.out.print("Shtyp x: ");
        int x=scan.nextInt();
        return x+"! ="+factoriel(x);}
         
        private static long factoriel (int x) throws FactorielException{
            if(x<0){
                throw new FactorielException(x);
            }
            if(x<=1){
                return 1;
            }
            return x* factoriel (x-1);
        }
}
    

