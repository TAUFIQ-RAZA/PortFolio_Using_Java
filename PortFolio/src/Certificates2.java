import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Certificates2 extends JFrame implements ActionListener {

    JButton back;
    public Certificates2(){
        setTitle("Certificates");

        ImageIcon bimage1= new ImageIcon(ClassLoader.getSystemResource("images/certificates_back.jpg"));
        Image bimage2= bimage1.getImage().getScaledInstance(700,800,Image.SCALE_DEFAULT);
        ImageIcon bimage3= new ImageIcon(bimage2);
        JLabel bimage = new JLabel(bimage3);
        bimage.setBounds(0,0,700,800);
        add(bimage);


        JLabel html= new JLabel("5. Communication");
        html.setBounds(80,60,400,30);
        html.setFont(new Font("Times New Roman",Font.BOLD,20));
        bimage.add(html);

        ImageIcon htmlimage1= new ImageIcon(ClassLoader.getSystemResource("certificates/Comminication.png"));
        Image htmlimage2= htmlimage1.getImage().getScaledInstance(230,180,Image.SCALE_DEFAULT);
        ImageIcon htmlimage3= new ImageIcon(htmlimage2);
        JLabel htmlimage = new JLabel(htmlimage3);
        htmlimage.setBounds(80,100,230,180);
        bimage.add(htmlimage);

        JLabel css= new JLabel("6. Global_Fusion");
        css.setBounds(380,60,400,30);
        css.setFont(new Font("Times New Roman",Font.BOLD,20));
        bimage.add(css);

        ImageIcon cssimage1= new ImageIcon(ClassLoader.getSystemResource("certificates/GLobal_Fusion.png"));
        Image cssimage2= cssimage1.getImage().getScaledInstance(230,180,Image.SCALE_DEFAULT);
        ImageIcon cssimage3= new ImageIcon(cssimage2);
        JLabel cssimage = new JLabel(cssimage3);
        cssimage.setBounds(380,100,230,180);
        bimage.add(cssimage);

        JLabel SQL= new JLabel("InternShip: Web Developement");
        SQL.setBounds(230,300,500,30);
        SQL.setFont(new Font("Times New Roman",Font.BOLD,20));
        bimage.add(SQL);

        ImageIcon sqlimage1= new ImageIcon(ClassLoader.getSystemResource("certificates/web_developement.png"));
        Image sqlimage2= sqlimage1.getImage().getScaledInstance(230,200,Image.SCALE_DEFAULT);
        ImageIcon sqlimage3= new ImageIcon(sqlimage2);
        JLabel sqlimage = new JLabel(sqlimage3);
        sqlimage.setBounds(240,340,230,200);
        bimage.add(sqlimage);


        back= new JButton("Back");
        back.setBounds(500,700,100,30);
        back.setFont(new Font("Raleway",Font.BOLD,16));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        bimage.add(back);


        setSize(700,800);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLocation(650,100);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==back){
            setVisible(false);
            new Profile().setVisible(true);
        }
    }


    public static void main(String[] args) {
        new Certificates2();
    }
}
