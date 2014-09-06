package url;

public class URLTest {	
	
	public static void main(String[] args) {
		String url = "http://archive.ncsa.uiuc.edu:80/SDG/Software/Mosaic/Demo/url-primer.html";
		URL test = URL.createFromString(url);
		System.out.println(test);
	}	

}
