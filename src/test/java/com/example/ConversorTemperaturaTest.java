package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes do ConversorTemperatura")
class ConversorTemperaturaTest {

    private ConversorTemperatura conversor;

    @BeforeEach
    void setUp() {
        conversor = new ConversorTemperatura();
    }

    // -------------------------------------------------------
    // Testes: celsiusParaFahrenheit
    // -------------------------------------------------------

    @Test
    @DisplayName("0 graus Celsius deve ser igual a 32 Fahrenheit (ponto de congelamento)")
    void testCongelamento_CelsiusParaFahrenheit() {
        double resultado = conversor.celsiusParaFahrenheit(0.0);
        assertEquals(32.0, resultado, 0.001,
                "0°C deveria converter para 32°F");
    }

    @Test
    @DisplayName("100 graus Celsius deve ser igual a 212 Fahrenheit (ponto de ebulicao)")
    void testEbulicao_CelsiusParaFahrenheit() {
        double resultado = conversor.celsiusParaFahrenheit(100.0);
        assertEquals(212.0, resultado, 0.001,
                "100°C deveria converter para 212°F");
    }

    @Test
    @DisplayName("37 graus Celsius (temperatura do corpo) deve ser aproximadamente 98.6 Fahrenheit")
    void testTemperaturaCorporal_CelsiusParaFahrenheit() {
        double resultado = conversor.celsiusParaFahrenheit(37.0);
        assertEquals(98.6, resultado, 0.001,
                "37°C deveria converter para 98.6°F");
    }

    @Test
    @DisplayName("Temperatura negativa: -40 Celsius deve ser igual a -40 Fahrenheit")
    void testNegativo_CelsiusParaFahrenheit() {
        double resultado = conversor.celsiusParaFahrenheit(-40.0);
        assertEquals(-40.0, resultado, 0.001,
                "-40°C deveria converter para -40°F (ponto de equivalencia)");
    }

    // -------------------------------------------------------
    // Testes: fahrenheitParaCelsius
    // -------------------------------------------------------

    @Test
    @DisplayName("32 Fahrenheit deve ser igual a 0 graus Celsius (ponto de congelamento)")
    void testCongelamento_FahrenheitParaCelsius() {
        double resultado = conversor.fahrenheitParaCelsius(32.0);
        assertEquals(0.0, resultado, 0.001,
                "32°F deveria converter para 0°C");
    }

    @Test
    @DisplayName("212 Fahrenheit deve ser igual a 100 graus Celsius (ponto de ebulicao)")
    void testEbulicao_FahrenheitParaCelsius() {
        double resultado = conversor.fahrenheitParaCelsius(212.0);
        assertEquals(100.0, resultado, 0.001,
                "212°F deveria converter para 100°C");
    }

    @Test
    @DisplayName("98.6 Fahrenheit deve ser aproximadamente 37 Celsius (temperatura do corpo)")
    void testTemperaturaCorporal_FahrenheitParaCelsius() {
        double resultado = conversor.fahrenheitParaCelsius(98.6);
        assertEquals(37.0, resultado, 0.001,
                "98.6°F deveria converter para 37°C");
    }

    @Test
    @DisplayName("Temperatura negativa: -40 Fahrenheit deve ser igual a -40 Celsius")
    void testNegativo_FahrenheitParaCelsius() {
        double resultado = conversor.fahrenheitParaCelsius(-40.0);
        assertEquals(-40.0, resultado, 0.001,
                "-40°F deveria converter para -40°C (ponto de equivalencia)");
    }
}
