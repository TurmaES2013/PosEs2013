/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.oo.frontend;

import br.edu.unis.oo.negocio.Vinculo;
import java.awt.Point;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author alunos
 */
public class frmVinculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmVinculo
     */
    public frmVinculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVinculo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastro de vínculos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        tblVinculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVinculo.setToolTipText("Objeto de referência: Vinculo");
        tblVinculo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblVinculo.getColumnModel().getColumn(0).setPreferredWidth(200);
        tblVinculo.getColumnModel().getColumn(1).setPreferredWidth(700);
        tblVinculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVinculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVinculo);

        jLabel1.setText("Filtro:");

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNovo)
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltro))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(jLabel1)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DadosIniciais(){
        SessionFactory sfac = new Configuration().configure().buildSessionFactory();
        Session se = sfac.openSession();
        
        List vinculos = se.createQuery("from Vinculo order by descricao").list();
        DefaultTableModel model = (DefaultTableModel)this.tblVinculo.getModel();
        model.setNumRows(0);
                                      
        Iterator it = vinculos.iterator();
        while(it.hasNext()){
            Vinculo v = (Vinculo) it.next();
            model.addRow(new Object[]{v.getId(), v.getDescricao()});
        }
    }
    
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        
        frmDetalheVinculo dv = new frmDetalheVinculo(javax.swing.JOptionPane.getFrameForComponent(this), true);
        dv.id = "0";
        dv.setLocationRelativeTo(null);
        dv.setVisible(true);
        
        DadosIniciais();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
       DadosIniciais();
 
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
       
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
         SessionFactory sfac = new Configuration().configure().buildSessionFactory();
        Session se = sfac.openSession();
        
        List vinculos = se.createQuery("from Vinculo where descricao like '"+ this.txtFiltro.getText() +"%' order by descricao").list();
        DefaultTableModel model = (DefaultTableModel)this.tblVinculo.getModel();
        model.setNumRows(0);
        
        Iterator it = vinculos.iterator();
        while(it.hasNext()){
            Vinculo v = (Vinculo) it.next();
            model.addRow(new Object[]{v.getId(), v.getDescricao()});
        }
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void tblVinculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVinculoMouseClicked
       
        if(evt.getClickCount() == 2){
            Point p = evt.getPoint();
            int linha = tblVinculo.rowAtPoint(p);
            //int coluna = tblVinculo.columnAtPoint(p);
                       
            frmDetalheVinculo dv = new frmDetalheVinculo(javax.swing.JOptionPane.getFrameForComponent(this), true);
            
            dv.id = "" + tblVinculo.getValueAt(linha, 0);
            dv.descricao = "" + tblVinculo.getValueAt(linha, 1);
            
            dv.setLocationRelativeTo(null);
            dv.setVisible(true);
            
            DadosIniciais();
            
            
        }
        
    }//GEN-LAST:event_tblVinculoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVinculo;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
