/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author jorod
 */
public class ArbolBinario {
      private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public boolean agregar(int dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return true;
        } else {
            return raiz.agregar(dato);
        }
    }

    public void eliminar(int dato) {
        raiz = eliminarRecursivo(raiz, dato);
    }

    private Nodo eliminarRecursivo(Nodo actual, int dato) {
        if (actual == null) {
            return null;
        }

        if (dato == actual.getDato()) {
            if (actual.getIzquierdo() == null && actual.getDerecho() == null) {
                return null;
            }

            if (actual.getIzquierdo() == null) {
                return actual.getDerecho();
            }

            if (actual.getDerecho() == null) {
                return actual.getIzquierdo();
            }

            int menorValor = encontrarMenorValor(actual.getDerecho());
            actual.setDato(menorValor);
            actual.setDerecho(eliminarRecursivo(actual.getDerecho(), menorValor));
            return actual;
        }

        if (dato < actual.getDato()) {
            actual.setIzquierdo(eliminarRecursivo(actual.getIzquierdo(), dato));
            return actual;
        }

        actual.setDerecho(eliminarRecursivo(actual.getDerecho(), dato));
        return actual;
    }

    private int encontrarMenorValor(Nodo raiz) {
        return raiz.getIzquierdo() == null ? raiz.getDato() : encontrarMenorValor(raiz.getIzquierdo());
    }

  public String recorrerPreorden() {
        StringBuilder sb = new StringBuilder();
        recorrerPreordenRecursivo(raiz, sb);
        return sb.toString().trim(); // Trim para eliminar el espacio al final
    }

    private void recorrerPreordenRecursivo(Nodo nodo, StringBuilder sb) {
        if (nodo != null) {
            sb.append(nodo.getDato()).append(" ");
            recorrerPreordenRecursivo(nodo.getIzquierdo(), sb);
            recorrerPreordenRecursivo(nodo.getDerecho(), sb);
        }
    }

    // Método para recorrer en inorden y devolver un String
    public String recorrerInorden() {
        StringBuilder sb = new StringBuilder();
        recorrerInordenRecursivo(raiz, sb);
        return sb.toString().trim(); // Trim para eliminar el espacio al final
    }

    private void recorrerInordenRecursivo(Nodo nodo, StringBuilder sb) {
        if (nodo != null) {
            recorrerInordenRecursivo(nodo.getIzquierdo(), sb);
            sb.append(nodo.getDato()).append(" ");
            recorrerInordenRecursivo(nodo.getDerecho(), sb);
        }
    }

    // Método para recorrer en postorden y devolver un String
    public String recorrerPostorden() {
        StringBuilder sb = new StringBuilder();
        recorrerPostordenRecursivo(raiz, sb);
        return sb.toString().trim(); // Trim para eliminar el espacio al final
    }

    private void recorrerPostordenRecursivo(Nodo nodo, StringBuilder sb) {
        if (nodo != null) {
            recorrerPostordenRecursivo(nodo.getIzquierdo(), sb);
            recorrerPostordenRecursivo(nodo.getDerecho(), sb);
            sb.append(nodo.getDato()).append(" ");
        }
    }
}
