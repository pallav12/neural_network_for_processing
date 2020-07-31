package neuralNetwork.library;


import processing.core.*;


public class HelloLibrary {
	
	// myParent is a reference to the parent sketch
	PApplet myParent;

	int myVariable = 0;
	
	public final static String VERSION = "##library.prettyVersion##";
	
	public HelloLibrary(PApplet theParent) {
		myParent = theParent;
	}
}

