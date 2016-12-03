package creation.factory.dependencyInjection;

public class ConfiguraQuestionario {
	//Classe Montadora
	//Depende de IQuestionario e Quiz. Tem o papel de juntar as duas!
	
	public static void main(String[] args) {
		
		IQuestionario iq = new QuestionarioTipoA();
		Quiz Q = new Quiz(iq);
		Q.runQuiz();
		
		iq = new QuestionarioTipoB();
		Q = new Quiz(iq);
		Q.runQuiz();
		
		//Poderia rodar aqui qualquer questionario, Tipo A, Tipo B, Tipo N
	}

}
