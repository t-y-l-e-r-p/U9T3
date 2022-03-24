import java.awt.Graphics;
public class Arc extends Shape{
    private int startAngle;
    private int arcAngle;
    public Arc()
    {
        super();
        startAngle = 50;
        arcAngle = 40;
    }
    @Override
    public void draw(Graphics graphic)
    {
        graphic.setColor(getColor());
        graphic.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}
