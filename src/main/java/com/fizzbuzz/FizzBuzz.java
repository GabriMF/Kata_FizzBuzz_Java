package com.fizzbuzz;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void printer(){
        int num;
        for(num = 1; num <= 100; num++){
            System.out.println(num);
        }
    }


    public String fizz(){
        if(this.number % 3 == 0){
            return "Fizz";
        }
        else{
            return String.valueOf(this.number);
        }
    }

    public String buzz(){
        if(this.number % 5 == 0){
            return "Buzz";
        }
        else{
            return String.valueOf(this.number);
        }
    }

    public String fizzBuzz(){
        if(this.number % 3 == 0 && this.number % 5 == 0){
            return "FizzBuzz";
        }
        else{
            return String.valueOf(this.number);
        }
    }


    public String fizz2(){
        if(this.number % 3 == 0 && String.valueOf(this.number).indexOf("3") != -1){
            return "Fizz";
        }
        return String.valueOf(this.number);
    }

    public String buzz2(){
        if(this.number % 5 == 0 && String.valueOf(this.number).indexOf("5") != -1){
            return "Buzz";
        }
        return String.valueOf(this.number);
    }
    
}
