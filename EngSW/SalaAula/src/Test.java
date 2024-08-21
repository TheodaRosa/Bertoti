import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		SalaAula fatec = new SalaAula();
		
		Aluno joao = new Aluno("Joao", "123454321");
		Aluno pedro = new Aluno("Pedro", "12345");
		
		fatec.cadastrarAluno(joao);
		fatec.cadastrarAluno(pedro);
		
		assertEquals(fatec.getAlunos().size(), 2);
		
		List<Aluno> aaluno = fatec.buscarAlunoNome("Joao");
		assertEquals(aaluno.get(0).getRa(), joao.getRa());
	}

}