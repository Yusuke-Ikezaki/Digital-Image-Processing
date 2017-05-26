public class PolygonalCurve extends PixelConverter{
    /* lower end of threshold */
    private int lowerR=80,lowerG=80,lowerB=80;
    /* upper end of threshold */
    private int upperR=160,upperG=160,upperB=160;
    
    /* constructor */
    public PolygonalCurve(){
    }
    public PolygonalCurve(int lower,int upper){
	lowerR=lowerG=lowerB=lower;
	upperR=upperG=upperB=upper;
    }
    public PolygonalCurve(int lowerR,int lowerG,int lowerB,
			  int upperR,int upperG,int upperB){
	this.lowerR=lowerR; this.lowerG=lowerG; this.lowerB=lowerB;
	this.upperR=upperR; this.upperG=upperG; this.upperB=upperB;
    }

    /* Polygonal Curve function */
    public int functionR(int r){
	if(r<lowerR) return 0;
	else if(r<upperR) return (int)(255/(upperR-lowerR+0.1)*(r-lowerR));
	else return 255;
    }
    public int functionG(int g){
        if(g<lowerG) return 0;
	else if(g<upperG) return (int)(255/(upperG-lowerG+0.1)*(g-lowerG));
	else return 255;
    }
    public int functionB(int b){
	if(b<lowerB) return 0;
	else if(b<upperB) return (int)(255/(upperB-lowerB+0.1)*(b-lowerB));
	else return 255;
    }
}
