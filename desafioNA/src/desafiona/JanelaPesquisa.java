package desafiona;

import javax.swing.JOptionPane;

public class JanelaPesquisa extends javax.swing.JFrame {
    //declaração e designação de variáveis:
    public static int proxCrt = 0, proxUpdt = 0, proxPrior = 0, proxFiltro = 0, proxFiltroData = 0; //indices
    public static String respostaFiltro, resposta, anoInicio, anoFim; //respostas dadas pelos componentes (jComboBox, jTextField, etc)
    public boolean apertadoFiltro = false; //identificação de botão clicado

    /*Início do Construtor da Janela de Pesquisa que inicializa os componentes da janela*/
    
    public JanelaPesquisa() {
        initComponents();
    }
    /*Fim do Construtor da Janela de Pesquisa que inicializa os componentes da janela*/
    
    /*Início da declaração e designação dos componentes da janela*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxClassificacao = new javax.swing.JComboBox<>();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        tituloSistemaJLabel = new javax.swing.JLabel();
        jLabelClassificacao = new javax.swing.JLabel();
        jLabelFiltro = new javax.swing.JLabel();
        jButtonPagDir = new javax.swing.JButton();
        jButtonPagEsq = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneResultadoPesquisa = new javax.swing.JTextPane();
        jFormattedTextFieldIntervaloInicio = new javax.swing.JFormattedTextField();
        jFormattedTextFieldIntervaloFim = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonIntervalo = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Classificação de Tickets da NeoAssist");
        setBackground(new java.awt.Color(204, 255, 255));
        setMaximizedBounds(new java.awt.Rectangle(840, 720, 840, 720));
        setMaximumSize(new java.awt.Dimension(840, 720));
        setMinimumSize(new java.awt.Dimension(840, 720));
        setPreferredSize(new java.awt.Dimension(840, 720));
        setResizable(false);

        jComboBoxClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Data de Criação", "Data de Atualização", "Prioridade" }));
        jComboBoxClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClassificacaoActionPerformed(evt);
            }
        });

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Prioridade Alta", "Prioridade Normal" }));
        jComboBoxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltroActionPerformed(evt);
            }
        });

        tituloSistemaJLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        tituloSistemaJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloSistemaJLabel.setLabelFor(this);
        tituloSistemaJLabel.setText("SISTEMA DE CLASSIFICAÇÃO DE TICKETS");

        jLabelClassificacao.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabelClassificacao.setLabelFor(jComboBoxClassificacao);
        jLabelClassificacao.setText("Ordenar por:");
        jLabelClassificacao.setToolTipText("Selecione uma opção");

        jLabelFiltro.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabelFiltro.setLabelFor(jComboBoxFiltro);
        jLabelFiltro.setText("Filtrar por:");

        jButtonPagDir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPagDir.setText(">");
        jButtonPagDir.setToolTipText("Próxima Página");
        jButtonPagDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagDirActionPerformed(evt);
            }
        });

        jButtonPagEsq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPagEsq.setText("<");
        jButtonPagEsq.setToolTipText("Página Anterior");
        jButtonPagEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagEsqActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        jLabel1.setText("Anterior");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        jLabel2.setText("Seguinte");

        jTextPaneResultadoPesquisa.setEditable(false);
        jTextPaneResultadoPesquisa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPaneResultadoPesquisa.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextPaneResultadoPesquisa.setText("Por favor, selecione a ordenação ou filtro de sua preferência!");
        jTextPaneResultadoPesquisa.setToolTipText("Sua pesquisa aparecerá aqui");
        jScrollPane1.setViewportView(jTextPaneResultadoPesquisa);

        jFormattedTextFieldIntervaloInicio.setText("AAAA");
        jFormattedTextFieldIntervaloInicio.setToolTipText("(AAAA)");
        jFormattedTextFieldIntervaloInicio.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        jFormattedTextFieldIntervaloFim.setText("AAAA");
        jFormattedTextFieldIntervaloFim.setToolTipText("(AAAA)");
        jFormattedTextFieldIntervaloFim.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel3.setText("De:");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel4.setText("Até:");

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel6.setText("Filtrar por Intervalo:");

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel8.setText("Página(s)");

        jButtonIntervalo.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jButtonIntervalo.setText("Filtrar por Intervalo");
        jButtonIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIntervaloActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        jButtonLimpar.setText("Limpar Pesquisa Atual");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPagEsq)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(33, 33, 33)
                .addComponent(jButtonPagDir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(236, 236, 236))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(tituloSistemaJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jButtonLimpar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelClassificacao)
                            .addComponent(jComboBoxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFiltro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldIntervaloInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldIntervaloFim, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(jButtonIntervalo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloSistemaJLabel)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClassificacao)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabelFiltro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldIntervaloFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextFieldIntervaloInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIntervalo)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jButtonPagDir)
                    .addComponent(jButtonPagEsq)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*Fim da declaração e designação dos componentes da janela*/
    
