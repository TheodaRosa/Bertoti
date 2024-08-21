import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class PedraTest {

	@Test
	void test() {
		
		CadastroPedras fatec = new CadastroPedras();
		
		Pedra pedrinho = new Pedra("Pedrinho", "123454321");
		Pedra pedro = new Pedra("Pedro", "12345");
		
		fatec.cadastrarPedra(pedrinho);
		fatec.cadastrarPedra(pedro);
		
		assertEquals(fatec.getPedras().size(), 2);
		
		List<Pedra> aaluno = fatec.buscarPedraNome("Joao");
		assertEquals(aaluno.get(0).getRa(), pedrinho.getRa());
	}

}
