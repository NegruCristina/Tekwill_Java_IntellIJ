package com.company;

public class Main {

    public static void main(String[] args) {
        //afisam la ecram cu ajutorul metodei getResul din interface
        System.out.println(getOperation('*').getResult(10,5));
        System.out.println(getOperation('/').getResult(10,5));
        System.out.println(getOperation('-').getResult(10,5));
        System.out.println(getOperation('+').getResult(10,5));

    }
/*am facut o metododa statica pe baza la intrface care primeste un char si in dependenta ce prmeste el acolo in
* case aceea face prin lamba expresii*/
    public static Operation getOperation(char symbol){
        switch (symbol){
            case '*':
                return (value1, value2) -> value1*value2;
            case '/':
                return (value1, value2) -> value1/value2;
            case '-':
                return (value1, value2) -> value1-value2;
            case '+':
                return (value1, value2) -> value1+value2;
            default:
                return (value1, value2) -> 0;
        }
    }
}
