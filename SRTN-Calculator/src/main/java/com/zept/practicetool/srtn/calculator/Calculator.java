package com.zept.practicetool.srtn.calculator;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Allen James Laxamana
 */
public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
    }

    // Global variable to keep track of the number of completed processes and the time spent
    static int completedProcess = 0;
    static int timeSpent = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserInput = new javax.swing.JTable();
        lblUserInput = new javax.swing.JLabel();
        lblGantt = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblChart = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        slderNoOfProcess = new javax.swing.JSlider();
        lblMin = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblWaiting = new javax.swing.JLabel();
        lblAverageTurn = new javax.swing.JLabel();
        lblAverageWaiting = new javax.swing.JLabel();
        txtAverageTurn = new javax.swing.JTextField();
        txtAverageWaiting = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblTurn = new javax.swing.JTable();
        lblTurn = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblWaiting = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shortest Remaining Time Next (STRN) Calculator");

        tblUserInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "Arrival Time", "Burst Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblUserInput);

        lblUserInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserInput.setText("USER INPUT");

        lblGantt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGantt.setText("GANTT CHART");

        tblChart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tblChart);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        slderNoOfProcess.setMaximum(6);
        slderNoOfProcess.setMinimum(2);
        slderNoOfProcess.setMinorTickSpacing(1);
        slderNoOfProcess.setPaintLabels(true);
        slderNoOfProcess.setPaintTicks(true);
        slderNoOfProcess.setSnapToTicks(true);
        slderNoOfProcess.setValue(2);
        slderNoOfProcess.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slderNoOfProcessStateChanged(evt);
            }
        });

        lblMin.setText("MIN");

        lblMax.setText("MAX");

        btnCalculate.setText("CALCULATE");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slderNoOfProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMax, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slderNoOfProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMin)
                    .addComponent(lblMax, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblWaiting.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblWaiting.setText("WAITING TIME (WT)");

        lblAverageTurn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAverageTurn.setText("Average TurnAround Time (ATaT)");

        lblAverageWaiting.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAverageWaiting.setText("Average Waiting Time (AWT)");

        txtAverageTurn.setEditable(false);
        txtAverageTurn.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAverageWaiting.setEditable(false);
        txtAverageWaiting.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tblTurn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "TurnAround Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblTurn);

        lblTurn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTurn.setText("TURNAROUND TIME (TaT)");

        tblWaiting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "Waiting Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblWaiting);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(txtAverageTurn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblTurn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblAverageTurn)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(txtAverageWaiting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblWaiting)
                                .addGap(57, 57, 57))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAverageWaiting)
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurn)
                    .addComponent(lblWaiting))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAverageTurn)
                    .addComponent(lblAverageWaiting))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAverageTurn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAverageWaiting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(lblUserInput))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(lblGantt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserInput)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGantt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void slderNoOfProcessStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slderNoOfProcessStateChanged
        int value = slderNoOfProcess.getValue();
        DefaultTableModel userInputModel = (DefaultTableModel) tblUserInput.getModel();
        userInputModel.setRowCount(value);
        for (int i = 0; i < slderNoOfProcess.getValue(); i++) {
            userInputModel.setValueAt("P" + (i + 1), i, 0);
        }
    }//GEN-LAST:event_slderNoOfProcessStateChanged

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // Create table models
        DefaultTableModel userInputModel = (DefaultTableModel) tblUserInput.getModel();
        DefaultTableModel chartModel = (DefaultTableModel) tblChart.getModel();

        // Create arrays with sizes equivalent to the number of processes
        String processName[] = new String[userInputModel.getRowCount()];
        int arrivalTime[] = new int[userInputModel.getRowCount()];
        int burstTime[] = new int[userInputModel.getRowCount()];

        try {
            // Save the user input values to your arrays or process them as needed
            for (int i = 0; i < userInputModel.getRowCount(); i++) {
                processName[i] = (String) userInputModel.getValueAt(i, 0);
                arrivalTime[i] = (int) userInputModel.getValueAt(i, 1);
                burstTime[i] = (int) userInputModel.getValueAt(i, 2);
            }

            // Sort the table based on their arrival
            sortTable(userInputModel);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please confirm the values by pressing ENTER.");
        }

        // Save the user input values to an array
        for (int i = 0; i < userInputModel.getRowCount(); i++) {
            processName[i] = (String) userInputModel.getValueAt(i, 0);
            arrivalTime[i] = (int) userInputModel.getValueAt(i, 1);
            burstTime[i] = (int) userInputModel.getValueAt(i, 2);
        }

        // Create a new row for the Gantt Chart
        chartModel.addRow(new Object[userInputModel.getRowCount()]);
        int rowIndex = chartModel.getRowCount() - 1;

        while (completedProcess != userInputModel.getRowCount()) {
            burstTime[0] = runProcess(processName[0], arrivalTime[0], burstTime[0], arrivalTime[1]);

            if (burstTime[0] == 0) {
                completedProcess++;

                // Add the new column to the Gantt Chart
                chartModel.addColumn(processName[0]);

                // Set the value in the same row for the corresponding column
                int columnIndex = chartModel.getColumnCount() - 1;
                chartModel.setValueAt(timeSpent, rowIndex, columnIndex);

                sortArray(processName, arrivalTime, burstTime);
            } else {

                // Add the new column to the Gantt Chart
                chartModel.addColumn(processName[0]);

                // Set the value in the same row for the corresponding column
                int columnIndex = chartModel.getColumnCount() - 1;
                chartModel.setValueAt(timeSpent, rowIndex, columnIndex);
                sortArray(processName, arrivalTime, burstTime);
            }
        }
    }//GEN-LAST:event_btnCalculateActionPerformed


    private void sortArray(String[] processName, int[] arrivalTime, int[] burstTime) {
        Integer[] indexes = new Integer[burstTime.length];

        for (int i = 0; i < burstTime.length; i++) {
            indexes[i] = i;
        }

        // Sorting based on burst time and then arrival time
        Arrays.sort(indexes, Comparator.comparingInt(i -> {
            if (burstTime[i] == 0 || burstTime[i] < timeSpent) {
                // Process has burst time 0 or has already arrived
                return burstTime[i];
            } else {
                // Set a high value for processes that haven't arrived yet
                return Integer.MAX_VALUE;
            }
        }));

        // Creating a temporary array to store the sorted values
        String[] tempProcessName = Arrays.copyOf(processName, processName.length);
        int[] tempArrivalTime = Arrays.copyOf(arrivalTime, arrivalTime.length);
        int[] tempBurstTime = Arrays.copyOf(burstTime, burstTime.length);

        // Move processes with burst time 0 to the end
        int zeroBurstIndex = 0;
        for (int i = 0; i < burstTime.length; i++) {
            if (tempBurstTime[i] == 0) {
                zeroBurstIndex = i;
                break;
            }
        }

        // Swap elements to move burst time 0 process to the end
        for (int i = zeroBurstIndex; i < burstTime.length - 1; i++) {
            if (tempBurstTime[i + 1] == 0 || tempBurstTime[i + 1] < timeSpent) {
                swap(tempProcessName, i, i + 1);
                swap(tempArrivalTime, i, i + 1);
                swap(tempBurstTime, i, i + 1);
            }
        }

        // Copying back the values to the original arrays
        System.arraycopy(tempProcessName, 0, processName, 0, processName.length);
        System.arraycopy(tempArrivalTime, 0, arrivalTime, 0, arrivalTime.length);
        System.arraycopy(tempBurstTime, 0, burstTime, 0, burstTime.length);
    }

    private void swap(String[] array, int index1, int index2) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private void sortTable(DefaultTableModel model) {
        // Get the number of rows in the model
        int rowCount = model.getRowCount();

        // Create a 2D array to hold the data
        Object[][] data = new Object[rowCount][model.getColumnCount()];

        // Populate the 2D array with data from the model
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                data[i][j] = model.getValueAt(i, j);
            }
        }

        // Sort the 2D array based on the "Arrival Time" column
        Arrays.sort(data, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] row1, Object[] row2) {
                Comparable<Object> val1 = (Comparable<Object>) row1[1];
                Comparable<Object> val2 = (Comparable<Object>) row2[1];
                return val1.compareTo(val2);
            }
        });

        // Clear the model
        model.setRowCount(0);

        // Populate the model with the sorted data
        for (Object[] row : data) {
            model.addRow(row);
        }

        // Reflect the changes 
        tblUserInput.revalidate();
        tblUserInput.repaint();
    }

    // Run each process using recursion
    private int runProcess(String name, int arrival, int burst, int nextProcessArrival) {
        // Burst time has reached 0
        if (burst == 0) {
            return burst;
        } // If another process arrives at this time, check burst times and prioritize the lower burst time
        else if (timeSpent == nextProcessArrival) {
            return burst;
        } else {
            timeSpent++;
            // Recursive call
            return runProcess(name, arrival, burst - 1, nextProcessArrival);
        }
    }

    // Overloaded method that also runs the process
    private int runProcess(String name, int arrival, int burst) {
        // Burst time has reached 0
        if (burst == 0) {
            return burst;
        } // If another process arrives at this time, check burst times and prioritize the lower burst time
        else {
            timeSpent++;
            // Recursive call
            return runProcess(name, arrival, burst - 1);
        }
    }

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAverageTurn;
    private javax.swing.JLabel lblAverageWaiting;
    private javax.swing.JLabel lblGantt;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblTurn;
    private javax.swing.JLabel lblUserInput;
    private javax.swing.JLabel lblWaiting;
    private javax.swing.JSlider slderNoOfProcess;
    private javax.swing.JTable tblChart;
    private javax.swing.JTable tblTurn;
    private javax.swing.JTable tblUserInput;
    private javax.swing.JTable tblWaiting;
    private javax.swing.JTextField txtAverageTurn;
    private javax.swing.JTextField txtAverageWaiting;
    // End of variables declaration//GEN-END:variables
}
