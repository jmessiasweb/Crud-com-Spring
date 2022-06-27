package fundamentos.classe;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object objecto){

        if (objecto instanceof Usuario){
            Usuario outro = (Usuario) objecto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        }else {
            return false;
        }
    }
}
