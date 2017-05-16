public abstract class EdgeExtraction extends AreaConverter{
    /* filtering for edge extraction */
    public int filtering(int x,int y){
	int frame=size/2;
	int rw=0,rh=0,gw=0,gh=0,bw=0,bh=0;
	for(int i=-frame;i<=frame;i++)
	    for(int j=-frame;j<=frame;j++){
		int c=getRGB(x+j,y+i);
		int weightH=processH(j,i);
		int weightW=processW(j,i);
		rh+=weightH*r(c); rw+=weightW*r(c);
		gh+=weightH*g(c); gw+=weightW*g(c);
		bh+=weightH*b(c); bw+=weightW*b(c);
	    }
	int r=(int)Math.sqrt(rh*rh+rw*rw);
	int g=(int)Math.sqrt(gh*gh+gw*gw);
	int b=(int)Math.sqrt(bh*bh+bw*bw);
	return rgb(r,g,b);
    }
    public abstract int processH(int x,int y);
    public abstract int processW(int x,int y);
}
