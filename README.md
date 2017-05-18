# Digital-Image-Processing
digital image processing by Java

~ implemented processes ~  
  - Tone Curve  
      parameter: gamma /* default 2.0 */  
      constructor: ToneCurve(double gamma)  
  - Chroma Key  
      parameter: maskR, maskG, maskB, rangeR, rangeG, rangeB /* default 0, 0, 0, 0, 0, 0 */  
      constructor: ChromaKey(int maskR, int maskG, int maskB, int rangeR, int rangeG, int rangeB)  
  - Posterization  
      parameter: level /* default 4 */  
      constructor: Posterization(int level)  
  - Nega Posi  
      parameter: None  
      constructor: NegaPosi()  
  - Averaging Filter  
      parameter: size  
      constructor: Averaging(int size)  
  - Gaussian Filter  
      parameter: size  
      constructor: Gaussian(int size)  
  - Differential Filter  
      parameter: None  
      constructor: Differential()  
  - Sobel Filter  
      parameter: None  
      constructor: Sobel()  
  - Prewitt Filter  
      parameter: None  
      constructor: Prewitt()  
  - Laplacian Filter  
      parameter: None  
      constructor: Laplacian()  

~ how to use ~  
  - example  
    ~~~
    Convert c=new ToneCurve(3.0);  
    c.convert(before_change_image_name, after_change_image_name);  
    c=new ChromaKey(100,50,75,10,5,15);  
    c.convert(before_change_image_name, after_change_image_name);  
    c=new Posterization(16);  
    c.convert(before_change_image_name, after_change_image_name);  
    c=new NegaPosi();  
    c.convert(before_change_image_name, after_change_image_name);  
    c=new Averaging(3);  
    c.convert(before_change_image_name, after_change_image_name);  
    c=new Gaussian(5);  
    c.convert(before_change_image_name, after_change_image_name);  
    c=new Differential();  
    c.convert(before_change_image_name, after_change_image_name);  
    c=new Sobel();  
    c.convert(before_change_image_name, after_change_image_name);  
    c=new Prewitt();  
    c.convert(before_change_image_name, after_change_image_name);  
    c=new Laplacian();  
    c.convert(before_change_image_name, after_change_image_name);  
    ~~~
