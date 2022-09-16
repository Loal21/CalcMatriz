package CalcMatrices;

import javax.swing.JOptionPane;

public class Calc extends javax.swing.JFrame {

    public Calc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Btnsuma = new javax.swing.JButton();
        Btnresta = new javax.swing.JButton();
        Btntraza = new javax.swing.JButton();
        Btndeter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cajaT = new javax.swing.JTextField();
        cajaR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Matrices");
        setBackground(new java.awt.Color(128, 128, 128));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("CALCULADORA DE MATRICES");

        Btnsuma.setText("SUMA");
        Btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsumaActionPerformed(evt);
            }
        });

        Btnresta.setText("RESTA");
        Btnresta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnrestaMouseClicked(evt);
            }
        });
        Btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnrestaActionPerformed(evt);
            }
        });

        Btntraza.setText("TRAZA");
        Btntraza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtntrazaActionPerformed(evt);
            }
        });

        Btndeter.setText("DETERMNINANTE");
        Btndeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndeterActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamaño de Matriz");

        cajaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTActionPerformed(evt);
            }
        });

        cajaR.setEditable(false);
        cajaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(203, 203, 203))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(cajaR, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(133, 133, 133)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(120, 120, 120)
                                                .addComponent(cajaT, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(Btnsuma)
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jSeparator1)
                                                        .addContainerGap()))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Btnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addComponent(Btntraza)
                                                .addGap(103, 103, 103)
                                                .addComponent(Btndeter)
                                                .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cajaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Btnsuma)
                                        .addComponent(Btnresta)
                                        .addComponent(Btndeter)
                                        .addComponent(Btntraza))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaR, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsumaActionPerformed
        int n = Integer.parseInt(cajaT.getText());
        int[][] matriz1;
        int[][] matriz2;
        matriz1 = new int[n][n];
        matriz2 = new int[n][n];
        //llenar las matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matriz [" + i + "}[" + j + "]. " + "Primera matriz"));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matriz [" + i + "}[" + j + "]. " + "Segunda matriz"));
            }
        }
        int matrizSuma[][] = new int[n][n];
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                int numeroMatriz1 = matriz1[y][x];
                int numeroMatriz2 = matriz2[y][x];
                int suma = numeroMatriz1 + numeroMatriz2;
                matrizSuma[y][x] = suma;
            }
        }

        System.out.println("Matriz1\t\tMatriz2\t\tMatrizSuma");
        for (int x = 0; x < 99; x++) {
            System.out.print("_");
        }
        System.out.println();
        //imprimir
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                System.out.printf("%5d ", matriz1[y][x]);
            }
            System.out.print(" | ");
            for (int x = 0; x < matriz2[y].length; x++) {
                System.out.printf("%5d ", matriz2[y][x]);
            }
            System.out.print(" | ");

            for (int x = 0; x < matrizSuma[y].length; x++) {
                System.out.printf("%5d ", matrizSuma[y][x]);
            }
            System.out.print(" | ");
            System.out.println();
        }

    }//GEN-LAST:event_BtnsumaActionPerformed

    private void BtntrazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtntrazaActionPerformed
        int n = Integer.parseInt(cajaT.getText());
        int matriz[][];

        matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Matriz [" + i + "}[" + j + "]. ");
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matriz [" + i + "}[" + j + "]. " + "Primera matriz"));
            }
        }
        imprimir(matriz);
        //valores diagonal
        System.out.println("Traza");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.printf("%5d ", matriz[i][j]);
                    cajaR.setText("Traza de la Matriz son:  " + matriz[i][j]);
                }
            }
        }
    }

    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }//GEN-LAST:event_BtntrazaActionPerformed

    private void cajaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTActionPerformed
    }//GEN-LAST:event_cajaTActionPerformed

    private void BtnrestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnrestaMouseClicked
    }//GEN-LAST:event_BtnrestaMouseClicked

    private void BtnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnrestaActionPerformed
        int n = Integer.parseInt(cajaT.getText());
        int matriz1[][];
        int matriz2[][];
        matriz1 = new int[n][n];
        matriz2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matriz [" + i + "}[" + j + "]. " + "Primera matriz"));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matriz [" + i + "}[" + j + "]. " + "Segunda matriz"));
            }
        }

        int[][] matrizresta = new int[matriz1.length][matriz1[0].length];
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                int numeroMatriz1 = matriz1[y][x];
                int numeroMatriz2 = matriz2[y][x];
                int resta = numeroMatriz1 - numeroMatriz2;
                matrizresta[y][x] = resta;
            }
        }
        System.out.println("Matriz1\t\tMatriz2\t\tMatrizResta");
        for (int x = 0; x < 62; x++) {
            System.out.print("_");
        }
        System.out.println();
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                System.out.printf("%5d ", matriz1[y][x]);

            }
            System.out.print(" | ");

            for (int x = 0; x < matriz2[y].length; x++) {

                System.out.printf("%5d ", matriz2[y][x]);
            }
            System.out.print(" | ");

            for (int x = 0; x < matrizresta[y].length; x++) {
                System.out.printf("%5d ", matrizresta[y][x]);

            }
            System.out.print(" | ");
            System.out.println();
        }
    }

    private void BtndeterActionPerformed(java.awt.event.ActionEvent evt) {
        int n = Integer.parseInt(cajaT.getText());
        int matriz[][] = new int[n][n];
        System.out.println("Ingrese datos");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Matriz [" + i + "}[" + j + "]. ");
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matriz [" + i + "}[" + j + "]. " + matriz[i][j]));
            }
        }
        System.out.println("La determinante de la Matriz es:\t" + determinante(matriz, n));
        cajaR.setText(String.valueOf("La determinante de la Matriz es:  \t" + determinante(matriz, n)));
    }

    static void Cofactor(int matriz[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (fila != p && columna != q) {
                    temp[i][j++] = matriz[fila][columna];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    static int determinante(int[][] matriz, int n) {
        int determinante = 0;
        if (n == 1) {
            return matriz[0][0];
        }
        int temp[][] = new int[n][n];
        int multiplicador = 1;
        for (int f = 0; f < n; f++) {
            Cofactor(matriz, temp, 0, f, n);
            determinante += multiplicador * matriz[0][f] * determinante(temp, n - 1);
            multiplicador = -multiplicador;
        }
        return determinante;
    }

    private void cajaRActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btndeter;
    private javax.swing.JButton Btnresta;
    private javax.swing.JButton Btnsuma;
    private javax.swing.JButton Btntraza;
    private javax.swing.JTextField cajaR;
    private javax.swing.JTextField cajaT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}