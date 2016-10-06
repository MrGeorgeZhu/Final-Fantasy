
public class Terrain
	{
		private char appearance;
		private boolean walkable;
		private String sentence1;
		private String sentence2;
		private double mobchance1;
		private double mobchance2;
		private double mobchance3;
		private double mobchance4;
		private double random;
		public Terrain (char a, boolean w, String s1, String s2, double m1, double m2, double m3, double m4, double r)
		{
			appearance = a;
			walkable = w;
			sentence1 = s1;
			sentence2 = s2;
			mobchance1 = m1;
			mobchance2 = m2;
			mobchance3 = m3;
			mobchance4 = m4;
			random = r;
		}
		public double getRandom()
			{
				return random;
			}
		public void setRandom(double random)
			{
				this.random = random;
			}
		public char getAppearance()
			{
				return appearance;
			}
		public void setAppearance(char appearance)
			{
				this.appearance = appearance;
			}
		public boolean isWalkable()
			{
				return walkable;
			}
		public void setWalkable(boolean walkable)
			{
				this.walkable = walkable;
			}
		public String getSentence1()
			{
				return sentence1;
			}
		public void setSentence1(String sentence1)
			{
				this.sentence1 = sentence1;
			}
		public String getSentence2()
			{
				return sentence2;
			}
		public void setSentence2(String sentence2)
			{
				this.sentence2 = sentence2;
			}
		public double getMobchance1()
			{
				return mobchance1;
			}
		public void setMobchance1(double mobchance1)
			{
				this.mobchance1 = mobchance1;
			}
		public double getMobchance2()
			{
				return mobchance2;
			}
		public void setMobchance2(double mobchance2)
			{
				this.mobchance2 = mobchance2;
			}
		public double getMobchance3()
			{
				return mobchance3;
			}
		public void setMobchance3(double mobchance3)
			{
				this.mobchance3 = mobchance3;
			}
		public double getMobchance4()
			{
				return mobchance4;
			}
		public void setMobchance4(double mobchance4)
			{
				this.mobchance4 = mobchance4;
			}
		
	}
