package mar_19;
class book{
	private String bookTitle;
	private double bookPrice;
	public book(String bookTitle, double bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "book [bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + "]";
	}
	
}

public class SetterInConstructor {
	public static void main(String[] args) {
		book b1= new book("ramraj", 500);
		System.out.println(b1);
		b1.setBookPrice(1200);
		System.out.println(b1);
	
		
	}

}
