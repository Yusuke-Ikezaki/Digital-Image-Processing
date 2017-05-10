public abstract class PixelConverter extends Converter{
    /* operation */
    public void operate(int x,int y){
	int c=getRGB(x,y);
	int rgb=process(c);
	setRGB(x,y,rgb);
    }
    public abstract int process(int c);
}
