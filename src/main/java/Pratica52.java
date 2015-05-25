/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;
/**
 *
 * @author a1614193
 */
public class Pratica52 {
    public static void main(String[] args) {
        Equacao2Grau eq1 = new Equacao2Grau(2, 12, 3);
        Equacao2Grau eq2 = new Equacao2Grau(2, 4, 3);
        Equacao2Grau eq3 = new Equacao2Grau(2, 4, 2);
        
        System.out.println(eq1.getA());
        System.out.println(eq1.getB());
        System.out.println(eq1.getC());
        System.out.println(eq2.getA());
        System.out.println(eq2.getB());
        System.out.println(eq2.getC());
        System.out.println(eq3.getA());
        System.out.println(eq3.getB());
        System.out.println(eq3.getC());
        
        System.out.println("Primeira raiz 1:" + eq1.getRaiz1());
        System.out.println("Segunda raiz 1:" + eq1.getRaiz2());
        
        System.out.println("Primeira raiz 2:" + eq2.getRaiz1());
        System.out.println("Segunda raiz 2:" + eq2.getRaiz2());
        
        System.out.println("Primeira raiz 3:" + eq3.getRaiz1());
        System.out.println("Segunda raiz 3:" + eq3.getRaiz2());
    }
}
