public class OnesScore {
	private int Score;
	
	public OnesScore(int[]values) {
		this.Score = calculateScore(values);
	}
	
	public int calculateScore(int[] values) {	
		int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 1) {
                sum = sum + values[i];
            }
        }
        return sum;
	}

	/**
	 * @return the oneScore
	 */
	public int getScore() {
		return Score;
	} 
}
