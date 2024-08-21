import java.util.List;
import java.util.LinkedList;

public class CadastroPedras {
	
	private List<Pedra> pedras = new LinkedList<Pedra>();
	
	public void cadastrarPedra(Pedra pedra) {
		pedras.add(pedra);
	}
	
	
	public List<Pedra> buscarPedraNome(String nome){
		List<Pedra> pedrasEncontradas = new LinkedList<Pedra>();
		for(Pedra pedra:pedras) {
			if(pedra.getNome().equals(nome)) pedrasEncontradas.add(pedra);
		}
		return pedrasEncontradas;
	}
	
	
	public List<Pedra> getPedras(){
		return pedras;
	}
}
