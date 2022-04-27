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
    private int quantidadeCompartimento;
    private ArrayList<Compartimento>Compartimentos;
    
    
    public Armario(){
        this.Compartimentos = new ArrayList<>();
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

    public ArrayList<Compartimento> getCompartimentos() {
        return Compartimentos;
    }

    public void setCompartimentos(ArrayList<Compartimento> Compartimentos) {
        this.Compartimentos = Compartimentos;
    }

    public int getQuantidadeCompartimento() {
        this.setQuantidadeCompartimento();
        return quantidadeCompartimento;
    }

    public void setQuantidadeCompartimento() {
        this.quantidadeCompartimento = this.Compartimentos.size();
    }
    
    public int getCompartimentoDisponiveis(){
        
        return this.calcularDisponiveis();
        
    }
    
    public int calcularDisponiveis(){
        int cont=0;
        
        for (int i = 0; i < this.Compartimentos.size(); i++) {
            if(this.getCompartimentos().get(i).isEstado()==true){
                cont++;
                System.out.println(cont);
            }
        }
        
        return cont;
    }
    
    
    
}