    /*Início do método mostraResultadoFiltroData, a qual é responsável por escrever no painel de texto da janela
    os tickets que se encontram dentro do intervalo requerido*/
    
    public void mostraResultadoFiltroData(String comeco, String fim) {
        //o if abaixo verifica se o ano do ticket em questão está dentro do intervalo; se sim, escreve no painel de texto.
        if ((DesafioNA.tickets[proxFiltroData].getAnoCrt() >= Integer.parseInt(comeco)) && (DesafioNA.tickets[proxFiltroData].getAnoCrt() <= Integer.parseInt(fim))) {
            jTextPaneResultadoPesquisa.setText("DATA CRIAÇÃO: " + DesafioNA.tickets[proxFiltroData].getDiaCrt() + "/"
                    + DesafioNA.tickets[proxFiltroData].getMesCrt() + "/" + DesafioNA.tickets[proxFiltroData].getAnoCrt()
                    + "\n ------------ \n\n" + DesafioNA.tickets[proxFiltroData].getTextoLegivel());

        }
    }
    
    /*Fim do método mostraResultadoFiltroData*/
    
    /*Início do método mostraResultadoFiltro, a qual é responsável por escrever no painel de texto da janela
    os tickets que se encontram dentro de determinada opção do jComboBoxFiltro*/
    
    public void mostraResultadoFiltro() {
        //os ifs mais externos verificam a opção selecionada no comboBox e fazem a triagem de acordo
        if (respostaFiltro.contains("Prioridade Alta")) {
            jTextPaneResultadoPesquisa.setText("");
            //chamada da função que ordena os tickets com base no critério selecionado
            DesafioNA.comp.ordenaTickets(DesafioNA.tickets, "Pnt");
            //triagem entre prioridade alta x normal
            /*20 é a nota de corte entre as pontuações, que foi necessária para que houvesse uma melhor distribuição de prioridades*/
            if (DesafioNA.tickets[proxFiltro].getPontuacao() >= 20) {
                jTextPaneResultadoPesquisa.setText("PRIORIDADE: ALTA" + "\n ------------ \n\n" + DesafioNA.tickets[proxFiltro].getTextoLegivel());
            } else {
                jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                proxFiltro = 0;
            }
        } else {
            //idem ao processo acima
            if (respostaFiltro.contains("Prioridade Normal")) {
                jTextPaneResultadoPesquisa.setText("");
                DesafioNA.comp.ordenaTickets(DesafioNA.tickets, "PntInverso");
                if (DesafioNA.tickets[proxFiltro].getPontuacao() < 20) {
                    jTextPaneResultadoPesquisa.setText("PRIORIDADE: NORMAL" + "\n ------------ \n\n" + DesafioNA.tickets[proxFiltro].getTextoLegivel());
                } else {
                    jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                    proxFiltro = 0;
                }
            }
        }
    }

    /*Fim do método mostraResultadoFiltro*/
    
    /*Início do método jComboBoxFiltroActionPerformed, a qual é responsável por identificar ações realizadas no
    componente e delegação da ação de resposta do Filtro*/
    
