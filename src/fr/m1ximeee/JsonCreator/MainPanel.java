package fr.m1ximeee.JsonCreator;

import fr.theshark34.swinger.abstractcomponents.AbstractButton;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainPanel extends JPanel implements ActionListener {

    public static JTextField url;
    public static JTextField dir;
    JButton choose;
    JButton mod;
    JButton externalfile;
    JButton mcp;
    JFileChooser jFileChooser;
    JLabel urlL;
    JLabel chemin;

    MainPanel(){
        this.setLayout(null);

        urlL = new JLabel("Url du serveur de fichier: ");
        urlL.setBounds(10,10,400,30);
        urlL.setFont(urlL.getFont().deriveFont(30F));
        this.add(urlL);

        url = new JTextField();
        url.setBounds(10, 50, 400, 20);
        url.setFont(url.getFont().deriveFont(10F));
        this.add(url);

        chemin = new JLabel("Chemin du dossier: ");
        chemin.setBounds(10,80,400,30);
        chemin.setFont(chemin.getFont().deriveFont(30F));
        this.add(chemin);

        dir = new JTextField();
        dir.setBounds(10, 130, 400,20);
        dir.setFont(dir.getFont().deriveFont(15F));
        this.add(dir);

        choose = new JButton("...");
        choose.setBounds(420,130,40, 20);
        choose.addActionListener(this);
        this.add(choose);

         mod = new JButton("Mod");
         mod.setBounds(10,160, 128,16);
         this.add(mod);

         externalfile = new JButton("ExternalFile");
         externalfile.setBounds(36,160, 128,16);
         this.add(externalfile);

         mcp = new JButton("MCP");
         mcp.setBounds(62,160, 128,16);
         this.add(mcp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == choose){
            jFileChooser = new JFileChooser(
                    FileSystemView
                            .getFileSystemView()
                            .getHomeDirectory()
            );
            jFileChooser.setDialogTitle("Choisissez un repertoire: ");
            jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int res = jFileChooser.showSaveDialog(null);
            if (res == jFileChooser.APPROVE_OPTION){
                File f = jFileChooser.getSelectedFile();
                dir.setText(String.valueOf(jFileChooser.getSelectedFile()));
            }
        }
    }
}
