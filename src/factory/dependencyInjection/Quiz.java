package factory.dependencyInjection;

//Somente depende da asbtracao IQuestionario
public class Quiz {

	private IQuestionario questionario;
	
	public Quiz (IQuestionario q){
		
		this.questionario = q;
	}
	
	public void runQuiz(){
		
		questionario.runQuestion();
	}
}

