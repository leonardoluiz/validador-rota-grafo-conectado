package com.github.leonardoluiz.validadorrota;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que representa o banco de dados de estados e fronteiras.
 *
 * @author leonardoluiz
 *
 */
public class EstadoRepositorio {

    public static final Estado MinasGerais = new Estado("1","Minas Gerais");
    public static final Estado RioDeJaneiro = new Estado("2","Rio de Janeiro");
    public static final Estado SaoPaulo = new Estado("3","São Paulo");
    public static final Estado Parana = new Estado("4","Parana");
    public static final Estado Amazonas = new Estado("5","Amazônas");
    public static final Estado Argentina = new Estado("6","Argentina");
    public static final Estado RioGrandeDoSul = new Estado("7","Rio Grande do Sul");

    public static final Map<Estado,Estado[]> fronteiras = new HashMap<Estado,Estado[]>();

    static {
        fronteiras.put(EstadoRepositorio.MinasGerais,new Estado[]{
                EstadoRepositorio.RioDeJaneiro,
                EstadoRepositorio.SaoPaulo
        });
        fronteiras.put(EstadoRepositorio.RioDeJaneiro,new Estado[]{
                EstadoRepositorio.MinasGerais,
                EstadoRepositorio.SaoPaulo
        });
        fronteiras.put(EstadoRepositorio.SaoPaulo,new Estado[]{
                EstadoRepositorio.RioDeJaneiro,
                EstadoRepositorio.MinasGerais,
                EstadoRepositorio.Parana
        });
        fronteiras.put(EstadoRepositorio.Parana,new Estado[]{
                EstadoRepositorio.SaoPaulo,
                EstadoRepositorio.Argentina
        });
        fronteiras.put(EstadoRepositorio.Argentina,new Estado[]{
                EstadoRepositorio.Parana,
                EstadoRepositorio.RioGrandeDoSul
        });
        fronteiras.put(EstadoRepositorio.RioGrandeDoSul,new Estado[]{
                EstadoRepositorio.Argentina
        });
        fronteiras.put(EstadoRepositorio.Amazonas,new Estado[]{
        });

    }

}
