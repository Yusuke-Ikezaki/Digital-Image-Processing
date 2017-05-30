public abstract class GrayPixelConverter extends PixelConverter{
    /* lookup table */
    protected int[] lookup=new int[256];

    /* make lookup table */
    public void make_lookup(){
        preprocess();
	for(int i=0;i<256;i++)
	    lookup[i]=function(i);
    }
    /* refer to lookup table */
    public int process(int c){
	int gray=lookup[gray(c)];
	return rgb(gray,gray,gray);
    }
    public abstract void preprocess();
    public abstract int function(int c);
}
