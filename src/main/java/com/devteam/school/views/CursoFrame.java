package com.devteam.school.views;

import com.devteam.school.app.AppContext;
import com.devteam.school.controllers.CursoController;
import com.devteam.school.controllers.ProfesorController;
import com.devteam.school.model.entities.Curso;
import com.devteam.school.model.entities.Profesor;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CursoFrame extends javax.swing.JFrame implements TransferData{

    private static  CursoFrame cursoFrame = new CursoFrame();
    
    private final CursoController cursoController;
    private final ProfesorController profesorController;
    private List<Curso> cursos;
    
    private String accion = "guardar";
    private Profesor profesorCurso;  // Profesor del curso


    public static CursoFrame getInstance(){
        if (cursoFrame == null){
            cursoFrame = new CursoFrame();
        }else
            cursoFrame.restart();
        return cursoFrame;
    }

    private void restart() { 
//        System.out.println("I am Here!!!" + getClass().getName());
        cursos = cursoController.getCursos();
        fillTable( cursos );
    }


    private CursoFrame() {
        initComponents();
        inhabilitar();
        
        cursoController = (CursoController) AppContext.getAppContext().getBean("cursoController");
        profesorController = (ProfesorController) AppContext.getAppContext().getBean("profesorController");
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
        jtfNombre = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfProfesor = new javax.swing.JTextField();
        jtfId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jbElegirProfesor = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtCursos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jtfTextoBuscar = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbActualizarTabla = new javax.swing.JButton();
        jlTotalRegistros = new javax.swing.JLabel();

        jLabel2.setText("Nombre:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL CURSO"));

        jbNuevo.setBackground(new java.awt.Color(51, 51, 51));
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(51, 51, 51));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/database_save.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripción:");

        jLabel8.setText("Profesor:");

        jtfProfesor.setEnabled(false);

        jtfId.setEditable(false);
        jtfId.setEnabled(false);

        jLabel12.setText("Código:");

        jLabel1.setText("Nombre:");

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jtaDescripcion);

        jbElegirProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/application_view_list.png"))); // NOI18N
        jbElegirProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbElegirProfesorMouseReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Grado", "2º Grado", "3º Grado", "4º Grado", "5º Grado" }));

        jLabel4.setText("Grado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jtfId, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfProfesor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbElegirProfesor))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtfId, jtfNombre});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbElegirProfesor)
                    .addComponent(jtfProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo))
                .addContainerGap())
        );

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("ADMINISTRACIÓN DE CURSOS");
        jlTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CURSOS"));

        jtCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCursosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtCursos);

        jLabel9.setText("Buscar");

        jtfTextoBuscar.setToolTipText("Nombre");
        jtfTextoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfTextoBuscarKeyReleased(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/google_custom_search.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(51, 51, 51));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_delete.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbActualizarTabla.setBackground(new java.awt.Color(51, 51, 51));
        jbActualizarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jbActualizarTabla.setText("Actualizar");
        jbActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarTablaActionPerformed(evt);
            }
        });

        jlTotalRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlTotalRegistros.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTextoBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(jtfTextoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(jbEliminar)
                    .addComponent(jbActualizarTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jlTotalRegistros)
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

    
    private void inhabilitar() {
         jtfId.setEnabled(false);
        jtfNombre.setEnabled(false);
        jtaDescripcion.setEnabled(false);

        jtfProfesor.setEnabled(false);
        jbElegirProfesor.setEnabled(false);
       

        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        
        initFields();
        
    }
    
     private void habilitar() {
        //jtfCodigoCurso.setEnabled(true);
        jtfNombre.setEnabled(true);
        jtaDescripcion.setEnabled(true);
        
        //jtfProfesor.setEnabled(true); 
        jbElegirProfesor.setEnabled(true);

        jbGuardar.setEnabled(true);
        jbEliminar.setEnabled(true);
       
        initFields();
    }
     
    private void initFields(){
        jtfId.setText("");
        jtfNombre.setText("");
        jtaDescripcion.setText("");

        jtfProfesor.setText("");
        profesorCurso = null;

    }
  

    
    public void fillTable(List<Curso> cursos){
        String[] titles = {"ID", "Nombre", "Descripción", "Profesor"};
        DefaultTableModel model = new DefaultTableModel(null, titles);

        String[] row = new String[4];

        Profesor profesor;
                
        for (Curso curso : cursos){
            row[0] = String.valueOf( curso.getId() );
            row[1] = curso.getNombre();
            row[2] = curso.getDescripcion();
            profesor = profesorController.getProfesorById(curso.getProfesorId());
            row[3] = profesor.getNombre() + " " + profesor.getApellidos();

            model.addRow(row);
        }

        jtCursos.setModel(model);
        jlTotalRegistros.setText( cursos.size() + " cursos");
    }
    
    private void jbActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarTablaActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_jbActualizarTablaActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        if (!jtfId.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Curso?","Confirmar",JOptionPane.INFORMATION_MESSAGE);

            if (confirmacion == 0) {
                long id =  Integer.parseInt(jtfId.getText());
                if (cursoController.deleteCurso(id)){
                    cursos = cursoController.getCursos();
                    fillTable(cursos);
                    initFields();
                    inhabilitar();
                    
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se pudo eliminar al Curso","Error al Eliminar",JOptionPane.ERROR_MESSAGE);
                }
                
            }

        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        search();
                
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCursosMouseClicked
        // TODO add your handling code here:
        jbGuardar.setText("Actualizar");
        habilitar();
        jbEliminar.setEnabled(true);
        accion = "editar";

        int fila = jtCursos.rowAtPoint(evt.getPoint());
        //int id = Integer.parseInt(jtCursoes.getValueAt(fila, 0).toString());

        Curso curso = cursos.get(fila);
        profesorCurso = profesorController.getProfesorById(curso.getProfesorId());
        fillFormCurso( curso );
    }//GEN-LAST:event_jtCursosMouseClicked

    private void jtfTextoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTextoBuscarKeyReleased
        // TODO add your handling code here:
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            search();
        }
              
    }//GEN-LAST:event_jtfTextoBuscarKeyReleased

    private void jbElegirProfesorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbElegirProfesorMouseReleased
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProfesorChooseDialog dialog = new ProfesorChooseDialog( cursoFrame, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setTransfer(cursoFrame);

                dialog.setVisible(true);  // Si lo llamas antes, no funciona
            }
        });
    }//GEN-LAST:event_jbElegirProfesorMouseReleased

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Curso curso = new Curso();
        curso.setNombre(jtfNombre.getText());
        curso.setDescripcion(jtaDescripcion.getText());

        if(profesorCurso != null )
        curso.setProfesorId( profesorCurso.getId() );

        if (accion.equals("guardar")) {
            curso = cursoController.saveCurso(curso);
            if (curso != null ) {
                cursos = cursoController.getCursos();
                fillTable(cursos);
                jtfId.setText(String.valueOf(curso.getId()) );
                inhabilitar();
                JOptionPane.showMessageDialog(rootPane, "El curso fue registrado correctamente");

            }
        }
        else if (accion.equals("editar")){
            curso.setId(Integer.parseInt(jtfId.getText()));

            curso = cursoController.updateCurso(curso);
            if (curso != null ) {

                cursos = cursoController.getCursos();
                fillTable(cursos);
                //inhabilitar();
                JOptionPane.showMessageDialog(rootPane, "El curso fue actualizado correctamente");
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        jbGuardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void search(){
        String searchText = jtfTextoBuscar.getText();
        cursos = cursoController.searchCursos(searchText);
        fillTable(cursos);
        inhabilitar();
    }
    
    private void fillFormCurso(Curso curso){
        jtfId.setText(String.valueOf(curso.getId()));
        jtfNombre.setText(curso.getNombre());
        jtaDescripcion.setText(curso.getDescripcion());

        jtfProfesor.setText(profesorCurso.getNombre() + " " + profesorCurso.getApellidos());
        
    }
    
    @Override
    public void transfer(Object data) {
        profesorCurso = (Profesor)data;
        jtfProfesor.setText(profesorCurso.getNombre() + " " + profesorCurso.getApellidos());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbActualizarTabla;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbElegirProfesor;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlTotalRegistros;
    private javax.swing.JTable jtCursos;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfProfesor;
    private javax.swing.JTextField jtfTextoBuscar;
    // End of variables declaration//GEN-END:variables

    
}
