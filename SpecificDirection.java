public class SpecificDirection extends Smoother{
    /* direction of smoothing */
    /* 0: from top to bottom */
    /* 1: from upper right to lower left */
    /* 2: from left to right */
    /* 3: from upper left to lower right */
    private int direction=0;

    /* constructor */
    public SpecificDirection(int size,int direction){
	this.size=size;
	this.direction=direction;
	sum=size;
    }

    /* filter */
    public int process(int x,int y){
	if(direction==0){
	    if(x==0) return 1;
	    else return 0;
	} else if(direction==1){
	    if(x==-y) return 1;
	    else return 0;
	} else if(direction==2){
	    if(y==0) return 1;
	    else return 0;
	} else if(direction==3){
	    if(x==y) return 1;
	    else return 0;
	} else return 0;
    }
}
