public abstract class AreaConverter extends Converter{
    /* operation for spatial filtering */
    public void processImage(){
	int frame=size/2;
	for(int y=frame;y<getHeight()-frame;y++)
	    for(int x=frame;x<getWidth()-frame;x++){
		int rgb=filtering(x,y);
		setRGB(x,y,rgb);
	    }
    }
    public abstract int filtering(int x,int y);
}
