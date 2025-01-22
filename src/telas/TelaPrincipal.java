package telas;

import Interface.TelaCriarConta;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelos.Restaurante;
import modelos.Usuario;
import servicos.ServicoAvaliacao;
import servicos.ServicoRestaurante;
import servicos.ServicoUsuario;




public class TelaPrincipal extends javax.swing.JFrame {
    
    public TelaPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainCadastrado = new javax.swing.JPanel();
        btnRestaurantesMainCadastrado = new javax.swing.JButton();
        btnMinhasAvMainCadastrado = new javax.swing.JButton();
        btnSairMainCadastrado = new javax.swing.JButton();
        pnlRestaurantes = new javax.swing.JPanel();
        txtBuscaRestaurantes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarRestaurantes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantes = new javax.swing.JTable();
        btnMeusRestaurantes = new javax.swing.JButton();
        btnFazerAvaliacao = new javax.swing.JButton();
        btnVoltarRestaurantes = new javax.swing.JButton();
        pnlLogin = new javax.swing.JPanel();
        txtUsuarioLogin = new javax.swing.JTextField();
        txtSenhaLogin = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnAcessarLogin = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblCriarConta = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pnlMainVisitante = new javax.swing.JPanel();
        txtBuscarRestauranteVisitante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarRestVisitante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRestauranteVisitante = new javax.swing.JTable();
        btnSairVisitante = new javax.swing.JButton();
        pnlMinhasAvaliacoes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMinhasAvaliacoes = new javax.swing.JTable();
        txtBuscarMinhasAvaliacoes = new javax.swing.JTextField();
        btnVoltarMinhasAvaliacoes = new javax.swing.JButton();
        btnEditarMinhasAvaliacoes = new javax.swing.JButton();
        btnSalvarMinhasAvaliacoes = new javax.swing.JButton();
        btnExcluirMinhasAvaliacoes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtComentarioMinhasAvaliacoes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNotaMinhasAvaliacoes = new javax.swing.JTextField();
        btnBuscarMinhasAvaliacoes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pnlMeusRestaurantes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMeusRestaurantes = new javax.swing.JTable();
        txtBuscarMeusRestaurantes = new javax.swing.JTextField();
        btnBuscarMeusRestaurantes = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCriarRestaurante = new javax.swing.JButton();
        btnVoltarMeusRestaurantes = new javax.swing.JButton();
        pnlFazerAvaliacao = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRestauranteAvaliacao = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtNotaAvaliacao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnSalvarFazerAvaliacao = new javax.swing.JButton();
        btnVoltarFazerAvaliacao = new javax.swing.JButton();
        txtBuscarFazerAvaliacao = new javax.swing.JTextField();
        btnBuscarFazerAvaliacao = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        pnlMainCadastrado.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlMainCadastradoComponentShown(evt);
            }
        });

        btnRestaurantesMainCadastrado.setText("RESTAURANTES");
        btnRestaurantesMainCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantesMainCadastradoActionPerformed(evt);
            }
        });

        btnMinhasAvMainCadastrado.setText("MINHAS AVALIAÇÕES");

        btnSairMainCadastrado.setText("SAIR");

        javax.swing.GroupLayout pnlMainCadastradoLayout = new javax.swing.GroupLayout(pnlMainCadastrado);
        pnlMainCadastrado.setLayout(pnlMainCadastradoLayout);
        pnlMainCadastradoLayout.setHorizontalGroup(
            pnlMainCadastradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainCadastradoLayout.createSequentialGroup()
                .addGroup(pnlMainCadastradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainCadastradoLayout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(pnlMainCadastradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRestaurantesMainCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMinhasAvMainCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(pnlMainCadastradoLayout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(btnSairMainCadastrado)))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        pnlMainCadastradoLayout.setVerticalGroup(
            pnlMainCadastradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainCadastradoLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnRestaurantesMainCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMinhasAvMainCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSairMainCadastrado)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMainCadastrado, "card3");

        pnlRestaurantes.setPreferredSize(new java.awt.Dimension(887, 618));
        pnlRestaurantes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlRestaurantesComponentShown(evt);
            }
        });

        jLabel3.setText("Buscar Restaurantes");

        btnBuscarRestaurantes.setText("S");
        btnBuscarRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRestaurantesActionPerformed(evt);
            }
        });

        tblRestaurantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurante", "Avaliações", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurantes);

        btnMeusRestaurantes.setText("MEUS RESTAURANTES");

        btnFazerAvaliacao.setText("FAZER AVALIAÇÃO");
        btnFazerAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerAvaliacaoActionPerformed(evt);
            }
        });

        btnVoltarRestaurantes.setText("VOLTAR");
        btnVoltarRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarRestaurantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRestaurantesLayout = new javax.swing.GroupLayout(pnlRestaurantes);
        pnlRestaurantes.setLayout(pnlRestaurantesLayout);
        pnlRestaurantesLayout.setHorizontalGroup(
            pnlRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRestaurantesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnVoltarRestaurantes)
                .addGap(230, 230, 230)
                .addGroup(pnlRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pnlRestaurantesLayout.createSequentialGroup()
                        .addComponent(txtBuscaRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRestaurantesLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(pnlRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRestaurantesLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnMeusRestaurantes)
                        .addGap(115, 115, 115)
                        .addComponent(btnFazerAvaliacao)))
                .addGap(119, 119, 119))
        );
        pnlRestaurantesLayout.setVerticalGroup(
            pnlRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRestaurantesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(btnVoltarRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarRestaurantes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMeusRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFazerAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRestaurantes, "card4");

        txtUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioLoginActionPerformed(evt);
            }
        });

        lblUsuario.setText("Usuário");

        lblSenha.setText("Senha");

        btnAcessarLogin.setText("ACESSAR");
        btnAcessarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarLoginActionPerformed(evt);
            }
        });

        lblCriarConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCriarConta.setText("Criar Conta");
        lblCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCriarContaMouseClicked(evt);
            }
        });

        lblEmail.setText("E-mail");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(btnAcessarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(lblCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmail)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblCriarConta)
                        .addGap(40, 40, 40)
                        .addComponent(btnAcessarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLogin, "card2");

        jLabel4.setText("Buscar Restaurante");

        btnBuscarRestVisitante.setText("S");

        tblRestauranteVisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurante", "Avaliações", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRestauranteVisitante);

        btnSairVisitante.setText("SAIR");

        javax.swing.GroupLayout pnlMainVisitanteLayout = new javax.swing.GroupLayout(pnlMainVisitante);
        pnlMainVisitante.setLayout(pnlMainVisitanteLayout);
        pnlMainVisitanteLayout.setHorizontalGroup(
            pnlMainVisitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainVisitanteLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(pnlMainVisitanteLayout.createSequentialGroup()
                .addGroup(pnlMainVisitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainVisitanteLayout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addGroup(pnlMainVisitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(pnlMainVisitanteLayout.createSequentialGroup()
                                .addComponent(txtBuscarRestauranteVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarRestVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlMainVisitanteLayout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(btnSairVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainVisitanteLayout.setVerticalGroup(
            pnlMainVisitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainVisitanteLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMainVisitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarRestauranteVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarRestVisitante))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSairVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMainVisitante, "card5");

        tblMinhasAvaliacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurante", "Comentário", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMinhasAvaliacoes);

        btnVoltarMinhasAvaliacoes.setText("VOLTAR");

        btnEditarMinhasAvaliacoes.setText("EDITAR");

        btnSalvarMinhasAvaliacoes.setText("SAVAR");

        btnExcluirMinhasAvaliacoes.setText("EXCLUIR");

        jLabel5.setText("Comentário");

        txtComentarioMinhasAvaliacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComentarioMinhasAvaliacoesActionPerformed(evt);
            }
        });

        jLabel6.setText("Nota");

        btnBuscarMinhasAvaliacoes.setText("S");

        jLabel7.setText("Buscar Restaurante");

        javax.swing.GroupLayout pnlMinhasAvaliacoesLayout = new javax.swing.GroupLayout(pnlMinhasAvaliacoes);
        pnlMinhasAvaliacoes.setLayout(pnlMinhasAvaliacoesLayout);
        pnlMinhasAvaliacoesLayout.setHorizontalGroup(
            pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMinhasAvaliacoesLayout.createSequentialGroup()
                .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMinhasAvaliacoesLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMinhasAvaliacoesLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMinhasAvaliacoesLayout.createSequentialGroup()
                                .addComponent(btnEditarMinhasAvaliacoes)
                                .addGap(62, 62, 62)
                                .addComponent(btnSalvarMinhasAvaliacoes)
                                .addGap(68, 68, 68)
                                .addComponent(btnExcluirMinhasAvaliacoes))
                            .addGroup(pnlMinhasAvaliacoesLayout.createSequentialGroup()
                                .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtComentarioMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNotaMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))))
                    .addGroup(pnlMinhasAvaliacoesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnVoltarMinhasAvaliacoes)
                        .addGap(264, 264, 264)
                        .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(pnlMinhasAvaliacoesLayout.createSequentialGroup()
                                .addComponent(txtBuscarMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnlMinhasAvaliacoesLayout.setVerticalGroup(
            pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMinhasAvaliacoesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMinhasAvaliacoes))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComentarioMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNotaMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnlMinhasAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirMinhasAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        getContentPane().add(pnlMinhasAvaliacoes, "card6");

        tblMeusRestaurantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurante", "Avaliações", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblMeusRestaurantes);

        btnBuscarMeusRestaurantes.setText("S");

        jLabel8.setText("Buscar Restaurante");

        btnCriarRestaurante.setText("CRIAR RESTAURANTE");

        btnVoltarMeusRestaurantes.setText("VOLTAR");

        javax.swing.GroupLayout pnlMeusRestaurantesLayout = new javax.swing.GroupLayout(pnlMeusRestaurantes);
        pnlMeusRestaurantes.setLayout(pnlMeusRestaurantesLayout);
        pnlMeusRestaurantesLayout.setHorizontalGroup(
            pnlMeusRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeusRestaurantesLayout.createSequentialGroup()
                .addGroup(pnlMeusRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMeusRestaurantesLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMeusRestaurantesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnVoltarMeusRestaurantes)
                        .addGap(274, 274, 274)
                        .addGroup(pnlMeusRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(pnlMeusRestaurantesLayout.createSequentialGroup()
                                .addComponent(txtBuscarMeusRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarMeusRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlMeusRestaurantesLayout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(btnCriarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        pnlMeusRestaurantesLayout.setVerticalGroup(
            pnlMeusRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeusRestaurantesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlMeusRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltarMeusRestaurantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMeusRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarMeusRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMeusRestaurantes))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnCriarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMeusRestaurantes, "card7");

        pnlFazerAvaliacao.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlFazerAvaliacaoComponentShown(evt);
            }
        });

        tblRestauranteAvaliacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Restaurante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblRestauranteAvaliacao);

        jLabel9.setText("Comentário");

        jLabel10.setText("Nota");

        btnSalvarFazerAvaliacao.setText("SALVAR");
        btnSalvarFazerAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFazerAvaliacaoActionPerformed(evt);
            }
        });

        btnVoltarFazerAvaliacao.setText("VOLTAR");
        btnVoltarFazerAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarFazerAvaliacaoActionPerformed(evt);
            }
        });

        btnBuscarFazerAvaliacao.setText("S");
        btnBuscarFazerAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFazerAvaliacaoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Buscar Restaurante");

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane6.setViewportView(txtComentario);

        javax.swing.GroupLayout pnlFazerAvaliacaoLayout = new javax.swing.GroupLayout(pnlFazerAvaliacao);
        pnlFazerAvaliacao.setLayout(pnlFazerAvaliacaoLayout);
        pnlFazerAvaliacaoLayout.setHorizontalGroup(
            pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFazerAvaliacaoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnVoltarFazerAvaliacao)
                .addGap(173, 173, 173)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarFazerAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarFazerAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFazerAvaliacaoLayout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFazerAvaliacaoLayout.createSequentialGroup()
                        .addGroup(pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFazerAvaliacaoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(291, 291, 291))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFazerAvaliacaoLayout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)))
                        .addGroup(pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFazerAvaliacaoLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFazerAvaliacaoLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(62, 62, 62))
                                    .addComponent(txtNotaAvaliacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSalvarFazerAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );
        pnlFazerAvaliacaoLayout.setVerticalGroup(
            pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFazerAvaliacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFazerAvaliacaoLayout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarFazerAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarFazerAvaliacao)
                            .addComponent(jLabel11)))
                    .addComponent(btnVoltarFazerAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFazerAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFazerAvaliacaoLayout.createSequentialGroup()
                        .addComponent(txtNotaAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarFazerAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(pnlFazerAvaliacao, "card8");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtComentarioMinhasAvaliacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComentarioMinhasAvaliacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComentarioMinhasAvaliacoesActionPerformed

    private void btnRestaurantesMainCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantesMainCadastradoActionPerformed
        pnlMainCadastrado.setVisible(false);
        pnlRestaurantes.setVisible(true);
    }//GEN-LAST:event_btnRestaurantesMainCadastradoActionPerformed

    private void txtUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioLoginActionPerformed

    private void lblCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCriarContaMouseClicked
        TelaCriarConta telacadastro = new TelaCriarConta();
        telacadastro.setVisible(true);
    }//GEN-LAST:event_lblCriarContaMouseClicked

    private void btnAcessarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarLoginActionPerformed
        //==============================NICOLAS
        String usuario = txtUsuarioLogin.getText();
        String senha = txtSenhaLogin.getText();
        
        Usuario usuarioEncontrado = ServicoUsuario.getListaUsuarios().stream()
            .filter(u -> u.getNomeUsuario().equals(usuario))
            .findFirst()
            .orElse(null);
        
        if (usuarioEncontrado != null) {
            if (usuarioEncontrado.getSenha().equals(senha)){
                
                ServicoUsuario.usuarioAtual = usuarioEncontrado;
                pnlLogin.setVisible(false);
                pnlMainCadastrado.setVisible(true);
                pnlRestaurantes.setVisible(false);
                pnlMainVisitante.setVisible(false);
                pnlMinhasAvaliacoes.setVisible(false);
                pnlMeusRestaurantes.setVisible(false);
                pnlFazerAvaliacao.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha informada está incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);
                pnlLogin.setVisible(true);
                pnlMainCadastrado.setVisible(false);
                pnlRestaurantes.setVisible(false);
                pnlMainVisitante.setVisible(false);
                pnlMinhasAvaliacoes.setVisible(false);
                pnlMeusRestaurantes.setVisible(false);
                pnlFazerAvaliacao.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuário informado não existe.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAcessarLoginActionPerformed

    private void btnBuscarFazerAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFazerAvaliacaoActionPerformed
        String nomeProcurado = txtBuscarFazerAvaliacao.getText();
        TableModel modelo = tblRestauranteAvaliacao.getModel();
        for (int row = 0; row < modelo.getRowCount(); row++) {
            String nome = (String) modelo.getValueAt(row, 1); // Get value from "Name" column
            if (nome.equals(nomeProcurado)) {
                tblRestauranteAvaliacao.setRowSelectionInterval(row, row); // Select the row
                break; // Exit the loop once found
            }
        }
    }//GEN-LAST:event_btnBuscarFazerAvaliacaoActionPerformed

    private void btnFazerAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerAvaliacaoActionPerformed
        pnlRestaurantes.setVisible(false);
        pnlFazerAvaliacao.setVisible(true);
    }//GEN-LAST:event_btnFazerAvaliacaoActionPerformed

    private void pnlFazerAvaliacaoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlFazerAvaliacaoComponentShown
        final var colunas = new Object[] {"ID","Restaurante"};
        DefaultTableModel modeloAvalRestaurante = new DefaultTableModel(colunas,0);
        for (Restaurante restaurante : ServicoRestaurante.buscaTodos()){
            Object linha[] = new Object[] {restaurante.getIdRestaurante(), restaurante.getNome()};
            modeloAvalRestaurante.addRow(linha);
        }
        tblRestauranteAvaliacao.setModel(modeloAvalRestaurante);
        tblRestauranteAvaliacao.setDefaultEditor(Object.class, null);
    }//GEN-LAST:event_pnlFazerAvaliacaoComponentShown

    private void btnSalvarFazerAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFazerAvaliacaoActionPerformed
        String conteudo = txtComentario.getText();
        String sNota = txtNotaAvaliacao.getText();
        int restauranteEscolhido = tblRestauranteAvaliacao.getSelectedRow();
        
        if (!conteudo.isBlank() && ehNotaValida(sNota) && restauranteEscolhido != -1){
            float nota = Float.parseFloat(sNota);
            TableModel modelo = tblRestauranteAvaliacao.getModel(); 
            int idRestaurante = (int) tblRestauranteAvaliacao.getValueAt(restauranteEscolhido, 0);
            ServicoAvaliacao.criaAvaliacao( ServicoUsuario.getUsuarioAtual().getIdUsuario(), idRestaurante, conteudo, nota);
            JOptionPane.showMessageDialog(null, "Avaliação registrada com sucesso",
                    "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            limparAvalRestaurantes();
            return;
        }
        JOptionPane.showMessageDialog(null, "Campos inválidos",
                    "Mensagem", JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_btnSalvarFazerAvaliacaoActionPerformed

    private void btnVoltarRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarRestaurantesActionPerformed
    pnlRestaurantes.setVisible(false);
    pnlMainCadastrado.setVisible(true);
    }//GEN-LAST:event_btnVoltarRestaurantesActionPerformed

    private void btnVoltarFazerAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarFazerAvaliacaoActionPerformed
    pnlFazerAvaliacao.setVisible(false);
    pnlRestaurantes.setVisible(true);
    limparAvalRestaurantes();
    }//GEN-LAST:event_btnVoltarFazerAvaliacaoActionPerformed

    private void pnlMainCadastradoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlMainCadastradoComponentShown
        
    }//GEN-LAST:event_pnlMainCadastradoComponentShown

    private void pnlRestaurantesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlRestaurantesComponentShown
        final var colunas = new Object[] {"Restaurantes","Avaliações", " Média Notas"};
        DefaultTableModel modeloRestaurante = new DefaultTableModel(colunas,0);
        for (String[] resumo : ServicoRestaurante.buscaResumo()){
            Object linha[] = new Object[] {resumo[0], resumo[1], resumo[2]};
            modeloRestaurante.addRow(linha);
        }
        tblRestaurantes.setModel(modeloRestaurante);
        tblRestaurantes.setDefaultEditor(Object.class, null);
    }//GEN-LAST:event_pnlRestaurantesComponentShown

    private void btnBuscarRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRestaurantesActionPerformed
    String nomeProcurado = txtBuscaRestaurantes.getText();
        TableModel modelo = tblRestaurantes.getModel();
        for (int row = 0; row < modelo.getRowCount(); row++) {
            String nome = (String) modelo.getValueAt(row, 0); 
            if (nome.equals(nomeProcurado)) {
                tblRestaurantes.setRowSelectionInterval(row, row); 
                break;
            }
        }
    }//GEN-LAST:event_btnBuscarRestaurantesActionPerformed

    // Utils pnlFazerAvaliação
    
    private void limparAvalRestaurantes(){
        txtComentario.setText("");
        txtNotaAvaliacao.setText("");
        txtBuscarFazerAvaliacao.setText("");
        tblRestauranteAvaliacao.clearSelection();
    }
    
    public static boolean ehNotaValida(String str) {
    try {
        float nota = Float.parseFloat(str);
        return 10 >= nota && 0 <= nota;
    } catch (NumberFormatException e) {
        return false;
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessarLogin;
    private javax.swing.JButton btnBuscarFazerAvaliacao;
    private javax.swing.JButton btnBuscarMeusRestaurantes;
    private javax.swing.JButton btnBuscarMinhasAvaliacoes;
    private javax.swing.JButton btnBuscarRestVisitante;
    private javax.swing.JButton btnBuscarRestaurantes;
    private javax.swing.JButton btnCriarRestaurante;
    private javax.swing.JButton btnEditarMinhasAvaliacoes;
    private javax.swing.JButton btnExcluirMinhasAvaliacoes;
    private javax.swing.JButton btnFazerAvaliacao;
    private javax.swing.JButton btnMeusRestaurantes;
    private javax.swing.JButton btnMinhasAvMainCadastrado;
    private javax.swing.JButton btnRestaurantesMainCadastrado;
    private javax.swing.JButton btnSairMainCadastrado;
    private javax.swing.JButton btnSairVisitante;
    private javax.swing.JButton btnSalvarFazerAvaliacao;
    private javax.swing.JButton btnSalvarMinhasAvaliacoes;
    private javax.swing.JButton btnVoltarFazerAvaliacao;
    private javax.swing.JButton btnVoltarMeusRestaurantes;
    private javax.swing.JButton btnVoltarMinhasAvaliacoes;
    private javax.swing.JButton btnVoltarRestaurantes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblCriarConta;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlFazerAvaliacao;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlMainCadastrado;
    private javax.swing.JPanel pnlMainVisitante;
    private javax.swing.JPanel pnlMeusRestaurantes;
    private javax.swing.JPanel pnlMinhasAvaliacoes;
    private javax.swing.JPanel pnlRestaurantes;
    private javax.swing.JTable tblMeusRestaurantes;
    private javax.swing.JTable tblMinhasAvaliacoes;
    private javax.swing.JTable tblRestauranteAvaliacao;
    private javax.swing.JTable tblRestauranteVisitante;
    private javax.swing.JTable tblRestaurantes;
    private javax.swing.JTextField txtBuscaRestaurantes;
    private javax.swing.JTextField txtBuscarFazerAvaliacao;
    private javax.swing.JTextField txtBuscarMeusRestaurantes;
    private javax.swing.JTextField txtBuscarMinhasAvaliacoes;
    private javax.swing.JTextField txtBuscarRestauranteVisitante;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtComentarioMinhasAvaliacoes;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNotaAvaliacao;
    private javax.swing.JTextField txtNotaMinhasAvaliacoes;
    private javax.swing.JTextField txtSenhaLogin;
    private javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables
}
