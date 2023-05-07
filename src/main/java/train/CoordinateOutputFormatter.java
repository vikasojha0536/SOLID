package train;

import java.util.List;

public class CoordinateOutputFormatter {

    private final boolean latFirst;

    public CoordinateOutputFormatter(boolean latFirst) {
        this.latFirst = latFirst;
    }

    public String parseOutput(List<TrainTarget> trainInRange) {
        var sb = new StringBuilder();
        if (latFirst) {
            trainInRange.forEach(a -> sb
                    .append("[")
                    .append(a.lat())
                    .append(" ")
                    .append(a.lon())
                    .append("] "));
        } else {
            trainInRange.forEach(a -> sb
                    .append("[")
                    .append(a.lon())
                    .append(" ")
                    .append(a.lat())
                    .append("] "));
        }

        return sb.toString();
    }
}
