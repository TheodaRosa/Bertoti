import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		SalaAula fatec = new SalaAula();
		
		Aluno joao = new Aluno("Joao", "123454321");
		
		fatec.cadastrarAluno(joao);
		
		assertEquals(fatec.getAlunos().size(), 1);
	
	}

}