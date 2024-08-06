import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Education extends JFrame implements ActionListener {
    JButton back,skills;

    public Education(){
        setTitle("EDUCATION SECTION");
        setLayout(null);

        ImageIcon bimage1= new ImageIcon(ClassLoader.getSystemResource("images/Education3_back.jpg"));
        Image bimage2= bimage1.getImage().getScaledInstance(550,600,Image.SCALE_DEFAULT);
        ImageIcon bimage3= new ImageIcon(bimage2);
        JLabel bimage = new JLabel(bimage3);
        bimage.setBounds(0,0,620,600);
        add(bimage);

        JLabel text = new JLabel("Education Details");
        text.setBounds(165,20,400,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,22));
        bimage.add(text);

        ImageIcon image1= new ImageIcon(ClassLoader.getSystemResource("images/Student.png"));
        Image image2= image1.getImage().getScaledInstance(150,130,Image.SCALE_DEFAULT);
        ImageIcon image3= new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(200,60,100,80);
        bimage.add(image);

        JLabel degree= new JLabel("B.E - Infromation Science & Engineering | 2024" );
        degree.setBounds(45,160,600,30);
        degree.setForeground(Color.WHITE);
        degree.setFont(new Font("SansSerif",Font.BOLD,18));
        bimage.add(degree);

        JLabel degreeCity= new JLabel("<html>SMT.KAMALA & SRI VENKAPPA M AGADI COLLEGE OF <br>ENGINEERING AND TECHNOLOGY <br> LAXMESHWAR-582116<html>" );
        degreeCity.setBounds(60,200,600,60);
        degreeCity.setForeground(Color.WHITE);
        degreeCity.setFont(new Font("SansSerif",Font.PLAIN,16));
        bimage.add(degreeCity);

        JLabel degreeMarks= new JLabel("Aggregate: CGPA:8.2" );
        degreeMarks.setBounds(60,260,600,20);
        degreeMarks.setForeground(Color.WHITE);
        degreeMarks.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(degreeMarks);

        JLabel puc= new JLabel("Pre-University Course (PUC) |  2020" );
        puc.setBounds(45,300,600,30);
        puc.setForeground(Color.WHITE);
        puc.setFont(new Font("SansSerif",Font.BOLD,18));
        bimage.add(puc);

        JLabel pucCity= new JLabel("GOVT P U COLLEGE,HANGAL -581104" );
        pucCity.setBounds(60,340,600,20);
        pucCity.setForeground(Color.WHITE);
        pucCity.setFont(new Font("SansSerif",Font.PLAIN,16));
        bimage.add(pucCity);

        JLabel pucMarks= new JLabel("Aggregate: Achieved a notable score of 78%" );
        pucMarks.setBounds(60,360,600,20);
        pucMarks.setForeground(Color.WHITE);
        pucMarks.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(pucMarks);

        JLabel sslc= new JLabel("Secondary School Leaving Certificate (SSLC) | 2018" );
        sslc.setBounds(45,400,600,20);
        sslc.setForeground(Color.WHITE);
        sslc.setFont(new Font("SansSerif",Font.BOLD,18));
        bimage.add(sslc);

        JLabel sslcCity= new JLabel("H.M.U.H SCHOOL, HANGAL-581104 " );
        sslcCity.setBounds(60,440,600,20 );
        sslcCity.setForeground(Color.WHITE);
        sslcCity.setFont(new Font("SansSerif",Font.PLAIN,16));
        bimage.add(sslcCity);

        JLabel sslcMarks= new JLabel("Aggregate: Attained an exceptional score of 89%" );
        sslcMarks.setBounds(60,460,600,20);
        sslcMarks.setForeground(Color.WHITE);
        sslcMarks.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(sslcMarks);


        back= new JButton("Back");
        back.setBounds(40,500,80,30);
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        bimage.add(back);

        skills= new JButton("Skills");
        skills.setBounds(400,500,80,30);
        skills.setFont(new Font("Raleway",Font.BOLD,14));
        skills.setBackground(Color.BLACK);
        skills.setForeground(Color.WHITE);
        skills.addActionListener(this);
        bimage.add(skills);

        setSize(550,600);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLocation(650,100);
    }

    public  void actionPerformed(ActionEvent ae){
        if (ae.getSource()== back){
            setVisible(false);
            new Profile().setVisible(true);
        } else if (ae.getSource()==skills) {
            setVisible(false);
            new Skills().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Education();
    }
}
