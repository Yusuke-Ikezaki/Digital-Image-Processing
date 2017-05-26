public class UnsharpMasking extends Smoother{
    /* parameter of filter */
    private int[][] weight;
    private int k=1;

    /* constructor */
    public UnsharpMasking(int k){
	this.k=k;
	size=3;
	sum=size*size;
    }

    /* filter */
    public int process(int x,int y){
	if(x==0&&y==0) return 8*k+9;
	else return -k;
    }
}
