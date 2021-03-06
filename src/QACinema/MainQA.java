/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QACinema;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author Ratib
 */
public class MainQA extends javax.swing.JFrame {

	/**
	 * Creates new form MainQA
	 */
	public MainQA() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialise the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblTop = new javax.swing.JLabel();
        jlblTop2 = new javax.swing.JLabel();
        jplTktTp = new javax.swing.JPanel();
        jlblTktTp = new javax.swing.JLabel();
        jlblNoTkt = new javax.swing.JLabel();
        jlblDay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbStd = new javax.swing.JComboBox<>();
        jcbOap = new javax.swing.JComboBox<>();
        jcbSdnt = new javax.swing.JComboBox<>();
        jcbChld = new javax.swing.JComboBox<>();
        jcbDay = new javax.swing.JComboBox<>();
        jplTktTp1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlblDate = new javax.swing.JLabel();
        jlblTime = new javax.swing.JLabel();
        jlblNoT = new javax.swing.JLabel();
        jlblON = new javax.swing.JLabel();
        jlblDis = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jlblOrdDet = new javax.swing.JLabel();
        jlblPrices = new javax.swing.JLabel();
        jlblPrices1 = new javax.swing.JLabel();
        jbtnExit = new javax.swing.JButton();
        jbtnRst = new javax.swing.JButton();
        jbtnCout = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jlblTop.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        jlblTop.setForeground(new java.awt.Color(153, 153, 153));
        jlblTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTop.setText("QA Cinema ...........................");

