package fr.m1ximeee.JsonCreator;

import fr.m1ximeee.JsonCreator.processors.IProcessor;
import fr.theshark34.swinger.util.WindowMover;

import javax.swing.*;

public class MainFrame extends JFrame {
    private static MainFrame instance;
    private static MainPanel mainPanel;
    private IProcessor modProcessor;
    private IProcessor mcpProcessor;
    private IProcessor externalFileProcessor;


    public MainFrame(){
        this.setTitle("JsonCreator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setContentPane(mainPanel = new MainPanel());
        setSize(1280, 720);

        this.setLocationRelativeTo(null);

        WindowMover mover = new WindowMover(this);
        this.addMouseListener(mover);
        this.addMouseMotionListener(mover);

        this.setVisible(true);
    }

    public IProcessor getModProcessor()
    {
        return this.modProcessor;
    }

    public IProcessor getMCPProcessor()
    {
        return this.mcpProcessor;
    }

    public IProcessor getExternalFileProcessor()
    {
        return this.externalFileProcessor;
    }

    public static MainFrame getInstance()
    {
        return instance;
    }
}
