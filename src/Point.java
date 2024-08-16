public class Point implements Cloneable{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Copy Constructor to make a shallow copy
    public Point(Point otherPoint){
        this.x = otherPoint.getX();
        this.y = otherPoint.getY();
    }

    public Point clone(){
        try{
            return (Point) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object point){
        //equals method contract:
        // 1- reflexive => x.equals(x) should always be true
        // 2- transitive => if x.equals(y) and y.equals(z) then x.equals(z)
        // 3- Consistent => for a not changed value of x and y x.equals(y) should always have the same output
        // ---------------------------------------------------------------------------

        //Steps:
        //1- Check if reflexive:
        if (this == point) return true;

        //2- Check if the given parameter is from type Point:
        if (! (point instanceof Point)) return false;

        //3- down cast the parameter to type Point and do the comparision
        // never forget that every (Object) is the parent class to all classes=> you can down cast it to every thing
        // we are overriding the equals method form class Objecy.equals thats why it is not alowed to put a parameter from a type rather than Object
        // => we have to downcast it to our desired class:
        Point p = (Point) point;
        return (this.x == p.getX() && this.y == p.getY());
    }

    @Override
    public int hashCode(){
        int result = Integer.hashCode(this.x);
        result = 31 * result + Integer.hashCode(this.y);
        return result;
    }
}
