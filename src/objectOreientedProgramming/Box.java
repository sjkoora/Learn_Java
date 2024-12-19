package objectOreientedProgramming;
//constructor overloading
//name shld bre same as class
//used to intiliaze value
public class Box {
 double width,height,depth;
 Box()//default constructor
 {
	 width=height=depth=0;
 }
 Box(double w,double h,double d)
 //withparameters
 {
	 width=w;
	 height=h;
	 depth=d;
 }
 Box(double len){
	 width=height=depth=len;
 }
 double volume()
 {
	 return(width*height*depth);
 }
}
