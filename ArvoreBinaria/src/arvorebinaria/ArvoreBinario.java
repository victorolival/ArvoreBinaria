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
public class ArvoreBinario {
    Node raiz;
    
        
    public void criarraiz(int valor){
        if(raiz != null){
            System.out.println("Raiz já criada, "+raiz);
        }
        else{
            raiz = new Node(valor);
        }
    }
    
    public void inserirfilhoesq(int valor){
        raiz.filhoesq = new Node(valor);
    }
    
    public void inserirfilhodir(int valor){
        raiz.filhodir = new Node(valor);
    }
}
