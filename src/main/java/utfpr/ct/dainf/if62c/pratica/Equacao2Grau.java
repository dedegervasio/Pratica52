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
public class Equacao2Grau<N extends Number> {

    private N a, b, c;

    public Equacao2Grau(N a, N b, N c) {
        if (a.doubleValue() == 0.0) {
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public N getA() {
        return a;
    }

    public N getB() {
        return b;
    }

    public N getC() {
        return c;
    }

    public void setA(N a) {
        if (a.doubleValue() == 0.0) {
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
    }

    public void setB(N b) {
        this.b = b;
    }

    public void setC(N c) {
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
