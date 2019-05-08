import java.applet.*;
import java.awt.*;
/*<applet code="appletdemo" width=300 height=200>
</applet>*/
public class appletdemo extends Applet
{
	TextField txt1,txt2,txt3,txt4;
	txt1=new TextField(8);
	txt2=new TextField(8);
	txt3=new TextField(8);
	txt4=new TextField(8);
	add(txt1);
	add(txt2);
	add(txt3);
	add(txt4);
	txt1.setText("0");
	txt2.setText("0");
	txt3.setText("0");
}
public void Paint(Graphics g)
{
	int x=0,y=0,z=0,t=0;
	String s1,s2,s3,s;
	g.drawString("CUSTOMER ID IN BOX1",20,20);
	s1=txt1.getText();
	x=Integer.parseInt(s1);
	
	s2=txt2.getText();
	y=Integer.parseInt(s2);
	
	s3=txt3.getText();
	z=Integer.parseInt(s2);
	t=x+y+z;
	s=String.valueOf(t);
	//txt4.setText();
	g.drawString("sum is",10,75);
	g.drawString(t,50,80);
}
public boolean Action(Event event,Object object)
{
	repaint();
	return true;
}

