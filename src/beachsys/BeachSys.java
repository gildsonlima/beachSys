package beachsys;

import java.util.ArrayList;

/**
 *
 * @author GCL
 */
public class BeachSys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario();
        usuario1.setCpf("254.254.587.22");
        usuario1.setEmail("jose@teste.com");
        usuario1.setNome("jose");
        
        Usuario usuario2 = new Usuario();
        usuario2.setCpf("");
        usuario2.setEmail("");
        usuario2.setNome("");
        
        Usuario usuario3 = new Usuario();
        usuario3.setCpf("254.548.587.22");
        usuario3.setEmail("joao@teste.com");
        usuario3.setNome("joao");
        
        Usuario usuario4 = new Usuario();
        usuario4.setCpf("224.148.587.22");
        usuario4.setEmail("maria@teste.com");
        usuario4.setNome("maria");
        
        Compartimento espaco_1_01 = new Compartimento();
        espaco_1_01.setTamanho("50x100");
        espaco_1_01.setNumeroCompartimento("1");
        espaco_1_01.setUsuario(usuario1);
        
        
        Compartimento espaco_1_02 = new Compartimento();
        espaco_1_01.setTamanho("100x100");
        espaco_1_01.setNumeroCompartimento("2");
        espaco_1_01.setUsuario(usuario2);
        
        Compartimento espaco_1_03 = new Compartimento();
        espaco_1_01.setTamanho("50x100");
        espaco_1_01.setNumeroCompartimento("3");
        espaco_1_01.setUsuario(usuario3);
        
        Compartimento espaco_1_04 = new Compartimento();
        espaco_1_01.setTamanho("50x150");
        espaco_1_01.setNumeroCompartimento("4");
        espaco_1_01.setUsuario(usuario4);
        
        Compartimento espaco_1_05 = new Compartimento();
        
        Compartimento espaco_1_06 = new Compartimento();
        
        ArrayList<Compartimento> compartimentos = new ArrayList<>();
        compartimentos.add(espaco_1_01);
        compartimentos.add(espaco_1_02);
        compartimentos.add(espaco_1_03);
        compartimentos.add(espaco_1_04);
        compartimentos.add(espaco_1_05);
        compartimentos.add(espaco_1_06);
        
        Armario armario1 = new Armario();
        armario1.setNome("Piatã");
        armario1.setPontoX("150");
        armario1.setPontoY("200");
        armario1.setCompartimentos(compartimentos);
        
        System.out.println("O armario "+ armario1.getNome() +" tem "+armario1.getQuantidadeCompartimento()+" espaços e "+armario1.getCompartimentoDisponiveis()+ " espaços disponiveis");
        
    }
    
}
