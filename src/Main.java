public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(15,17);
        Color c= new Color((byte) 15, (byte)4,(byte)15);
        ColorPoint colorPoint = new ColorPoint(p1,c);
        CounterPoint counterPoint = new CounterPoint(p1);

        System.out.println(p1.equals(colorPoint));

        Point p1Copy = new Point(p1);
        ColorPoint colorPointCopy = new ColorPoint(colorPoint);
        CounterPoint counterPointCopy = new CounterPoint(counterPoint);

        System.out.println(counterPointCopy.equals(counterPoint));


        ColorPoint CPClone = colorPoint.clone();
        CounterPoint counterClone = counterPoint.clone();
        System.out.println(counterClone.equals(counterPointCopy));
        System.out.println(counterClone.equals(counterPoint));
        System.out.println(counterClone.hashCode() == counterPointCopy.hashCode());
    }
}
