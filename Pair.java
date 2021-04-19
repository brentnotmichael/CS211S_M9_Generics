import java.util.Objects;

public class Pair <T> {
	
	private T first;
	private T second;
		
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
	
	@Override
	public String toString() {
	    return "First: " + first + "\nSecond: " + second;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pair<?>) {
			Pair<?> other = (Pair<?>) obj;
			if (!this.first.equals(other.first) && (!this.first.equals(other.second))) {
				return false;
			} else if (!this.second.equals(other.second)&& (!this.second.equals(other.first))) {
				return false;
			} return true;
		}
		// didn't pass instanceof check, return false
		return false;
	}
	

}
