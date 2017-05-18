public class Prewitt extends EdgeExtraction{
    /* constructor */
    public Prewitt(){
	size=3;
    }

    /* vertical filter */
    public int processH(int x,int y){
	if(y==-1) return 1;
	else if(y==1) return -1;
	else return 0;
    }
    /* horizontal filter */
    public int processW(int x,int y){
	return x;
    }
}
