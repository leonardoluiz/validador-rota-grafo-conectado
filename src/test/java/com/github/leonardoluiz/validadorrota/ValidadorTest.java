package com.github.leonardoluiz.validadorrota;

import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de teste unitário para o validador de rotas.
 */
public class ValidadorTest {

    @Test
    public void testarSeDoisEstadosVizinhosSaoValidos() {
        verificarSeValido(
                EstadoRepositorio.MinasGerais,
                EstadoRepositorio.SaoPaulo);
    }

    @Test
    public void testarSeDoisEstadosNaoVizinhosSaoInvalidos() {
        verificarSeInvalido(
                EstadoRepositorio.MinasGerais,
                EstadoRepositorio.Amazonas);
    }

    @Test
    public void testarSeTresEstadosVizinhosSaoValidos() {
        verificarSeValido(
                EstadoRepositorio.MinasGerais,
                EstadoRepositorio.RioDeJaneiro,
                EstadoRepositorio.SaoPaulo);
    }

    @Test
    public void testarSeTresEstadosNãoVizinhosSaoInvalidos() {
        verificarSeInvalido(
                EstadoRepositorio.MinasGerais,
                EstadoRepositorio.Amazonas,
                EstadoRepositorio.SaoPaulo);
    }

    @Test
    public void testarSeQuatroEstadosEUmPaisVizinhosSaoValidosQuandoOrdenados() {
        verificarSeValido(
                EstadoRepositorio.MinasGerais,
                EstadoRepositorio.SaoPaulo,
                EstadoRepositorio.Parana,
                EstadoRepositorio.Argentina,
                EstadoRepositorio.RioGrandeDoSul);
    }

    @Test
    public void testarSeQuatroEstadosEUmPaisVizinhosSaoValidos() {
        verificarSeValido(
                EstadoRepositorio.MinasGerais,
                EstadoRepositorio.Parana,
                EstadoRepositorio.RioGrandeDoSul,
                EstadoRepositorio.SaoPaulo,
                EstadoRepositorio.Argentina);
    }

    @Test
    public void testarSeCincoEstadosEUmPaisVizinhosSaoValidosQuandoHaMaisDeUmCaminho() {
        verificarSeValido(
                EstadoRepositorio.MinasGerais,
                EstadoRepositorio.SaoPaulo,
                EstadoRepositorio.RioDeJaneiro,
                EstadoRepositorio.Parana,
                EstadoRepositorio.Argentina,
                EstadoRepositorio.RioGrandeDoSul);
    }

    private void verificarSeValido(Estado ... estados ) {
        Assert.assertTrue(new ValidadorFronteira().validar(estados));
    }

    private void verificarSeInvalido(Estado ... estados ) {
        Assert.assertFalse(new ValidadorFronteira().validar(estados));
    }

}
