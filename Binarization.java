public abstract class Binarization extends GrayPixelConverter{
    /* histogram */
    protected int[] hist=new int[256];
    /* threshold of binarization */
    private int threshold;

    /* preprocessing */
    public void preprocess(){
	make_hist();
    }
    /* make histogram */
    public void make_hist(){
	for(int i=0;i<256;i++)
	    hist[i]=0;
	for(int y=0;y<getHeight();y++)
	    for(int x=0;x<getWidth();x++){
		int c=getRGB(x,y);
		hist[gray(c)]++;
	    }
	threshold=calc_threshold();
    }
    /* binarization function */
    public int function(int c){
	if(c>threshold) return 255;
	else return 0;
    }
    public abstract int calc_threshold();
}
