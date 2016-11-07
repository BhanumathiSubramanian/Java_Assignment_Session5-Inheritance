class areacalc
{
    
    public int b;
    public int h;
    public int w;
    
}
class triangle extends areacalc
{
    
    public void tricalc(int bre, int hi)
    {
        b = bre;
        h = hi;
        System.out.println(0.5*b*h);
    }
    
}
class rectangle extends areacalc
{
    
    public void rectcalc(int width, int hi)
    {
        w = width;
        h = hi;
        System.out.println(w*h);
        
    }
}
public class HelloWorld{

     public static void main(String []args)
     {
        triangle t = new triangle();
        System.out.println("Area of Triangle");
        t.tricalc(10, 20);
        rectangle r = new rectangle();
        System.out.println("Area of Rectangle");
        r.rectcalc(20,30);
     }
}
