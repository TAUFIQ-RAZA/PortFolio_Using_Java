import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Certificates extends JFrame implements ActionListener {

    JButton next;
    public Certificates(){
        setTitle("Certificates");

        ImageIcon bimage1= new ImageIcon(ClassLoader.getSystemResource("images/certificates_back.jpg"));
        Image bimage2= bimage1.getImage().getScaledInstance(700,800,Image.SCALE_DEFAULT);
        ImageIcon bimage3= new ImageIcon(bimage2);
        JLabel bimage = new JLabel(bimage3);
        bimage.setBounds(0,0,700,800);
        add(bimage);

        JLabel text = new JLabel("CERTIFICATES");
        text.setBounds(240,20,400,30);
        text.setForeground(Color.darkGray);
        text.setFont(new Font("SansSerif",Font.BOLD,26));
        bimage.add(text);

        JLabel html= new JLabel("1. HTML5");
        html.setBounds(80,80,100,30);
        html.setFont(new Font("Times New Roman",Font.BOLD,20));
        bimage.add(html);

        ImageIcon htmlimage1= new ImageIcon(ClassLoader.getSystemResource("certificates/HTML.png"));
        Image htmlimage2= htmlimage1.getImage().getScaledInstance(230,180,Image.SCALE_DEFAULT);
        ImageIcon htmlimage3= new ImageIcon(htmlimage2);
        JLabel htmlimage = new JLabel(htmlimage3);
        htmlimage.setBounds(80,120,230,180);
        bimage.add(htmlimage);

        JLabel css= new JLabel("2. CSS");
        css.setBounds(380,80,100,30);
        css.setFont(new Font("Times New Roman",Font.BOLD,20));
        bimage.add(css);

        ImageIcon cssimage1= new ImageIcon(ClassLoader.getSystemResource("certificates/Css.png"));
        Image cssimage2= cssimage1.getImage().getScaledInstance(230,180,Image.SCALE_DEFAULT);
        ImageIcon cssimage3= new ImageIcon(cssimage2);
        JLabel cssimage = new JLabel(cssimage3);
        cssimage.setBounds(380,120,230,180);
        bimage.add(cssimage);

        JLabel SQL= new JLabel("3. SQL");
        SQL.setBounds(80,320,100,30);
        SQL.setFont(new Font("Times New Roman",Font.BOLD,20));
        bimage.add(SQL);

        ImageIcon sqlimage1= new ImageIcon(ClassLoader.getSystemResource("certificates/SQL.png"));
        Image sqlimage2= sqlimage1.getImage().getScaledInstance(230,180,Image.SCALE_DEFAULT);
        ImageIcon sqlimage3= new ImageIcon(sqlimage2);
        JLabel sqlimage = new JLabel(sqlimage3);
        sqlimage.setBounds(80,360,230,180);
        bimage.add(sqlimage);

        JLabel soft= new JLabel("4. SOFT_SKILLS");
        soft.setBounds(380,320,400,30);
        soft.setFont(new Font("Times New Roman",Font.BOLD,20));
        bimage.add(soft);

        ImageIcon softimage1= new ImageIcon(ClassLoader.getSystemResource("certificates/Soft_skills.png"));
        Image softimage2= softimage1.getImage().getScaledInstance(230,180,Image.SCALE_DEFAULT);
        ImageIcon softimage3= new ImageIcon(softimage2);
        JLabel softimage = new JLabel(softimage3);
        softimage.setBounds(380,360,230,180);
        bimage.add(softimage);

        next= new JButton("Next");
        next.setBounds(500,700,100,30);
        next.setFont(new Font("Raleway",Font.BOLD,16));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.addActionListener(this);
        bimage.add(next);


        setSize(700,800);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLocation(650,100);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==next){
            setVisible(false);
            new Certificates2().setVisible(true);
        }
    }


    public static void main(String[] args) {
        new Certificates();
    }
}
