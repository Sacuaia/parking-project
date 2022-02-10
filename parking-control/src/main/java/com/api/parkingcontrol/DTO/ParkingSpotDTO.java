package com.api.parkingcontrol.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDTO {

	@NotBlank
	private String parkingSpotNumber;
	
	@NotBlank
    @Size(max = 7)
	private String licensePlater;
	
	@NotBlank
	private String brandCar;
	
	@NotBlank
	private String modelCar;
	
    @NotBlank
	private String colorCar;
	
	@NotBlank
	private String responsibleName;
	
    @NotBlank
	private String apartment;
	
    @NotBlank
	private String block;
	

    public String getParkingSpotNumber() {
        return this.parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlater() {
        return this.licensePlater;
    }

    public void setLicensePlater(String licensePlater) {
        this.licensePlater = licensePlater;
    }

    public String getBrandCar() {
        return this.brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return this.modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return this.colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return this.responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return this.apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return this.block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    
}