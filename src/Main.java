import processScheduling.Process;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        final int timeConstraint = 10;

        Process processA = new Process(100, 0, 0, 'A');
        Process processB = new Process(50, 0, 0, 'B');
        Process processC = new Process(20, 50, 0, 'C');

        ArrayList<Process> processes = new ArrayList<>();
        processes.add(processA);
        processes.add(processB);
        processes.add(processC);
    }


}