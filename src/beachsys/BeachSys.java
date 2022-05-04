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
        
        //intaciamento de usuarios
        
        Usuario usuario1 = new Usuario();
        usuario1.setCpf("254.254.587.22");
        usuario1.setEmail("jose@teste.com");
        usuario1.setNome("jose");
        
        Usuario usuario2 = new Usuario();
        usuario2.setCpf("254.254.587.22");
        usuario2.setEmail("josias@teste.com");
        usuario2.setNome("josias");
        
        Usuario usuario3 = new Usuario();
        usuario3.setCpf("254.548.587.22");
        usuario3.setEmail("joao@teste.com");
        usuario3.setNome("joao");
        
        Usuario usuario4 = new Usuario();
        usuario4.setCpf("224.148.587.22");
        usuario4.setEmail("maria@teste.com");
        usuario4.setNome("maria");
        
        //instanciamento de compartimentos
        
        Compartimento espaco_1_01 = new Compartimento();
        espaco_1_01.setTamanho("50x100");
        espaco_1_01.setNumeroCompartimento(1);
        espaco_1_01.setUsuario(usuario1);
                
        Compartimento espaco_1_02 = new Compartimento();
        espaco_1_02.setTamanho("100x100");
        espaco_1_02.setNumeroCompartimento(2);
        

        Compartimento espaco_1_03 = new Compartimento();
        espaco_1_03.setTamanho("550x600");
        espaco_1_03.setNumeroCompartimento(3);
        espaco_1_03.setUsuario(usuario3);
        
        Compartimento espaco_1_04 = new Compartimento();
        espaco_1_04.setTamanho("50x150");
        espaco_1_04.setNumeroCompartimento(4);
        espaco_1_04.setUsuario(usuario4);
        
        Compartimento espaco_1_05 = new Compartimento();
        espaco_1_05.setTamanho("150x150");
        espaco_1_05.setNumeroCompartimento(5);
        
        Compartimento espaco_1_06 = new Compartimento();
        espaco_1_06.setTamanho("250x150");
        espaco_1_06.setNumeroCompartimento(6);
        
        Compartimento espaco_1_07 = new Compartimento();
        espaco_1_07.setTamanho("250x150");
        espaco_1_07.setNumeroCompartimento(7);
        espaco_1_07.setUsuario(usuario2);
        
       //intaciamento do array e adicao de compartimentos
        
        ArrayList<Compartimento> compartimentos = new ArrayList<>();
        
        //intaciamento do armario
        
        Armario armario1 = new Armario();
        armario1.setNome("Piatã");
        armario1.setPontoX("150");
        armario1.setPontoY("200");
        armario1.setCompartimentos(compartimentos);
        
        armario1.setCompartimento(espaco_1_01);
        armario1.setCompartimento(espaco_1_02);
        armario1.setCompartimento(espaco_1_03);
        armario1.setCompartimento(espaco_1_04);
        armario1.setCompartimento(espaco_1_05);
        armario1.setCompartimento(espaco_1_06);
        armario1.setCompartimento(espaco_1_07);
       
        //prints para teste de funcionamento
        
        System.out.println("O armario "+ armario1.getNome() +" tem "+armario1.getQuantidadeCompartimento()+" espaços e "+armario1.getCompartimentoDisponiveis()+ " espaços disponiveis");
        
        for (int i = 0; i < armario1.getQuantidadeCompartimento(); i++) {
            System.out.println("Compartimento numero "+ armario1.getCompartimentos().get(i).getNumeroCompartimento());
            System.out.println("Tamanho "+armario1.getCompartimentos().get(i).getTamanho());
            if(armario1.getCompartimentos().get(i).isEstado()){
                System.out.println("Sendo usado por "+armario1.getCompartimentos().get(i).getUsuario().getNome());
            }else{
                System.out.println("Armario livre");
            }
        }
        
    }
    
}
