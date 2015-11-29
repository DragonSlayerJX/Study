
public class Overload {
	 private int nLifes; // = 0
	
	public Overload() {
		// TODO Auto-generated constructor stub
	setLifes(100);
	setLifes(1_000_000_000);
	}

	public int getLifes() {
		return nLifes;
	}

	public void setLifes(int nLifes) {
		this.nLifes = nLifes;
	}
	
	public void setLifes(float nLifes) {
		this.nLifes = (int) nLifes;
	}
	
	public void setLifes(String nLifes) {
		this.nLifes = Integer.valueOf(nLifes);
	}

	
	
}
