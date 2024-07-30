/**
 * 
 */
package com.cb.systempropertyviewer;

/**
 * 
 */
public class Test {
	public static Test createTest(int modus) {
		return new Test(modus);
	}

	/**
	 * @param modus
	 */
	private Test(int modus) {
		this.modus = modus;
	}

	// FIXME

	// TODO

	public void setModus(int modus) {
		this.modus = modus;
	}

	private int modus;
	// FIXME
	
	// TODO
	
	public int getModus() {
		return modus;
	}

	String meldung = Messages.getString("Test.0"); //$NON-NLS-1$
}
