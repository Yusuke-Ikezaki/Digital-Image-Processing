public abstract class AreaConverter extends Converter{
    /* operation for spatial filtering */
    public void operate(int x,int y){
	int rgb=filtering(x,y);
	setRGB(x,y,rgb);
    }
    public abstract int filtering(int x,int y);
}
