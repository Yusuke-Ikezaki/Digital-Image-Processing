public abstract class Converter extends ImageProcessing{
    /* filter size */
    private int size=1;

    /* process template */
    public void convert(String before_name,String after_name){
	readImage(before_name);
	processImage();
	writeImage(after_name);
    }
    public void processImage(){
	int frame=size/2;
	for(int y=frame;y<getHeight()-frame;y++)
	    for(int x=frame;x<getWidth()-frame;x++){
		operate(x,y);
	    }
    }
    public abstract void operate(int x,int y);
}
