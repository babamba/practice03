package prob5;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	public int stateCode;
	
	public Book(){
		
	}
	
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	

	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}


	public void print(){
		System.out.println(
				"책 제목 : " + this.title + 
				", 작가 : " + this.author + 
				", 대여 유무" + (stateCode==0? "대여중" : "재고있음"));
	}
	
	void rent(){
		this.stateCode = 0;
			System.out.println(title + "가 대여 중");
		}

}
