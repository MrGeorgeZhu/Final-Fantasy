
public class Character {
	private String name;
	private int health;
	private int maxhealth;
	private int meleeAttack;
	private int magicAttack;
	private int skirmishAttack;
	private int defense;
	private int magicDefense;
	private int dexterity;
	private Weapon weapon;
	private Armor armor;
	public Character(String n, int h, int mh, int ma, int maa, int sa, int d, int md, int dex, Weapon w, Armor r)
	{
		name = n;
		health = h;
		maxhealth = mh;
		meleeAttack = ma;
		magicAttack = maa;
		skirmishAttack = sa;
		defense = d;
		magicDefense = md;
		dexterity = dex;
		weapon = w;
		armor = r;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMaxhealth() {
		return maxhealth;
	}
	public void setMaxhealth(int maxhealth) {
		this.maxhealth = maxhealth;
	}
	public int getMeleeAttack() {
		return meleeAttack;
	}
	public void setMeleeAttack(int meleeAttack) {
		this.meleeAttack = meleeAttack;
	}
	public int getMagicAttack() {
		return magicAttack;
	}
	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	public int getSkirmishAttack() {
		return skirmishAttack;
	}
	public void setSkirmishAttack(int skirmishAttack) {
		this.skirmishAttack = skirmishAttack;
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
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public Armor getArmor() {
		return armor;
	}
	public void setArmor(Armor armor) {
		this.armor = armor;
	}
}
