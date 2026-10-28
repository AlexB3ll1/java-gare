package simulazione10;

public class RunnerNotValidException extends Exception{
	public RunnerNotValidException() {
		super();
	}
	
	RunnerNotValidException(String msg){
		super(msg);
	}
}
