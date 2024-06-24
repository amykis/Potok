package potok;

import java.util.Collections;
import java.util.List;

public class PotokService {
    public void sortStreams(List<Potok> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
