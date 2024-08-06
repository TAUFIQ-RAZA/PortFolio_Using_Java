import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Skills extends JFrame implements ActionListener {

    JButton back,projects;
    public Skills(){
        setTitle("TECHNICAL SKILLS");
        setLayout(null);

        ImageIcon bimage1= new ImageIcon(ClassLoader.getSystemResource("images/skills_back.jpg"));
        Image bimage2= bimage1.getImage().getScaledInstance(550,600,Image.SCALE_DEFAULT);
        ImageIcon bimage3= new ImageIcon(bimage2);
        JLabel bimage = new JLabel(bimage3);
        bimage.setBounds(0,0,550,600);
        add(bimage);

        JLabel text = new JLabel("Technical Skills ");
        text.setBounds(170,20,400,30);
        text.setForeground(Color.black);
        text.setFont(new Font("SansSerif",Font.BOLD,22));
        bimage.add(text);

        JLabel skill = new JLabel("<html><ol>" +
                "<li>Core JAVA</li>" +
                "<li>HTML</li>" +
                "<li>CSS</li>" +
                "<li>SQL</li>" +
                "<li>SPRING BOOT</li>"+
                "</ol><html>");
        skill.setBounds(90,50,500,200);
        skill.setForeground(Color.black);
        skill.setFont(new Font("SansSerif",Font.BOLD,20));
        bimage.add(skill);

        JLabel text2 = new JLabel("Inter-personal Skills ");
        text2.setBounds(170,260,400,30);
        text2.setForeground(Color.black);
        text2.setFont(new Font("SansSerif",Font.BOLD,22));
        bimage.add(text2);

        JLabel personal = new JLabel("<html><ul>" +
                "<li>Problem Solving</li>" +
                "<li>Leadership</li>" +
                "<li>Quick Learner</li>" +
                "<li>Good Listener</li>" +
                "</ul><html>");
        personal.setBounds(90,270,500,200);
        personal.setForeground(Color.black);
        personal.setFont(new Font("SansSerif",Font.BOLD,20));
        bimage.add(personal);

        back= new JButton("Back");
        back.setBounds(40,500,80,30);
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        bimage.add(back);

        projects= new JButton("Projects");
        projects.setBounds(380,500,100,30);
        projects.setFont(new Font("Raleway",Font.BOLD,14));
        projects.setBackground(Color.white);
        projects.setForeground(Color.black);
        projects.addActionListener(this);
        bimage.add(projects);


        setSize(550,600);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLocation(650,100);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==back){
            setVisible(false);
            new Profile().setVisible(true);
        } else if (ae.getSource()==projects) {
            setVisible(false);
            new Projects().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Skills();
    }

}
