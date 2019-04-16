import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;

public class one {
    private JPanel panelMain;
    private JTextField firstNameText;
    private JTextField lastNameText;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel yearOfBirthLabel;
    private JFormattedTextField yearOFBirthText;
    private JLabel monthOfBirthLabel;
    private JLabel dayOfBirthLabel;
    private JFormattedTextField monthOFBirthText;
    private JFormattedTextField dayOFBirthText;
    private JButton calcAge;
    private JTextArea ageOutput;
    private JButton buttonMsg;

    private one() {
        calcAge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = (int) yearOFBirthText.getValue();
                int month = (int) monthOFBirthText.getValue();
                int day = (int) dayOFBirthText.getValue();
                LocalDate birthDate = LocalDate.of(year, month, day);
                LocalDate today = LocalDate.now();
                ageOutput.append(String.valueOf(Period.between(birthDate, today).getYears()));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("one");
        frame.setContentPane(new one().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        yearOFBirthText = new JFormattedTextField(formatter);
        monthOFBirthText = new JFormattedTextField(formatter);
        dayOFBirthText = new JFormattedTextField(formatter);

    }
}
