package assignment1;

import algs4.StdAudio;
/*Anh Nguyen*/
public class ENotes {

	public static void playTone(double frequency, double duration) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * duration);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			slices[i] = Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
		}
		StdAudio.play(slices);
	}
	public static void main(String[] args) {
		playTone(329.6, 1.0);
		playTone(659.3, 1.0);
		playTone(1319, 1.0);
	    StdAudio.close();
        System.exit(0);
	}

}
