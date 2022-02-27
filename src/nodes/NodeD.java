package nodes;

public class NodeD {
    NodeD next;
    NodeD previous;
    int data;
    @Override
    public String toString() {
        return "NodeD{" +
                "next=" + next +
                ", previous=" + previous +
                ", data=" + data +
                '}';
    }

    public NodeD getNext() {
        return next;
    }

    public void setNext(NodeD next) {
        this.next = next;
    }

    public NodeD getPrevious() {
        return previous;
    }

    public void setPrevious(NodeD previous) {
        this.previous = previous;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }



}
