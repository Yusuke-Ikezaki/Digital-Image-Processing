# Digital-Image-Processing
digital image processing by Java

## Implemented Processes   
  - Polygonal Curve  
      parameter: lowerR, lowerG, lowerB, upperR, upperG, upperB /* default 80, 80, 80, 160, 160, 160 */  
      constructor: PolygonalCurve(int lowerR, int lowerG, int lowerB, int upperR, int upperG, int upperB)  
  - Gamma Conversion  
      parameter: gammaR, gammaG, gammaB /* default 2.0, 2.0, 2.0 */  
      constructor: GammaConversion(double gammaR, double gammaG, double gammaB)  
  - S Curve  
      parameter: None  
      constructor: SCurve()  
  - Nega Posi  
      parameter: None  
      constructor: NegaPosi()  
  - Posterization  
      parameter: levelR, levelG, levelB /* default 4, 4, 4 */  
      constructor: Posterization(int levelR, int levelG, int levelB)  
  - Solarization  
      parameter: lowerR, lowerG, lowerB, upperR, upperG, upperB /* default 80, 80, 80, 160, 160, 160 */  
      constructor: PolygonalCurve(int lowerR, int lowerG, int lowerB, int upperR, int upperG, int upperB)  
  - Pseudo Color  
      parameter: None  
      constructor: Pseudo()  
  - Chroma Key  
      parameter: maskR, maskG, maskB, rangeR, rangeG, rangeB /* default 0, 0, 0, 0, 0, 0 */  
      constructor: ChromaKey(int maskR, int maskG, int maskB, int rangeR, int rangeG, int rangeB)  
  - Averaging Filter  
      parameter: size  
      constructor: Averaging(int size)  
  - Gaussian Filter  
      parameter: size  
      constructor: Gaussian(int size)  
  - Specific Direction Filter  
      parameter: size, direction  
      constructor: SpecificDirection(int size, int direction)  
      /* direction 0: top to bottom, 1: upper right to lower left, 2: left to right, 3: upper left to lower right */  
  - Median Filter  
      parameter: size  
      constructor: Median(int size)  
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
  - Sharping Filter  
      parameter: None  
      constructor: Sharping()  
  - Unsharp Masking  
      parameter: k /* default 1 */  
      constructor: UnsharpMasking(int k)  
  - Emboss  
      parameter: size  
      constructor: Emboss(int size)  

## how to use 
  - example  
    ~~~
    Converter c = new PolygonalCurve(64, 128, 192, 128, 192, 256);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new GammaConversion(3.0, 1.5, 0.5);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new SCurve();  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new NegaPosi();  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Posterization(16, 8, 4);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Solarization(64, 64, 64, 128, 192, 256);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Pseudo();  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new ChromaKey(100, 50, 75, 10, 5, 15);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Averaging(3);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Gaussian(5);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new SpecificDirection(15, 1);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Median(5);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Differential();  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Sobel();  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Prewitt();  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Laplacian();  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Sharping();  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new UnsharpingMasking(10);  
    c.convert(before_change_image_name, after_change_image_name);  
    c = new Emboss(5);  
    c.convert(before_change_image_name, after_change_image_name);  
    ~~~
