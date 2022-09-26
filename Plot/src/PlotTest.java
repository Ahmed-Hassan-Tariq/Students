public class PlotTest {
    public static void main(String[] args) {
        Plot plot1 =
        new Plot(
                new Owner("x", "y","xxxx-xxxxxxx",
                        20, "Attack Helicopter"),

                new Address("Punjab", "x", "y",
                        'c', 40, 24.084893f, 30.758474f ),

                new Dimensions(30.44, 20.33),
                5_000_000
        );

        System.out.printf("%s", plot1.getPlotInfo());

    }
}
