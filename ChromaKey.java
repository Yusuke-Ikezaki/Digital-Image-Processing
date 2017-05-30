public class ChromaKey extends ColorPixelConverter{
    /* background color */
    private int maskR=0,maskG=0,maskB=0;
    /* range of background color */
    private int rangeR=0,rangeG=0,rangeB=0;

    /* constructor */
    public ChromaKey(){
    }
    public ChromaKey(int maskR,int maskG,int maskB,
		     int rangeR,int rangeG,int rangeB){
	this.maskR=maskR; this.maskG=maskG; this.maskB=maskB;
	this.rangeR=rangeR; this.rangeG=rangeG; this.rangeB=rangeB;
    }

    /* mask function */
    public int functionR(int r){
	if(maskR-rangeR<=r&&r<=maskR+rangeR) return 0;
	else return r;
    }
    public int functionG(int g){
	if(maskG-rangeG<=g&&g<=maskG+rangeG) return 0;
	else return g;
    }
    public int functionB(int b){
	if(maskB-rangeB<=b&&b<=maskB+rangeB) return 0;
	else return b;
    }
    /* setter of mask color */
    public void setMask(int maskR,int maskG,int maskB){
	this.maskR=maskR; this.maskG=maskG; this.maskB=maskB;
    }
    /* setter of mask range */
    public void setRange(int rangeR,int rangeG,int rangeB){
	this.rangeR=rangeR; this.rangeG=rangeG; this.rangeB=rangeB;
    }
}
