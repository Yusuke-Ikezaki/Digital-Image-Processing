public class Pseudo extends PixelConverter{
    /* pseudo color */
    public int functionR(int r){
	if(r<128) return 0;
	else if(r<192) return 4*(r-127);
	else return 255;
    }
    public int functionG(int g){
	if(g<64) return 4*g;
	else if(g<192) return 255;
	else return -4*(g-255);
    }
    public int functionB(int b){
	if(b<64) return 255;
	else if(b<192) return -4*(b-127);
	else return 0;
    }
}
