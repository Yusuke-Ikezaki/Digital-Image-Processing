public class NegaPosi extends PixelConverter{
    /* concrete process */
    public int process(int c){
	int r=255-r(c);
	int g=255-g(c);
	int b=255-b(c);
        return rgb(r,g,b);
    }
}
