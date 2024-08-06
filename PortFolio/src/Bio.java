import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bio extends JFrame implements ActionListener {

    JButton ok;

    public Bio(){

        setTitle("BIO DATA");

        ImageIcon bimage1= new ImageIcon(ClassLoader.getSystemResource("images/BioData.jpg"));
        Image bimage2= bimage1.getImage().getScaledInstance(370,450,Image.SCALE_DEFAULT);
        ImageIcon bimage3= new ImageIcon(bimage2);
        JLabel bimage = new JLabel(bimage3);
        bimage.setBounds(0,0,370,450);
        add(bimage);

        JLabel name= new JLabel("Name : Taufiq Raza Sirbadgi");
        name.setBounds(45,35,400,30);
        name.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(name);

        JLabel domain= new JLabel("Domain : Software Engineer");
        domain.setBounds(45,65,400,30);
        domain.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(domain);

        JLabel age= new JLabel("Age : 22");
        age.setBounds(45,95,400,30);
        age.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(age);

        JLabel fname= new JLabel("Father Name : Md.Mateen Sirbadgi");
        fname.setBounds(45,125,400,30);
        fname.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(fname);

        JLabel gender= new JLabel("Gender : Male");
        gender.setBounds(45,155,400,30);
        gender.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(gender);

        JLabel dob= new JLabel("D.O.B : 15 AUG 2002 ");
        dob.setBounds(45,185,400,30);
        dob.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(dob);

        JLabel religion= new JLabel("Religion : Muslim ");
        religion.setBounds(45,215,400,30);
        religion.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(religion);

        JLabel language= new JLabel("Language : English, Kannada, Hindi ");
        language.setBounds(45,245,400,30);
        language.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(language);

        JLabel address= new JLabel("Address: Bengaluru, Karnataka, India ");
        address.setBounds(45,275,400,30);
        address.setFont(new Font("SansSerif",Font.BOLD,14));
        bimage.add(address);

        ok= new JButton("OK");
        ok.setBounds(140,350,60,30);
        ok.setFont(new Font("Raleway",Font.BOLD,12));
        ok.setBackground(Color.BLACK);
        ok.setForeground(Color.WHITE);
        ok.addActionListener(this);
        bimage.add(ok);


        setSize(370,450);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLocation(280,100);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==ok){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Bio();

    }
}