    private void jComboBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiltroActionPerformed
        respostaFiltro = evt.toString();
        resposta = "nada";
        mostraResultadoFiltro();
    }//GEN-LAST:event_jComboBoxFiltroActionPerformed
    
    /*Fim do método jComboBoxFiltroActionPerformed*/
    
    // --------------------------
    
    /*Início do método jComboBoxClassificacaoActionPerformed, a qual é responsável por identificar ações realizadas no
    componente e delegação da ação de resposta da Ordenação*/
    
    private void jComboBoxClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClassificacaoActionPerformed
        //String resposta;
        resposta = evt.toString();
        respostaFiltro = "nada";
        mostraResultadoClassificacao();
    }//GEN-LAST:event_jComboBoxClassificacaoActionPerformed

    /*Fim do método jComboBoxFiltroActionPerformed*/
    
    // --------------------------
    
    
    /*Início do método mostraResultadoClassificacao, a qual é responsável por escrever no painel de texto da janela
    os tickets que se encontram dentro de determinada opção do jComboBoxClassificacao*/
    
    public void mostraResultadoClassificacao() {
        //idem à mostraResultadoFiltro, porém com critérios de ordenação e escrita diferentes
        if (resposta.contains("Criação")) {
            jTextPaneResultadoPesquisa.setText("");
            DesafioNA.comp.ordenaTickets(DesafioNA.tickets, "Crt");
            jTextPaneResultadoPesquisa.setText("DATA CRIAÇÃO: " + DesafioNA.tickets[proxCrt].getDiaCrt() + "/"
                    + DesafioNA.tickets[proxCrt].getMesCrt() + "/" + DesafioNA.tickets[proxCrt].getAnoCrt()
                    + "\n ------------ \n\n" + DesafioNA.tickets[proxCrt].getTextoLegivel());

        } else {
            jTextPaneResultadoPesquisa.setText("");
            if (resposta.contains("Atualização")) {
                DesafioNA.comp.ordenaTickets(DesafioNA.tickets, "Updt");
                jTextPaneResultadoPesquisa.setText("DATA ATUALIZAÇÃO: " + DesafioNA.tickets[proxUpdt].getDiaUpdt() + "/"
                        + DesafioNA.tickets[proxUpdt].getMesUpdt() + "/" + DesafioNA.tickets[proxUpdt].getAnoUpdt()
                        + "\n ------------ \n\n" + DesafioNA.tickets[proxUpdt].getTextoLegivel());

            } else {
                jTextPaneResultadoPesquisa.setText("");
                if (resposta.contains("Prioridade")) {
                    DesafioNA.comp.ordenaTickets(DesafioNA.tickets, "Pnt");
                    //20 é a nota de corte entre as pontuações
                    if (DesafioNA.tickets[proxPrior].getPontuacao() >= 20) {
                        jTextPaneResultadoPesquisa.setText("PRIORIDADE: ALTA" + "\n ------------ \n\n" + DesafioNA.tickets[proxPrior].getTextoLegivel());
                    } else if (DesafioNA.tickets[proxPrior].getPontuacao() < 20) {
                        jTextPaneResultadoPesquisa.setText("PRIORIDADE: NORMAL" + "\n ------------ \n\n" + DesafioNA.tickets[proxPrior].getTextoLegivel());
                    }
                }
            }
        }
    }

    /*Fim do método mostraResultadoClassificacao*/
    
    // --------------------------
    
    /*Início do método jButtonPagEsqActionPerformed, a qual é responsável por identificar ações realizadas no
    componente e delegação da ação de resposta do botão de página anterior*/
    
    private void jButtonPagEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagEsqActionPerformed
        //aqui as variáveis são decrementadas para que tenha-se acesso à página/ticket anterior
        if (apertadoFiltro == true) {
            if (proxFiltroData > 0) {
                proxFiltroData--;
                mostraResultadoFiltroData(anoInicio, anoFim);
            } else {
                jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
            }
        } else {

            if (respostaFiltro.contains("Alta")) {
                if (proxFiltro > 0) {
                    proxFiltro--;
                    mostraResultadoFiltro();
                } else {
                    jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                }
            } else {
                if (respostaFiltro.contains("Normal")) {
                    if (proxFiltro > 0) {
                        proxFiltro--;
                        mostraResultadoFiltro();
                    } else {
                        jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                    }
                }
            }

            if (resposta.contains("Criação")) {
                if (proxCrt > 0) {
                    proxCrt--;
                    mostraResultadoClassificacao();
                } else {
                    jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                }
            } else {
                if (resposta.contains("Atualização")) {
                    if (proxUpdt > 0) {
                        proxUpdt--;
                        mostraResultadoClassificacao();
                    } else {
                        jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                    }
                } else {
                    if (resposta.contains("Prioridade")) {
                        if (proxPrior > 0) {
                            proxPrior--;
                            mostraResultadoClassificacao();
                        } else {
                            jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonPagEsqActionPerformed

    /*Fim do método jButtonPagEsqActionPerformed*/
    
    // --------------------------
    
    /*Início do método jButtonPagDirActionPerformed, a qual é responsável por identificar ações realizadas no
    componente e delegação da ação de resposta do botão de página posterior*/
    
    private void jButtonPagDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagDirActionPerformed
        //aqui as variáveis são incrementadas para que tenha-se acesso à página/ticket posterior
        if (apertadoFiltro == true) {
            if (proxFiltroData < 24) {
                proxFiltroData++;
                mostraResultadoFiltroData(anoInicio, anoFim);
            } else {
                jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
            }
        } else {

            if (respostaFiltro.contains("Alta")) {
                if (proxFiltro < 24) {
                    proxFiltro++;
                    mostraResultadoFiltro();
                } else {
                    jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                    //proxFiltro = 0;
                }
            } else {
                if (respostaFiltro.contains("Normal")) {
                    if (proxFiltro < 24) {
                        proxFiltro++;
                        mostraResultadoFiltro();
                    } else {
                        jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                        //proxFiltro = 0;
                    }
                }
            }

            if (resposta.contains("Criação")) {
                if (proxCrt < 24) {
                    proxCrt++;
                    mostraResultadoClassificacao();
                } else {
                    jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                }
            } else {
                if (resposta.contains("Atualização")) {
                    if (proxUpdt < 24) {
                        proxUpdt++;
                        mostraResultadoClassificacao();
                    } else {
                        jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                    }
                } else {
                    if (resposta.contains("Prioridade")) {
                        if (proxPrior < 24) {
                            proxPrior++;
                            mostraResultadoClassificacao();
                        } else {
                            jTextPaneResultadoPesquisa.setText("OS TICKETS ACABARAM! ;D");
                        }

                    }
                }
            }
        }

    }//GEN-LAST:event_jButtonPagDirActionPerformed

    /*Fim do método jButtonPagDirActionPerformed*/
    
    // --------------------------
    
    /*Início do método jButtonIntervaloActionPerformed, a qual é responsável por identificar ações realizadas no
    componente e delegação da ação de resposta do intervalo*/
    
    private void jButtonIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIntervaloActionPerformed
        //pega os dados digitados pelo usuário nos campos de entrada e verifica se estão corretos;
        //se sim, delega a responsabilidade de resposta;
        //se não, mostra a mensagem de erro;
        anoInicio = jFormattedTextFieldIntervaloInicio.getText();
        anoFim = jFormattedTextFieldIntervaloFim.getText();

        jFormattedTextFieldIntervaloInicio.setText("");
        jFormattedTextFieldIntervaloFim.setText("");

        if ((anoInicio.length() > 4) || (anoFim.length() > 4) || (anoFim.length() < 4) || (anoInicio.length() < 4)) {
            JOptionPane.showMessageDialog(null, "Data em formato errado! \n Repita o processo utilizando o formato de ano com 4 dígitos (AAAA) numéricos apenas!");
        } else {
            try {

                mostraResultadoFiltroData(anoInicio, anoFim);
                apertadoFiltro = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Data em formato errado! \n Repita o processo utilizando o formato de ano com 4 dígitos (AAAA) numéricos apenas!");
            }
        }
    }//GEN-LAST:event_jButtonIntervaloActionPerformed

    /*Fim do método jButtonIntervaloActionPerformed*/
    
    // --------------------------
    
    /*Início do método jButtonLimparActionPerformed, a qual é responsável por limpar o texto da pesquisa anterior e 
    preparar as variáveis para uma nova pesquisa*/
    
    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        //variáveis reiniciadas para uma nova pesquisa;
        jTextPaneResultadoPesquisa.setText("");
        proxCrt = 0;
        proxUpdt = 0;
        proxPrior = 0;
        proxFiltro = 0;
        proxFiltroData = 0;
        apertadoFiltro = false;
    }//GEN-LAST:event_jButtonLimparActionPerformed

    /*Fim do método jButtonIntervaloLimparPerformed*/
    
    // --------------------------
    
    /*Início do método init, que cria a janela e a inicializa*/
    
    public void init() {
        //criação e inicialização da janela com as características selecionadas
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPesquisa().setVisible(true);
            }
        });
    }
    
    /*Fim do método init*/
    
    // --------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIntervalo;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPagDir;
    private javax.swing.JButton jButtonPagEsq;
    private javax.swing.JComboBox<String> jComboBoxClassificacao;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JFormattedTextField jFormattedTextFieldIntervaloFim;
    private javax.swing.JFormattedTextField jFormattedTextFieldIntervaloInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClassificacao;
    private javax.swing.JLabel jLabelFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPaneResultadoPesquisa;
    private javax.swing.JLabel tituloSistemaJLabel;
    // End of variables declaration//GEN-END:variables
}
