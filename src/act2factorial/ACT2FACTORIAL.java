/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2factorial;

/**
 *
 * @author Familia Andrade
 */
public class ACT2FACTORIAL {

  static int factorial (int num) {
if (num == 0) return 1;
        else return num * factorial(num-1);
    }
public static void main(String[] args) {
           System.out.println("El factorial de 6 es: " + factorial(6));
    }
}

