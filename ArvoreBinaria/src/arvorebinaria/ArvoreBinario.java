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
    private int cont = 0;
    private int maior = 0;
    private int menor = 9999;
    private int soma = 0;
    
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
    
    
    
    private int quantelementos (Node no){
        if(no != null){
            quantelementos(no.filhoesq);
            quantelementos(no.filhodir);
            cont++;
        }
        return cont;
    }
    
    public void imprimirquantelementos(Node no){
        quantelementos(no);
        System.out.println("Quantidade de elementos da Árvore: "+cont);
    }
    
    public void exibePosOrdem (Node no) {
        if(no != null){
            exibePosOrdem(no.filhoesq);
            exibePosOrdem(no.filhodir);
            System.out.print(no.getValor() +",");
        }
    }
    
    private int maiorelemento (Node no){
        if(no != null ){
            if(no.getValor() > maior){
                maior = no.getValor();
            }
            maiorelemento(no.filhoesq);
            maiorelemento(no.filhodir);
        }
        return maior;
    }
    
    public void imprimirmaiorelemento(Node no){
        maiorelemento(no);
        System.out.println("Maior elemento da Árvore: "+maior);
    }
    
    private int menorelemento (Node no){
        if(no != null){
            if(no.getValor() < menor){
                menor = no.getValor();
                }
            menorelemento(no.filhoesq);
            menorelemento(no.filhodir);
        }
        return menor;
    }
    
    public void imprimirmenorelemento(Node no){
        menorelemento(no);
        System.out.println("Menor elemento da Árvore: "+menor);
    }
    
    private int somaelementos(Node no){
        if(no != null){
            soma = soma + no.getValor();
            somaelementos(no.filhoesq);
            somaelementos(no.filhodir);
        }
        

        return soma;
    }
    
    public void imprimirsomaelementos(Node no){
        somaelementos(no);
        System.out.println("Soma dos elementos da Árvore: "+soma);
    }
    
}
