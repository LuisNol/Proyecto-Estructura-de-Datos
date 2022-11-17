
package Modelo;
public class CribaDeSumaran {
 int cont = 0;
    public void Calculo(int n) {
       cont=4;
      
        for (int i = 10; i < n; i++) {
            if ((ultimCifra("" + i) == 7 || ultimCifra("" + i) == 1 || ultimCifra("" + i) == 3 || ultimCifra("" + i) == 9) && ((i % 7 != 0) || (i % 3 != 0))) {//
                if (esPrimo(i)) {
                    cont++;
                    
                }
                // si pones el test de fermat, igual funciona
                // se esta creando un nuveo algoritmo basado en el el patron de los cuatro

            }
        }
        
    }

  public int getCont() {
        return cont;
    }
    private  boolean esPrimo(int num) {
        boolean primo = (num == 1) ? false : true;
        int divisor = 2;
        while (primo && divisor <= Math.sqrt(num)) {
            if (num % divisor == 0) {
                primo = false;
            }
            divisor++;
        }
        return primo;
    }

    private boolean multiplode3(String num) {
        int sum = 0;
        for (int i = 1; i < num.length() - 1; i++) {
            sum += num.charAt(i) - 48;
        }
        return sum % 3 == 0;
    }

    public  int ultimCifra(String numeros) {
        return numeros.charAt(numeros.length() - 1) - 48;
    }

    private  boolean FermatTest(int num) {
        return (modPow(2, num - 1, num) == 1);
    }

    public  long modPow(long a, long b, long c) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
            res %= c;
        }
        return res % c;
    }
}
