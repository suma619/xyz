import javax.swing.*;
class Menu2 extends JFrame
{
	public final void main(String s[])
	{
	JFrame menuframe;
	JMenu filemenu,editmenu,exitmenu;
	JMenuItem itemnew,itemopen,itempaste,itemcopy,itemclose;
	JMenuBar menubar=new JMenuBar();	
	

		// menuframe=new Jframe();
		// setJMenuBar(menubar);
		// menubar.setTitle("Jmenu demo");
		// setSize(300,300);
		// setVisible(true);


		filemenu=new JMenu("file");
		editmenu=new JMenu("edit");
		exitmenu=new JMenu("exit");
	
		itemnew=new JMenuItem("new");
		itemopen=new JMenuItem("open");
		itemclose=new JMenuItem("close");
		itempaste=new JMenuItem("paste");
		itemcopy=new JMenuItem("copy");	
		
		filemenu.add(itemnew);
		filemenu.add(itemopen);
		
		editmenu.add(itemcopy);
		editmenu.add(itempaste);
		
		exitmenu.add(itemclose);
		
		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(exitmenu);
		setJMenuBar(menubar);
		
		

		//Menu2 m1=new Menu2();	
		
	}
}