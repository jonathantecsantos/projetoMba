package com.portalmba.mba.dtos;

import com.portalmba.mba.models.Professor;

public class ProfessorDto {

    private String nomeProfessor;
    private String emailProfessor;
    private String disciplinaProfessor;

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public String getDisciplinaProfessor() {
        return disciplinaProfessor;
    }

    public void setDisciplinaProfessor(String disciplinaProfessor) {
        this.disciplinaProfessor = disciplinaProfessor;
    }

    public Professor toProfessor() {
        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setEmail(emailProfessor);
        professor.setDisciplina(disciplinaProfessor);

        return professor;
    }
}
