package simulazione10;

public class GaraAgonistica extends Gara implements CompetizioneAgonistica{
	private int maxTempo;
	private Runner vincitore;
	
	public GaraAgonistica(int maxTempo) {
		this.maxTempo = maxTempo;
	}

	@Override
	public boolean vincoloIscrizioneSoddisfatto(Runner runner) {
		if(runner.getMigliorTempo() < maxTempo) {
			return true;
		}
		return false;
	}
	
	public void setVincitore(Runner runner) throws RunnerNotValidException{
		boolean trovato = false;
		for(Runner r : partecipanti) {
			if(r.equals(runner)) {
				trovato = true;
			}
		}
		if(!trovato) {
			throw new RunnerNotValidException();
		}
		this.vincitore = runner;
	}
	
	public Runner getVincitore() {return vincitore;}
	
}
