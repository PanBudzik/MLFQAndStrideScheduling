package processScheduling;

import java.util.*;

public class MLFQ {

    private ArrayList<Process> processes;
    private int timeConstraint;

    private Queue<Process> queuePriority0 = new LinkedList<>();
    private Queue<Process> queuePriority1 = new LinkedList<>();
    private Queue<Process> queuePriority2 = new LinkedList<>();

    public MLFQ(ArrayList<Process> processes, int timeConstraint) {
        this.processes = processes;
        this.timeConstraint = timeConstraint;
    }

    public void processQueue() {

//        Collections.sort(processes, new Comparator<Process>() {
//            @Override
//            public int compare(Process p1, Process p2) {
//                return Integer.compare(p1.getPriority(), p2.getPriority());
//            }
//        });


        for (Process process : processes) {
            queuePriority0.add(processes.get(0));
            processes.remove(0);
        }
    }
}
