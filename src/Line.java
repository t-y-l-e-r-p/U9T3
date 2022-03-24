import java.awt.Graphics;
public class Line extends Shape {
    public Line()
    {
        super();
    }
    public void draw(Graphics graphic)
    {
        graphic.setColor(getColor());
        graphic.drawLine(getPoint1().x, getPoint1().y, getPoint2().x, getPoint2().y);
    }

}
