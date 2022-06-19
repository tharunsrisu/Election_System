
public class IR_Ballot extends Ballot {

    private Candidate[] candidates;
    private String[] nums;
    private int choice=0;
    private boolean isValid;

    /**
     * Constructor for the creation of a new IR_Ballot object
     * 
     * @param ID ID for the OPL_Ballot
     * @param candidates array of the Candidates in the IR Election
     */
    public IR_Ballot(int ID,Candidate[] candidates, boolean isValid){
        super(ID);
        this.candidates=candidates;
        this.isValid = isValid;
    }

    /**
     * returns the int for the index of the current Candidate choice
     * 
     * @return int corresponding to index of the current Candidate choice in the Candidate[]
     */
    public int getChoice(){
        return choice;
    }

    /**
     * Sets the current choice of the Ballot
     *
     * @param c the (index of) the Candidate who will get the vote on the Ballot
     */
    public void setChoice(int c){
        choice=c;
    }

    /** 
     * gives the current Candidate that gets the vote on the IR_Ballot
     * 
     * @return the Candidate that is currently chosen on the IR_Ballot
     */
    public Candidate getCurrentChoice(){
        return candidates[choice];
    }

    public Candidate[] getCandidates(){
        return candidates;
    }

    /**
     * gives current validity status of each ballot, true meaning at least half
     * of the candidates, rounding up, were ranked on the ballot, else false
     * 
     * @return
     */
    public boolean getValidity(){
        return isValid;
    }
}
