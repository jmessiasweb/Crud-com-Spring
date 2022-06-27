package coleçoes;

import java.util.Objects;

public class Usuario {

    Usuario(String nome){
        this.nome = nome;
    }

    public String toString(){
        return  "Meu nome e:" + this.nome + ".";
    }

    String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }



}
