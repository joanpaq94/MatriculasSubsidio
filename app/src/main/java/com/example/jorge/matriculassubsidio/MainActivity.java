package com.example.jorge.matriculassubsidio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;


import com.example.jorge.matriculassubsidio.api.Datos;
import com.example.jorge.matriculassubsidio.models.Adaptador;
import com.example.jorge.matriculassubsidio.models.Matricula;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;
    public final static String TAG="Datos Matriucla Subsidiadas";

    private RecyclerView view;
    private Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=(RecyclerView)findViewById(R.id.view);
        view.setLayoutManager(new LinearLayoutManager(this));

        retrofit=new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/").addConverterFactory(GsonConverterFactory.create()).build();

        obtenerDatos();

    }

    public void obtenerDatos() {

        Datos service = retrofit.create(Datos.class);
        final Call<List<Matricula>> matriculaCall = service.obtenerListaMatriculas();

        matriculaCall.enqueue(new Callback<List<Matricula>>() {
            @Override
            public void onResponse(Call<List<Matricula>> call, Response<List<Matricula>> response) {

                if (response.isSuccessful()) {
                    List matricula = response.body();
                    for (int i = 0; i < matricula.size(); i++) {
                        Matricula ma = (Matricula) matricula.get(i);
                        adaptador = new Adaptador(matricula);
                        view.setAdapter(adaptador);

                    }
                } else {

                    Toast notificacion = Toast.makeText(MainActivity.this,"error",Toast.LENGTH_LONG);
                    notificacion.show();
                }
            }

            @Override
            public void onFailure(Call<List<Matricula>> call, Throwable t) {

                Toast notificacion = Toast.makeText(MainActivity.this,"error fallido",Toast.LENGTH_LONG);
                notificacion.show();
            }
        });
    }
}
