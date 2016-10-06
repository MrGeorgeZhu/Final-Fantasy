
public class Mob
	{
		private String name;
		private int health;
		private int attack;
		private int defense;
		private int magicDefense;
		private int dexterity;
		private String element;
		public Mob (String n, int h, int a, int d, int md, int dx, String e)
		{
			name = n;
			health = h;
			attack = a;
			defense = d;
			magicDefense = md;
			dexterity = dx;
			element = e;
		}
		public String getElement()
			{
				return element;
			}
		public void setElement(String element)
			{
				this.element = element;
			}
		public int getDexterity()
			{
				return dexterity;
			}
		public void setDexterity(int dexterity)
			{
				this.dexterity = dexterity;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getHealth()
			{
				return health;
			}
		public void setHealth(int health)
			{
				this.health = health;
			}
		public int getAttack()
			{
				return attack;
			}
		public void setAttack(int attack)
			{
				this.attack = attack;
			}
		public int getDefense()
			{
				return defense;
			}
		public void setDefense(int defense)
			{
				this.defense = defense;
			}
		public int getMagicDefense()
			{
				return magicDefense;
			}
		public void setMagicDefense(int magicDefense)
			{
				this.magicDefense = magicDefense;
			}
	}
