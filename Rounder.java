public static double receiveInput(String s, int pointAccuracy) {
		
  if(s.indexOf("/") == -1) {
    return round(Double.parseDouble(s), pointAccuracy);
  } 

  String dividendS = s.substring(0, s.indexOf("/"));
  double dividend = Double.parseDouble(dividendS);

  //to prevent the program from crashing:
  if(s.indexOf("/") == s.length()-1) {
    System.out.println("Input couldn't get identified.");
    return 0.0; 
  }

  String divisorS = s.substring(s.indexOf("/")+1); 
  double divisor = Double.parseDouble(divisorS);
		
	return round(dividend/divisor, pointAccuracy);
}


public static double round(double arg, int pointAccuracy) {
  int multiplier = (int) Math.pow(10, pointAccuracy);

  double d = arg * multiplier; 
  double r = d - (int)d;

  if(r >= 0.5) return ((d-r)+1)/multiplier;

  return (d-r)/multiplier;
}
