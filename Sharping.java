public class Sharping extends Smoother{
    /* constructor */
    public Sharping(){
	size=3;
    }

    /* filter */
    public int process(int x,int y){
	if(x==0&&y==0) return 5;
	else if(x==0||y==0) return -1;
	else return 0;
    }
}
