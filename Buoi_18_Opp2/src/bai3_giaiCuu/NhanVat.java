package bai3_giaiCuu;
public class NhanVat {
	private int blood, power;
	private boolean alive;

	
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public NhanVat(int blood, int power, boolean alive) {
		this.blood = blood;
		this.power = power;
		this.alive = alive;
	}
	public String toString() {
		String res= "";
		if (this.alive) res = "ALIVE";
		else res = "DEAD";
		return "blood: " + this.blood + "\npower: " + this.power + "\n" + res + "\n--------------\n";
	}
	public void mushroom() {
		this.blood -= 15;
		this.power -= 2;
		if (this.blood <=0 ||this.power <= 0) {
			this.blood = 0;
			this.power = 0;
			this.alive = false;
		}
	}
	public void phuThuy(int power) {
		if (power >= this.power) {
			this.blood = 0;
			this.power = 0;
			this.alive = false;
		}
		else {
			this.power += 5;
		}
	}
	public void pea() {
		this.blood += 10;
		this.power += 2;
	}
	public void soldier(int power) {
		if (power > this.power) {
			this.blood = 0;
			this.power = 0;
			this.alive = false;
		}
		else {
			this.blood += 5;
			this.power += 7;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
