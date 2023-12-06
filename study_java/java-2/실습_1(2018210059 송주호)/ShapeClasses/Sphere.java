package ShapeClasses;
import MyInterface.Shape;
/**
 * 여기에 Cylinder 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Sphere implements Shape
{
    private String name;
    private Double radius;

    public Sphere(String name, Double radius){
        this.name= name;
        this.radius=radius;
    }

    public Double computeVolume(){
        return (4/3)*radius*radius*radius*Math.PI;   
    }
    
        public String toString(){
        return "도형이름 : " +name + ","
        + "반지름 : " +radius;
    }
    
}