import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Projects extends JFrame implements ActionListener {

    JButton back, experience;

    public Projects(){

        setTitle("PROJECTS");
        setLayout(null);

        ImageIcon bimage1= new ImageIcon(ClassLoader.getSystemResource("images/project.jpg"));
        Image bimage2= bimage1.getImage().getScaledInstance(700,800,Image.SCALE_DEFAULT);
        ImageIcon bimage3= new ImageIcon(bimage2);
        JLabel bimage = new JLabel(bimage3);
        bimage.setBounds(0,0,700,800);
        add(bimage);

        JLabel text = new JLabel("PROJECTS");
        text.setBounds(240,20,400,30);
        text.setForeground(Color.black);
        text.setFont(new Font("SansSerif",Font.BOLD,26));
        bimage.add(text);

        ImageIcon image1= new ImageIcon(ClassLoader.getSystemResource("images/projectIcon.jpg"));
        Image image2= image1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon image3= new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(210,60,200,100);
        bimage.add(image);

        JLabel project1= new JLabel("1. DEEP FAKE VIDEO DETECTION | Final Year Project" );
        project1.setBounds(30,170,600,30);
        project1.setForeground(Color.BLACK);
        project1.setFont(new Font("SansSerif",Font.BOLD,20));
        bimage.add(project1);

        JLabel project1Desc= new JLabel("<html>Desc: Created a system using machine learning & deep learning.<html>" );
        project1Desc.setBounds(50,180,600,60);
        project1Desc.setForeground(Color.DARK_GRAY);
        project1Desc.setFont(new Font("SansSerif",Font.PLAIN,18));
        bimage.add(project1Desc);

        JLabel project2= new JLabel("2. STUDENT INFORMATION SYSTEM | InternShip Project" );
        project2.setBounds(30,250,600,30);
        project2.setForeground(Color.BLACK);
        project2.setFont(new Font("SansSerif",Font.BOLD,20));
        bimage.add(project2);

        JLabel project2Desc= new JLabel("<html>Desc: Created a system using Java for backend operations,<br> MySQL for data management, and HTML/CSS for the interface.<html>" );
        project2Desc.setBounds(50,270,600,60);
        project2Desc.setForeground(Color.DARK_GRAY);
        project2Desc.setFont(new Font("SansSerif",Font.PLAIN,18));
        bimage.add(project2Desc);

        JLabel project3= new JLabel("3. BANK MANAGEMENT SYSTEM | Java Project" );
        project3.setBounds(30,340,600,30);
        project3.setForeground(Color.BLACK);
        project3.setFont(new Font("SansSerif",Font.BOLD,20));
        bimage.add(project3);

        JLabel project3Desc= new JLabel("<html>Desc: Created a system using Java for backend operations,<br> MySQL for data management, and JFrame for the interface.<html>" );
        project3Desc.setBounds(50,360,600,60);
        project3Desc.setForeground(Color.DARK_GRAY);
        project3Desc.setFont(new Font("SansSerif",Font.PLAIN,18));
        bimage.add(project3Desc);

        JLabel project4= new JLabel("4. YOUTUBE| Responsive InterFace" );
        project4.setBounds(30,430,600,30);
        project4.setForeground(Color.BLACK);
        project4.setFont(new Font("SansSerif",Font.BOLD,20));
        bimage.add(project4);

        JLabel project4Desc= new JLabel("<html>Desc: Implemented a YouTube Responsive interface clone <br> using HTML and CSS. <html>" );
        project4Desc.setBounds(50,450,600,60);
        project4Desc.setForeground(Color.DARK_GRAY);
        project4Desc.setFont(new Font("SansSerif",Font.PLAIN,18));
        bimage.add(project4Desc);

        JLabel project5= new JLabel("5. PORTFOLIO| Java Project" );
        project5.setBounds(30,520,600,30);
        project5.setForeground(Color.BLACK);
        project5.setFont(new Font("SansSerif",Font.BOLD,20));
        bimage.add(project5);

        JLabel project5Desc= new JLabel("<html>Desc: Implemented a PortFolio Purely Using Java. <html>" );
        project5Desc.setBounds(50,530,600,60);
        project5Desc.setForeground(Color.DARK_GRAY);
        project5Desc.setFont(new Font("SansSerif",Font.PLAIN,18));
        bimage.add(project5Desc);

        back= new JButton("Back");
        back.setBounds(40,700,80,30);
        back.setFont(new Font("Raleway",Font.BOLD,16));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        bimage.add(back);

        experience= new JButton("Experience");
        experience.setBounds(500,700,120,30);
        experience.setFont(new Font("Raleway",Font.BOLD,16));
        experience.setBackground(Color.white);
        experience.setForeground(Color.black);
        experience.addActionListener(this);
        bimage.add(experience);


        setSize(700,800);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLocation(650,100);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==back){
            setVisible(false);
            new Profile().setVisible(true);
        } else if (ae.getSource()==experience) {
            setVisible(false);
            new Experience().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Projects();
    }
}
