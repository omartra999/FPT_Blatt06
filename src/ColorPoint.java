import java.util.Objects;

public class ColorPoint implements Cloneable{
    private Point point;
    private Color color;

    public ColorPoint(Point point, Color color){
        this.point = point;
        this.color = color;
    }

    public ColorPoint(ColorPoint colorPoint){
        this.point = colorPoint.getPoint();
        this.color = colorPoint.getColor();
    }

    public Color getColor() {
        return color;
    }

    public Point getPoint() {
        return point;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public ColorPoint clone(){
        try{
            return (ColorPoint) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object point){
        if (this == point) return true;
        if(!(point instanceof ColorPoint)) return false;
        ColorPoint p = (ColorPoint) point;
        return (this.point.equals(point) && this.color == p.getColor());
    }

    @Override
    public int hashCode() {
        int result = point.hashCode();
        result = 31 * result + Objects.hashCode(this.color);
        return result;
    }
}
