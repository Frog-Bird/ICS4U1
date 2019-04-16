import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class two {
    private JPanel panelMain;
    private JRadioButton grade9RB;
    private JRadioButton grade10RB;
    private JRadioButton grade11RB;
    private JRadioButton grade12RB;
    private JLabel gradeLabel;
    private JRadioButton grade13RB;
    private JLabel genderLabel;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JLabel AGELabel;
    private JSpinner ageSpinner;
    private JLabel OFCLASSESSEMESTER1Label;
    private JLabel OFCLASSESSEMESTER2Label;
    private JSpinner OFCLASSESSEMESTER1Spinner;
    private JSpinner OFCLASSESSEMESTER2Spinner;
    private JLabel AVERAGELASTYEARLabel;
    private JComboBox averageLastYearComboBox;
    private JList<String> SCHOOLACTIVITIESList;
    private JLabel SCHOOLACTIVITIESLabel;
    private JLabel DOYOUTAKETHELabel;
    private JRadioButton yesRadioButton;
    private JRadioButton noRadioButton;
    private JLabel HOWMUCHYOULIKESCHOOLLabel;
    private JLabel HOWMUCHYOULIKEGDHSLabel1;
    private JSlider HOWMUCHYOULIKESCHOOLSlider;
    private JSlider HOWMUCHYOULIKEGDHSSlider;
    private JButton submitButton;
    private JTextArea activitieToAdd;
    private JButton addActivtieButton;
    private JList schoolActivitiesList;
    private ButtonGroup bus;
    private ButtonGroup gender;
    private ButtonGroup grade;
    private static DefaultListModel listModel;
    private JFrame frame;
    private BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

    private two() throws IOException {

        addActivtieButton.addActionListener(e -> listModel.addElement(activitieToAdd.getText()));
        submitButton.addActionListener(e -> {
            try {
                writer.write("Grade: " + grade.getSelection().getActionCommand());
                writer.newLine();
                writer.write("Gender: " + gender.getSelection().getActionCommand());
                writer.newLine();
                writer.write("Age: " + ageSpinner.getValue());
                writer.newLine();
                writer.write("Number of Classes in Semester 1: " + OFCLASSESSEMESTER1Spinner.getValue());
                writer.newLine();
                writer.write("Number of Classes in Semester 2: " + OFCLASSESSEMESTER2Spinner.getValue());
                writer.newLine();
                writer.write("Average Last Year: " + averageLastYearComboBox.getItemAt(averageLastYearComboBox.getSelectedIndex()));
                writer.newLine();
                writer.write("School Activities: " + schoolActivitiesList.getSelectedValuesList());
                writer.newLine();
                writer.write("Takes the Bus: "  + bus.getSelection().getActionCommand());
                writer.newLine();
                writer.write("How Much They Like School: " + HOWMUCHYOULIKESCHOOLSlider.getValue());
                writer.newLine();
                writer.write("How Much They Like GDHS: " + HOWMUCHYOULIKEGDHSSlider.getValue());
                writer.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("two");
        frame.setContentPane(new two().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        grade9RB = new JRadioButton("9");
        grade9RB.setActionCommand("9");
        grade10RB = new JRadioButton("10");
        grade10RB.setActionCommand("10");
        grade11RB = new JRadioButton("11");
        grade11RB.setActionCommand("11");
        grade12RB = new JRadioButton("12");
        grade12RB.setActionCommand("12");
        grade13RB = new JRadioButton("13");
        grade13RB.setActionCommand("13");

        maleRadioButton = new JRadioButton();
        maleRadioButton.setActionCommand("male");
        femaleRadioButton = new JRadioButton();
        femaleRadioButton.setActionCommand("female");

        yesRadioButton = new JRadioButton();
        yesRadioButton.setActionCommand("yes");
        noRadioButton = new JRadioButton();
        noRadioButton.setActionCommand("no");

        listModel = new DefaultListModel();
        listModel.addElement("Robotics");
        listModel.addElement("Art Club");
        listModel.addElement("Swimming");
        listModel.addElement("Soccer");
        listModel.addElement("Foot Ball");
        schoolActivitiesList = new JList(listModel);
        schoolActivitiesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        schoolActivitiesList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
    }
}
