package edu.ramon.anatomia;
public class MinhaClasse {
    public static void main (String [] args){
      
        String nome = "Ramon";
        String segundoNome = "Vicente";

        String nomeComposto = nomeCompleto (nome, segundoNome);


        System.out.println(nomeComposto);
    }

    public static String nomeCompleto (String Nome, String segundoNome){
        return "Resultado do metodo:" + Nome.concat(" ").concat(segundoNome);
    }
}
