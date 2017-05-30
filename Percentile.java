public class Percentile extends Binarization{
    /* parameter of percentile */
    private double p;

    /* constructor */
    public Percentile(double p){
	this.p=p;
    }

    /* calculate threshold */
    public int calc_threshold(){
	int sum=getHeight()*getWidth();
	int t=(int)(sum*p);
	for(int i=0,cnt=0;i<256;cnt+=hist[i++])
	    if(cnt+hist[i]>=t) return i;
	return 255;
    }
}
