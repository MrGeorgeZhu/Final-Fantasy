import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Battle extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static JFrame frame = new JFrame();
		//static boolean enemyAlive = true;
		//static boolean playerAlive = true;
		public static void battle(ArrayList <Character> team, ArrayList <Mob> enemy, Object[] magic)
		{
			JOptionPane.showMessageDialog(frame, "A group of monsters approached you.");
			boolean enemyAlive = true;
			boolean playerAlive = true;
			do
				{
			for (int i = 0; i < team.size(); i++)
				{
					System.out.println(team.get(i).getName()+"    "+team.get(i).getHealth()+"/"+team.get(i).getMaxhealth()+"     "+team.get(i).getWeapon().getName()+"     "+team.get(i).getArmor().getName());
				}
				playerAlive = false;
			for (int i = 0; i < team.size(); i++)
				{
					Object[] option = {"Melee Attack","Skirmish Attack", "Magic", "Run"};
					if (team.get(i).getHealth() > 0)
						{
					String question = "What would " + team.get(i).getName() + " like to do?";
					int playerTurn = JOptionPane.showOptionDialog(frame, question, "Player Turn", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
					switch (playerTurn)
					{
						case 0:
								{
									String choice[] = new String[enemy.size()];
									for (int r = 0; r < enemy.size(); r++)
										{
											choice[r] = enemy.get(r).getName() + " " + enemy.get(r).getHealth();
										}
									int attackChoice = JOptionPane.showOptionDialog(frame, "Which one?", "Attack Choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
									int dealt = team.get(i).getMeleeAttack()+team.get(i).getWeapon().getMelee()+(int)(Math.random()*6-3) - enemy.get(attackChoice).getDefense();
									dealt = Math.max(0, dealt);
									double round = (double) enemy.get(attackChoice).getDexterity()/100.0;
									if (Math.random() > round)
										{
									enemy.get(attackChoice).setHealth(enemy.get(attackChoice).getHealth()- dealt);
								    JOptionPane.showMessageDialog(frame, "You dealt " + dealt + " damage to enemy.");
										}
									else
										{
											JOptionPane.showMessageDialog(frame, "You missed.");
										}
									if (enemy.get(attackChoice).getHealth() <= 0)
										{
											enemy.remove(attackChoice);
										}
									break;
								}
						case 1:
								{
									String choice[] = new String[enemy.size()];
									for (int r = 0; r < enemy.size(); r++)
										{
											choice[r] = enemy.get(r).getName() + " " + enemy.get(r).getHealth();
										}
									int attackChoice = JOptionPane.showOptionDialog(frame, "Which one?", "Attack Choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
									int dealt = team.get(i).getSkirmishAttack()+team.get(i).getWeapon().getSkirmish()+(int)(Math.random()*6-3) - enemy.get(attackChoice).getDefense();
									dealt = Math.max(0, dealt);
									double round = (double) enemy.get(attackChoice).getDexterity()/100.0;
									if (Math.random() > round)
										{
									enemy.get(attackChoice).setHealth(enemy.get(attackChoice).getHealth()- dealt);
								    JOptionPane.showMessageDialog(frame, "You dealt " + dealt + " damage to enemy with skirmish attack.");
										}
									else
										{
											JOptionPane.showMessageDialog(frame, "You missed.");
										}
									if (enemy.get(attackChoice).getHealth() <= 0)
										{
											enemy.remove(attackChoice);
										}
									break;
								}
						case 2:
								{
									if (magic[0] == null)
										{
											JOptionPane.showMessageDialog(frame, "You have no magic to use.");
											break;
										}
									String choice[] = new String[enemy.size()];
									for (int r = 0; r < enemy.size(); r++)
										{
											choice[r] = enemy.get(r).getName() + " " + enemy.get(r).getHealth();
										}
									int attackChoice = JOptionPane.showOptionDialog(frame, "Which one?", "Attack Choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
									int dealt = team.get(i).getMagicAttack()+team.get(i).getWeapon().getMagic()+(int)(Math.random()*6-3) - enemy.get(attackChoice).getMagicDefense();
									int magicChoice = JOptionPane.showOptionDialog(frame, "Which magic?", "Magic Choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, magic, magic[0]);
									if (enemy.get(attackChoice).getElement().equalsIgnoreCase("Ice"))
										{
											if (magicChoice == 0){dealt = dealt *2;}
											if (magicChoice == 2){dealt = dealt /2;}
										}
									if (enemy.get(attackChoice).getElement().equalsIgnoreCase("Thunder"))
										{
											if (magicChoice == 1){dealt = dealt *2;}
											if (magicChoice == 0){dealt = dealt /2;}
										}
									if (enemy.get(attackChoice).getElement().equalsIgnoreCase("Fire"))
										{
											if (magicChoice == 2){dealt = dealt *2;}
											if (magicChoice == 1){dealt = dealt /2;}
										}
									JOptionPane.showMessageDialog(frame, "You dealt " + dealt + " damage to enemy with magic attack.");
									enemy.get(attackChoice).setHealth(enemy.get(attackChoice).getHealth()- dealt);
									if (enemy.get(attackChoice).getHealth() <= 0)
										{
											enemy.remove(attackChoice);
										}
									break;
								}
						case 3:
								{
									enemyAlive = false;
									break;
								}
					}
						}
					if (team.get(i).getHealth() > 0)
						{
							playerAlive = true;
						}
					if (enemy.size() == 0 || !enemyAlive)
						{
							break;
						}
				}
			if (enemy.size() == 0 || !enemyAlive)
				{
					break;
				}
			enemyAlive = false;
			for (int i = 0; i < enemy.size(); i++)
				{
					int mobChoice = (int)(Math.random()*team.size());
					int damage = (int)(Math.random()*4)-2 + enemy.get(i).getAttack() - team.get(mobChoice).getDefense();
					damage = Math.max(0, damage);
					double round = (double) team.get(mobChoice).getDexterity()/100.0;
					if (Math.random() > round)
						{
					team.get(mobChoice).setHealth(team.get(mobChoice).getHealth()-damage);
					JOptionPane.showMessageDialog(frame, "Enemy" + enemy.get(i).getName() + " dealt "  + damage + " damage to " + team.get(mobChoice).getName()+ ".");
						}
					else
						{
							JOptionPane.showMessageDialog(frame, "Enemy Missed! (You lucky bastard.)");
						}
					if (enemy.get(i).getHealth() > 0)
						{
							enemyAlive = true;
						}
				}
				} while (playerAlive && enemyAlive);
			if (!playerAlive)
				{
					JOptionPane.showMessageDialog(frame, "Player all died.");
				}
			else if (!enemyAlive)
				{
					JOptionPane.showMessageDialog(frame, "You won the battle.");
				}
		}
		public static void toggleBattle(ArrayList <Character> team, Terrain block)
		{
			ArrayList <Mob> mob = Generate.generateMob();
			ArrayList <Mob> enemy1 = new ArrayList<Mob>();
			enemy1.add(mob.get(0));
			enemy1.add(mob.get(1));
			ArrayList <Mob> enemy2 = new ArrayList<Mob>();
			enemy2.add(mob.get(0));
			enemy2.add(mob.get(2));
			ArrayList <Mob> enemy3 = new ArrayList<Mob>();
			enemy3.add(mob.get(0));
			enemy3.add(mob.get(1));
			enemy3.add(mob.get(2));
			ArrayList <Mob> enemy4 = new ArrayList<Mob>();
			enemy4.add(mob.get(3));
		}
		/*public static void main(String[]arg)
		{
			ArrayList <Weapon> weapon = Generate.generateWeapon();
			ArrayList <Armor> armor = Generate.generateArmor();
			ArrayList <Character> team = new ArrayList <Character>();
			team.add(new Character("Steve", 40, 40, 5, 10, 3, 5, 8, 7, weapon.get(4), armor.get(1)));
			team.add(new Character("Elijah", 50, 50, 7, 5, 9, 8, 3, 9, weapon.get(7), armor.get(1)));
			team.add(new Character("Henry Y.", 60, 60, 12, 2, 6, 8, 2, 7, weapon.get(1), armor.get(1)));
			ArrayList <Mob> mob = Generate.generateMob();
			ArrayList <Mob> enemy = new ArrayList<Mob>();
			enemy.add(mob.get(0));
			enemy.add(mob.get(1));
			battle(team, enemy);
		}*/
	}
