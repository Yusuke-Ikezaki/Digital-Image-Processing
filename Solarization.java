public class Solarization extends ColorPixelConverter{
    /* lower end of threshold */
    private int lowerR=80,lowerG=80,lowerB=80;
    /* upper end of threshold */
    private int upperR=160,upperG=160,upperB=160;
    
    /* constructor */
    public Solarization(){
    }
    public Solarization(int lower,int upper){
	lowerR=lowerG=lowerB=lower;
	upperR=upperG=upperB=upper;
    }
    public Solarization(int lowerR,int lowerG,int lowerB,
			int upperR,int upperG,int upperB){
	this.lowerR=lowerR; this.lowerG=lowerG; this.lowerB=lowerB;
	this.upperR=upperR; this.upperG=upperG; this.upperB=upperB;
    }

    /* solarization function */
    public int functionR(int r){
	if(r<lowerR) return (int)(255/(lowerR+0.1)*r);
	else if(r<upperR) return (int)(-255/(upperR-lowerR+0.1)*(r-upperR));
	else return (int)(255/(255-upperR+0.1)*(r-upperR));
    }
    public int functionG(int g){
        if(g<lowerG) return (int)(255/(lowerG+0.1)*g);
	else if(g<upperG) return (int)(-255/(upperG-lowerG+0.1)*(g-upperG));
	else return (int)(255/(255-upperG+0.1)*(g-upperG));
    }
    public int functionB(int b){
	if(b<lowerB) return (int)(255/(lowerB+0.1)*b);
	else if(b<upperB) return (int)(-255/(upperB-lowerB+0.1)*(b-upperB));
	else return (int)(255/(255-upperB+0.1)*(b-upperB));
    }
}
