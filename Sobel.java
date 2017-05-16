public class Sobel extends EdgeExtraction{
    /* constructor */
    public Sobel(){
	size=3;
    }

    /* vertical filter */
    public int processH(int x,int y){
	return x==0 ? 2*y : y;
    }
    /* horizontal filter */
    public int processW(int x,int y){
	return y==0 ? 2*x : x;
    }
}
