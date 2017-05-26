public class SCurve extends PixelConverter{
    /* sigmoid function */
    public int functionR(int r){
	return (int)(255*1.0/(1.0+Math.exp(-(r-128)/16)));
    }
    public int functionG(int g){
	return (int)(255*1.0/(1.0+Math.exp(-(g-128)/16)));
    }
    public int functionB(int b){
	return (int)(255*1.0/(1.0+Math.exp(-(b-128)/16)));
    }
}
