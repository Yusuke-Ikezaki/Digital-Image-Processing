public abstract class Smoother extends AreaConverter{
    /* filtering for Smoothing */
    public int filtering(int x,int y){
	int frame=size/2;
	int r=0,g=0,b=0;
	for(int i=-frame;i<=frame;i++)
	    for(int j=-frame;j<=frame;j++){
		int c=getRGB(x+j,y+i);
		double weight=process(x,y);
		r+=(int)(r(c)*weight);
		g+=(int)(g(c)*weight);
		b+=(int)(b(c)*weight);
	    }
	return rgb(r,g,b);
    }
    public abstract double process(int x,int y);
}
