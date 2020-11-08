/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k;
import java.util.Scanner;
/**
 *
 * @author tegar
 */
public class Kalkulator {
    Scanner scanner = new Scanner(System.in);
    public Double value1, value2;

    public Double addValue(){
        return value1 + value2;
    }
    public Double subValue(){
        return value1 - value2;
    }
    public Double multiplyValue() {
        return value1 * value2;
    }
    public Double divideValue() {
        return value1 / value2;
    }
    public Double divValue() {
        return value1 % value2;
    }
}
