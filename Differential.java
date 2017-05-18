public class Differential extends EdgeExtraction{
    /* constructor */
    public Differential(){
	size=3;
    }

    /* vertical filter */
    public int processH(int x,int y){
	if(x==0&&y==0) return 1;
	else if(x==0&&y==1) return -1;
	else return 0;
    }
    /* horizontal filter */
    public int processW(int x,int y){
	if(x==0&&y==0) return 1;
	else if(x==-1&&y==0) return -1;
	else return 0;
    }
}
