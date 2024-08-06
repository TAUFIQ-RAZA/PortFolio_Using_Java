import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contacts extends JFrame implements ActionListener {

    JButton back;

    public Contacts(){

        setTitle("Contacts");
        setLayout(null);

        ImageIcon bimage1= new ImageIcon(ClassLoader.getSystemResource("images/Contacts_back.jpg"));
        Image bimage2= bimage1.getImage().getScaledInstance(650,600,Image.SCALE_DEFAULT);
        ImageIcon bimage3= new ImageIcon(bimage2);
        JLabel bimage = new JLabel(bimage3);
        bimage.setBounds(0,0,650,600);
        add(bimage);

        JLabel text = new JLabel("CONTACTS ");
        text.setBounds(200,140,400,30);
        text.setForeground(Color.black);
        text.setFont(new Font("Arial",Font.BOLD,26));
        bimage.add(text);

        JLabel phno= new JLabel("Phone Number :     +91-7676356614");
        phno.setBounds(100,210,500,30);
        phno.setFont(new Font("Times New Roman",Font.BOLD,18));
        bimage.add(phno);

        JLabel email= new JLabel("Email ID :     mrtaufiqraza@gmail.com");
        email.setBounds(100,260,500,30);
        email.setFont(new Font("Times New Roman",Font.BOLD,18));
        bimage.add(email);

        JLabel gitHub= new JLabel("GitHub ID :     TAUFIQ_RAZA");
        gitHub.setBounds(100,310,500,30);
        gitHub.setFont(new Font("Times New Roman",Font.BOLD,18));
        bimage.add(gitHub);

        JLabel linkedin= new JLabel("Linkdin ID : http://www.linkedin.com/in/taufiq-raza-sirbadgi");
        linkedin.setBounds(100,360,600,30);
        linkedin.setFont(new Font("Times New Roman",Font.BOLD,18));
        bimage.add(linkedin);

        back= new JButton("Back");
        back.setBounds(40,500,80,30);
        back.setFont(new Font("Raleway",Font.BOLD,16));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        bimage.add(back);

        setSize(600,600);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLocation(650,100);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Profile().setVisible(true);
        }
    }

    public static void main(String[] args)
    {
        new Contacts();
    }
}
