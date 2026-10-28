package simulazione10;

public interface CompetizioneAgonistica {

    public abstract void setVincitore(Runner runner) throws RunnerNotValidException;

    public abstract Runner getVincitore();
}