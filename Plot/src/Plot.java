public class Plot {
    private Owner owner;
    private Address address;
    private Dimensions dimensions;
    private int demandPrice;

    public Plot(Owner owner, Address address, Dimensions dimensions,int demandPrice){
        this.owner = owner;
        this.address = address;
        this.dimensions = dimensions;
        this.demandPrice = demandPrice;
    }

    public String getPlotInfo(){
        return String.format("%s%n%n%s%n%n%s%n%n" +
            "----------Demand Price----------%n%d",
            this.owner.getOwnerInfo(), this.address.getFullAddress(),
            this.dimensions.getDimensions(), this.demandPrice);
    }

}
