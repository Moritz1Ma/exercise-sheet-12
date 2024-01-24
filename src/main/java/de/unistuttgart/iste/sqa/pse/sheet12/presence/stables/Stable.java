package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

import java.util.List;

/**
 * This class represents a barn, which consists of fans and cages. In this stable
 * laying poultries can be bred.
 *
 * @version 1.0
 */
public class 	Stable {
	private final int id;
	protected final String addressOfStable;
	protected final float temperature;
	private final int capacity;
	private final double surface;

	private final List<Ventilator> ventilators;
	private final List<Cage> cages;
	private final Technician technician;

	public Stable(
			final int id,
			final String address,
			final double surface,
			final Technician technician,
			final float temperature,
			final int capacity,
			final List<Cage> cages,
			final List<Ventilator> ventilators) {
		if (cages.size() < 10) {
			throw new IllegalArgumentException("To few cages, must be at least 10");
		}

		this.id = id;
		this.addressOfStable = address;
		this.surface = surface;
		this.technician = technician;
		this.temperature = temperature;
		this.capacity = capacity;

		this.cages = cages;
		this.ventilators = ventilators;
	}

	public void checkTemperature() {
		if (temperature > 40) {
			turnOffAllVentilators();
		} else {
			turnOnAllVentilators();
		}
	}

	private void turnOnAllVentilators() {
		for (final Ventilator aVentilator : ventilators) {
			aVentilator.turnOn();
		}
	}

	private void turnOffAllVentilators() {
		for (final Ventilator aVentilator : ventilators) {
			aVentilator.turnOff();
		}
	}
}
