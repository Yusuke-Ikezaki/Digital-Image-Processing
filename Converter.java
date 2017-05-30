public abstract class Converter extends ImageProcessing{
    /* process template */
    public void convert(String before_name,String after_name){
	readImage(before_name);
	processImage();
	writeImage(after_name);
    }
    public abstract void processImage();
}
