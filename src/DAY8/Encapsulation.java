package DAY8;

public class Encapsulation {
	
	private int Accno;
	private String name;
	private double AcBal;
	private String branch;
	
	
	public void SetAccno(int Accno) {
		this.Accno = Accno;
	}
	public int GetAccno() {
		return Accno;
	}
	public void Setname(String name) {
		this.name = name;
	}
	public String Getname() {
		return name;
	}
	public double getAcBal() {
		return AcBal;
	}
	public void setAcBal(double acBal) {
		AcBal = acBal;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
