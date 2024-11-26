package mar_24;
import java.time.LocalDate;
import java.util.Scanner;

class book {
	private String bookName;
	private String authourName;
	private LocalDate publishedDate;

	public book(String bookName, String authourName, LocalDate publishedDate) {
		super();
		this.bookName = bookName;
		this.authourName = authourName;
		this.publishedDate = publishedDate;
	}

	public static book getbookdeils() {
		Scanner sc = new Scanner(System.in);
		System.out.println("bookName");
		String title = sc.nextLine();
		System.out.println("authorName");
		String author = sc.nextLine();
		System.out.println("date name");
		int date = sc.nextInt();
		sc.close();
		return new book(title, author, null);

	}

	@Override
	public String toString() {
		return "book [bookName=" + bookName + ", authourName=" + authourName + ", publishedDate=" + publishedDate + "]";
	}

}

public class Bookmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the book numbers");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			book b1=book.getbookdeils();
			System.out.println(b1);
			
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
