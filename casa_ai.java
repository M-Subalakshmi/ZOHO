import java.util.*;

class Inventory{
    
    int ProductId;
    String ProductName;
    int Quantity;
    int Price;
    //GET
    public int getProductId(){
        return ProductId;
    }
    public String getProductName(){
        return ProductName;
    }
    public int getQuantity(){
        return Quantity;
    }
    public int getPrice(){
        return Price;
    }
    //SET 
    public void setProductId(int ProductId){
        this.ProductId=ProductId;
    }
    public void setQuantity(int Quantity){
        this.Quantity=Quantity;
    }
    public void setProductName(String ProductName){
        this.ProductName=ProductName;
    }
    public void setPrice(int Price){
        this.Price=Price;
    }
    
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Inventory record[]=new Inventory[101];
		int index=1;
		while(true){
		    System.out.println("1.INVENTORY");
		    System.out.println("2.SALE");
		    System.out.println("3.STOCK");
		    System.out.println("4.EXIT");
		    System.out.print("Enter Your Choice : ");
		    int n=sc.nextInt();
		    System.out.println();
		    sc.nextLine();
		    switch(n){
		        case 1:{
		            System.out.println();
		            System.out.print("INVENTORY=>");
		            String INVENTORY_INPUT=sc.nextLine();
		            String[] splitingInventoryInput=INVENTORY_INPUT.split("[|]");
		            
		            record[index]=new Inventory();
		            record[index].setProductId(Integer.parseInt(splitingInventoryInput[0]));
		            record[index].setProductName(splitingInventoryInput[1]);
		            record[index].setQuantity(Integer.parseInt(splitingInventoryInput[2]));
		            record[index].setPrice(Integer.parseInt(splitingInventoryInput[3]));
		            index++;
		            System.out.println("Inventory Updated.");
		            System.out.println();
		            break;
		        }
		        case 2:{
		            System.out.print("Sale=>");
		            String SALE_INPUT=sc.nextLine();
		            String[] splitingSaleInput=SALE_INPUT.split("[;]");
		            
		            System.out.println();
		            System.out.println("== Bill ==");
		            System.out.println(splitingSaleInput.length);
		            int total=0;
		            for(String SingleItem:splitingSaleInput){
		                String[] Single=SingleItem.split("[|]");
		                int sale_ProductId=Integer.parseInt(Single[0]);
		                int sale_Quantity=Integer.parseInt(Single[1]);
		                
		                System.out.println(sale_ProductId+"-"+record[sale_ProductId].getProductName()+"-"+sale_Quantity+"-"+record[sale_ProductId].getPrice()+"-N/A-"+(sale_Quantity*record[sale_ProductId].getPrice()));               
		                total+=sale_Quantity*record[sale_ProductId].getPrice();
		            }
		            System.out.println("== Total ==");
		            System.out.println(total);
		            System.out.println("========");
		            System.out.println();
		            break;
		        }
		        case 3:{
		            System.out.println();
		            System.out.print("STOCK=>");
		            int ProductId=sc.nextInt();
		            if(index==1) System.out.println("NO STOCK");
		            System.out.println();
		            System.out.println(record[ProductId].getProductName()+"-"+record[ProductId].getQuantity());
		            System.out.println();
		            break;
		        }
		        case 4:{
		            return;
		        }
		        default:{
		            System.out.println("Invalid Choice");
		            System.out.println();
		        }
		    }
		}
	}
}
