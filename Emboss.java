public class Emboss extends Smoother{
    /* constructor */
    public Emboss(int size){
	this.size=size;
    }
    
    /* filter */
    public int process(int x,int y){
	int frame=size/2;
	if(x==-frame&&y==-frame) return 1;
	else if(x==frame&&y==frame) return -1;
	else return 0;
    }
}
