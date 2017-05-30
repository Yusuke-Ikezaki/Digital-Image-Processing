public abstract class ColorPixelConverter extends PixelConverter{
    /* lookup table */
    protected int[] lookupR=new int[256];
    protected int[] lookupG=new int[256];
    protected int[] lookupB=new int[256];

    /* make lookup table */
    public void make_lookup(){
	for(int i=0;i<256;i++){
	    lookupR[i]=functionR(i);
	    lookupG[i]=functionG(i);
	    lookupB[i]=functionB(i);
	}
    }
    /* refer to lookup table */
    public int process(int c){
	int r=lookupR[r(c)];
	int g=lookupG[g(c)];
	int b=lookupB[b(c)];
	return rgb(r,g,b);
    }
    public abstract int functionR(int r);
    public abstract int functionG(int g);
    public abstract int functionB(int b);
}
