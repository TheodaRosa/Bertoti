# Bertoti
# We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

# Atividade 1- A engenharia de software se preocupa com o futuro e as mudanças que podem vir nela. É importante ser flexível e eficiente para poder ter projetos que possam durar no mercado, e entender que cada ação tem alguma consequência.

# Atividade 2- Exemplos de trade-off: Trocar dediferentes línguas de programação, como do python(Mais comfortável, porém lento) para o Java(Rápido, porém "verboso"); Mudar de sistemas operacionais, por exemplo, do Windows(Confortável) para o Linux(Flexivel); e trocar funções de um código por outro por conta de eficiência(As funções não podem coexistir sem prejudicar na eficiência do programa)

# Atividade 3- import java.util.List;

# "CadastroPedras.java"
# import java.util.LinkedList;

# public class CadastroPedras {
# 	
# 	private List<Pedra> pedras = new LinkedList<Pedra>();
# 	
# 	public void cadastrarPedra(Pedra pedra) {
# 		pedras.add(pedra);
# 	}
# 	
# 	
# 	public List<Pedra> buscarPedraNome(String nome){
# 		List<Pedra> pedrasEncontradas = new LinkedList<Pedra>();
# 		for(Pedra pedra:pedras) {
# 			if(pedra.getNome().equals(nome)) pedrasEncontradas.add(pedra);
# 		}
# 		return pedrasEncontradas;
# 	}
# 	
# 	
# 	public List<Pedra> getPedras(){
# 		return pedras;
# 	}
# }


# "Pedra.java"
# public class Pedra {
# 	
# 	private String nome;
# 	private String ra;
# 	
# 	public Pedra(String nome, String ra) {
# 		this.nome = nome;
# 		this.ra = ra;
# 	}
# 	
# 	public String getNome() {
# 		return nome;
# 	}
# 	
# 	public String getRa() {
# 		return ra;
# 	}
# }


# "Test.java"
# import static org.junit.jupiter.api.Assertions.*;

# import java.util.List;

# import org.junit.jupiter.api.Test;

# class PedraTest {
# 
# 	@Test
# 	void test() {
# 		
# 		CadastroPedras fatec = new CadastroPedras();
# 		
# 		Pedra pedrinho = new Pedra("Pedrinho", "123454321");
# 		Pedra pedro = new Pedra("Pedro", "12345");
# 		
# 		fatec.cadastrarPedra(pedrinho);
# 		fatec.cadastrarPedra(pedro);
# 		
# 		assertEquals(fatec.getPedras().size(), 2);
# 		
# 		List<Pedra> aaluno = fatec.buscarPedraNome("Joao");
# 		assertEquals(aaluno.get(0).getRa(), pedrinho.getRa());
# 	}
# 
# }

