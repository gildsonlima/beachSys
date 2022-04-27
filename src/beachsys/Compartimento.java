/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beachsys;

/**
 *
 * @author GCL
 */
public class Compartimento {
    
    private String tamanho;
    private String numeroCompartimento;
    private boolean estado = false;
    private Usuario usuario;
    
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.setEstado();
    }
    
     public boolean isEstado() {
        
        return estado;
    }

    public void setEstado() {
        if (this.usuario != null){
            this.estado = true;
            System.out.println("saida do setEstado ocupado "+this.estado);
            }else{
                System.out.println("saida do setEstado vazio "+this.estado);
        }
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNumeroCompartimento() {
        return numeroCompartimento;
    }

    public void setNumeroCompartimento(String numeroCompartimento) {
        this.numeroCompartimento = numeroCompartimento;
    }
    
   
 
    
}
