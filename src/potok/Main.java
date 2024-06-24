package potok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UchebnayaGroup group1 = new UchebnayaGroup("Group 1");
        UchebnayaGroup group2 = new UchebnayaGroup("Group 2");
        UchebnayaGroup group3 = new UchebnayaGroup("Group 3");
        UchebnayaGroup group4 = new UchebnayaGroup("Group 4");
        UchebnayaGroup group5 = new UchebnayaGroup("Group 5");

        Potok stream1 = new Potok(Arrays.asList(group1, group2), "Stream-1");
        Potok stream2 = new Potok(Arrays.asList(group3), "Stream-2");
        Potok stream3 = new Potok(Arrays.asList(group1, group2, group3, group4), "Stream-3");
        Potok stream4 = new Potok(Arrays.asList(group5, group2, group4), "Stream-4");

        List<Potok> streams = Arrays.asList(stream1, stream2, stream3, stream4);

        Controller controller = new Controller();
        controller.sortStreams(streams);

        for (Potok potok : streams) {
            int groupCount = potok.getGroup().size();
            String groupWord = WordUtilit.getGroupWord(groupCount);
            System.out.println(potok.getName() + " включает в себя " + groupCount + " " + groupWord + ".");
        }

    }
}
