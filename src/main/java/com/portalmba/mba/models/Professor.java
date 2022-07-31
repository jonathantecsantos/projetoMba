package com.portalmba.mba.models;


import java.util.concurrent.atomic.AtomicInteger;

public class Professor {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String nome;
    private String email;
    private String disciplina;
    private boolean status;

    public Professor(String nome, String email, String disciplina) {
        this.nome = nome;
        this.email = email;
        this.disciplina = disciplina;
        this.status = true;
        this.id = count.incrementAndGet();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
