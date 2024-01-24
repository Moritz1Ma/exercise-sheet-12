package de.unistuttgart.iste.sqa.pse.sheet12.homework.cleancode;

public class Panda {
    private boolean isFed;
    private final int weight;

    public Panda(int weight){
        if(weight < 60){
            throw new IllegalArgumentException("A Panda should weigh at least 60 kilos");
        }
        this.weight = weight;
        this.isFed = false;
    }

    public int getWeight(){
        return weight;
    }

    public void feed(){
        this.isFed = true;
    }
}
