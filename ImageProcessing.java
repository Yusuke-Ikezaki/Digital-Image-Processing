import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class ImageProcessing{
    private int w,h;
    private BufferedImage read,write;

    /* Color */
    public int a(int c){
        return c>>>24;
    }
    public int r(int c){
        return c>>16&0xff;
    }
    public int g(int c){
        return c>>8&0xff;
    }
    public int b(int c){
        return c&0xff;
    }
    public int gray(int c){
	return (int)(0.2989*r(c))+(int)(0.5870*g(c))+(int)(0.1140*b(c));
    }
    public int rgb(int r,int g,int b){
	if(r<0) r=0;
	else if(r>255) r=255;
	if(g<0) g=0;
	else if(g>255) g=255;
	if(b<0) b=0;
	else if(b>255) b=255;
        return 0xff000000 | r <<16 | g <<8 | b;
    }
    public int argb(int a,int r,int g,int b){
        return a<<24 | r <<16 | g <<8 | b;
    }

    /* Image */
    private void setWidth(int w){
	this.w=w;
    }
    private void setHeight(int h){
	this.h=h;
    }
    public int getWidth(){
	return w;
    }
    public int getHeight(){
	return h;
    }
    private void setRead(BufferedImage read){
	this.read=read;
    }
    private void setWrite(BufferedImage write){
	this.write=write;
    }
    public BufferedImage getRead(){
	return read;
    }
    public BufferedImage getWrite(){
	return write;
    }
    protected void setRGB(int x,int y,int rgb){
	write.setRGB(x,y,rgb);
    }
    public int getRGB(int x,int y){
	return read.getRGB(x,y);
    }
    public BufferedImage copyImage(BufferedImage source){
	BufferedImage copy=new BufferedImage(source.getWidth(),
					     source.getHeight(),
					     source.getType());
	copy.setData(source.getData());
	return copy;
    }

    /* File */
    public void readImage(String name){
	try{
	    File before=new File(name);
	    setRead(ImageIO.read(before));
	    setWidth(read.getWidth()); setHeight(read.getHeight());
	    setWrite(copyImage(read));
	} catch(IOException e){
	    System.out.println(e);
	}
    }
    public void writeImage(String name){
	try{
	    File after=new File(name);
	    ImageIO.write(write,extension(name),after);
	} catch(IOException e){
	    System.out.println(e);
	}
    }
    public String extension(String filename){
	return filename.substring(filename.indexOf('.')+1,filename.length());
    }
}
