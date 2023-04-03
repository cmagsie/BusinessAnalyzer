public class Business {
    private String id;
    private String accountNumber;
    private String ownershipName;
    private String dbaName;
    private String streetAddress;
    private String zipcode;
    private String businessStartDate;
    private String businessEndDate;
    private String locationStartDate;
    private String locationEndDate;
    private String mailAddress;
    private String mailCity;
    private String mailZipcode;
    private String mailState;
    private String naicsCode;
    private String naicsCodeDescription;
    private boolean parkingTax;
    private boolean transientOccupancyTax;
    private String licCode;
    private String licCodeDescription;
    private String supervisorDistrict;
    private String neighborhoodAnalysisBoundaries;
    private String businessCorridor;
    private String businessLocation;
    private Integer sfFindNeighborhoods;
    private Integer policeDistricts;
    private Integer supervisorDistricts;
    private Integer analysisNieghborhoods;
    private Integer neighborhoods;

    public Business(String id, String accountNumber, String ownershipName, String dbaName, String streetAddress,
            String zipcode, String businessStartDate, String businessEndDate, String locationStartDate,
            String locationEndDate, String mailAddress, String mailCity, String mailZipcode, String mailState,
            String naicsCode, String naicsCodeDescription, boolean parkingTax, boolean transientOccupancyTax,
            String licCode, String licCodeDescription, String supervisorDistrict, String neighborhoodAnalysisBoundaries,
            String businessCorridor, String businessLocation, Integer sfFindNeighborhoods, Integer policeDistricts,
            Integer supervisorDistricts, Integer analysisNieghborhoods, Integer neighborhoods) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.ownershipName = ownershipName;
        this.dbaName = dbaName;
        this.streetAddress = streetAddress;
        this.zipcode = zipcode;
        this.businessStartDate = businessStartDate;
        this.businessEndDate = businessEndDate;
        this.locationStartDate = locationStartDate;
        this.locationEndDate = locationEndDate;
        this.mailAddress = mailAddress;
        this.mailCity = mailCity;
        this.mailZipcode = mailZipcode;
        this.mailState = mailState;
        this.naicsCode = naicsCode;
        this.naicsCodeDescription = naicsCodeDescription;
        this.parkingTax = parkingTax;
        this.transientOccupancyTax = transientOccupancyTax;
        this.licCode = licCode;
        this.licCodeDescription = licCodeDescription;
        this.supervisorDistrict = supervisorDistrict;
        this.neighborhoodAnalysisBoundaries = neighborhoodAnalysisBoundaries;
        this.businessCorridor = businessCorridor;
        this.businessLocation = businessLocation;
        this.sfFindNeighborhoods = sfFindNeighborhoods;
        this.policeDistricts = policeDistricts;
        this.supervisorDistricts = supervisorDistricts;
        this.analysisNieghborhoods = analysisNieghborhoods;
        this.neighborhoods = neighborhoods;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnershipName() {
        return ownershipName;
    }

    public void setOwnershipName(String ownershipName) {
        this.ownershipName = ownershipName;
    }

    public String getDbaName() {
        return dbaName;
    }

    public void setDbaName(String dbaName) {
        this.dbaName = dbaName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getBusinessStartDate() {
        return businessStartDate;
    }

    public void setBusinessStartDate(String businessStartDate) {
        this.businessStartDate = businessStartDate;
    }

    public String getBusinessEndDate() {
        return businessEndDate;
    }

    public void setBusinessEndDate(String businessEndDate) {
        this.businessEndDate = businessEndDate;
    }

    public String getLocationStartDate() {
        return locationStartDate;
    }

    public void setLocationStartDate(String locationStartDate) {
        this.locationStartDate = locationStartDate;
    }

    public String getLocationEndDate() {
        return locationEndDate;
    }

    public void setLocationEndDate(String locationEndDate) {
        this.locationEndDate = locationEndDate;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getMailCity() {
        return mailCity;
    }

    public void setMailCity(String mailCity) {
        this.mailCity = mailCity;
    }

    public String getMailZipcode() {
        return mailZipcode;
    }

    public void setMailZipcode(String mailZipcode) {
        this.mailZipcode = mailZipcode;
    }

    public String getMailState() {
        return mailState;
    }

    public void setMailState(String mailState) {
        this.mailState = mailState;
    }

    public String getNaicsCode() {
        return naicsCode;
    }

    public void setNaicsCode(String naicsCode) {
        this.naicsCode = naicsCode;
    }

    public String getNaicsCodeDescription() {
        return naicsCodeDescription;
    }

    public void setNaicsCodeDescription(String naicsCodeDescription) {
        this.naicsCodeDescription = naicsCodeDescription;
    }

    public boolean isParkingTax() {
        return parkingTax;
    }

    public void setParkingTax(boolean parkingTax) {
        this.parkingTax = parkingTax;
    }

    public boolean isTransientOccupancyTax() {
        return transientOccupancyTax;
    }

    public void setTransientOccupancyTax(boolean transientOccupancyTax) {
        this.transientOccupancyTax = transientOccupancyTax;
    }

    public String getLicCode() {
        return licCode;
    }

    public void setLicCode(String licCode) {
        this.licCode = licCode;
    }

    public String getLicCodeDescription() {
        return licCodeDescription;
    }

    public void setLicCodeDescription(String licCodeDescription) {
        this.licCodeDescription = licCodeDescription;
    }

    public String getSupervisorDistrict() {
        return supervisorDistrict;
    }

    public void setSupervisorDistrict(String supervisorDistrict) {
        this.supervisorDistrict = supervisorDistrict;
    }

    public String getNeighborhoodAnalysisBoundaries() {
        return neighborhoodAnalysisBoundaries;
    }

    public void setNeighborhoodAnalysisBoundaries(String neighborhoodAnalysisBoundaries) {
        this.neighborhoodAnalysisBoundaries = neighborhoodAnalysisBoundaries;
    }

    public String getBusinessCorridor() {
        return businessCorridor;
    }

    public void setBusinessCorridor(String businessCorridor) {
        this.businessCorridor = businessCorridor;
    }

    public String getBusinessLocation() {
        return businessLocation;
    }

    public void setBusinessLocation(String businessLocation) {
        this.businessLocation = businessLocation;
    }

    public Integer getSfFindNeighborhoods() {
        return sfFindNeighborhoods;
    }

    public void setSfFindNeighborhoods(Integer sfFindNeighborhoods) {
        this.sfFindNeighborhoods = sfFindNeighborhoods;
    }

    public Integer getPoliceDistricts() {
        return policeDistricts;
    }

    public void setPoliceDistricts(Integer policeDistricts) {
        this.policeDistricts = policeDistricts;
    }

    public Integer getSupervisorDistricts() {
        return supervisorDistricts;
    }

    public void setSupervisorDistricts(Integer supervisorDistricts) {
        this.supervisorDistricts = supervisorDistricts;
    }

    public Integer getAnalysisNieghborhoods() {
        return analysisNieghborhoods;
    }

    public void setAnalysisNieghborhoods(Integer analysisNieghborhoods) {
        this.analysisNieghborhoods = analysisNieghborhoods;
    }

    public Integer getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(Integer neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

}