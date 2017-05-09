public abstract class Converter extends ImageProcessing{
    /* filter size */
    private int size=1;

    /* process template */
    public void processImage(){
	int frame=size/2;
	for(int y=frame;y<getHeight()-frame;y++)
	    for(int x=frame;x<getWidth()-frame;x++){
		process(x,y);
	    }
    }
    public abstract void process(int x,int y);
}
