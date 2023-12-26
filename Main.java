import java.util.Scanner;
class Book{
	String name;
	String author;
	int price;
	int numPages;
	
	Book(String name,String author,int price,int numPages){
		this.name=name;
		this.author=author;
		this.price=price;
		this.numPages=numPages;
		}
	public String toString(){
		String name,author,price,numPages;
		name="Book name"+this.name+"\n";
		author="Author name"+this.author+"\n";
		price="price"+this.price+"\n";
		numPages="no of pages"+this.numPages+"\n";
		return name+author+price+numPages;
		}
	}
	public class Main{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			int n;
			String name;
			String author;
			int price;
			int numPages;

			System.out.println("Enter the number of books");
			n=s.nextInt();

			Book[] books = new Book[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter details for book " + (i + 1) + ":");
            			System.out.println("Name:");
				name=s.next();
				System.out.println("Author:");
				author=s.next();
				System.out.println("Price");
				price=s.nextInt();
				System.out.println("Number of pages");
				numPages=s.nextInt();
				books[i] = new Book(name, author, price, numPages);
				}
			 System.out.println("\nBook details:");
			    for (int i = 0; i < n; i++) {
   		  		  System.out.println(books[i].toString());
    			}
		}
	}