package com.example.jorge.matriculassubsidio.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jorge on 12/10/17.
 */

public class Matricula {
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("total_matricula_subsidiada")
    @Expose
    private String totalMatriculaSubsidiada;
    @SerializedName("grado_0")
    @Expose
    private String grado0;
    @SerializedName("grado_1")
    @Expose
    private String grado1;
    @SerializedName("grado_2")
    @Expose
    private String grado2;
    @SerializedName("grado_3")
    @Expose
    private String grado3;
    @SerializedName("grado_4")
    @Expose
    private String grado4;
    @SerializedName("grado_5")
    @Expose
    private String grado5;
    @SerializedName("grado_6")
    @Expose
    private String grado6;
    @SerializedName("grado_7")
    @Expose
    private String grado7;

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTotalMatriculaSubsidiada() {
        return totalMatriculaSubsidiada;
    }

    public void setTotalMatriculaSubsidiada(String totalMatriculaSubsidiada) {
        this.totalMatriculaSubsidiada = totalMatriculaSubsidiada;
    }

    public String getGrado0() {
        return grado0;
    }

    public void setGrado0(String grado0) {
        this.grado0 = grado0;
    }

    public String getGrado1() {
        return grado1;
    }

    public void setGrado1(String grado1) {
        this.grado1 = grado1;
    }

    public String getGrado2() {
        return grado2;
    }

    public void setGrado2(String grado2) {
        this.grado2 = grado2;
    }

    public String getGrado3() {
        return grado3;
    }

    public void setGrado3(String grado3) {
        this.grado3 = grado3;
    }

    public String getGrado4() {
        return grado4;
    }

    public void setGrado4(String grado4) {
        this.grado4 = grado4;
    }

    public String getGrado5() {
        return grado5;
    }

    public void setGrado5(String grado5) {
        this.grado5 = grado5;
    }

    public String getGrado6() {
        return grado6;
    }

    public void setGrado6(String grado6) {
        this.grado6 = grado6;
    }

    public String getGrado7() {
        return grado7;
    }

    public void setGrado7(String grado7) {
        this.grado7 = grado7;
    }

}

