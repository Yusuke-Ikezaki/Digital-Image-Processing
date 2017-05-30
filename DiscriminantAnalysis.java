public class DiscriminantAnalysis extends Binarization{
    /* calculate threshold */
    public int calc_threshold(){
	int tMax=0;
	double sigmaMax=0.0;
	for(int t=0;t<256;t++){
	    int w1=0,w2=0;
	    int sum1=0,sum2=0;
	    double m1=0.0,m2=0.0;
	    for(int i=0;i<t;i++){
		w1+=hist[i];
	        sum1+=i*hist[i];
	    }
	    for(int i=t;i<256;i++){
		w2+=hist[i];
		sum2+=i*hist[i];
	    }
	    if(w1==0||w2==0) continue;
	    m1=(double)sum1/w1; m2=(double)sum2/w2;
	    double sigma=0.01*w1*w2*(m1-m2)*(m1-m2);
	    if(sigma>sigmaMax){
		sigmaMax=sigma; tMax=t;
	    }
	}
	return tMax;
    }
}
