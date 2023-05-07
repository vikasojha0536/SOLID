package train;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        var trains = List.of(
                new TrainTarget("a1", 1, 2),
                new TrainTarget("a2", 10, 3),
                new TrainTarget("a3", -2, 7),
                new TrainTarget("a4", 6, -3),
                new TrainTarget("a5", 3, 4),
                new TrainTarget("a6", 9, 10)
        );

        var origin = new Origin(0, 0);
        CoordinateOutputFormatter latLongFormatter = new CoordinateOutputFormatter(true);
        System.out.println(origin.getTrainInRange(6, trains, latLongFormatter));

        CoordinateOutputFormatter longLatFormatter = new CoordinateOutputFormatter(false);

        System.out.println(origin.getTrainInRange(6, trains, longLatFormatter));
    }
}
