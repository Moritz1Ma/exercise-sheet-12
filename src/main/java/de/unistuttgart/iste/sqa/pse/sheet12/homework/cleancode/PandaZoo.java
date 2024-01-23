package de.unistuttgart.iste.sqa.pse.sheet12.homework.cleancode;

import java.util.HashSet;
import java.util.Set;

public class PandaZoo {
    private String name;
    private final Set<Panda> pandas;

    /*
     * Create a new zoo with out any pandas.
     */
    public PandaZoo(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name must not be null or empty");
        }
        this.name = name;
        this.pandas = new HashSet<>();
    }

    /**
     * Add a panda to the zoo, if the panda is not yet part of the zoo.
     */
    public boolean addPanda(Panda panda) {
        if (panda == null || !this.pandas.contains(panda)) {
            throw new IllegalArgumentException("Panda cannot be null");
        }
        this.pandas.add(panda);
        return true;
    }

    /**
     * Find all pandas in the zoo that are heavier than 100 kilogram.
     */
    public Set<Panda> getPandasOver100Kilos() {
        Set<Panda> pandasHeavierThan100Kilos = new HashSet<>();
        for (Panda element : this.pandas)
            if (element.getWeight() > 100.00) {
                pandasHeavierThan100Kilos.add(element);
            }
        return pandasHeavierThan100Kilos;
    }

    /**
     * Feed all pandas in the zoo.
     */
    public void feedPandas() {
        for (final Panda panda : pandas) {
            panda.feed();
        }
    }

    /**
     * Calculate the sum of the weight of all pandas in the zoo.
     *
     * @return total weight of all pandas in the zoo.
     */
    public int sumOfPandaWeight() {
        int sum = 0;
        for (final Panda panda : pandas)
            sum += panda.getWeight();
        return sum;
    }

}
