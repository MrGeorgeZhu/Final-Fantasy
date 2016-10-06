import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
public class Play extends JFrame implements KeyListener
	{
		JLabel label;
		static ArrayList <Character> team = new ArrayList <Character>();
		static Object magic[] = {null, null, null};
		static int level = 0;
		static boolean happened1 = false;
		static boolean happened2 = false;
		static boolean happened3 = false;
		static boolean happened4 = false;
		static boolean happened5 = false;
		static boolean happened6 = false;
		static boolean happened7 = false;
		static Terrain c1[][] = Generate.C1classroom();
		static Terrain cHallWay[][] = Generate.cHallWay();
		static Terrain mainHall[][] = Generate.mainHallway();
		static Terrain twoHund1[][] = Generate.twohundhallway1();
		static Terrain classroom[][] = Generate.classroom();
		static Terrain twoHund2[][] = Generate.twohundTwo();
		static Terrain outside[][] = Generate.outside();
		static Terrain sHallway[][] = Generate.sHallway();
		static Terrain library[][] = Generate.library();
		static char last = 'o';
		public Play(String s)
			{
				super(s);
				JPanel p = new JPanel();
				label = new JLabel("Key Listener!");
		        p.add(label);
		        add(p);
		        addKeyListener(this);
		        setSize(200, 100);
		        setVisible(true);
			}
		@Override
		public void keyTyped(KeyEvent e){}
		@Override
		public void keyReleased(KeyEvent e) {}
		@Override
	    public void keyPressed(KeyEvent e) {
	    	if (e.getKeyCode() == KeyEvent.VK_RIGHT)
	    		{
	    			switch (level)
	    					{
	    						case 0: { moveRight(c1, last); print(c1); break;}
	    						case 1: { moveRight(cHallWay, last);print(cHallWay); break;}
	    						case 2: { moveRight(mainHall, last);print(mainHall); break;}
	    						case 3: { moveRight(twoHund1, last);print(twoHund1); break;}
	    						case 4: { moveRight(classroom, last);print(classroom); break;}
	    						case 5: { moveRight(twoHund2, last); print(twoHund2); break;}
	    						case 6: { moveRight(outside, last); print(outside); break;}
	    						case 7: { moveRight(sHallway, last); print(sHallway); break;}
	    						case 8: { moveRight(library, last); print(library); break;}
	    		}
	    		}
	    	if (e.getKeyCode() == KeyEvent.VK_LEFT)
	    		{
	    			switch (level)
	    					{
	    						case 0: { moveLeft(c1, last); print(c1); break;}
	    						case 1: { moveLeft(cHallWay, last);print(cHallWay); break;}
	    						case 2: { moveLeft(mainHall, last);print(mainHall); break;}
	    						case 3: { moveLeft(twoHund1, last);print(twoHund1); break;}
	    						case 4: { moveLeft(classroom, last);print(classroom); break;}
	    						case 5: { moveLeft(twoHund2, last); print(twoHund2); break;}
	    						case 6: { moveLeft(outside, last); print(outside); break;}
	    						case 7: { moveLeft(sHallway, last); print(sHallway); break;}
	    						case 8: { moveLeft(library, last); print(library); break;}
	    		}
	    		}
	    	if (e.getKeyCode() == KeyEvent.VK_UP)
	    		{
	    			switch (level)
	    			{
	    			case 0: { moveUp(c1, last); print(c1); break;}
					case 1: { moveUp(cHallWay, last);print(cHallWay); break;}
					case 2: { moveUp(mainHall, last);print(mainHall); break;}
					case 3: { moveUp(twoHund1, last);print(twoHund1); break;}
					case 4: { moveUp(classroom, last);print(classroom); break;}
					case 5: { moveUp(twoHund2, last); print(twoHund2); break;}
					case 6: { moveUp(outside, last); print(outside); break;}
					case 7: { moveUp(sHallway, last); print(sHallway); break;}
					case 8: { moveUp(library, last); print(library); break;}
	    			}
	    		}
	    	if (e.getKeyCode() == KeyEvent.VK_DOWN)
	    		{
	    			switch (level)
	    			{
	    			case 0:  moveDown(c1, last); print(c1); break;
					case 1:  moveDown(cHallWay, last);print(cHallWay); break;
					case 2:  moveDown(mainHall, last);print(mainHall); break;
					case 3:  moveDown(twoHund1, last);print(twoHund1); break;
					case 4:  moveDown(classroom, last);print(classroom); break;
					case 5:  moveDown(twoHund2, last); print(twoHund2); break;
					case 6:  moveDown(outside, last); print(outside); break;
					case 7:  moveDown(sHallway, last); print(sHallway); break;
					case 8:  moveDown(library, last); print(library); break;
	    			}
	    		}
	    }
		public static void main(String[]arg)
		{
			ImageIcon image = new ImageIcon("fifa.jpeg");
			JLabel label = new JLabel("", image, JLabel.CENTER);
			JPanel panel = new JPanel(new BorderLayout());
			panel.add( label, BorderLayout.CENTER );
			//JOptionPane.showMessageDialog(panel, "Final Fantasy");
			//JOptionPane.showMessageDialog(panel, "Final Fantasy", "Play", 0, image);
			print(c1);
			//System.out.println(level);
			new Play("Playing Game.");
		}
		public static void moveLeft(Terrain[][] place, char last)
		{
			boolean found = false;
			int row = -1; int column = -1;
			for (int r = 0; r < place.length; r++)
				{
					for (int c = 0; c < place[0].length; c++)
						{
							if (place[r][c].getAppearance() == 'c')
								{
									found = true;
									if (place[r][c-1].isWalkable())
										{
											row = r; column = c-1;
											place[r][c].setAppearance('o');
											place[r][c-1].setAppearance('c');
											battleDetection(place [r][c-1], team, magic);
											if (place[r][c-1].getSentence1()!= null)
												{
													System.out.println(place[r][c-1].getSentence1());
												}
											if (place[r][c-1].getSentence2() != null)
												{
													System.out.println(place[r][c-1].getSentence2());
												}
											break;
										}
									else
										{
											System.out.println("Can't go there.");
											break;
										}
								}
							if (found){break;}
						}
				}
			switchLevel();
			triggerEvent();
		}
		public static void moveRight(Terrain[][] place, char last)
			{
				boolean found = false;
				int row = -1; int column = -1;
				for (int r = 0; r < place.length; r++)
					{
						for (int c = 0; c < place[0].length; c++)
							{
								if (place[r][c].getAppearance() == 'c')
									{
										found = true;
										if (place[r][c+1].isWalkable())
											{
												row = r; column = c+1;
												place[r][c].setAppearance('o');
												place[r][c+1].setAppearance('c');
												battleDetection(place [r][c+1], team, magic);
												if (place[r][c+1].getSentence1()!= null)
													{
														System.out.println(place[r][c+1].getSentence1());
													}
												if (place[r][c+1].getSentence2() != null)
													{
														System.out.println(place[r][c+1].getSentence2());
													}
												break;
											}
										else
											{
												System.out.println("Can't go there.");
												break;
											}
									}
								if (found){break;}
							}
					}
				switchLevel();
				triggerEvent();
			}
		public static void moveUp(Terrain[][] place, char last)
			{
				boolean found = false;
				int row = -1; int column = -1;
				for (int r = 0; r < place.length; r++)
					{
						for (int c = 0; c < place[0].length; c++)
							{
								if (place[r][c].getAppearance() == 'c')
									{
										found = true;
										if (place[r-1][c].isWalkable())
											{
												row = r-1; column = c;
												place[r][c].setAppearance('o');
												place[r-1][c].setAppearance('c');
												battleDetection(place [r-1][c], team, magic);
												if (place[r-1][c].getSentence1()!= null)
													{
														System.out.println(place[r-1][c].getSentence1());
													}
												if (place[r-1][c].getSentence2() != null)
													{
														System.out.println(place[r-1][c].getSentence2());
													}
												break;
											}
										else
											{
												System.out.println("Can't go there.");
												break;
											}
									}
								if (found){break;}
							}
					}
				switchLevel();
				triggerEvent();
			}
		public static void moveDown(Terrain[][] place, char last)
			{
				boolean found = false;
				int row = -1; int column = -1;
				for (int r = 0; r < place.length; r++)
					{
						for (int c = 0; c < place[0].length; c++)
							{
								if (place[r][c].getAppearance() == 'c')
									{
										found = true;
										if (place[r+1][c].isWalkable())
											{
												row = r+1; column = c;
												place[r][c].setAppearance('o');
												place[r+1][c].setAppearance('c');
												battleDetection(place [r+1][c], team, magic);
												if (place[r+1][c].getSentence1()!= null)
													{
														System.out.println(place[r+1][c].getSentence1());
													}
												if (place[r+1][c].getSentence2() != null)
													{
														System.out.println(place[r+1][c].getSentence2());
													}
												break;
											}
										else
											{
												System.out.println("Can't go there.");
												break;
											}
									}
								if (found){break;}
							}
					}
				switchLevel();
				triggerEvent();
			}
		public static void battleDetection(Terrain chunk, ArrayList <Character> team, Object[] magic)
		{
			ArrayList <Mob> enemyList = Generate.generateMob();
			ArrayList <Mob> mobb = new ArrayList <Mob>();
			if (Math.random() < chunk.getMobchance1())
				{
					mobb.add(enemyList.get(0));
					mobb.add(enemyList.get(1));
					Battle.battle(team, mobb, magic);
				}
			else if (Math.random() < chunk.getMobchance2())
				{
					mobb.add(enemyList.get(0));
					mobb.add(enemyList.get(2));
					Battle.battle(team, mobb, magic);
				}
			else if (Math.random() < chunk.getMobchance3())
				{
					mobb.add(enemyList.get(0));
					mobb.add(enemyList.get(1));
					mobb.add(enemyList.get(2));
					Battle.battle(team, mobb, magic);
				}
			else if (Math.random() < chunk.getMobchance4())
				{
					mobb.add(enemyList.get(4));
					Battle.battle(team, mobb, magic);
				}
		}
		public static void print(Terrain[][] area)
		{
			for (int r = 0; r < area.length; r++)
				{
					for (int c = 0; c < area[0].length; c++)
						{
							System.out.print(area[r][c].getAppearance()+" ");
						}
					System.out.println();
				}
		}
		public static void switchLevel()
		{
			//System.out.println(c1[1][7].getAppearance());
			if (level == 0 && c1[1][7].getAppearance() == 'c')
				{
					System.out.println("hello");
					level = 1;
				}
			else if (level == 1 && (cHallWay[1][1].getAppearance() == 'c' || cHallWay[2][1].getAppearance() == 'c' || cHallWay[3][1].getAppearance() == 'c'|| cHallWay[4][1].getAppearance() == 'c'))
				{
					System.out.println("hello"+level);
					level = 2;
				}
			else if (level == 2 && (mainHall[1][2].getAppearance() == 'c' || mainHall[1][3].getAppearance() == 'c' || mainHall[1][5].getAppearance() == 'c'))
				{
					System.out.println("hello"+level);
					level = 3;
				}
			else if (level == 3 && (twoHund1[1][1].getAppearance() == 'c' || twoHund1[1][2].getAppearance() == 'c' || twoHund1[1][3].getAppearance() == 'c' || twoHund1[1][4].getAppearance() == 'c'))
				{
					System.out.println("hello"+level);
					level = 5;
				}
			else if (level == 3 && twoHund1[2][4].getAppearance() == 'c')
				{
					System.out.println("hello0"+level);
					level = 4;
				}
			else if (level == 4 && classroom[9][3].getAppearance() == 'c')
				{
					level = 3;
				}
			else if (level == 5 && (twoHund2[1][1].getAppearance() == 'c' || twoHund2[2][1].getAppearance() == 'c'))
				{
					level = 6;
				}
			else if (level == 6 && (outside[1][4].getAppearance() == 'c' || outside[1][5].getAppearance() == 'c'))
				{
					level = 7;
				}
			else if (level == 7 && sHallway[8][6].getAppearance() == 'c')
				{
					level = 8;
				}
		}
		public static void triggerEvent()
		{
			System.out.println(level);
			if (!happened1 && level == 0)
				{
					ArrayList <Mob> mobb = new ArrayList <Mob>();
					mobb.add(new Mob ("Angry Squirrel", 40, 10, 4, 0, 3, "Ice"));
					Events.specialEvent1(team, mobb);
					happened1 = true;
				}
			if (!happened2 && level == 1)
				{
					Events.specialEvent2(team);
					happened2 = true;
				}
			if (!happened3 && level == 4)
				{
					Events.specialEvent3(team, magic);
					happened3 = true;
				}
			if (!happened4 && level == 5)
				{
					Events.specialEvent4(team);
					happened4 = true;
				}
			if (!happened5 && level == 7)
				{
					Events.specialEvent5(team);
					happened5 = true;
				}
			if (!happened6 && level == 8 && library[1][1].getAppearance() == 'c')
				{
					ArrayList <Mob> mobb = new ArrayList <Mob>();
					Events.specialevent6(team, mobb, magic);
					happened6 = true;
				}
		}
	}
