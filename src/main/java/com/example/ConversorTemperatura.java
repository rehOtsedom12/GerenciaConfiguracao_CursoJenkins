package com.example;

/**
 * Classe utilitaria para conversao de temperaturas.
 *
 * Metodos disponíveis:
 *   - celsiusParaFahrenheit(double celsius)
 *   - fahrenheitParaCelsius(double fahrenheit)
 */
public class ConversorTemperatura {

    /**
     * Converte uma temperatura de Celsius para Fahrenheit.
     *
     * Formula: F = (C * 9/5) + 32
     *
     * @param celsius Temperatura em graus Celsius
     * @return Temperatura equivalente em Fahrenheit
     */
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    /**
     * Converte uma temperatura de Fahrenheit para Celsius.
     *
     * Formula: C = (F - 32) * 5/9
     *
     * @param fahrenheit Temperatura em graus Fahrenheit
     * @return Temperatura equivalente em Celsius
     */
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
