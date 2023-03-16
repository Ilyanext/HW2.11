public class Number implements Comparable<Number> {
    private int number;
    private long id;

    public Number(int number, long id) {
        this.number = number;
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                ", id=" + id +
                "}\n";
    }

    @Override
    public int compareTo(Number o) {
        return this.getNumber()-o.getNumber();
    }
}
