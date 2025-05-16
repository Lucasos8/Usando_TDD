package com.mycompany.calc_fatorial_num_int;

public class CalcularFatorial {

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser não-negativo.");
        }
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para execução direta via Maven ou terminal
    public static void main(String[] args) {
        int numero = 5;
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
}
