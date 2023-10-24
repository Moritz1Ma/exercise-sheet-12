package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

import java.util.Date;

/**
 * This class represents a ventilator which should be opened independent of the
 * current temperature.
 *
 * @version 1.0
 */
public class Ventilator {
	public int id;
	private int width;
	private int height;
	private boolean on;
	private Date purchaseDate;
	private int powerClimatisation;

	protected void turnOn() {}

	protected void turnOff() {}

	protected boolean isOn() {
		return this.on;
	}
}
