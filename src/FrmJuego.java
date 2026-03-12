import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class FrmJuego extends JFrame {

    private JPanel pnlJugador1, pnlJugador2;
    private Jugador jugador1 = new Jugador();
    private Jugador jugador2 = new Jugador();

    public FrmJuego() {
        setSize(500, 300);
        setTitle("Juguemos al Apuntado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnRepartir = new JButton("Repartir");
        btnRepartir.setBounds(10, 10, 100, 25);
        add(btnRepartir);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(120, 10, 100, 25);
        add(btnVerificar);

        JTabbedPane tpJugadores = new JTabbedPane();
        tpJugadores.setBounds(10, 50, 460, 200);
        add(tpJugadores);

        pnlJugador1 = new JPanel();
        pnlJugador1.setLayout(null);
        pnlJugador1.setBackground(new Color(0, 255, 0));
        pnlJugador2 = new JPanel();
        pnlJugador2.setLayout(null);
        pnlJugador2.setBackground(new Color(0, 255, 255));

        tpJugadores.addTab("Martín EStrada Contreras", pnlJugador1);
        tpJugadores.addTab("Raúl Vidal", pnlJugador2);

        btnRepartir.addActionListener(e -> {
            repartir();
        });
        /* 
        btnRepartir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                repartir();
            }
        });
        */

    }

    private void repartir() {
        jugador1.repartir();
        jugador2.repartir();

        jugador1.mostrar(pnlJugador1);
        jugador2.mostrar(pnlJugador2);

    }

}
