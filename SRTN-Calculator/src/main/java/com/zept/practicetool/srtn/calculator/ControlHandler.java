package com.zept.practicetool.srtn.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allen James Laxamana
 */
public class ControlHandler extends Calculator {

    public void compute(int[] burstTime, int[] arrivalTime) {
        // Dynamic array
        Vector<Integer> ganttChart = new Vector<>();

        int completedProcess = 0;
        int currentTime = 0;

        while (completedProcess < slderNoOfProcess.getValue()) {
            Arrays.sort(burstTime);
            Arrays.sort(arrivalTime);
            burstTime[0] -= 1;
            currentTime++;
        }
    }

    public void updateTable(DefaultTableModel model, List<Process> processes) {
        // Clear the existing rows in the table
        model.setRowCount(0);

        // Add the sorted processes back to the table
        for (Process process : processes) {
            Object[] rowData = {process.processName, process.arrivalTime, process.burstTime};
            model.addRow(rowData);
        }
    }
}
