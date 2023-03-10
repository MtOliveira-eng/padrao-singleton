import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprasTest {

    @Test
    public void deveRetornarNomeFornecedor() {
        Compras.getInstance().setNomeFornecedor("Fornecedor x");
        assertEquals("Fornecedor x", Compras.getInstance().getNomeFornecedor());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Compras.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Compras.getInstance().getUsuarioLogado());
    }

}

