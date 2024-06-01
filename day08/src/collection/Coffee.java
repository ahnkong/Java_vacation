package collection;


// 카페 메뉴의 틀 만들기
public class Coffee {
		
	private String name;
	private String kind;
	private int price ;
	private boolean sale; // 세일 유무, 10% 깎인 가격으로 나타내줘야 하니까!
	
	
	//기본생성자
	public Coffee() {;}


	//초기화 생성자 ctrl + shift + s+ o
	public Coffee(String name, String kind, int price, boolean sale) {
		super();
		this.name = name;
		this.kind = kind;
		this.price = price;
		this.sale = sale;
	}


	
	//게터세터 (들여쓰기 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean getSale() {
		return sale;
	}

	public void setSale(boolean sale) {
		this.sale = !sale;
	
	}


	@Override // toString 재정의
	public String toString() {
		return "Coffee [name=" + name + ", kind=" + kind + ", price=" + price + ", sale=" + sale + "]\n";
	}
	
	
	
}	
