public class Averaging extends Smoother{
    /* parameter of filter */
    private int weight=1;

    /* constructor */
    public Averaging(int size){
	this.size=size;
	sum=size*size;
    }

    /* filter */
    public int process(int x,int y){
	return weight;
    }
}
