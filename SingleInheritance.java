
public class SingleInheritance {
	
	
	
	
	//Calculate area of rectangle and triangle using single inheritance. 
	
	int l = 20;
	int h = 40;
	int w = 30;
	
	
	
	
	}

class Area extends SingleInheritance{
	
	public void Method(){
		
		
		System.out.println("The area of Triangle");
	
	
	int areaTriangle = l*h/2;
	
	
	System.out.println("Area is "+ areaTriangle);

	System.out.println("The Area of Rectangle");
	int areaRectangle= w*l;
	System.out.println("The Area of Rectangle is: "+areaRectangle);
	
	
	
	}
	public static void main(String[] args){
		
		Area obj= new Area();
		obj.Method();
		
	}
	
	
	
		
}
