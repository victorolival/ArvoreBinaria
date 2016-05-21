/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author victor.rolival
 */
public class Node {
    Node filhoesq;
    Node filhodir;
    private int valor;

    public Node(int valor) {
        this.filhoesq = null;
        this.filhodir = null;
        this.valor = valor;
    }

    public Node getFilhoesq() {
        return filhoesq;
    }

    public void setFilhoesq(Node filhoesq) {
        this.filhoesq = filhoesq;
    }

    public Node getFilhodir() {
        return filhodir;
    }

    public void setFilhodir(Node filhodir) {
        this.filhodir = filhodir;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
