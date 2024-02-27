package Lista_de_atividade_02.java.questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nascimento;
        String dataPassagem;
        String hasRG;
        String hasPassagem;
        String[] assentos = {"A1","A2","A3","B1","B2","B3","C1","C2","C3"};

        Scanner scan = new Scanner(System.in);  

        System.out.println("A quantidade de passageiros suportada é 9");
        
        int i =0;
        while(i < assentos.length){
            System.out.println("Tem RG:[S/N]");
            hasRG = scan.next();
            if(hasRG.equals("N")||hasRG.equals("n")){
                System.out.println("A saída é nessa direção");
                break;  
            }

            System.out.println("Tem Passagem:[S/N]");
            hasPassagem = scan.next();
            if(hasPassagem.equals("N")||hasPassagem.equals("n")){
                System.out.println("A recepção é nessa direção");
                break;  
            }    

            System.out.println("Digite sua data de nascimento: [DD/MM/AAAA]");
            nascimento = scan.next();        
            
            System.out.println("Digite a data de nascimento da sua passagem: [DD/MM/AAAA]");
            dataPassagem = scan.next();    
            
            if(!nascimento.equals(dataPassagem)){
                System.err.println("190");
                break;
            }
            System.out.println("O seu assento é "+ assentos[i]+ ", Tenha um bom dia!");
            i++;
        }
    }
}