package org.engcia.cf.model;

public class Evidence extends FactCF{

	public Evidence(double cf, String description, String value) {
		super(cf, description, value);
	}
	
	public String toString() {
		return super.toString();
	}
    private String description;
    private String value;

    public Evidence(String description, String value) {
        this.description = description;
        this.value = value;
    }

    // Getters e setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
