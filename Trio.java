import java.util.*;
/*
 * @auther: Ethan Zhang, Justin Tang, Ming King
 * */

public class Trio<T extends Comparable<? super T>> implements Comparable<Trio <T>> {

	private T item1, item2, item3;
	
	public Trio (T firstItem, T secondItem, T thirdItem ){
		this.item1 = firstItem;
		this.item2 = secondItem;
		this.item3 = thirdItem;		
	}
	
	public Trio(T oneItem){
		this(oneItem, oneItem, oneItem);
	}
	
	public T getItem1(){
		return item1;
	}
	
	public void setItem1(T item1){
		this.item1 = item1;
	}

	public T getItem2() {
		return item2;
	}

	public void setItem2(T item2) {
		this.item2 = item2;
	}

	public T getItem3() {
		return item3;
	}

	public void setItem3(T item3) {
		this.item3 = item3;
	}
	
	@Override
	public String toString(){
		return "The Trio is: " + item1 + " " + item2 + " " + item3;
	}
	
	public int contains(T thing){
		int count = 0;
		if (thing.equals(item1))
			count++;
		
		if (thing.equals(item2))
			count++;
		
		if (thing.equals(item3))
			count++;
		
		return count;
	}
	
	public boolean hasDuplicates(){
		if (this.item1.equals(this.item2)||this.item1.equals(this.item3)||this.item2.equals(this.item3))
			return true;
		else
			return false;
	}
	
/*	//First way of equals
	@Override
	public boolean equals(Object another){
		if (another instanceof Trio<?>) {
			Trio<?> newObj = (Trio<?>) another;

		boolean case1 = this.item1.equals(newObj.item1)&&this.item2.equals(newObj.item2) &&this.item3.equals(newObj.item3);
		boolean case2 = this.item1.equals(newObj.item1)&&this.item2.equals(newObj.item3) &&this.item3.equals(newObj.item2);
		boolean case3 = this.item1.equals(newObj.item3)&&this.item2.equals(newObj.item2) &&this.item3.equals(newObj.item1);
		boolean case4 = this.item1.equals(newObj.item2)&&this.item2.equals(newObj.item1) &&this.item3.equals(newObj.item3);
		boolean case5 = this.item1.equals(newObj.item3)&&this.item2.equals(newObj.item1) &&this.item3.equals(newObj.item2);
		boolean case6 = this.item3.equals(newObj.item1)&&this.item1.equals(newObj.item2) &&this.item2.equals(newObj.item3);

		return (case1||case2||case3||case4||case5||case6);
		}
		else
			return false;
	}
*/
	
	//Second way of equals
	@Override
	public boolean equals(Object another){
		if (another instanceof Trio<?>){
			Trio<?> newObj = (Trio<?>) another;
			
			ArrayList<T> thisArray = new ArrayList<T>();
				thisArray.add(this.item1);
				thisArray.add(this.item2);
				thisArray.add(this.item3);
				
			Collections.sort(thisArray);
			
			ArrayList<T> anotherArray = new ArrayList<T>();
				anotherArray.add((T) newObj.item1);
				anotherArray.add((T) newObj.item2);
				anotherArray.add((T) newObj.item3);
		
			Collections.sort(anotherArray);
			
			boolean item1 = thisArray.get(0).equals(anotherArray.get(0));
			boolean item2 = thisArray.get(1).equals(anotherArray.get(1));			
			boolean item3 = thisArray.get(2).equals(anotherArray.get(2));			
	
		return(item1&&item2&&item3);

		}
		else
			return false;
	}
	


	private T getLowest(){
	
		T lowest = item1;
		
		if(item1.compareTo(item2) > 0){
			
			lowest = item2;
			
				if(item2.compareTo(item3) > 0)
					lowest = item3;
		}
		
		if(lowest.compareTo(item3) > 0)
			lowest = item3;
			
		return lowest;
	}

	@Override
	public int compareTo(Trio<T> another){
		
		return this.getLowest().compareTo(another.getLowest());

	}
	
}
