package com.example.yolosolo.app;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import java.net.URI;

/**
 * Created by pivotal on 1/27/15.
 */
public class PokedexService {

    private URI endpoint;
    private HttpClient restPokemon;

    public PokedexService(URI endpoint) {
        restPokemon = new DefaultHttpClient()
    }
}
