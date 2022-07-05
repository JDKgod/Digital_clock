import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Digitalclock extends JFrame {

   // int hour, minute, second;
   // int day, month, year;

    private JPanel Digitalclock;
    private JLabel DCLabel;
    private JPanel Digitalclock2;
    private JLabel time;
    private JLabel Date;


    public Digitalclock() {
        setMinimumSize(new Dimension(300, 200));
        setContentPane(Digitalclock);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);
       //Display the window
        setLocationRelativeTo(null);

        int delay = 100;
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                DateTimeFormatter Formatter1 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
                String FormattedDateTime = now.format(Formatter);
                String FormattedDate = now.format(Formatter1);

                time.setText(FormattedDateTime);
                Date.setText(FormattedDate);
                System.out.println("Iam a coder");
            }
        });
        timer.start();



    }
    
    }

