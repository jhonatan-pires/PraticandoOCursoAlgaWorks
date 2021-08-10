package com.CursoAlgaWorks.Factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor()
public class Contato {
    private String id;
    private String nome;
    private String telefone;

    public Contato() {}

    public boolean isNovo(){
        return id == null;
    }
}