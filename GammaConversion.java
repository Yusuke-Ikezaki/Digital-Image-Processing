public class GammaConversion extends PixelConverter{
    /* parameter of gamma_function */
    private double gammaR=2.0;
    private double gammaG=2.0;
    private double gammaB=2.0;

    /* constructor */
    public GammaConversion(){
    }
    public GammaConversion(double gamma){
	gammaR=gamma; gammaG=gamma; gammaB=gamma;
    }
    public GammaConversion(double gammaR,double gammaG,double gammaB){
	this.gammaR=gammaR; this.gammaG=gammaG; this.gammaB=gammaB;
    }

    /* gamma function */
    public int functionR(int r){
	return (int)(255*Math.pow(r/255.0,1/gammaR));
    }
    public int functionG(int g){
	return (int)(255*Math.pow(g/255.0,1/gammaG));
    }
    public int functionB(int b){
	return (int)(255*Math.pow(b/255.0,1/gammaB));
    }
}
