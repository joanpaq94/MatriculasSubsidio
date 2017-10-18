package com.example.jorge.matriculassubsidio.api;

import com.example.jorge.matriculassubsidio.models.Matricula;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jorge on 12/10/17.
 */

public interface Datos {

    @GET("xdsk-jnyu.json")
    Call<List<Matricula>> obtenerListaMatriculas();
}
