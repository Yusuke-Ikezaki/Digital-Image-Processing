public abstract class Smoother extends AreaConverter{
    /* parameter of filtering */
    protected int sum=1;

    /* filtering for Smoothing */
    public int filtering(int x,int y){
	int frame=size/2;
	int r=0,g=0,b=0;
	for(int i=-frame;i<=frame;i++)
	    for(int j=-frame;j<=frame;j++){
		int c=getRGB(x+j,y+i);
		int weight=process(j,i);
		r+=r(c)*weight;
		g+=g(c)*weight;
		b+=b(c)*weight;
	    }
	r/=sum; g/=sum; b/=sum;
	return rgb(r,g,b);
    }
    public abstract int process(int x,int y);
}
