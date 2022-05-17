package org.groupa.week10;

public class ExceptionMain {

    public static void main(String[] args){

        try{
            checkAge(12);
            checkAge(19);
        }
        catch (AgeException runtimeException) {
            System.out.println("Error : " + runtimeException.getMessage());
        }
    }

    static void checkAge(int age) throws AgeException{
        if (age < 18) {
            throw new AgeException("Tidak bisa mengikuti");
        }
    }

    public int menghitung(int a , int b){
        int sum = a-b;
        if(sum==0)
            throw new ArithmeticException("sum adalah 0");

        return sum;
    }
}
