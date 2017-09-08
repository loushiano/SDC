package firstAgent;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import agentModule.Input;


public class GUI implements Observer{
	private JFrame frame; // The fame
	private Container contentPane; // Content Pane
	private GUIPanel circlePanel;//a panel in which we will draw shapes
	private Rectangle r;

	
	public GUI(){
		
		setFrame(new JFrame("SlotsScheduling"));
		circlePanel=new GUIPanel();
		frame.setResizable(true);
		frame.setContentPane(circlePanel);
		//Get the content pane from the frame.
		contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		frame.setPreferredSize(new Dimension(5000,5000));
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
	
	
	private void setFrame(JFrame jFrame) {
	frame=jFrame;
	
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg1 instanceof Rectangle){
			 r =(Rectangle) arg1;
			circlePanel.addRectangle(r);
			circlePanel.draw();
		}else if (arg1 instanceof Line){
			Line l =(Line) arg1;
			circlePanel.drawLine(l);
		}else if (arg1 instanceof String){
			if(arg1.equals("up")){
				r.addY(-5);
			}else {
				r.addX(5);
			}
			circlePanel.draw();
		}
		
	}

	public boolean notAhit() {
		return r.getX()<4800;
	}

	

}
