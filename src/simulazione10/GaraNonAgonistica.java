package simulazione10;

public class GaraNonAgonistica extends Gara{
	private int minEta;
	private int maxEta;
	
	public GaraNonAgonistica(int minEta, int maxEta) {
		super();
		this.minEta = minEta;
		this.maxEta  = maxEta;
	}

	@Override
	public boolean vincoloIscrizioneSoddisfatto(Runner runner) {
		if(runner.getEta() >= minEta && runner.getEta() <= maxEta) {
			return true;
		}
		return false;
	}
	
	
	
}
