/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.lang.Math;

/**
 *
 * @author a1614193
 */
public class Equacao2Grau {

    private Number a, b, c;

    public Equacao2Grau(Number a, Number b, Number c) {
        if (a.doubleValue() == 0.0) {
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Number getA() {
        return a;
    }

    public Number getB() {
        return b;
    }

    public Number getC() {
        return c;
    }

    public void setA(Number a) {
        if (a.doubleValue() == 0.0) {
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
    }

    public void setB(Number b) {
        this.b = b;
    }

    public void setC(Number c) {
        this.c = c;
    }

    public double getRaiz1() {
        try {
            if (Math.pow(this.b.doubleValue(), 2) - 4 * this.a.doubleValue() * this.c.doubleValue() < 0) {
                throw new RuntimeException();
            }
        } catch (RuntimeException rte) {
            System.out.println("Equação não tem solução real");
        }
        return (this.b.doubleValue() * (-1) + Math.sqrt(Math.pow(this.b.doubleValue(), 2) - 4 * this.a.doubleValue() * this.c.doubleValue())) / 2 * this.a.doubleValue();
    }

    public double getRaiz2() {
        try {
            if (Math.pow(this.b.doubleValue(), 2) - 4 * this.a.doubleValue() * this.c.doubleValue() < 0) {
                throw new RuntimeException();
            }

        } catch (RuntimeException rte) {
            System.out.println("Equação não tem solução real");

        }
        return (this.b.doubleValue() * (-1) - Math.sqrt(Math.pow(this.b.doubleValue(), 2) - 4 * this.a.doubleValue() * this.c.doubleValue())) / 2 * this.a.doubleValue();
    }

}
