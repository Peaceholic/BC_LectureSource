public class Prob1
{
    //main method
    public static void main (String[] args)
    {
		Book[] booklist = new Book[5];

		Book book1 = new Book("Java", 25000);
		Book book2 = new Book("JSP", 15000);
		Book book3 = new Book("SQL", 30000);
		Book book4 = new Book("JDBC", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB");
		book5.setPrice(34000);

		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;

		BookMgr mgr = new BookMgr(booklist);

		System.out.println(" === 도서 목록 === ");
		mgr.printBookList();
		System.out.println("");

		System.out.println(" === 도서 가격 합계 === ");
		mgr.printTotalPrice();
		
    }//end of main  
}//end of class


class Book
{
	private String title;
	private int price;

	public Book(){
	}

	public Book(String title, int price){
		this.title = title;
		this.price=price;	
	}

	public String getTitle(){
		return this.title;
	}

	public void setTitle(String title){
		this.title = title;	
	}

	public int getPrice(){
		return this.price;
	}

	public void setPrice(int  price){
		this.price = price;	
	}
}// end of book

class BookMgr
{
	Book[] booklist;

	public BookMgr(Book[] list){
		booklist = list;
	}

	public void printBookList(){
		for(int i=0; i < booklist.length; i++){
			System.out.println(booklist[i].getTitle());		
		}	
	}

	public void printTotalPrice(){
		int temp = 0;
		for(int i=0; i < booklist.length; i++){
			temp+=booklist[i].getPrice();
		}		
		System.out.println(temp);
	}
}