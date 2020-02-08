/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author l03m01
 */
public class Modelo_Clase {
    
    private int nun1;
    private int num2;
    private int resultado;

    public int getNun1() {
        return nun1;
    }

    public void setNun1(int nun1) {
        this.nun1 = nun1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int multiplicar()
    {
        
        this.resultado = this.nun1 * this.num2;
        
        return this.resultado;
    }
}
