package potok;

import java.util.List;

public class Controller {
    private PotokService potokService;

    public Controller() {
        this.potokService = new PotokService();
    }

    public void sortStreams(List<Potok> streams) {
        potokService.sortStreams(streams);
    }
}
