public class Posterization extends PixelConverter{
    /* parameter of posterize */
    private int level=4;
    
    /* constructor */
    public Posterization(){
    }
    public Posterization(int level){
	this.level=level;
    }

    /* concrete process */
    public int process(int c){
	int gray=gray(c);
	return posterize(gray);
    }
    /* posterization */
    public int posterize(int gray){
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
