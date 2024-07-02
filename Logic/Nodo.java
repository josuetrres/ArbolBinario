/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author jorod
 */
public class Nodo {
      int dato;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public boolean agregar(int valor) {
        if (this.dato > valor) {
            if (this.izquierdo == null) {
                this.izquierdo = new Nodo(valor);
                return true;
            } else {
                return this.izquierdo.agregar(valor);
            }
        } else if (this.dato < valor) {
            if (this.derecho == null) {
                this.derecho = new Nodo(valor);
                return true;
            } else {
                return this.derecho.agregar(valor);
            }
        } else {
            return false; // El valor ya existe en el árbol
        }
    }
}
