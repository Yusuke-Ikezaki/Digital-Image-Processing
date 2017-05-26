import java.util.Arrays;

public class Median extends Smoother{
    /* constructor */
    public Median(int size){
	this.size=size;
    }

    /* calculate median */
    private int calc_median(int[] array){
	Arrays.sort(array);
	int median;
	int n=array.length;
	if(n%2==0) median=(array[n/2]+array[n/2+1])/2;
	else median=array[n/2];
	return median;
    }
    /* override */
    public int filtering(int x,int y){
	int frame=size/2;
	int[] fr=new int[size*size];
	int[] fg=new int[size*size];
	int[] fb=new int[size*size];
	int k=0;
	for(int i=-frame;i<=frame;i++)
	    for(int j=-frame;j<=frame;j++){
		int c=getRGB(x+j,y+i);
		fr[k]=r(c); fg[k]=g(c); fb[k]=b(c);
		k++;
	    }
	int r=calc_median(fr);
	int g=calc_median(fg);
	int b=calc_median(fb);
	return rgb(r,g,b);
    }
    /* filter */
    public int process(int x,int y){
	return 0;
    }
    public int getSum(){
	return 0;
    }
}
