import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
class SpecialCharactersUI extends JFrame {
    private JTextArea outputArea;
    private JTextField inputField;

    public void initUI() {
        setTitle("Поиск символов отличных от букв и пробела");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 350);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel inputLabel = new JLabel("Введите ваш текст:");
        inputLabel.setBounds(20, 20, 150, 30);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(155, 20, 240, 30);
        add(inputField);

        JButton searchButton = new JButton("Найти специальные символы");
        searchButton.setBounds(155, 60, 240, 30);
        add(searchButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBounds(90, 100, 360, 150);
        add(scrollPane);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                HashSet<Character> specialChars = Main.findSpecialCharacters(text);
                outputArea.setText("Символы отличные от букв и пробела: " + specialChars);
            }
        });

        setVisible(true);
    }
}