        jlblTop2.setFont(new java.awt.Font("Lucida Blackletter", 0, 24)); // NOI18N
        jlblTop2.setForeground(new java.awt.Color(153, 153, 153));
        jlblTop2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTop2.setText("Live the movie like an actor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlblTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblTop2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTop)
                    .addComponent(jlblTop2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jplTktTp.setBackground(new java.awt.Color(51, 51, 51));
        jplTktTp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jplTktTp.setForeground(new java.awt.Color(51, 51, 51));
        jplTktTp.setPreferredSize(new java.awt.Dimension(430, 222));

        jlblTktTp.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblTktTp.setForeground(new java.awt.Color(153, 153, 153));
        jlblTktTp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTktTp.setText("Ticket Type");
        jlblTktTp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jlblNoTkt.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblNoTkt.setForeground(new java.awt.Color(153, 153, 153));
        jlblNoTkt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNoTkt.setText("No. of Tickets");
        jlblNoTkt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jlblDay.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblDay.setForeground(new java.awt.Color(153, 153, 153));
        jlblDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDay.setText("Choose A Day");
        jlblDay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Standard");
        jLabel1.setSize(new java.awt.Dimension(50, 16));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OAP");
        jLabel2.setSize(new java.awt.Dimension(50, 16));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student");
        jLabel3.setSize(new java.awt.Dimension(50, 16));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Child");
        jLabel4.setSize(new java.awt.Dimension(50, 16));

        jcbStd.setBackground(new java.awt.Color(102, 102, 102));
        jcbStd.setForeground(new java.awt.Color(204, 204, 204));
        jcbStd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jcbOap.setBackground(new java.awt.Color(102, 102, 102));
        jcbOap.setForeground(new java.awt.Color(204, 204, 204));
        jcbOap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jcbSdnt.setBackground(new java.awt.Color(102, 102, 102));
        jcbSdnt.setForeground(new java.awt.Color(204, 204, 204));
        jcbSdnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jcbChld.setBackground(new java.awt.Color(102, 102, 102));
        jcbChld.setForeground(new java.awt.Color(204, 204, 204));
        jcbChld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jcbDay.setBackground(new java.awt.Color(102, 102, 102));
        jcbDay.setForeground(new java.awt.Color(204, 204, 204));
        jcbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        javax.swing.GroupLayout jplTktTpLayout = new javax.swing.GroupLayout(jplTktTp);
        jplTktTp.setLayout(jplTktTpLayout);
        jplTktTpLayout.setHorizontalGroup(
            jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplTktTpLayout.createSequentialGroup()
                .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplTktTpLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jlblTktTp))
                    .addGroup(jplTktTpLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jplTktTpLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2))
                            .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplTktTpLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jlblNoTkt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplTktTpLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbOap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbStd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbSdnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbChld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)))
                .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblDay)
                    .addComponent(jcbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jplTktTpLayout.setVerticalGroup(
            jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplTktTpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTktTp)
                    .addComponent(jlblNoTkt)
                    .addComponent(jlblDay))
                .addGap(18, 18, 18)
                .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbStd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbOap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbSdnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplTktTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbChld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jplTktTp1.setBackground(new java.awt.Color(51, 51, 51));
        jplTktTp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jplTktTp1.setForeground(new java.awt.Color(51, 51, 51));
        jplTktTp1.setPreferredSize(new java.awt.Dimension(134, 222));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Time");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Number of Tickets");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Order Number");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Discount Amount");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Total");

        jlblDate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblDate.setForeground(new java.awt.Color(153, 153, 153));
        jlblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jlblTime.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblTime.setForeground(new java.awt.Color(153, 153, 153));
        jlblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jlblNoT.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblNoT.setForeground(new java.awt.Color(153, 153, 153));
        jlblNoT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNoT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jlblON.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblON.setForeground(new java.awt.Color(153, 153, 153));
        jlblON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblON.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jlblDis.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblDis.setForeground(new java.awt.Color(153, 153, 153));
        jlblDis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jlblTotal.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlblTotal.setForeground(new java.awt.Color(255, 0, 51));
        jlblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jlblOrdDet.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblOrdDet.setForeground(new java.awt.Color(153, 153, 153));
        jlblOrdDet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOrdDet.setText("Order Details");
        jlblOrdDet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        javax.swing.GroupLayout jplTktTp1Layout = new javax.swing.GroupLayout(jplTktTp1);
        jplTktTp1.setLayout(jplTktTp1Layout);
        jplTktTp1Layout.setHorizontalGroup(
            jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplTktTp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNoT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblON, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblDis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplTktTp1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblOrdDet)
                .addGap(139, 139, 139))
        );
        jplTktTp1Layout.setVerticalGroup(
            jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplTktTp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblOrdDet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jplTktTp1Layout.createSequentialGroup()
                        .addGroup(jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jplTktTp1Layout.createSequentialGroup()
                                .addGroup(jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jplTktTp1Layout.createSequentialGroup()
                                        .addGroup(jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jplTktTp1Layout.createSequentialGroup()
                                                .addGroup(jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jlblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6))
                                            .addComponent(jlblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7))
                                    .addComponent(jlblNoT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addComponent(jlblON, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(jlblDis, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplTktTp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jlblPrices.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblPrices.setForeground(new java.awt.Color(153, 153, 153));
        jlblPrices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPrices.setText("Prices ----------- Standard £8  -  OAP £6  -  Student £6  -  Child £4");
        jlblPrices.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jlblPrices1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlblPrices1.setForeground(new java.awt.Color(153, 153, 153));
        jlblPrices1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPrices1.setText("Special offer: Every Wednesday £2 off each ticket");
        jlblPrices1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jbtnExit.setBackground(new java.awt.Color(51, 51, 51));
        jbtnExit.setForeground(new java.awt.Color(204, 204, 204));
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnRst.setBackground(new java.awt.Color(51, 51, 51));
        jbtnRst.setForeground(new java.awt.Color(204, 204, 204));
        jbtnRst.setText("Reset");
        jbtnRst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRstActionPerformed(evt);
            }
        });

        jbtnCout.setBackground(new java.awt.Color(51, 51, 51));
        jbtnCout.setForeground(new java.awt.Color(204, 204, 204));
        jbtnCout.setText("Check Out");

        jbtnAdd.setBackground(new java.awt.Color(51, 51, 51));
        jbtnAdd.setForeground(new java.awt.Color(204, 204, 204));
        jbtnAdd.setText("Add to cart");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPrices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblPrices1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jplTktTp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnRst)
                                .addGap(81, 81, 81)
                                .addComponent(jbtnAdd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtnCout)
                                .addGap(120, 120, 120)
                                .addComponent(jbtnExit))
                            .addComponent(jplTktTp1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jlblPrices1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplTktTp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jplTktTp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCout)
                    .addComponent(jbtnExit)
                    .addComponent(jbtnAdd)
                    .addComponent(jbtnRst))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
		this.getContentPane().setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_formWindowActivated

    private void jbtnRstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRstActionPerformed
        // TODO add your handling code here:
		jcbStd.setSelectedIndex(0);
		jcbOap.setSelectedIndex(0);
		jcbSdnt.setSelectedIndex(0);
		jcbChld.setSelectedIndex(0);
		jcbDay.setSelectedIndex(0);
		jlblDate.setText(null);
		jlblTime.setText(null);
		jlblNoT.setText(null);
		jlblON.setText(null);
		jlblDis.setText(null);
		jlblTotal.setText(null);
    }//GEN-LAST:event_jbtnRstActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
		System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        
		//To generate random order number
		RandomOrder OrdNo = new RandomOrder();
		int Order = 0;
		jlblON.setText(String.valueOf(OrdNo.RandomOrdNum(Order)));
		
		//To check the time
		Calendar timer = Calendar.getInstance();
		timer.getTime();
		SimpleDateFormat tTime = new SimpleDateFormat("HH:mm a");
		jlblTime.setText(tTime.format(timer.getTime()) + " (UK)");
		
		//To check the date
		SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-yyyy");
		jlblDate.setText(tDate.format(timer.getTime()));

		//To get the total number of tickets
		numTkt();
		
