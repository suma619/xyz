import javax.swing.*;
class MenuExample extends JFrame
{
	JFrame menuframe;
	JMenu filemenu,editmenu,exitmenu;
	JMenuItem itemnew,itemopen,itempaste,itemcopy,itemclose;
	JMenuBar menubar;	
	public MenuExample()
	{
		menubar=new JMenuBar();

		filemenu=new JMenu("file");
		editmenu=new JMenu("edit");
		exitmenu=new JMenu("exit");
	
		itemnew=new JMenuItem();
		itemopen=new JMenuItem();
		itemclose=new JMenuItem();
		itempaste=new JMenuItem();
		itemcopy=new JMenuItem();	
		
		filemenu.add(itemnew);
		filemenu.add(itemopen);
		
		editmenu.add(itemcopy);
		editmenu.add(itempaste);
		
		exitmenu.add(itemclose);
		
		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(exitmenu);
		
		setJMenuBar(menubar);
		setTitle("Jmenu demo");
		setSize(300,300);
		setVisible(true);	
		
	}
	public static void main(String a[])
	{
		MenuExample mefude=new MenuExample();
	}
}