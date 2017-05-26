public class Posterization extends PixelConverter{
    /* parameter of posterize */
    private int levelR=4,levelG=4,levelB=4;
    
    /* constructor */
    public Posterization(){
    }
    public Posterization(int level){
	levelR=level; levelG=level; levelB=level;
    }
    public Posterization(int levelR,int levelG,int levelB){
	this.levelR=levelR; this.levelG=levelG; this.levelB=levelB;
    }

    /* posterization function */
    public int functionR(int r){
       	int base=256/levelR;
	for(int c=base;c<256;c+=base)
	    if(r<c) return c;
	return 255;
    }
    public int functionG(int g){
	int base=256/levelG;
	for(int c=base;c<256;c+=base)
	    if(g<c) return c;
	return 255;
    }
    public int functionB(int b){
	int base=256/levelB;
	for(int c=base;c<256;c+=base)
	    if(b<c) return c;
	return 255;
    }
    /* setter of level */
    public void setLevel(int level){
	levelR=level; levelG=level; levelB=level;
    }
    public void setLevel(int levelR,int levelG,int levelB){
	this.levelR=levelR; this.levelG=levelG; this.levelB=levelB;
    }
}
