package processScheduling;

public class Process {
    private int processingTime;
    private int currentTime;
    private int priority;
    private Character symbol;

    public Process(int processingTime, int currentTime, int priority, Character symbol) {
        this.processingTime = processingTime;
        this.currentTime = currentTime;
        this.priority = priority;
        this.symbol = symbol;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(int processingTime) {
        this.processingTime = processingTime;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }
}
