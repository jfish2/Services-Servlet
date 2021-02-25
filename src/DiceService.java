import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceService {

    JLabel label;
    JComboBox numDice;

    public JPanel getGuiPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Roll dice!");
        String[] choices = {"1", "2", "3","4","5"};
        numDice = new JComboBox(choices);
        label = new JLabel("dice values here");
        button.addActionListener(new RollEmListener());
        panel.add(numDice);
        panel.add(button);
        panel.add(label);
        return panel;
    }

    public class RollEmListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //rolling dice simulator
            String diceOutput = "";
            String selection = (String) numDice.getSelectedItem();
            int numDiceToRoll = Integer.parseInt(selection);

            for(int i=0; i<numDiceToRoll; i++) {
                int r = (int) ((Math.random() * 6) + 1);
                diceOutput += (" " + r);
            }
            label.setText(diceOutput);
        }
    }
}
