package exercicios.pooPoli;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius) {
        double fahrenheit  = (temperaturaCelsius * 1.8) + 32;
        //System.out.println("A temperatura" + temperaturaCelsius + "para Fahrenheit é: " + fahrenheit );
        System.out.printf("A temperatura %.2fºC são %.2fºF.%n", temperaturaCelsius, fahrenheit);

    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaFahrenheit) {
        double celsius  = (temperaturaFahrenheit - 32) / 1.8;
        System.out.printf("A temperatura %.2fºF são %.2fºC.", temperaturaFahrenheit, celsius);

    }

    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        double celsius = 15.5;
        double fahrenheit = 40;

        conversor.celsiusParaFahrenheit(celsius);
        conversor.fahrenheitParaCelsius(fahrenheit);
    }
}
