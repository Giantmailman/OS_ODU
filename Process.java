//Liam robb, lr003
import java.util.Objects;
import java.util.Comparator;

public class Process implements Comparable{

    private final int pid;
    private final int priority;
    private ProcessStatus status;

    public Process(){ // default
        pid = -1;
        priority = -1;
        status = ProcessStatus.BLOCKED;
    }


    public Process(int pid, int priority, ProcessStatus status){ //standard instantiation
        this.pid = pid;
        this.priority = priority;
        this.status = status;
    }


    public Process(Process other){ // copy instantiation
        this.pid = other.pid;
        this.priority = other.priority;
        this.status = other.status;
    }

    //equals for my process
    @Override
    public boolean equals(Object ob){
        if(ob == null) return false;
        else if (!(ob instanceof Process)) return false;
        else return this.pid == ((Process)ob).pid;
    }

    //same deal but defining hashing
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.pid;
        hash = 79 * hash + this.priority;
        hash = 79 * hash + Objects.hashCode(this.status);
        return hash;
    }

    //again but compare
    @Override
    public int compareTo(Object ob){
        if(this.priority == ((Process)ob).priority)
            return 0;
        else if(this.priority < ((Process)ob).priority)
            return 1;
        else return -1;
    }

    //getters and setter

    public int getPid() {return this.pid;}

    public int getPriority() {return this.priority;}

    public ProcessStatus getStatus() {return this.status;}

    public void setStatus(ProcessStatus status) {this.status = status;}


}
