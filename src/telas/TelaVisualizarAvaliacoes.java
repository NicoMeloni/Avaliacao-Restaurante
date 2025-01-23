/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelos.Avaliacao;
import modelos.Usuario;
import modelos.Restaurante;
import permanencia.interfaces.AvaliacaoDAO;
import servicos.ServicoAvaliacao;
import permanencia.interfaces.UsuarioDAO;
import servicos.ServicoUsuario;
import permanencia.interfaces.RestauranteDAO;
import servicos.ServicoRestaurante;


/**
 *
 * @author Nicopau
 */
public class TelaVisualizarAvaliacoes extends javax.swing.JFrame {

    private ArrayList<Avaliacao> avaliacoes = new ArrayList();
    public TelaVisualizarAvaliacoes(Restaurante restaurante) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lbl_nomeres.setText(restaurante.getNome());
        avaliacoes = ServicoRestaurante.buscarAvaliacoes(restaurante.getIdRestaurante());
        carregarTabelaAvaliacoes();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAva = new javax.swing.JTable();
        lblNomeRestauranteVisualizarMenu = new javax.swing.JLabel();
        lbl_nomeres = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuário", "Comentário", "Nota"
            }
        ));
        jScrollPane1.setViewportView(tblAva);

        lblNomeRestauranteVisualizarMenu.setText("Avaliações");

        lbl_nomeres.setText("AVA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNomeRestauranteVisualizarMenu)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_nomeres)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeRestauranteVisualizarMenu)
                    .addComponent(lbl_nomeres))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
public final void carregarTabelaAvaliacoes() {
        DefaultTableModel modeloAvas = new DefaultTableModel(new Object[] {"Usuario","comentario","nota"},0);
        for (Avaliacao avaliacao : avaliacoes){
            Object linha[] = new Object[]{ 
                ServicoUsuario.buscarPorId(avaliacao.getIdUsuario()).getNomeUsuario(), 
                avaliacao.getConteudo(),
                String.format("%.2f",avaliacao.getNota()).replace(",", ".")
            };
            modeloAvas.addRow(linha);
        }
        tblAva.setModel(modeloAvas);
        tblAva.setDefaultEditor(Object.class, null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeRestauranteVisualizarMenu;
    private javax.swing.JLabel lbl_nomeres;
    private javax.swing.JTable tblAva;
    // End of variables declaration//GEN-END:variables
}
