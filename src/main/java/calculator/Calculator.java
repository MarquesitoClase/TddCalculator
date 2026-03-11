package calculator;

public class Calculator{

    public int Sum(int number1, int number2){
        return number1+number2;
    }
    public int Rest(int number1, int number2){
        return  number1-number2;
    }

    public int Product(int number1, int number2){
        return number1*number2;
    }

    public int IntegerDivision(int number1, int number2){
        if(number1%number2!=0) System.out.println("La division no es exacta, y su resto es "+ number1%number2);
        return (int)(number1/number2);
    }

    public double DoubleDivision(double number1, double number2){

    }
}
