package simulazione10;

public class Runner {
	private int eta;
	private int migliorTempo;
	private String idRunner;
	
	public Runner(int eta, int migliorTempo, String idRunner) throws RunnerNotValidException{
		if(eta < 10 || eta > 100) {
			throw new RunnerNotValidException();
		}
		if(migliorTempo <= 0) {
			throw new RunnerNotValidException();
		}
		if(idRunner == null || idRunner.trim().isEmpty()) {
			throw new RunnerNotValidException();
		}
		
		this.eta = eta;
		this.migliorTempo = migliorTempo;
		this.idRunner = idRunner;
	}
	
	public int getEta() {return eta;}
	public int getMigliorTempo() {return migliorTempo;}
	public String getIdRunner() {return idRunner;}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || !(obj instanceof Runner)) {
			return false;
		}
		
		Runner app = (Runner) obj;
		
		return idRunner.equals(app.getIdRunner());
	}
}
