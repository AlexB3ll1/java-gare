package simulazione10;

import java.util.*;

public abstract class Gara {
	protected List<Runner> partecipanti;
	
	public Gara() {
		partecipanti = new LinkedList<>();
	}
	
	public abstract boolean vincoloIscrizioneSoddisfatto(Runner runner);
	
	public void iscrivi(Runner runner) throws RunnerNotValidException{
		for(Runner r : partecipanti) {
			if (runner.equals(r)) {
				throw new RunnerNotValidException("runner già presente");
			}
		}
		if(!vincoloIscrizioneSoddisfatto(runner)) {
			throw new RunnerNotValidException("iscrizione non soddisfatta");
		}
		if(!partecipanti.add(runner)) {
			throw new RunnerNotValidException("iscrizione non avvenuta");
		}
	}
	
	public int iscrivi(ArrayList<Runner> runners) {
		int nonIscritti = 0;
		for(Runner r : runners) {
			try {
				iscrivi(r);
			}catch(RunnerNotValidException e) {
				nonIscritti++;
				continue;
			}
		}
		return nonIscritti;
	}
	
	public int getNumIscritti() {return partecipanti.size();}
	
	public ArrayList<Runner> getIscrittiClasseEta(int eta){
	    ArrayList<Runner> appoggio = new ArrayList<>();

	    for (Runner r : partecipanti) {
	        if (r.getEta() > eta) {
	            appoggio.add(r);
	        }
	    }

	    return appoggio;
	}

}
