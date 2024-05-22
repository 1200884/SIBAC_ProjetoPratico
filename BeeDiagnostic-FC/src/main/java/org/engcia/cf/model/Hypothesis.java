package org.engcia.cf.model;

public class Hypothesis extends FactCF {

    private String name;
    private String value;
    private boolean updated;

    public Hypothesis(double cf, String description, String value) {
        super(cf, description, value);
    }

    public Hypothesis(String name, String value) {
        this.name = name;
        this.value = value;
        this.updated = false;
    }

    public void update() {
        this.updated = true;
    }

    public boolean isUpdated() {
        return updated;
    }

    public void updateConfidence(double ruleCF) {
        this.cf += ruleCF * (1 - this.cf);
        this.updated = true;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
