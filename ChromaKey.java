public class ChromaKey extends PixelConverter{
    /* parameter of mask_func */
    private int maskR=0,maskG=0,maskB=0;
    private int rangeR=0,rangeG=0,rangeB=0;

    /* constructor */
    public ChromaKey(){
    }
    public ChromaKey(int maskR,int maskG,int maskB,
		     int rangeR,int rangeG,int rangeB){
	this.maskR=maskR; this.maskG=maskG; this.maskB=maskB;
	this.rangeR=rangeR; this.rangeG=rangeG; this.rangeB=rangeB;
    }

    /* concrete process */
    public int process(int c){
	return mask_func(r(c),g(c),b(c));
    }
    /* masking */
    public int mask_func(int r,int g,int b){
	if((maskR-rangeR<=r&&r<=maskR+rangeR)&&
	   (maskG-rangeG<=g&&g<=maskG+rangeG)&&
	   (maskB-rangeB<=b&&b<=maskB+rangeB)) return rgb(r,g,b);
	else return rgb(0,0,0);
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
