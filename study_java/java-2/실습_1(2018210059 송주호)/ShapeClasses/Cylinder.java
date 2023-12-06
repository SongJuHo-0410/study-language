 package ShapeClasses;
import MyInterface.Shape;
/**
 * 여기에 Cylinder 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Cylinder implements Shape
{
    private Double radius;
    private String name;
    private Integer height;

    public Cylinder(String name,Double radius,Integer height)
    {
        this.height=height;
        this.name=name;
        this.radius=radius;
    }

    public Double computeVolume()
    {
        return Math.PI * radius * radius * height;
    }

    public String toString(){
        return "도형이름 : " +name + ","
        + "반지름 : " +radius+ ","
        +"높이 : " +height;
    }
}
