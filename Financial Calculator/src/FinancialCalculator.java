// EmptyFrame.java
//Victor Chan, Manik Khurana
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
class EmptyFrame extends JFrame{
  public EmptyFrame(){
  }

  public static void main(String[] args){
    JFrame Calculator = new EmptyFrame();
    Calculator.setTitle("Calculator");
    Calculator.setSize(650,450);
    Calculator.setLocationRelativeTo(null);
    Calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
   
    JPanel panel = new JPanel();
    Calculator.add(panel);
    panel.setLayout(null); 
    
    final JLabel Title = new JLabel("Financial Calculator");//Title
    Title.setBounds(80,5,400,40);
    Title.setFont(new Font("Sans Serif",0,40));
    panel.add(Title);
    
    final JLabel Error = new JLabel("Error");//Label for error message
    Error.setBounds(500,75,100,40);
    Error.setFont(new Font("Sans Serif",0,40));
    Error.setVisible(false);
    panel.add(Error);
    
    final JLabel PresentValue = new JLabel("Present Value");
    PresentValue.setBounds(20,50,250,30);
    PresentValue.setFont(new Font("Sans Serif",0,20));
    panel.add(PresentValue);
    
    final JTextArea PVArea = new JTextArea();
    PVArea.setLineWrap(true);
    PVArea.setWrapStyleWord(false);
    PVArea.setBounds(20,80,250,30);
    panel.add(PVArea);
    
    JButton PVClear = new JButton("Clear");
    PVClear.setBounds(300, 80, 100, 30);
    PVClear.setFont(new Font("Sans Serif",0,20));
    panel.add(PVClear);
    
    final JLabel PIR = new JLabel("Period Interest Rate");
    PIR.setBounds(20,120,250,30);
    PIR.setFont(new Font("Sans Serif",0,20));
    panel.add(PIR);
    
    final JTextArea PIRArea =new JTextArea();
    PIRArea.setLineWrap(true);
    PIRArea.setWrapStyleWord(false);
    PIRArea.setBounds(20,150,250,30);
    panel.add(PIRArea);
    
    JButton PIRClear = new JButton("Clear");
    PIRClear.setBounds(300, 150, 100, 30);
    PIRClear.setFont(new Font("Sans Serif",0,20));
    panel.add(PIRClear);
    
    final JLabel NumberOfPeriods = new JLabel("Number of Periods");
    NumberOfPeriods.setBounds(20,190,250,30);
    NumberOfPeriods.setFont(new Font("Sans Serif",0,20));
    panel.add(NumberOfPeriods);
    
    final JTextArea NoPArea =new JTextArea();
    NoPArea.setLineWrap(true);
    NoPArea.setWrapStyleWord(false);
    NoPArea.setBounds(20,220,250,30);
    panel.add(NoPArea);
    
    JButton NoPClear = new JButton("Clear");
    NoPClear.setBounds(300, 220, 100, 30);
    NoPClear.setFont(new Font("Sans Serif",0,20));
    panel.add(NoPClear);
    
    final JLabel PeriodPayment = new JLabel("Period Payment");
    PeriodPayment.setBounds(20,260,250,30);
    PeriodPayment.setFont(new Font("Sans Serif",0,20));
    panel.add(PeriodPayment);
    
    final JTextArea PPArea =new JTextArea();
    PPArea.setLineWrap(true);
    PPArea.setWrapStyleWord(false);
    PPArea.setBounds(20,290,250,30);
    panel.add(PPArea);
    
    JButton PPClear = new JButton("Clear");
    PPClear.setBounds(300, 290, 100, 30);
    PPClear.setFont(new Font("Sans Serif",0,20));
    panel.add(PPClear);
    
    final JLabel FutureValue = new JLabel("Future Value");
    FutureValue.setBounds(20,330,250,30);
    FutureValue.setFont(new Font("Sans Serif",0,20));
    panel.add(FutureValue);
    
    final JTextArea FVArea =new JTextArea();
    FVArea.setLineWrap(true);
    FVArea.setWrapStyleWord(false);
    FVArea.setBounds(20,360,250,30);
    panel.add(FVArea);
    
    JButton FVClear = new JButton("Clear");
    FVClear.setBounds(300, 360, 100, 30);
    FVClear.setFont(new Font("Sans Serif",0,20));
    panel.add(FVClear);
    
    JButton calculate = new JButton("Calculate");//Calculate button
    calculate.setBounds(450, 200, 175, 50);
    calculate.setFont(new Font("Sans Serif",0,30));
    calculate.setBackground(Color.blue);
    calculate.setForeground(Color.yellow);
    panel.add(calculate);
    
    JButton clearall = new JButton("Clear All");//to clear all textareas and error messages
    clearall.setBounds(450, 275, 175, 50);
    clearall.setFont(new Font("Sans Serif",0,20));
    panel.add(clearall);
    
    JButton quit = new JButton("Quit");//to quit
    quit.setBounds(450, 350, 175, 50);
    quit.setFont(new Font("Sans Serif",0,30));
    panel.add(quit);
    
    Calculator.setVisible(true);
    
    quit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
            System.exit(0);
       }
    });
    
    clearall.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
            PVArea.setText(null);
            PIRArea.setText(null);
            NoPArea.setText(null);
            PPArea.setText(null);
            FVArea.setText(null);
            PVArea.setBackground(Color.white);
            PIRArea.setBackground(Color.white);
            NoPArea.setBackground(Color.white);
            PPArea.setBackground(Color.white);
            FVArea.setBackground(Color.white);
            Error.setVisible(false);
       }
    });
    
    PVClear.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
            PVArea.setText(null);
            PVArea.setBackground(Color.white);
       }
    });
    
    PIRClear.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
            PIRArea.setText(null);
            PIRArea.setBackground(Color.white);
       }
    });
    
    NoPClear.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
            NoPArea.setText(null);
            NoPArea.setBackground(Color.white);
       }
    });
    
    PPClear.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
            PPArea.setText(null);
            PPArea.setBackground(Color.white);
       }
    });
    
    FVClear.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
            FVArea.setText(null);
            FVArea.setBackground(Color.white);
       }
    });
    
    calculate.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	if (PVArea.getText().length()==0 && PIRArea.getText().length()!=0 && NoPArea.getText().length()!=0 && PPArea.getText().length()!=0 && FVArea.getText().length()!=0){
            	double PIR = Double.parseDouble(PIRArea.getText());
            	double NoP = Double.parseDouble(NoPArea.getText());
            	double FV = Double.parseDouble(FVArea.getText());
        		double PV1 = FV/Math.pow(1+PIR, NoP);
        		double PV2 = 100*PV1;
        		double PV3 = Math.round(PV2);
        		double PV = PV3/100;
        		PVArea.setText(Double.toString(PV));
        		PVArea.setBackground(Color.yellow);
                PIRArea.setBackground(Color.white);
                NoPArea.setBackground(Color.white);
                PPArea.setBackground(Color.white);
                FVArea.setBackground(Color.white);
                Error.setVisible(false);
                //this if statement is invoked only if PVArea is the only text area without anything
        	}
        	else if(PVArea.getText().length()!=0 && PIRArea.getText().length()==0 && NoPArea.getText().length()!=0 && PPArea.getText().length()!=0 && FVArea.getText().length()!=0){
            	double PV = Double.parseDouble(PVArea.getText());
            	double NoP = Double.parseDouble(NoPArea.getText());
            	double FV = Double.parseDouble(FVArea.getText());
        		double PIR1 = Math.pow(FV/PV, 1/NoP)-1;
        		double PIR2 = 100*PIR1;
        		double PIR3 = Math.round(PIR2);
        		double PIR = PIR3/100;
        		PIRArea.setText(Double.toString(PIR));
        		PVArea.setBackground(Color.white);
                PIRArea.setBackground(Color.yellow);
                NoPArea.setBackground(Color.white);
                PPArea.setBackground(Color.white);
                FVArea.setBackground(Color.white);
                Error.setVisible(false);
              //this if statement is invoked only if PIRArea is the only text area without anything
        	}
        	else if(PVArea.getText().length()!=0 && PIRArea.getText().length()!=0 && NoPArea.getText().length()==0 && PPArea.getText().length()!=0 && FVArea.getText().length()!=0){
            	double PV = Double.parseDouble(PVArea.getText());
            	double PIR = Double.parseDouble(PIRArea.getText());
            	double FV = Double.parseDouble(FVArea.getText());
        		double NoP1 = (Math.log(FV/PV))/(Math.log(PIR+1));
        		double NoP2 = 100*NoP1;
        		double NoP3 = Math.round(NoP2);
        		double NoP = NoP3/100;
        		NoPArea.setText(Double.toString(NoP));
        		PVArea.setBackground(Color.white);
                PIRArea.setBackground(Color.white);
                NoPArea.setBackground(Color.yellow);
                PPArea.setBackground(Color.white);
                FVArea.setBackground(Color.white);
        		Error.setVisible(false);
        		//this if statement is invoked only if NoPArea is the only text area without anything
        	}
        	else if(PVArea.getText().length()!=0 && PIRArea.getText().length()!=0 && NoPArea.getText().length()!=0 && PPArea.getText().length()==0 && FVArea.getText().length()!=0){
            	double PV = Double.parseDouble(PVArea.getText());
            	double PIR = Double.parseDouble(PIRArea.getText());
            	double NoP = Double.parseDouble(NoPArea.getText());
            	double PP1 = PV/((1/PIR)-(1/(PIR*(Math.pow(1+PIR, NoP)))));
            	double PP2 = 100*PP1;
            	double PP3 = Math.round(PP2);
            	double PP = PP3/100;
            	PPArea.setText(Double.toString(PP));
        		PVArea.setBackground(Color.white);
                PIRArea.setBackground(Color.white);
                NoPArea.setBackground(Color.white);
                PPArea.setBackground(Color.yellow);
                FVArea.setBackground(Color.white);
                Error.setVisible(false);
              //this if statement is invoked only if PPArea is the only text area without anything
        	}
        	else if(PVArea.getText().length()!=0 && PIRArea.getText().length()!=0 && NoPArea.getText().length()!=0 && PPArea.getText().length()!=0 && FVArea.getText().length()==0){
            	double PV = Double.parseDouble(PVArea.getText());
            	double PIR = Double.parseDouble(PIRArea.getText());
            	double NoP = Double.parseDouble(NoPArea.getText());
            	double FV1 = PV*(Math.pow(1+PIR, NoP));
            	double FV2 = 100*FV1;
            	double FV3 = Math.round(FV2);
            	double FV = FV3/100;
            	FVArea.setText(Double.toString(FV));
        		PVArea.setBackground(Color.white);
                PIRArea.setBackground(Color.white);
                NoPArea.setBackground(Color.white);
                PPArea.setBackground(Color.white);
                FVArea.setBackground(Color.yellow);
                Error.setVisible(false);
              //this if statement is invoked only if FVArea is the only text area without anything
        	}
        	else Error.setVisible(true);//for everything else
	   }
    });

  }
}