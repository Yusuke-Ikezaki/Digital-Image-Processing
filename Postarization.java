public class Postarization extends PixelConverter{
    /* parameter of postarize */
    private int level=4;
    
    /* constructor */
    public Postarization(){
    }
    public Postarization(int level){
	this.level=level;
    }

    /* concrete process */
    public int process(int c){
	int gray=gray(c);
	return postarize(gray);
    }
    /* postarization */
    public int postarize(int gray){
	int base=256/(level-1);
	for(int i=1,output=0;i<level;i++,output+=base)
	    if(gray<256*i/level) return rgb(output,output,output);
	return rgb(255,255,255);
    }
    /* setter of level */
    public void setLevel(int level){
	this.level=level;
    }
}
