
package Modelo;

// Programa Java para imprimir todos los primos menores o iguales a n
// usando Criba de Eratóstenes - Sieve of Eratosthenes


public class CribaEratostenes {
 private int count=0;
    public void  Calcular(int n) {
     
        int tope = (int) Math.floor(Math.sqrt(n));

        boolean[] primos = new boolean[n + 1];

        for (int i = 2; i <= tope; i++) {
            if (primos[i] == false) {
                for (int j = i; j <= n / i; j++) {
                    primos[j * i] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (primos[i] == false) {
             
                count++;
            }
        }
    }
    public int getCount() {
        return count;
    }
    
}
