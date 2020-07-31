package neuralNetwork.library;

import java.util.Random;

import pallav.Matrix.Matrix;

public class NeuralNetwork {
	int input;
	int hidden;
	int output;
	Matrix hi;
	private NeuralNetwork(int input,int hidden, int output) {
		this.input=input;
		this.hidden=hidden;
		this.output=output;
		hi=Matrix.array(new float[hidden][input]);
		randomize(hi);
	}
	public static NeuralNetwork init(int input, int hidden, int output) {
		return new NeuralNetwork(input,hidden, output);
	}
	
	public void feedForward(float[] arr) {
		float [][] a=new float[arr.length][0];
		for(int i=0;i<arr.length;i++) {
			a[i][0]=arr[i];
		}
		Matrix mat=Matrix.array(a);
		
	}
	private void randomize(Matrix m) {
		for(int i=0;i<m.dimensions(m)[0];i++) {
			for(int j=0;j<m.dimensions(m)[1];j++) {
				Random rd=new Random();
				m.array[i][j]=rd.nextFloat();
			}
		}		
	}
	
}
