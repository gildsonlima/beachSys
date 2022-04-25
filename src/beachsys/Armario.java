/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beachsys;

import java.util.ArrayList;

/**
 *
 * @author GCL
 */
public class Armario {
    
    private String nome;
    private String pontoX;
    private String pontoY;
    private int quantidadeEspaco;
    private ArrayList<Espaco>espacos;
    int cont=0;
    public Armario(){
        this.espacos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPontoX() {
        return pontoX;
    }

    public void setPontoX(String pontoX) {
        this.pontoX = pontoX;
    }

    public String getPontoY() {
        return pontoY;
    }

    public void setPontoY(String pontoY) {
        this.pontoY = pontoY;
    }

    public ArrayList<Espaco> getEspacos() {
        return espacos;
    }

    public void setEspacos(ArrayList<Espaco> espacos) {
        this.espacos = espacos;
    }

    public int getQuantidadeEspaco() {
        this.setQuantidadeEspaco();
        return quantidadeEspaco;
    }

    public void setQuantidadeEspaco() {
        this.quantidadeEspaco = this.espacos.size();
    }
    
    public int getEspacosDisponiveis(){
        
        return this.calcularDisponiveis();
        
    }
    
    public int calcularDisponiveis(){
        
        cont++;
        
        return cont;
    }
    
    
    
    
}
