package Quiz;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class Sport implements EventHandler<ActionEvent>{
	
	String[] questions = {
			"Who is the greatest football player of all time?", 
			"How many world cups have Brazil won?", 
			"Who has won the most NBA champpionships?" ,
			"Who has won more grand slam tennis titles?"
};
	
	String[][] alternatives = {
			{"Cristiano Ronaldo", "Lionel Messi", "Pele", "Diego Maradona"}, 
			{"2", "4", "1", "5"}, 
			{"Kobe Bryant", "Michael Jordan", "Lebron James", "Bill Russel"}, 
			{"Roger Federer", "Rafael Nadal", "novak djokovic", "Pete Sampras"}
	};
	
	char[] correct = {
			'B',
			'D',
			'D',
			'A'
	};
	
	char answer;
	int index;
	int total_questions = questions.length;
	int result;
	int timer = 30;

	public Sport() {
		
	}
	
	public void nextQuestion() {
	
	}
	
	
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	public void answers() {
		
	}
	
	public void results() {
		
	}
}
