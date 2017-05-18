public class Laplacian extends EdgeExtraction{
    /* constructor */
    public Laplacian(){
	size=3;
    }

    /* vertical filter */
    public int processH(int x,int y){
	if(x==0&&y==0) return -4;
	else if(x==0||y==0) return 1;
	else return 0;
    }
    /* horizontal filter */
    public int processW(int x,int y){
	return processH(x,y);
    }
}
