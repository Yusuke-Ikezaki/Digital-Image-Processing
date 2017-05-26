public class Gaussian extends Smoother{
    /* parameter of filter */
    private int[][] weight;
    private int center;

    /* constructor */
    public Gaussian(int size){
	this.size=size;
	center=size/2;
	int[] lookup=make_lookup(size);
	weight=new int[size][size];
        for(int i=0;i<size;i++)
	    for(int j=0;j<size;j++){
		weight[i][j]=lookup[i]*lookup[j];
		sum+=weight[i][j];
	    }
    }

    /* make lookup table */
    private int[] make_lookup(int n){
	int[][] tpas=new int[n][n];
	for(int i=0;i<n;i++)
	    for(int j=0;j<=i;j++){
		if(j==0||j==i) tpas[i][j]=1;
		else tpas[i][j]=tpas[i-1][j-1]+tpas[i-1][j];
	    }
	return tpas[n-1];
    }
    /* filter */
    public int process(int x,int y){
	return weight[y+center][x+center];
    }
}
