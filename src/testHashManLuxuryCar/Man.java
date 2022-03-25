package testHashManLuxuryCar;

public class Man {

	   private String noseSize;
	   private String eyesColor;
	   private String haircut;
	   private boolean scars;
	   private int dnaCode;

	public Man(String noseSize, String eyesColor, String haircut, boolean scars, int dnaCode) {
	   this.noseSize = noseSize;
	   this.eyesColor = eyesColor;
	   this.haircut = haircut;
	   this.scars = scars;
	   this.dnaCode = dnaCode;
	}

	public String getNoseSize() {
		return noseSize;
	}

	public String getEyesColor() {
		return eyesColor;
	}

	public String getHaircut() {
		return haircut;
	}

	public boolean isScars() {
		return scars;
	}

	public int getDnaCode() {
		return dnaCode;
	}
	

	@Override
	public boolean equals(Object o) {
	   if (this == o) return true;
	   if (o == null || getClass() != o.getClass()) return false;
	   Man man = (Man) o;
	   return dnaCode == man.dnaCode;
	}
	

}


	