//		totalPrice tot = new totalPrice();
//		jlblTotal.setText(String.valueOf(tot.getTotal()));

		//To set the prices
		setPrices();
		
		//To get the total price
		totalP();
		
		//To show the discount amount
		discount();
		
    }//GEN-LAST:event_jbtnAddActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainQA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainQA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainQA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainQA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainQA().setVisible(true);
			}
		});
	}
	
	private int StdNo = 0, OapNo = 0, SdntNo = 0, ChldNo = 0;
	private String Day;
	
	//To set the number of standard tickets
	public void setStdNo(int StdNo) {
		this.StdNo = Integer.parseInt((String)jcbStd.getSelectedItem());
	}
	
	//To get the number of standard tickets
	public int getStdNo() {
    return StdNo;
  }

	//To set the number of OAP tickets
	public void setOapNo(int OapNo) {
		this.OapNo = Integer.parseInt((String)jcbOap.getSelectedItem());
	}
	
	//To get the number of OAP tickets
	public int getOapNo() {
    return OapNo;
  }
	 
	//To set the number of student tickets
	public void setSdntNo(int SdntNo){
		this.SdntNo = Integer.parseInt((String)jcbSdnt.getSelectedItem());
	}
	 
	//To get the number of student tickets
	public int getSdntNo() {
    return SdntNo;
  }
	
	//To set the number of child tickets
	public void setChldNo(int ChldNo) {
		this.ChldNo = Integer.parseInt((String)jcbChld.getSelectedItem());
	}

	//To get the number of child tickets
	public int getChldNo() {
    return ChldNo;
  }
	
	//To set the booking day
	public void setDay(String Day) {
		this.Day = ((String)jcbDay.getSelectedItem());
	}
	
	public String getSelectedDay() {
		return (String)jcbDay.getSelectedItem();
    }

	public void numTkt() {
		int not =  (Integer.parseInt((String)jcbStd.getSelectedItem())) + (Integer.parseInt((String)jcbOap.getSelectedItem())) + 
				(Integer.parseInt((String)jcbSdnt.getSelectedItem())) + (Integer.parseInt((String)jcbChld.getSelectedItem()));
		jlblNoT.setText(String.valueOf(not));
		}

	int stnd, oap, stud, chld, total;
	
	public void totalP () {
	total = (stnd * (Integer.parseInt((String)jcbStd.getSelectedItem())) + (oap * (Integer.parseInt((String)jcbOap.getSelectedItem()))) + 
			(stud * (Integer.parseInt((String)jcbSdnt.getSelectedItem()))) + (chld * (Integer.parseInt((String)jcbChld.getSelectedItem()))));
	jlblTotal.setText("£ " + String.valueOf(total));
	}
	
	public void setPrices(){
		if (getSelectedDay().equals("Wednesday")) {
		stnd = 6; oap = 4; stud = 4; chld = 2;
		}
		else {
		stnd = 8; oap = 6; stud = 6; chld = 4;
		}
	}
	
	public void discount(){
		int discAmount;
		if (getSelectedDay().equals("Wednesday")) {
		discAmount =  ((Integer.parseInt((String)jcbStd.getSelectedItem())) * 2 ) + ((Integer.parseInt((String)jcbOap.getSelectedItem()))* 2 ) + 
				((Integer.parseInt((String)jcbSdnt.getSelectedItem())) * 2 ) + ((Integer.parseInt((String)jcbChld.getSelectedItem())) * 2 );
		jlblDis.setText("£ " + String.valueOf(discAmount));
		}
		else {
		discAmount = 0;
		jlblDis.setText("£ " + String.valueOf(discAmount));
		}
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnCout;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnRst;
    private javax.swing.JComboBox<String> jcbChld;
    private javax.swing.JComboBox<String> jcbDay;
    private javax.swing.JComboBox<String> jcbOap;
    private javax.swing.JComboBox<String> jcbSdnt;
    public javax.swing.JComboBox<String> jcbStd;
    private javax.swing.JLabel jlblDate;
    private javax.swing.JLabel jlblDay;
    private javax.swing.JLabel jlblDis;
    public javax.swing.JLabel jlblNoT;
    private javax.swing.JLabel jlblNoTkt;
    private javax.swing.JLabel jlblON;
    private javax.swing.JLabel jlblOrdDet;
    private javax.swing.JLabel jlblPrices;
    private javax.swing.JLabel jlblPrices1;
    private javax.swing.JLabel jlblTime;
    private javax.swing.JLabel jlblTktTp;
    private javax.swing.JLabel jlblTop;
    private javax.swing.JLabel jlblTop2;
    public javax.swing.JLabel jlblTotal;
    private javax.swing.JPanel jplTktTp;
    private javax.swing.JPanel jplTktTp1;
    // End of variables declaration//GEN-END:variables
}
