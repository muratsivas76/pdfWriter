package cidObjects;

public class CIDSystemInfo {
	private final String PDFCRLF = "\r\n";
	private StringBuilder sbCIDSystemInfoDic = new StringBuilder();
	private String strRegistry;
	private String strOrdering;
	private int intSupplement;
	
	/** The constructors  for the class	 */
	public CIDSystemInfo(){}
	
	public String getRegistry() {return strRegistry;	}

	public void setRegistry(String strRegistry) {this.strRegistry = strRegistry;}

	public String getOrdering() {return strOrdering;}

	public void setOrdering(String strOrdering) {this.strOrdering = strOrdering;}

	public int getSupplement() {return intSupplement;}

	public void setSupplement(int intSupplement) {this.intSupplement = intSupplement;}

	public String toString(){
		sbCIDSystemInfoDic.append("<< " );// Start of dictionary
		sbCIDSystemInfoDic.append("/Registry " + strRegistry + PDFCRLF);
		sbCIDSystemInfoDic.append("/Ordering " + strOrdering+ PDFCRLF);
		sbCIDSystemInfoDic.append("/Supplement " + Integer.toString(intSupplement)+ PDFCRLF);
		sbCIDSystemInfoDic.append(">> " + PDFCRLF);// End of dictionary
		return sbCIDSystemInfoDic.toString();
	}
	
}