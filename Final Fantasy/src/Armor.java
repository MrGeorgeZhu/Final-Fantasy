
public class Armor {
	private String name;
	private int defense;
	private int magicDefense;
	public Armor(String n, int d, int md)
	{
		name = n;
		defense = d;
		magicDefense = md;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getMagicDefense() {
		return magicDefense;
	}
	public void setMagicDefense(int magicDefense) {
		this.magicDefense = magicDefense;
	}
}
