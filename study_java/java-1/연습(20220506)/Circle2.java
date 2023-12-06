
/**
 * 
 * 
 * @author () 
 * @version ()
 */
public class Circle2
{
    // 
    private String name;
    private int radius;
    private String color;
    
    /**
     *
     */
    public Circle2(String color,int r)
    {
        //
        this.color =  color;
        this.radius = r;
        this.name = null;
    }
    
    public Circle2(String name,String color,int r)
    {
        //
        this(color, r);
        this.name =  name;
        // this.radius = r;
        // this.color = color;
    }
    
    
    public double getArea()
    {
        // 
        return 3.14 * this.radius * this.radius;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setName(String n){
        this.name = n;
    }
}
