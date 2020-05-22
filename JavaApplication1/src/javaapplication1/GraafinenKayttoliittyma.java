package javaapplication1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;

public class GraafinenKayttoliittyma extends JFrame {

    private Maksukortti maksukortti = new Maksukortti();
    private String maksutapa;
    private JTextArea textArea;

    private JButton buttonStart = new JButton("Start");
    private JButton buttonClear = new JButton("Clear");
    private JButton kortti = new JButton("Kortti");
    private JButton kateinen = new JButton("Käteinen");
    private JButton buttonLisaa = new JButton("Lisää rahaa");
    private JButton buttonTulosta = new JButton("Tulosta");

    private boolean korttipainettu = false;

    private PrintStream standardOut;

    public GraafinenKayttoliittyma() {
        super("Ohjelma");

        textArea = new JTextArea(50, 10);
        textArea.setEditable(false);
        PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));

        standardOut = System.out;

        System.setOut(printStream);
        System.setErr(printStream);

        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.WEST;

        add(buttonStart, constraints);

        constraints.gridx = 1;
        add(buttonClear, constraints);

        constraints.gridx = 2;
        add(kortti, constraints);

        constraints.gridx = 3;
        add(kateinen, constraints);

        constraints.gridx = 3;
        constraints.gridy = 1;
        add(buttonLisaa, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;

        add(new JScrollPane(textArea), constraints);

        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                kaynnistaOhjelma();

            }
        });
        
         buttonLisaa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                maksukortti.lisaaRahaa(5);

            }
        });

        kortti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    textArea.getDocument().remove(0,
                            textArea.getDocument().getLength());
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }

                System.out.println("lisaa - lisää rahaa kortille");
                System.out.println("ota - ota rahaa kortilta");
                System.out.println("tulosta - tulosta kortin arvo");
                System.out.println("lopeta - lopeta ohjelma");

            }
        });

        kateinen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    textArea.getDocument().remove(0,
                            textArea.getDocument().getLength());
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
                System.out.println("lisaa - lisää käteistä");
                System.out.println("ota - ota käteistä");
                System.out.println("tulosta - tulosta lompakon arvo");
                System.out.println("lopeta - lopeta ohjelma");
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // clears the text area
                try {
                    textArea.getDocument().remove(0,
                            textArea.getDocument().getLength());
                    standardOut.println("Text area cleared");
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }
        });

        buttonTulosta.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent evt) {
                 System.out.println();
            }

        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(
                480, 320);
        setLocationRelativeTo(
                null);
    }

    private void printLog() {
        Kayttoliittyma liittyma = new Kayttoliittyma();
        liittyma.kaynnista();
        System.out.println("asd");
    }

    public void kaynnistaOhjelma() {
        Maksukortti kortti = new Maksukortti();
        Kateinen kateinen = new Kateinen();
        Lompakko lompakko = new Lompakko();
        System.out.println("Kortti vai käteinen?");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GraafinenKayttoliittyma().setVisible(true);
            }
        });
    }
}
