package org.rta.secondvehicle.api.model;

/**
 * ResponseType provides details for aadhar response success or error
 * 
 * @author Sriram
 *
 */
public enum ResponseType {

    SUCCESS(1, "success"),
    ERROR(2, "error");

    private int value;
    private String label;

    private ResponseType(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return this.value;
    }

    public String getLabel() {
        return this.label;
    }

}
