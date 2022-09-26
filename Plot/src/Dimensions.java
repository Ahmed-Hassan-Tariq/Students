public class Dimensions {
    private double length;
    private double width;
    private double area;
    private String shape;

    public Dimensions(double length, double width){
        this.length = length;
        this.width = width;
        this.area = (length * width);

        if(length != width){
        this.shape = "Rectangle";
        }else{
            this.shape = "Square";
        }
    }

    public String getDimensions(){
        return String.format("----------Dimensions of Plot----------" +
                "%nLength: %.2f%nWidth: %.2f%nArea: %.2f%nShape: %s",
                this.length,this.width, this.area, this.shape);
    }

}
