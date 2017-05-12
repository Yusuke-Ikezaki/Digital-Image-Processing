public class ToneCurve extends PixelConverter{
    /* parameter of gamma_func */
    private double gamma=2.0;

    /* constractor */
    public ToneCurve(){
    }
    public ToneCurve(double gamma){
	this.gamma=gamma;
    }

    /* concrete process */
    public int process(int c){
	int r=(int)gamma_func(r(c));
	int g=(int)gamma_func(g(c));
	int b=(int)gamma_func(b(c));
	return rgb(r,g,b);
    }
    /* gamma correction */
    public double gamma_func(int c){
	return 255*Math.pow(c/255.0,1/gamma);
    }
    /* setter of gamma */
    private void setGamma(double gamma){
	this.gamma=gamma;
    }
}
