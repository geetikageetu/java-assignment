package test;

class complex{
    int real;
    int imagina;

    public complex(int real , int imagina){
        this.real = real;
        this.imagina = imagina;
    }

    public complex add(complex b){
        return new complex(this.real+b.real,this.imagina+b.imagina);
    }
    public complex subtract(complex b){
        return new complex(this.real-b.real,this.imagina-b.imagina);
    }
    public complex multiply(complex b){
        return new complex( this.real*b.real - this.imagina*b.imagina , this.imagina*b.real + this.real*b.imagina);
    }
    public String toString(){
        return String.format("Real > %d : Imagina > %d",this.real,this.imagina );
    }
}
public class A5 {
	 
	
	public static void main(String[] args) {
	        A5 test = new A5();
	       
	    }
	 A5(){
         complex a = new complex(6,2);
         complex b = new complex(5,4);
         System.out.println((a.add(b)).toString());
         System.out.println((a.subtract(b)).toString());
         System.out.println((a.multiply(b).toString()));


     }
    

   
}