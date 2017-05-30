public abstract class PixelConverter extends Converter{
    /* process for each pixel */
    public void processImage(){
	make_lookup();
	for(int y=0;y<getHeight();y++)
	    for(int x=0;x<getWidth();x++){
		int c=getRGB(x,y);
		int rgb=process(c);
		setRGB(x,y,rgb);
	    }
    }
    public abstract void make_lookup();
    public abstract int process(int c);
}
