public class CounterPoint implements Cloneable{
    private Point point;
    private static int counter;

    public CounterPoint(Point point){
        this.point = point;
        incrementCounter();
    }
    public CounterPoint(CounterPoint counterPoint){
        this.point = counterPoint.getPoint();
        incrementCounter();
    }

    private static synchronized void incrementCounter(){
        counter++;
    }

    public CounterPoint clone(){
    try {
        return (CounterPoint) super.clone();
    }catch (CloneNotSupportedException e){
        throw new AssertionError();
    }
    }
    public static int getCounter() {
        return counter;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public static void setCounter(int counter) {
        CounterPoint.counter = counter;
    }

    @Override
    public boolean equals(Object point){
        if (this == point) return true;
        if (!(point instanceof CounterPoint)) return false;
        CounterPoint p= (CounterPoint) point;
        return (this.point.equals(p.getPoint()));
    }

    @Override
    public int hashCode(){
        return 31 * this.point.hashCode();
    }

}
