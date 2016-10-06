import java.util.Scanner;
import java.util.ArrayList;
public class Events
	{
		public static void delay(int i)
			{
	        try
					{
					Thread.sleep(i);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
		public static void specialEvent1(ArrayList <Character> team, ArrayList <Mob> mobb)
		{
			ArrayList <Weapon> weapon = Generate.generateWeapon();
			ArrayList <Armor> armor = Generate.generateArmor();
			Scanner userInput = new Scanner (System.in);
			String dialog1 = "???: Eh...";
			String dialog2 = "Steve: What time is it now?";
			String dialog3 = "Steve: I can't believe I fell asleep in Java Programing class.";
			String dialog4 = "Steve: Where's everyone?";
			String dialog5 = "Steve: What happened to this classroom?";
			String dialog6 = "Steve: Oh! Hi there, little squirrel!";
			String dialog7 = "Steve: Ah! You bit me! You little son of a *****!";
			team.add(new Character("Steve", 40, 40, 5, 10, 3, 5, 8, 7, weapon.get(2), armor.get(0)));
			for (int i = 0; i < dialog1.length(); i++)
				{
					System.out.print(dialog1.substring(i, i+1));
					delay(50);
				}
			System.out.println();
			String fake1 = userInput.nextLine();
			for (int i = 0; i < dialog2.length(); i++)
				{
					System.out.print(dialog2.substring(i, i+1));
					delay(50);
				}
			System.out.println();
			String fake2 = userInput.nextLine();
			for (int i = 0; i < dialog3.length(); i++)
				{
					System.out.print(dialog3.substring(i, i+1));
					delay(50);
				}
			System.out.println();
			String fake3 = userInput.nextLine();
			for (int i = 0; i < dialog4.length(); i++)
				{
					System.out.print(dialog4.substring(i, i+1));
					delay(50);
				}
			System.out.println();
			String fake4 = userInput.nextLine();
			for (int i = 0; i < dialog5.length(); i++)
				{
					System.out.print(dialog5.substring(i, i+1));
					delay(50);
				}
			System.out.println();
			String fake5 = userInput.nextLine();
			for (int i = 0; i < dialog6.length(); i++)
				{
					System.out.print(dialog6.substring(i, i+1));
					delay(50);
				}
			System.out.println();
			String fake6 = userInput.nextLine();
			for (int i = 0; i < dialog7.length(); i++)
				{
					System.out.print(dialog7.substring(i, i+1));
					delay(50);
				}
			System.out.println();
			String fake7 = userInput.nextLine();
			Object mag[] = {null, null, null};
			Battle.battle(team, mobb, mag);
		}
	public static void specialEvent2(ArrayList <Character> team)
	{
		ArrayList <Weapon> weapon = Generate.generateWeapon();
		ArrayList <Armor> armor = Generate.generateArmor();
		Scanner userInput = new Scanner (System.in);
		String dialog1 = "Elijah: Here you are Steve.";
		String dialog2 = "Steve: Elijah! What happened?";
		String dialog3 = "Elijah: Dunno, some sort of terrorist attack.";
		String dialog4 = "Steve: Well then, let's find our way out of here.";
		String dialog5 = "Elijah joined the team.";
		team.add(new Character("Elijah", 50, 50, 7, 5, 9, 8, 3, 9, weapon.get(5), armor.get(0)));
		for (int i = 0; i < dialog1.length(); i++)
			{
				System.out.print(dialog1.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake1 = userInput.nextLine();
		for (int i = 0; i < dialog2.length(); i++)
			{
				System.out.print(dialog2.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake2 = userInput.nextLine();
		for (int i = 0; i < dialog3.length(); i++)
			{
				System.out.print(dialog3.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake3 = userInput.nextLine();
		for (int i = 0; i < dialog4.length(); i++)
			{
				System.out.print(dialog4.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake4 = userInput.nextLine();
		for (int i = 0; i < dialog5.length(); i++)
			{
				System.out.print(dialog5.substring(i, i+1));
				delay(200);
			}
		System.out.println();
	}
	public static void specialEvent3 (ArrayList <Character> team, Object[] magic)
	{
		for (int i = 0; i < team.size(); i++)
			{
				team.get(i).setHealth(team.get(i).getMaxhealth());
			}
		Scanner userInput = new Scanner (System.in);
		ArrayList <Weapon> weapon = Generate.generateWeapon();
		ArrayList <Armor> armor = Generate.generateArmor();
		String dialog1 = "Mrs. Ulmer: Welcome to the AP Biology class. I'm glad that you guys made it";
		String dialog2 = "Mrs. Ulmer: The terrorists used a biological weapon on us, but they forgot we had a biology class here.";
		String dialog3 = "Mrs. Ulmer: Most of us are just taking a break here since we worked hard against those mutated animals.";
		String dialog4 = "Mrs. Ulmer: If you can find the way out for us, it would be awesome.";
		String dialog5 = "Mrs. Ulmer: And feel free to take some supplies.";
		String dialog6 = "Weapon and armor upgraded.";
		team.get(0).setWeapon(weapon.get(4));
		team.get(0).setArmor(armor.get(1));
		team.get(1).setWeapon(weapon.get(6));
		team.get(1).setArmor(armor.get(1));
		//Object mag[] = {"Fire", "Ice", "Thunder"};
		magic[0] = "Fire";
		magic[1] = "Ice";
		magic[2] = "Thunder";
		for (int i = 0; i < dialog1.length(); i++)
			{
				System.out.print(dialog1.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake1 = userInput.nextLine();
		for (int i = 0; i < dialog2.length(); i++)
			{
				System.out.print(dialog2.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake2 = userInput.nextLine();
		for (int i = 0; i < dialog3.length(); i++)
			{
				System.out.print(dialog3.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake3 = userInput.nextLine();
		for (int i = 0; i < dialog4.length(); i++)
			{
				System.out.print(dialog4.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake4 = userInput.nextLine();
		for (int i = 0; i < dialog5.length(); i++)
			{
				System.out.print(dialog5.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake5 = userInput.nextLine();
		for (int i = 0; i < dialog6.length(); i++)
			{
				System.out.print(dialog6.substring(i, i+1));
				delay(50);
			}
		System.out.println();
	}
	public static void specialEvent4(ArrayList <Character> team)
	{
		Scanner userInput = new Scanner (System.in);
		ArrayList <Weapon> weapon = Generate.generateWeapon();
		ArrayList <Armor> armor = Generate.generateArmor();
		String dialog1 = "Henry: Here you are Steve.";
		String dialog2 = "Steve: I need your help Henry.";
		String dialog3 = "Henry: I need YOUR help.";
		String dialog4 = "Henry: The only way out is through the library.";
		String dialog5 = "Henry: But there are some enemies that even I can't defeat.";
		String dialog6 = "Henry: You and your friend can give me a hand. Let's go.";
		String dialog7 = "Henry joined the team.";
		team.add(new Character("Henry Y.", 60, 60, 12, 2, 6, 8, 2, 7, weapon.get(3), armor.get(2)));
		for (int i = 0; i < dialog1.length(); i++)
			{
				System.out.print(dialog1.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake1 = userInput.nextLine();
		for (int i = 0; i < dialog2.length(); i++)
			{
				System.out.print(dialog2.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake2 = userInput.nextLine();
		for (int i = 0; i < dialog3.length(); i++)
			{
				System.out.print(dialog3.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake3 = userInput.nextLine();
		for (int i = 0; i < dialog4.length(); i++)
			{
				System.out.print(dialog4.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake4 = userInput.nextLine();
		for (int i = 0; i < dialog5.length(); i++)
			{
				System.out.print(dialog5.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake5 = userInput.nextLine();
		for (int i = 0; i < dialog6.length(); i++)
			{
				System.out.print(dialog6.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake6 = userInput.nextLine();
		for (int i = 0; i < dialog7.length(); i++)
			{
				System.out.print(dialog7.substring(i, i+1));
				delay(200);
			}
		System.out.println();
	}
	public static void specialEvent5(ArrayList <Character> team)
	{
		for (int i = 0; i < team.size(); i++)
			{
				team.get(i).setHealth(team.get(i).getMaxhealth());
			}
		Scanner userInput = new Scanner (System.in);
		String dialog1 = "Mrs. Niblack: Fair well, guys. Make the Lord be with you.";
		String dialog2 = "Received the blessing, defence increased.";
		for (int i = 0; i < dialog1.length(); i++)
			{
				System.out.print(dialog1.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake1 = userInput.nextLine();
		for (int i = 0; i < dialog2.length(); i++)
			{
				System.out.print(dialog2.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		for (int i = 0; i < team.size(); i++)
			{
				team.get(i).setDefense(team.get(i).getDefense()*2);
				team.get(i).setMagicDefense(team.get(i).getMagicDefense()*2);
			}
	}
	public static void specialevent6(ArrayList <Character> team, ArrayList <Mob> mobb, Object[] magic)
	{
		Scanner userInput = new Scanner(System.in);
		ArrayList <Mob> mob = Generate.generateMob();
		mobb.add(mob.get(4));
		String dialog1 = "Terrorist: So you finally made it...";
		String dialog2 = "Henry: Who's this guy, never seen him before.";
		String dialog3 = "Elijah: He looks stupid, I think he is one of the terrorists.";
		String dialog4 = "Terrorist: Hey! Listen to me!";
		String dialog5 = "Steve: Well then, let's take him out";
		for (int i = 0; i < dialog1.length(); i++)
			{
				System.out.print(dialog1.substring(i, i+1));
				delay(200);
			}
		System.out.println();
		String fake1 = userInput.nextLine();
		for (int i = 0; i < dialog2.length(); i++)
			{
				System.out.print(dialog2.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake2 = userInput.nextLine();
		for (int i = 0; i < dialog3.length(); i++)
			{
				System.out.print(dialog3.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake3 = userInput.nextLine();
		for (int i = 0; i < dialog4.length(); i++)
			{
				System.out.print(dialog4.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake4 = userInput.nextLine();
		for (int i = 0; i < dialog5.length(); i++)
			{
				System.out.print(dialog5.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		Battle.battle(team, mobb, magic);
		specialEvent7();
	}
	public static void specialEvent7()
	{
		Scanner userInput = new Scanner (System.in);
		String dialog1 = "The terrorist is dead, you exited the building safely.";
		String dialog2 = "Soon the rescue team came and saved us all.";
		String dialog3 = "Some people get hurt, but because of the stupidity of the terrorists, nobody was killed.";
		String dialog4 = "But you all get a nice 7 day off.";
		for (int i = 0; i < dialog1.length(); i++)
			{
				System.out.print(dialog1.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake1 = userInput.nextLine();
		for (int i = 0; i < dialog2.length(); i++)
			{
				System.out.print(dialog2.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake2 = userInput.nextLine();
		for (int i = 0; i < dialog3.length(); i++)
			{
				System.out.print(dialog3.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		String fake3 = userInput.nextLine();
		for (int i = 0; i < dialog4.length(); i++)
			{
				System.out.print(dialog4.substring(i, i+1));
				delay(50);
			}
		System.out.println();
		System.exit(0);
	}
	}
