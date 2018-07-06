package domain;

public class CardBean {
	
	
	private String kind; 
	private int number,width, height;
	
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	
	@Override
	public String toString() {
		return "카드내용 [종류=" + kind + ", 숫자=" + number + ", 폭=" + width + ", 높이=" + height + "]";
	}
	
}
