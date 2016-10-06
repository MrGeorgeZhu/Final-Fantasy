
public class Weapon {
	private String name;
	private int melee;
	private int magic;
	private int skirmish;
	public Weapon(String n, int m, int ma, int s)
	{
		name = n;
		melee = m;
		magic = ma;
		skirmish = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMelee() {
		return melee;
	}
	public void setMelee(int melee) {
		this.melee = melee;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	public int getSkirmish() {
		return skirmish;
	}
	public void setSkirmish(int skirmish) {
		this.skirmish = skirmish;
	}
}
