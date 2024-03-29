package com.devteam.school.views;

import com.devteam.school.app.AppContext;
import com.devteam.school.app.Session;
import com.devteam.school.app.TableModelFillRecord;
import com.devteam.school.app.Utils;
import com.devteam.school.controllers.CursoController;
import com.devteam.school.controllers.MatriculaController;
import com.devteam.school.model.entities.*;
import java.util.ArrayList;

import java.util.List;
import javax.swing.table.DefaultTableModel;


public class LlenarNotasFrame extends javax.swing.JFrame implements TransferData{

    private static  LlenarNotasFrame llenarNotasFrame;
    
    private final MatriculaController matriculaController;
    private final CursoController cursoController;
    
    private String accion = "guardar";
    private Profesor profesorMatricula;  // Profesor del consulta
    private List<Curso> cursosProfesor;
    

    public static LlenarNotasFrame getInstance(){
        if (llenarNotasFrame == null){
            llenarNotasFrame = new LlenarNotasFrame();
        }else
            llenarNotasFrame.restart();
        return llenarNotasFrame;
    }

    private void restart() { 
        //resetForm();
    }


    private LlenarNotasFrame() {
        initComponents();
        jtNotas.getTableHeader().setReorderingAllowed(false);
                
        matriculaController = (MatriculaController) AppContext.getAppContext().getBean("matriculaController");
        cursoController = (CursoController) AppContext.getAppContext().getBean("cursoController");
        
        Session session = Session.getSession();
        if (session != null)
            if (session.getUserid() != 0){ // No admin user
                jtfProfesor.setText(session.getUserFullName());
                jbElegirProfesor.setEnabled(false); jbElegirProfesor.setToolTipText("Solo para el administrador ...");
                
                profesorMatricula = new Profesor();
                profesorMatricula.setId(session.getUserid());
                profesorMatricula.setUsername(session.getUsername());
                
                loadCursosProfesor(profesorMatricula.getId());
            }
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtfProfesor = new javax.swing.JTextField();
        jbCargarDatos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbElegirProfesor = new javax.swing.JButton();
        jcbGrado = new javax.swing.JComboBox<>();
        jcbCursos = new javax.swing.JComboBox<>();
        jlTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtNotas = new javax.swing.JTable();
        jbGuardarDatos = new javax.swing.JButton();
        jlTotalRegistros = new javax.swing.JLabel();
        jlCursosJalados = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("Nombre:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));

        jtfProfesor.setEditable(false);

        jbCargarDatos.setBackground(new java.awt.Color(51, 51, 51));
        jbCargarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/table_refresh.png"))); // NOI18N
        jbCargarDatos.setText("Aceptar");
        jbCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarDatosActionPerformed(evt);
            }
        });

        jLabel3.setText("Grado:");

        jLabel12.setText("Profesor:");

        jLabel1.setText("Curso:");

        jbElegirProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/application_view_list.png"))); // NOI18N
        jbElegirProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbElegirProfesorMouseReleased(evt);
            }
        });

        jcbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º", "2º", "3º", "4º", "5º" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfProfesor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbElegirProfesor))
                            .addComponent(jcbGrado, 0, 236, Short.MAX_VALUE)
                            .addComponent(jcbCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbElegirProfesor)
                    .addComponent(jtfProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jcbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jcbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jbCargarDatos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("LLENADO  DE NOTAS");
        jlTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("NOTAS"));

        jtNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtNotas);

        jbGuardarDatos.setBackground(new java.awt.Color(51, 51, 51));
        jbGuardarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/database_save.png"))); // NOI18N
        jbGuardarDatos.setText("Guardar");
        jbGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarDatosActionPerformed(evt);
            }
        });

        jlTotalRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlTotalRegistros.setText("Registros");

        jlCursosJalados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel4.setBackground(new java.awt.Color(255, 179, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ballon.png"))); // NOI18N
        jLabel4.setText("Antes de guardar verifique los datos");
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90)
                        .addComponent(jbGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlCursosJalados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbGuardarDatos)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTotalRegistros)
                    .addComponent(jlCursosJalados))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    public void fillTable(List<MatriculaDetalle> mdetalles){
        String[] titles = {"ID", "Alumno", "Nota 1","Nota 2", "Nota 3", "Promedio"};
        DefaultTableModel model = new TableModelFillRecord(null, titles);

        String[] row = new String[6];
        
        int jalados = 0;
                
        for (MatriculaDetalle mdetalle : mdetalles){
            row[0] = String.valueOf( mdetalle.getId() );
            row[1] = mdetalle.getAlumnoNombre();
            row[2] = mdetalle.getNota1()+ "";
            row[3] = mdetalle.getNota2()+ "";
            row[4] = mdetalle.getNota3()+ "";
            
            row[5] = mdetalle.getPromedio() + "";
 

            if(mdetalle.getPromedio() < 11) jalados++;
            
            model.addRow(row);
        }

        jtNotas.setModel(model);
        jlTotalRegistros.setText( mdetalles.size() + " Alumnos");
        jlCursosJalados.setText(jalados + " Jalados");
    }
    
    private void jbGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarDatosActionPerformed
        // TODO add your handling code here:
        
        List<MatriculaDetalle> detalles = new ArrayList<>();
        int numeroFilas = jtNotas.getModel().getRowCount();

        // System.out.println("Filasss:" + numeroFilas); 
        
        MatriculaDetalle detalle;
        DefaultTableModel model = (DefaultTableModel) jtNotas.getModel();

        for (int i = 0; i< numeroFilas ; i++){
            detalle = new MatriculaDetalle();
            detalle.setId( Integer.parseInt(model.getValueAt(i,0).toString()) );
            detalle.setNota1( Integer.parseInt(model.getValueAt(i,2).toString()) );
            detalle.setNota2( Integer.parseInt(model.getValueAt(i,3).toString()) );
            detalle.setNota3( Integer.parseInt(model.getValueAt(i,4).toString()) );

            detalles.add(detalle);
        }

        detalles = matriculaController.updateNotas(detalles);
        if (detalles != null && detalles.size() > 0){
            fillTable(detalles);
            Utils.showInfoMessage(rootPane, "Notas gurdadas exitosamente");
        }else {
            Utils.showErrorMessage(rootPane, "Error al actualizar, contacta al Administrador");
        }
                
        //updateTable();
    }//GEN-LAST:event_jbGuardarDatosActionPerformed

    private void jbCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarDatosActionPerformed

        try{
            int cursoIndex = jcbCursos.getSelectedIndex();
            long cursoId = -1;
            if(cursoIndex >= 0)
                if(cursosProfesor != null && !cursosProfesor.isEmpty())
                    cursoId = cursosProfesor.get(cursoIndex).getId();

            int grado = jcbGrado.getSelectedIndex(); grado++;

            List<MatriculaDetalle> detalles = matriculaController.getStudentsCourse(cursoId,grado);

            fillTable(detalles);
        }catch(Exception e){
            System.out.println("Error al consultar ...");
        }
        
    }//GEN-LAST:event_jbCargarDatosActionPerformed

    private void jbElegirProfesorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbElegirProfesorMouseReleased
        // TODO add your handling code here:
        if(jbElegirProfesor.isEnabled()){
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ProfesorChooserDialog dialog = new ProfesorChooserDialog( llenarNotasFrame, true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                           dialog.dispose();
                        }
                    });
                    dialog.setTransfer(llenarNotasFrame);

                    dialog.setVisible(true);  // Si lo llamas antes, no funciona
                }
            });
        }
    }//GEN-LAST:event_jbElegirProfesorMouseReleased
    
           
    @Override
    public void transfer(Object data) {
        profesorMatricula = (Profesor)data;
        jtfProfesor.setText(profesorMatricula.getNombre() + " " + profesorMatricula.getApellidos());
        
        loadCursosProfesor(profesorMatricula.getId());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbCargarDatos;
    private javax.swing.JButton jbElegirProfesor;
    private javax.swing.JButton jbGuardarDatos;
    private javax.swing.JComboBox<String> jcbCursos;
    private javax.swing.JComboBox<String> jcbGrado;
    private javax.swing.JLabel jlCursosJalados;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlTotalRegistros;
    private javax.swing.JTable jtNotas;
    private javax.swing.JTextField jtfProfesor;
    // End of variables declaration//GEN-END:variables

    private void loadCursosProfesor(long id) {
        
        cursosProfesor = cursoController.getCoursesByProfesor(id);
        
        jcbCursos.removeAllItems();
        for(Curso curso : cursosProfesor){
            jcbCursos.addItem(curso.getNombre());
        }
        
    }
   
}
