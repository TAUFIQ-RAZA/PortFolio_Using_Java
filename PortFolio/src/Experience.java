import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Experience extends JFrame implements ActionListener {
    JButton back,certificates;

    public Experience(){
        setTitle("Experience");
        setLayout(null);

        ImageIcon bimage1= new ImageIcon(ClassLoader.getSystemResource("images/experienceIcon.png"));
        Image bimage2= bimage1.getImage().getScaledInstance(120,100,Image.SCALE_DEFAULT);
        ImageIcon bimage3= new ImageIcon(bimage2);
        JLabel bimage = new JLabel(bimage3);
        bimage.setBounds(220,20,120,100);
        add(bimage);

        JLabel experice1= new JLabel("1. One Month InternShip | Full Stack Java " );
        experice1.setBounds(30,140,600,30);
        experice1.setForeground(Color.BLACK);
        experice1.setFont(new Font("SansSerif",Font.BOLD,20));
        add(experice1);

        JLabel project1Desc= new JLabel("At Amba Software - Dharwad" );
        project1Desc.setBounds(60,160,600,30);
        project1Desc.setForeground(Color.DARK_GRAY);
        project1Desc.setFont(new Font("SansSerif",Font.BOLD,14));
        add(project1Desc);

        JLabel experice2= new JLabel("2. Two Month Software Trainee | Java Application" );
        experice2.setBounds(30,200,700,30);
        experice2.setForeground(Color.BLACK);
        experice2.setFont(new Font("SansSerif",Font.BOLD,20));
        add(experice2);

        JLabel project2Desc= new JLabel("At Xworkz.in- Bengaluru" );
        project2Desc.setBounds(60,220,600,30);
        project2Desc.setForeground(Color.DARK_GRAY);
        project2Desc.setFont(new Font("SansSerif",Font.BOLD,14));
        add(project2Desc);

        back= new JButton("Back");
        back.setBounds(40,300,80,30);
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);

        certificates= new JButton("Certification");
        certificates.setBounds(400,300,150,30);
        certificates.setFont(new Font("Raleway",Font.BOLD,14));
        certificates.setBackground(Color.white);
        certificates.setForeground(Color.black);
        certificates.addActionListener(this);
        add(certificates);

        setSize(600,400);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLocation(650,150);
    }

    public  void actionPerformed(ActionEvent ae){
        if (ae.getSource()== back){
            setVisible(false);
            new Profile().setVisible(true);
        } else if (ae.getSource()==certificates) {
            setVisible(false);
            new Certificates().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Experience();
    }
}
