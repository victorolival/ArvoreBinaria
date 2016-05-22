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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArvoreBinario arvore = new ArvoreBinario();
        
        arvore.criararvore();
        Node raiz = arvore.criarraiz(10);
        Node a = arvore.inserirfilhoesq(raiz, 8);
        Node b = arvore.inserirfilhodir(raiz, 22);
        Node c = arvore.inserirfilhodir(b, 50);
        Node d = arvore.inserirfilhoesq(c, 2);
        System.out.print("Pós Ordem: ");
        arvore.exibePosOrdem(raiz);
        System.out.println("");
        arvore.imprimirquantelementos(raiz);
        arvore.imprimirmaiorelemento(raiz);
        arvore.imprimirmenorelemento(raiz);
        arvore.imprimirsomaelementos(raiz);
        
    }
    
}
