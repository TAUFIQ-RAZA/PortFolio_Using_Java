import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile extends JFrame implements ActionListener {
    JButton education,projects,skills,experience, contacts,certificates,exit,bio;

    public Profile(){
        setTitle("PortFolio: TAUFIQ RAZA");
        setLayout(null);

        JLabel text = new JLabel("Welcome To PortFolio");
        text.setBounds(150,20,400,30);
        text.setFont(new Font("Raleway",Font.BOLD,22));
        add(text);

        ImageIcon bimage1= new ImageIcon(ClassLoader.getSystemResource("images/background.jpg"));
        Image bimage2= bimage1.getImage().getScaledInstance(550,600,Image.SCALE_DEFAULT);
        ImageIcon bimage3= new ImageIcon(bimage2);
        JLabel bimage = new JLabel(bimage3);
        bimage.setBounds(0,0,550,600);
        add(bimage);

        ImageIcon image1= new ImageIcon(ClassLoader.getSystemResource("images/TAUFIQ_RAZA1.jpg"));
        Image image2= image1.getImage().getScaledInstance(150,130,Image.SCALE_DEFAULT);
        ImageIcon image3= new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(180,60,150,130);
        bimage.add(image);


        bio= new JButton("BIO");
        bio.setBounds(20,20,55,30);
        bio.setFont(new Font("Raleway",Font.BOLD,12));
        bio.setBackground(Color.gray);
        bio.setForeground(Color.black);
        bio.addActionListener(this);
        bimage.add(bio);

        education= new JButton("EDUCATION");
        education.setBounds(160,220,180,30);
        education.setFont(new Font("Raleway",Font.BOLD,16));
        education.setBackground(Color.WHITE);
        education.setForeground(Color.BLACK);
        education.addActionListener(this);
        bimage.add(education);

        projects= new JButton("PROJECTS");
        projects.setBounds(160,270,180,30);
        projects.setFont(new Font("Raleway",Font.BOLD,16));
        projects.setBackground(Color.WHITE);
        projects.setForeground(Color.BLACK);
        projects.addActionListener(this);
        bimage.add(projects);

        skills= new JButton("SKILLS");
        skills.setBounds(160,320,180,30);
        skills.setFont(new Font("Raleway",Font.BOLD,16));
        skills.setBackground(Color.WHITE);
        skills.setForeground(Color.BLACK);
        skills.addActionListener(this);
        bimage.add(skills);

        experience= new JButton("EXPERIENCE");
        experience.setBounds(160,370,180,30);
        experience.setFont(new Font("Raleway",Font.BOLD,16));
        experience.setBackground(Color.WHITE);
        experience.setForeground(Color.BLACK);
        experience.addActionListener(this);
        bimage.add(experience);

        certificates= new JButton("CERTIFICATION");
        certificates.setBounds(160,420,180,30);
        certificates.setFont(new Font("Raleway",Font.BOLD,16));
        certificates.setBackground(Color.WHITE);
        certificates.setForeground(Color.BLACK);
        certificates.addActionListener(this);
        bimage.add(certificates);

        contacts= new JButton("CONTACTS");
        contacts.setBounds(160,470,180,30);
        contacts.setFont(new Font("Raleway",Font.BOLD,16));
        contacts.setBackground(Color.WHITE);
        contacts.setForeground(Color.BLACK);
        contacts.addActionListener(this);
        bimage.add(contacts);

        exit= new JButton("EXIT");
        exit.setBounds(420,520,80,20);
        exit.setFont(new Font("Raleway",Font.BOLD,12));
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        bimage.add(exit);


        setSize(550,600);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLocation(650,100);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== exit){
            System.exit(0);
        }else if (ae.getSource()== education){
            setVisible(false);
            new Education().setVisible(true);
        } else if (ae.getSource()==skills) {
            setVisible(false);
            new Skills().setVisible(true);
        }else if (ae.getSource()== projects){
            setVisible(false);
            new Projects().setVisible(true);
        } else if (ae.getSource()==bio) {
            setVisible(true);
            new Bio().setVisible(true);
        }else if (ae.getSource()==contacts){
            setVisible(false);
            new Contacts().setVisible(true);
        } else if (ae.getSource()==certificates) {
            setVisible(false);
            new Certificates().setVisible(true);
        }else if (ae.getSource()==experience){
            setVisible(false);
            new Experience().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Profile();
    }
}

