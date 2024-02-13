package com.indonesia.objects;


public class Provisions {
    private String SKU;
    private String Description;
    private String Plant;
    private String Location;
    private String BatchNumber;
    private String SLOC;

    public Provisions() {
    }

    public Provisions withSKU(String SKU) {
        this.SKU= SKU;
        return this;
    }

    public Provisions withDescription(String Description) {
        this.Description = Description;
        return this;
    }

    public Provisions withPlant(String Plant) {
        this.Plant = Plant;
        return this;
    }

    public Provisions withLocation(String Location) {
        this.Location = Location;
        return this;
    }

    public Provisions withBatchNumber(String BatchNumber) {
        this.BatchNumber = BatchNumber;
        return this;
    }

    public Provisions withSLOC(String SLOC) {
        this.SLOC = SLOC;
        return this;
    }

    public String getSKU() {
        return SKU;
    }

    public String getDescriptionId() {
        return Description;
    }

    public String getPlantId() {
        return Plant;
    }

    public String getLocationType() {
        return Location;
    }
    public String getBatchNumberType() {
        return BatchNumber;
    }
    public String getSLOCType() {
        return SLOC;
    }


}
