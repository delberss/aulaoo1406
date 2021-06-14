package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setNome("Marco");
        assertEquals("Marco", funcionarioHorista.getNome());
    }

    @Test
    void calcularSalario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setNumDias(10);
        funcionarioHorista.setNumHorasDia(10);
        funcionarioHorista.setValorHora(100f);
        assertEquals(11000f, funcionarioHorista.calcularSalario());
    }
}