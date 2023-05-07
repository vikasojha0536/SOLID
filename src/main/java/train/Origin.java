package train;

import java.util.List;

public class Origin {
    private final int originLat;
    private final int originLon;

    public Origin(int originLat, int originLon) {
        this.originLat = originLat;
        this.originLon = originLon;
    }

    public String getTrainInRange(int range, List<TrainTarget> allTrains, CoordinateOutputFormatter outputFormatter) {
        var trainInRange = allTrains
                .stream()
                // d = √[(x2 − x1)2 + (y2 − y1)2]
                .filter(a -> {
                    var distance = (int) Math.sqrt(
                            (originLat - a.lat()) * (originLat - a.lat()) +
                                    (originLon - a.lon()) * (originLon - a.lon()));
                    return distance <= range;
                })
                .toList();

            return outputFormatter.parseOutput(trainInRange);
    }
}
