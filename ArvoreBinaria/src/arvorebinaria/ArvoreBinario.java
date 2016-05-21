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
    
    public void criararvore(){
        raiz = null;
    }
        
    public Node criarraiz(int valor){
        if(raiz != null){
            System.out.println("Raiz já criada, "+raiz);
        }
        else{
            raiz = new Node(valor);
            
        }
    return raiz;
    }
    
    public Node inserirfilhoesq(Node no,int valor){
        no.filhoesq = new Node(valor);
        return no.filhoesq;
    }
    
    public Node inserirfilhodir(Node no,int valor){
        no.filhodir = new Node(valor);
        return no.filhodir;
    }
    
    public void exibeEmOrdem (Node no) {
        if (no.filhoesq != null) {
            exibeEmOrdem (no.filhoesq);
        }
        System.out.print(no.getValor()+",");

        if (no.filhodir != null) {
            exibeEmOrdem (no.filhodir);
        }
    
    }
    
    public void quantelementos (Node no,int cont){
        //int cont = 0;
        if (no.filhoesq != null) {
            cont++;
            quantelementos (no.filhoesq,cont);
        }
        
        
       

        if (no.filhodir != null) {
            cont++;
            quantelementos (no.filhodir, cont);
        }
        System.out.print(cont);
    }
    
}
