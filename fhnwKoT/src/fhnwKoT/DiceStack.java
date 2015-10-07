import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DiceStack extends JFrame implements ActionListener {

	private int noOfDices = 6;
	private Dice[] dices = new Dice[noOfDices];
	private JButton[] diceButtons = new JButton[noOfDices];
	private JButton roll = new JButton("Würfeln");

	public DiceStack() {
		for (int i = 0; i < noOfDices; i++) {
			dices[i] = new Dice();
			diceButtons[i] = new JButton();
			diceButtons[i].addActionListener(this);
		}

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		FlowLayout fl = new FlowLayout();
		panel.setLayout(fl);

		for (int i = 0; i < this.dices.length; i++) {
			panel.add(this.diceButtons[i]);
			this.diceButtons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		this.updateDiceIcons();
		roll.addActionListener(this);
		panel.add(roll);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		DiceStack ds = new DiceStack();

	}

	public void rollAll() {

		for (Dice d : this.dices) {
			if (d.getStatus()) {
				d.roll();
			}
		}
		this.updateDiceIcons();
		this.result();

	}

	public void result() {
		int[] result = new int[Dice.GenericDiceValues.values().length];
		for(int i = 0; i < Dice.GenericDiceValues.values().length; i++){
			result[i] = this.getNoOfSameFaces(Dice.GenericDiceValues.values()[i]);
		}
		for(int r: result){
			System.out.println(r + "|");
		}
	}

	public int getNoOfSameFaces(Dice.GenericDiceValues gv) {
		int result = 0;
		for (Dice d : dices) {
			if (d.getValue() == gv && d.getNumericStatus()) {
				result++;
			}
		}
		return result;
	}

	public void updateDiceIcons() {
		for (int i = 0; i < dices.length; i++) {
			this.diceButtons[i].setIcon(new ImageIcon("res/" + this.dices[i].getImageURL()));
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == this.roll) {
			this.rollAll();
		}
		for (int i = 0; i < this.diceButtons.length; i++) {
			if (ae.getSource() == this.diceButtons[i]) {
				this.dices[i].switchStatus();
				if(this.dices[i].getStatus()){
					this.diceButtons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				}else{
					this.diceButtons[i].setBorder(BorderFactory.createLineBorder(Color.RED));
				}
			}
		}
	}
}
