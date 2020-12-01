/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

/**
 * It contains the data of a triangle and allows to calculate of its area.
 * @author Oscar Llamas Parra
 */
public class Triangle {
    //private: data hiding
    private float base; //base of the triangle
    private float height; //height of the triangle
    
    //insert code: right click or alt+insert

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public Triangle() {
    }
    
    
    /**
     * 
     * @return This method returns the value of the area of the triangle
     * multiplying the base per the height.
     */
    float calculateArea(){
        return base*height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    /**
     * ¿Qué sucede cuando mantenemos pulsado ctrl, ponemos el cursor encima de 
     * una variable y pulsamos en ella?¿Usando este método podrías explicarme 
     * que variables serían this.base y base dentro delconstructor que hemos creado?
     * "this.base" hace referencia a la variable inicializada en la parte superior
     * de la clase, mientras que "base" hace referencia a la variable del método.
     */
    
}
