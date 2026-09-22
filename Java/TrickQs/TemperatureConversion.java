package Coding.Java.TrickQs;

public class TemperatureConversion {

    public static void tempFahrenheitConversion(double tempC) {

        double tempFahrenheit = (tempC * 9/5) + 32;


        System.out.println(tempFahrenheit);


    }


    public static void tempCelsiusConversion(double tempF) {

        double tempCelsius = (tempF - 32) * 5/9;

        System.out.println(tempCelsius);

    }

    public static void main(String[] args) {

        double tempC = 25;

        double tempF = 77;

        tempFahrenheitConversion(tempC);

        tempCelsiusConversion(tempF);



    }


}
