//Liam Robb, lr003
public enum ProcessStatus {
    RUNNING(0), READY(1), BLOCKED(2); // could make this the T/F bit maybe with killed as 3rd

    private final int id;
    ProcessStatus(int id) {this.id = id;}
    public int getValue() {return id;}

}
