package mar_22;

import java.util.Scanner;

class item {
	private int itemId;
	private String itemName;
	private String itemCompany;
	private int itemPrice;

	public item(int itemId, String itemName, String itemCompany, int itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCompany = itemCompany;
		this.itemPrice = itemPrice;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCompany() {
		return itemCompany;
	}

	public void setItemCompany(String itemCompany) {
		this.itemCompany = itemCompany;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "item [itemId=" + itemId + ", itemName=" + itemName + ", itemCompany=" + itemCompany + ", itemPrice="
				+ itemPrice + "]";
	}
	
	
}

public class Product {

	public static void main(String[] args) {
		item i1=new item(123, "froot", "cocola", 90);
		System.out.println(i1);
	}

}
