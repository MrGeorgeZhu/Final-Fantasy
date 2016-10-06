import java.util.ArrayList;
public class Generate {
	//static ArrayList <Mob> mobList = new ArrayList <Mob>();
	public static ArrayList<Weapon> generateWeapon()
	{
		ArrayList <Weapon> weaponList = new ArrayList <Weapon>();
		weaponList.add(new Weapon ("Pen", 3, 0, 0));
		weaponList.add(new Weapon ("Steel Ruler", 7, 0, 0));
		weaponList.add(new Weapon ("Kichen Knife", 4, 0, 0));
		weaponList.add(new Weapon ("Scalpel", 9, 0, 0));
		weaponList.add(new Weapon ("Test Tube", 2, 8, 0));
		weaponList.add(new Weapon ("Bouncy Call", 1, 0, 4));
		weaponList.add(new Weapon ("Slingshot", 0, 0, 5));
		weaponList.add(new Weapon ("Lacrosse Stick", 4, 0, 7));
		return weaponList;
	}
	public static ArrayList<Armor> generateArmor()
	{
		ArrayList <Armor> armorList = new ArrayList <Armor>();
		armorList.add(new Armor ("School Uniform", 3, 0));
		armorList.add(new Armor ("White Gown", 5, 3));
		armorList.add(new Armor ("Security Vest", 7, 1));
		return armorList;
	}
	public static ArrayList <Mob> generateMob()
	{
		ArrayList <Mob> mobList = new ArrayList <Mob>();
		mobList.add(new Mob ("Angry Squirrel", 40, 10, 4, 0, 3, "Ice"));
		mobList.add(new Mob ("Huge Bat", 25, 12, 2, 1, 10, "Thunder"));
		mobList.add(new Mob ("Enchanted Book", 80, 20, 5, 10, 2, "Fire"));
		mobList.add(new Mob ("Slime", 30, 12, 50, 0, 0, "Thunder"));
		mobList.add(new Mob ("Mutated Terrorist", 300, 30, 6, 6, 5, "Ice"));
		return mobList;
	}
	public static Terrain[][] C1classroom()
	{
		Terrain c1[][] = new Terrain[11][9];
		//Terrain desk = new Terrain ('-', false, null, null, 0, 0, 0, 0);
		//Terrain walkway = new Terrain ('o', true, null, null, 0, 0, 0, 0);
		for (int r = 0; r < 11; r++)
			{
				for (int c = 0; c < 9; c++)
					{
						if (r == 0 || r == 10 || c == 0 || (c == 8 && r != 1)|| (r == 2 && c != 3) || (r == 4 && c != 3) || (r == 6 && c != 3) || (r == 8 && c != 3))
							{
								c1[r][c] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
							}
						else
							{
								c1[r][c] = new Terrain ('o', true, null, null, 0, 0, 0, 0, Math.random());
							}
					}
			}
		c1[9][1] = new Terrain('c', true, null, null, 0, 0, 0, 0, Math.random());
		//c1[9][1].setAppearance('c');
		return c1;
	}
	public static Terrain[][] cHallWay()
	{
		Terrain cH[][] = new Terrain[9][7];
		//Terrain wall = new Terrain ('-', false, null, null, 0, 0, 0, 0);
		//Terrain walkway = new Terrain ('o', true, null, null, 0.2, 0, 0, 0);
		//Terrain blocked = new Terrain ('o', true, "This way is blocked", null, 0.2, 0, 0, 0);
		for (int r = 0; r < 9; r++)
			{
				for (int c = 0; c < 7; c++)
					{
						if (r == 0||r == 8||c == 6)
							{
								cH[r][c] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
							}
						else
							{
								cH[r][c] = new Terrain ('o', true, null, null, 0, 0, 0, 0, Math.random());
							}
					}
			}
		cH[6][0] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		cH[1][2] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[1][3] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[1][4] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[2][5] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[3][5] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[4][5] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[5][5] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[6][5] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[7][2] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[7][3] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[7][4] = new Terrain ('o', true, "This way is blocked.", null, 0, 0, 0, 0, Math.random());
		cH[7][1].setAppearance('c');
		return cH;
	}
	public static Terrain[][] mainHallway()
	{
		Terrain mH[][] = new Terrain[10][10];
		//Terrain wall = new Terrain ('-', false, null, null, 0, 0, 0, 0);
		//Terrain walkway = new Terrain ('o', true, null, null, 0.3, 0.2, 0, 0);
		//Terrain blocked = new Terrain ('o', true, "This way is blocked", null, 0.3, 0.2, 0, 0);
		for (int r = 0; r < 10; r++)
			{
				for (int c = 0; c < 10; c++)
					{
						if ((r == 0 && r!=2 && r!=3 && r!=5) || r == 9 || c == 0 || (c == 9 && (r > 5 || r == 0)))
							{
								mH[r][c] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
							}
						else
							{
								mH[r][c] = new Terrain ('o', true, null, null, 0.05, 0.025, 0, 0, Math.random());
							}
					}
			}
		mH[2][7] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[2][6] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[1][6] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[4][7] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[4][6] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[4][5] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[4][4] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[3][4] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[2][4] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[1][4] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		mH[3][1] = new Terrain ('o', true, "This way is blocked", null, 0.15, 0.1, 0, 0, Math.random());
		mH[4][1] = new Terrain ('o', true, "This way is blocked", null, 0.15, 0.1, 0, 0, Math.random());
		mH[5][1] = new Terrain ('o', true, "This way is blocked", null, 0.15, 0.1, 0, 0, Math.random());
		new Terrain ('o', true, "This way is blocked", null, 0.15, 0.1, 0, 0, Math.random());
		mH[5][8].setAppearance('c');
		return mH;
	}
	public static Terrain[][] twohundhallway1()
	{
		Terrain twohund1[][] = new Terrain[9][6];
		//Terrain wall = new Terrain ('-', false, null, null, 0, 0, 0, 0);
		//Terrain walkway = new Terrain ('o', true, null, null, 0.3, 0.2, 0, 0);
		for (int r = 0; r < 9; r++)
			{
				for (int c = 0; c < 6; c++)
					{
						if (c == 0 || (c == 5 && r != 2))
							{
								twohund1[r][c] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
							}
						else
							{
								twohund1[r][c] = new Terrain ('o', true, null, null, 0.05, 0.025, 0, 0, Math.random());
							}
					}
			}
		twohund1[2][3] = new Terrain ('S', true, "Go to the classroom on the right.", null, 0, 0, 0, 0, Math.random());
		twohund1[8][2].setAppearance('c');
		return twohund1;
	}
	public static Terrain[][] classroom()
	{
		Terrain classroom[][] = new Terrain[10][10];
		//Terrain wall = new Terrain ('-', false, null, null, 0, 0, 0, 0);
		//Terrain walkway = new Terrain ('o', true, null, null, 0, 0, 0, 0);
		for (int r = 0; r < 10; r++)
			{
				for (int c = 0; c < 10; c++)
					{
						if (c == 0 || c == 9 || r == 0 || (r == 9 && c != 3) || ((r == 2 || r == 4 || r == 6) && c != 1 && c != 5))
							{
								classroom[r][c] =  new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
							}
						else
							{
								classroom[r][c] = new Terrain ('o', true, null, null, 0, 0, 0, 0, Math.random());
							}
					}
			}
		classroom[3][1] = new Terrain('N', true, "AP Biology Student: Don't worry, it's safe here.", "AP Biology Student: Feel free to go around.", 0, 0, 0, 0, Math.random());
		classroom[5][1] = new Terrain('N', true, "AP Biology Student: We used our biology skills to defend ourselves.", "AP Biology Student: We are so proud of ourselves.", 0, 0, 0, 0, Math.random());
		classroom[5][4] = new Terrain('N', true, "AP Biology Student: You might need some equipment.", "AP Biology Student: There are plenty of them around", 0, 0, 0, 0, Math.random());
		classroom[3][8] = new Terrain('N', true, "AP Biology Student: The only way out is through the library.", "AP Biology Student: But there are some hardcore mobs there.", 0, 0, 0, 0, Math.random());
		classroom[5][8] = new Terrain('N', true, "George: I think Henry is somewhere upstairs.", "George: You might want his help.", 0, 0, 0, 0, Math.random());
		classroom[8][3].setAppearance('c');
		return classroom;
	}
	public static Terrain[][] twohundTwo()
	{
		Terrain twohund2[][] = new Terrain[7][9];
		//Terrain wall = new Terrain ('-', false, null, null, 0, 0, 0, 0);
		//Terrain walkway = new Terrain ('o', true, null, null, 0, 0.2, 0.4, 0);
		for (int r = 0; r < 7; r++)
			{
				for (int c = 0; c < 9; c++)
					{
						if (r == 0 || c == 8 || (r >= 3 && c <= 3))
							{
								twohund2[r][c] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
							}
						else
							{
								twohund2[r][c] = new Terrain ('o', true, null, null, 0, 0, 0, 0, Math.random());
							}
					}
			}
		twohund2[1][4] = new Terrain('V', true, "Vincent: It's in credible! The wifi is still working!", "Vincent: I can still play world of tank here until the rescue team come.", 0, 0, 0, 0, Math.random());
		twohund2[1][5] = new Terrain('B', true, "Bill: It so tiring to kill all the mobs.", "Bill: But it's fun, too", 0, 0, 0, 0, Math.random());
		twohund2[6][4].setAppearance('c');
		return twohund2;
	}
	public static Terrain[][] outside()
	{
		Terrain outside[][] = new Terrain[11][8];
		//Terrain wall = new Terrain ('-', false, null, null, 0, 0, 0, 0);
		//Terrain walkway = new Terrain ('o', true, null, null, 0, 0.3, 0.5, 0);
		for (int r = 0; r < 11; r++)
			{
				for (int c = 0; c < 8; c++)
					{
						if (c == 0 || c == 7 || (r == 0 && c != 4 && c != 5) || (r == 10 && c != 1 && c != 2))
							{
								outside[r][c] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
							}
						else
							{
								outside[r][c] = new Terrain ('o', true, null, null, 0, 0.05, 0.1, 0, Math.random());
							}
					}
			}
		outside[10][1].setAppearance('c');
		return outside;
	}
	public static Terrain[][] sHallway()
	{
		Terrain sHallway[][] = new Terrain[10][8];
		//Terrain wall = new Terrain ('-', false, null, null, 0, 0, 0, 0);
		//Terrain walkway = new Terrain ('o', true, null, null, 0.3, 0.5, 0.2, 0);
		for (int r = 0; r < 10; r++)
			{
				for (int c = 0; c < 8; c++)
					{
						if (r == 0 || c == 0 || (r == 9 && c != 1 && c != 2) || (c == 7 && r != 8))
							{
								sHallway[r][c] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
							}
						else
							{
								sHallway[r][c] = new Terrain ('o', true, null, null, 0, 0.1, 0.15, 0, Math.random());
							}
					}
			}
		sHallway[8][1].setAppearance('c');
		return sHallway;
	}
	public static Terrain[][] library()
	{
		Terrain library[][] = new Terrain[12][12];
		//Terrain wall = new Terrain ('-', false, null, null, 0, 0, 0, 0);
		//Terrain walkway = new Terrain ('o', true, null, null, 0.3, 0.5, 0.2, 0);
		for (int r = 0; r < 12; r++)
			{
				for (int c = 0; c < 12; c++)
					{
						if (c == 0 || c == 11 || (c == 0 && r != 1) || (c == 11 && r != 9))
							{
								library[r][c] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
							}
						else
							{
								library[r][c] = new Terrain ('o', true, null, null, 0.05, 0.1, 0.075, 0, Math.random());
							}
					}
			}
		for (int i = 1; i < 7; i++)
			{
				library[i][5] = library[i][7] = library[i][9] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
			}
		library[2][2] = library[2][3] = library[3][2] = library[3][3] = library[5][2] = library[5][3] = library[6][2] = library[6][3] = new Terrain ('-', false, null, null, 0, 0, 0, 0, Math.random());
		library[10][9].setAppearance('c');
		return library;
	}
}
