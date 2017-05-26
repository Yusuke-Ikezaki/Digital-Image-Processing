public abstract class Converter extends ImageProcessing{
    /* filter size */
    protected int size=1;

    /* process template */
    public void convert(String before_name,String after_name){
	readImage(before_name);
	processImage();
	writeImage(after_name);
    }
    public abstract void processImage();
}
