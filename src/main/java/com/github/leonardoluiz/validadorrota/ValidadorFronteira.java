package com.github.leonardoluiz.validadorrota;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe que implementa o algorítimo de busca em largura (Breadth-first search) para validar o grafo formado pelos estados e suas fronteiras.
 *
 * @author leonardoluiz
 *
 */
public class ValidadorFronteira {

    /**
     * Valida a rota quando é possível traçar um caminho por todos os estados através das suas fronteiras.
     *
     * @param estados
     *
     * @return
     */
    public boolean validar(Estado[] estados) {

        if (estados == null || estados.length == 0) return false;
        HashSet<Estado> todosEstados = new HashSet<Estado>(Arrays.asList(estados));
        HashSet<Estado> estadosVisitados = new HashSet<Estado>();
        List<Estado> f = new LinkedList<Estado>();
        Estado origem = estados[0];

        estadosVisitados.add(origem);
        f.add(origem);

        while (!f.isEmpty()) {
            Estado estado = f.get(0);
            for (Estado vizinho : EstadoRepositorio.fronteiras.get(estado)) {

                if (!todosEstados.contains(vizinho)) continue;

                if (!estadosVisitados.contains(vizinho)) {
                    estadosVisitados.add(vizinho);
                    f.add(vizinho);
                }
            }
            f.remove(estado);
        }

        return estadosVisitados.size() == estados.length;
    }
}
