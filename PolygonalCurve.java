public class PolygonalCurve extends ColorPixelConverter{
    /* parameter of polygonal curve function */
    private double aR=150.0/255,aG=150.0/255,aB=150.0/255;
    private double bR=0.0,bG=0.0,bB=0.0;
    
    /* constructor */
    public PolygonalCurve(){
    }
    public PolygonalCurve(int a,int b){
	aR=aG=aB=a;
	bR=bG=bB=b;
    }
    public PolygonalCurve(int aR,int aG,int aB,int bR,int bG,int bB){
	this.aR=aR; this.aG=aG; this.aB=aB;
	this.bR=bR; this.bG=bG; this.bB=bB;
    }

    /* Polygonal Curve function */
    public int functionR(int r){
	return (int)(aR*r+bR);
    }
    public int functionG(int g){
	return (int)(aG*g+bG);
    }
    public int functionB(int b){
	return (int)(aB*b+bB);
   }
}
