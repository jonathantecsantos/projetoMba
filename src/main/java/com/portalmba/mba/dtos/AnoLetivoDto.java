package com.portalmba.mba.dtos;

import com.portalmba.mba.models.AnoLetivo;

public class AnoLetivoDto {

    private String ano;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public AnoLetivo toAnoLetivo() {
        AnoLetivo anoLetivo = new AnoLetivo();
        anoLetivo.setAno(ano);
        return anoLetivo;
    }
}
