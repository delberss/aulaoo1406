package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioDiaristaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setNome("Marco");
        assertEquals("Marco", funcionarioDiarista.getNome());
    }

    @Test
    void calcularSalario() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setNumDias(10);
        funcionarioDiarista.setValorDia(100f);
        assertEquals(2000f, funcionarioDiarista.calcularSalario());
    }
}