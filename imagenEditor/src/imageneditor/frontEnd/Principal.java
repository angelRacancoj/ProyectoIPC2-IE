/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.frontEnd;

import imageneditor.DefaultValue;
import imageneditor.analisis.Lexer;
import imageneditor.analisis.canvas;
import imageneditor.analisis.colors;
import imageneditor.analisis.paint;
import imageneditor.backEnd.Objects.canvasStruct;
import imageneditor.backEnd.Objects.colorsStruct;
import imageneditor.backEnd.Objects.lienzoObj;
import imageneditor.backEnd.Objects.paintStruct;
import imageneditor.exceptions.errorsSaver;
import imageneditor.files.ManejadorArchivo;
import imageneditor.files.ManejadorImagenes;
import imageneditor.objectsManager.canvasManager;
import imageneditor.objectsManager.colorManager;
import imageneditor.objectsManager.pintarManager;
import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author orlan
 */
public class Principal extends javax.swing.JFrame {

    String pathAux = "";
    String pathCanvas = "";
    String pathCanvasOld = "";
    String pathColors = "";
    String pathColorsOld = "";
    String pathPaint = "";
    String pathPaintOld = "";

    ManejadorArchivo fileManager;
    ManejadorImagenes imageManager = new ManejadorImagenes();

    canvasStruct canvasStr;
    colorsStruct colorStr;
    paintStruct paintSrt;
    canvasManager canvasMgr;
    colorManager colorMgr;
    pintarManager paintMgr;

    Lexer lex;
    Lexer lex2;
    Lexer lex3;
    canvas canvasSi;
    colors colorSi;
    paint paintSi;

    imagenEditor editor;

    LinkedList<String> canvasErrors = new LinkedList<>();
    LinkedList<String> colorsErrors = new LinkedList<>();
    LinkedList<String> paintErrors = new LinkedList<>();

    errorsSaver errors;
    codeEditor errorWindows;

    /**
     * Creates new form Principal
     */
    public Principal() {

        this.fileManager = new ManejadorArchivo();
        this.canvasStr = new canvasStruct();
        this.canvasMgr = new canvasManager(canvasStr);
        this.colorStr = new colorsStruct();
        this.colorMgr = new colorManager(colorStr, canvasMgr);
        this.paintSrt = new paintStruct();
        this.paintMgr = new pintarManager(paintSrt, canvasMgr, colorStr);

        errors = new errorsSaver(pathCanvas, canvasErrors, pathColors, colorsErrors, pathPaint, paintErrors);
        errorWindows = new codeEditor("");
        errorWindows.noEditable();

        this.lex = new Lexer(new StringReader(""));
        this.canvasSi = new canvas(lex, canvasMgr, errors);
        this.lex2 = new Lexer(new StringReader(""));
        this.colorSi = new colors(lex2, colorMgr, errors);
        this.lex3 = new Lexer(new StringReader(""));
        this.paintSi = new paint(lex3, paintMgr, errors);

        editor = new imagenEditor(canvasStr, colorStr, paintSrt, this);
        initComponents();
        generarMenu.setEnabled(false);
        proyectTabsTabbedPane.add("Errores", errorWindows);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                if (needToSave()) {
                    int confirm = JOptionPane.showOptionDialog(null, "Desea salir sin guardar los cambios?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (confirm == 0) {
                        System.exit(0);
                    } else {
                        saveChanges();
                    }
                } else {
                    System.exit(0);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proyectTabsTabbedPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        nuevoMenu = new javax.swing.JMenu();
        canvasMenuItem = new javax.swing.JMenuItem();
        coloresMenuItem = new javax.swing.JMenuItem();
        pintarMenuItem = new javax.swing.JMenuItem();
        abrirMenuItem = new javax.swing.JMenuItem();
        guardarMenuItem = new javax.swing.JMenuItem();
        salirMenuItem = new javax.swing.JMenuItem();
        analisisMenu = new javax.swing.JMenu();
        analizarMenuItem = new javax.swing.JMenuItem();
        generarMenu = new javax.swing.JMenu();
        editorGraficoMenuItem = new javax.swing.JMenuItem();
        generarMenuItem = new javax.swing.JMenuItem();
        ayudaMenu = new javax.swing.JMenu();
        manualUsuarioMenuItem = new javax.swing.JMenuItem();
        manualTecnicoMenuItem = new javax.swing.JMenuItem();
        acercaDeMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Editor de Imagenes");

        archivoMenu.setText(" Archivo ");

        nuevoMenu.setText("Nuevo");

        canvasMenuItem.setText("Canvas");
        canvasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canvasMenuItemActionPerformed(evt);
            }
        });
        nuevoMenu.add(canvasMenuItem);

        coloresMenuItem.setText("Colores");
        coloresMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloresMenuItemActionPerformed(evt);
            }
        });
        nuevoMenu.add(coloresMenuItem);

        pintarMenuItem.setText("Pintar");
        pintarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pintarMenuItemActionPerformed(evt);
            }
        });
        nuevoMenu.add(pintarMenuItem);

        archivoMenu.add(nuevoMenu);

        abrirMenuItem.setText("Abrir");
        abrirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirMenuItemActionPerformed(evt);
            }
        });
        archivoMenu.add(abrirMenuItem);

        guardarMenuItem.setText("Guardar");
        guardarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarMenuItemActionPerformed(evt);
            }
        });
        archivoMenu.add(guardarMenuItem);

        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        archivoMenu.add(salirMenuItem);

        jMenuBar1.add(archivoMenu);

        analisisMenu.setText(" Analisis ");

        analizarMenuItem.setText("Analizar");
        analizarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarMenuItemActionPerformed(evt);
            }
        });
        analisisMenu.add(analizarMenuItem);

        jMenuBar1.add(analisisMenu);

        generarMenu.setText(" Generar ");

        editorGraficoMenuItem.setText("Editor Grafico");
        editorGraficoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorGraficoMenuItemActionPerformed(evt);
            }
        });
        generarMenu.add(editorGraficoMenuItem);

        generarMenuItem.setText("Generar");
        generarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarMenuItemActionPerformed(evt);
            }
        });
        generarMenu.add(generarMenuItem);

        jMenuBar1.add(generarMenu);

        ayudaMenu.setText(" Ayuda ");

        manualUsuarioMenuItem.setText("Manual Usuario");
        manualUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualUsuarioMenuItemActionPerformed(evt);
            }
        });
        ayudaMenu.add(manualUsuarioMenuItem);

        manualTecnicoMenuItem.setText("Manual Tecnico");
        manualTecnicoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualTecnicoMenuItemActionPerformed(evt);
            }
        });
        ayudaMenu.add(manualTecnicoMenuItem);

        acercaDeMenuItem.setText("Acerca de");
        acercaDeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeMenuItemActionPerformed(evt);
            }
        });
        ayudaMenu.add(acercaDeMenuItem);

        jMenuBar1.add(ayudaMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proyectTabsTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proyectTabsTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addWindow(String path, String oldPath) {
        try {
            if (oldPath.equals("")) {
                codeEditor canvasWindows = new codeEditor(path);
                canvasWindows.setText(fileManager.lecturaArchivo(path));
                proyectTabsTabbedPane.add(fileManager.nameFile(path), canvasWindows);
            } else {
                if (needToSave()) {
                    int confirm = JOptionPane.showOptionDialog(null, "Desea guardar los cambios realizados?", "Información", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (confirm != 0) {
                        saveChanges();
                    }
                } else {
                    System.exit(0);
                }
                int index = proyectTabsTabbedPane.indexOfTab(fileManager.nameFile(oldPath));
                proyectTabsTabbedPane.remove(index);
                codeEditor canvasWindows = new codeEditor(path);
                canvasWindows.setText(fileManager.lecturaArchivo(path));
                proyectTabsTabbedPane.add(fileManager.nameFile(path), canvasWindows);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void canvasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canvasMenuItemActionPerformed
        JFileChooser guardar = new JFileChooser();
        guardar.setDialogTitle("Create as ." + DefaultValue.CANVAS_EXT + " file");
        FileFilter canvasExt = new FileNameExtensionFilter("CANVAS (." + DefaultValue.CANVAS_EXT + ")", DefaultValue.CANVAS_EXT);
        guardar.setFileFilter(canvasExt);
        if (guardar.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            pathCanvas = (guardar.getSelectedFile().getAbsolutePath() + "." + DefaultValue.CANVAS_EXT);
            System.out.println(pathCanvas);
            try {
                fileManager.guardarArchivo(pathCanvas, "/* Clase " + fileManager.nameFile(pathCanvas) + " creada */");
                addWindow(pathCanvas, pathCanvasOld);
                pathCanvasOld = pathCanvas;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_canvasMenuItemActionPerformed

    private void coloresMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloresMenuItemActionPerformed
        JFileChooser guardar = new JFileChooser();
        guardar.setDialogTitle("Create as ." + DefaultValue.COLOR_EXT + " file");
        FileFilter colorsExt = new FileNameExtensionFilter("COLORES (." + DefaultValue.COLOR_EXT + " )", DefaultValue.COLOR_EXT);
        guardar.setFileFilter(colorsExt);
        if (guardar.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            pathColors = (guardar.getSelectedFile().getAbsolutePath() + "." + DefaultValue.COLOR_EXT);
            System.out.println(pathColors);
            try {
                fileManager.guardarArchivo(pathColors, "/* Clase " + fileManager.nameFile(pathColors) + " creada */");
                addWindow(pathColors, pathColorsOld);
                pathColorsOld = pathColors;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_coloresMenuItemActionPerformed

    private void pintarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pintarMenuItemActionPerformed
        JFileChooser guardar = new JFileChooser();
        guardar.setDialogTitle("Create as ." + DefaultValue.PAINT_EXT + " file");
        FileFilter paintExt = new FileNameExtensionFilter("PINTAR (." + DefaultValue.PAINT_EXT + ")", DefaultValue.PAINT_EXT);
        guardar.setFileFilter(paintExt);
        if (guardar.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            pathPaint = (guardar.getSelectedFile().getAbsolutePath() + "." + DefaultValue.PAINT_EXT);
            System.out.println(pathPaint);
            try {
                fileManager.guardarArchivo(pathPaint, "/* Clase " + fileManager.nameFile(pathPaint) + " creada */");
                addWindow(pathPaint, pathPaintOld);
                pathPaintOld = pathPaint;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_pintarMenuItemActionPerformed

    private void abrirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMenuItemActionPerformed
        clearList();
        generarMenu.setEnabled(false);

        JFileChooser dialogo = new JFileChooser();
        dialogo.setDialogTitle("Open file");
        FileFilter colorsExt = new FileNameExtensionFilter("COLORES (." + DefaultValue.COLOR_EXT + " )", DefaultValue.COLOR_EXT);
        FileFilter canvasExt = new FileNameExtensionFilter("CANVAS (." + DefaultValue.CANVAS_EXT + ")", DefaultValue.CANVAS_EXT);
        FileFilter paintExt = new FileNameExtensionFilter("PINTAR (." + DefaultValue.PAINT_EXT + ")", DefaultValue.PAINT_EXT);
        dialogo.addChoosableFileFilter(canvasExt);
        dialogo.addChoosableFileFilter(colorsExt);
        dialogo.addChoosableFileFilter(paintExt);
        dialogo.setFileFilter(canvasExt);
        //??????????????????????????????????????????????
        dialogo.setAcceptAllFileFilterUsed(false);
        //??????????????????????????????????????????????
        if (dialogo.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            pathAux = dialogo.getSelectedFile().getAbsolutePath();
            if (fileManager.extensionFile(pathAux).equalsIgnoreCase(DefaultValue.CANVAS_EXT)) {
                pathCanvas = pathAux;
                addWindow(pathCanvas, pathCanvasOld);
                pathCanvasOld = pathCanvas;
            } else if (fileManager.extensionFile(pathAux).equalsIgnoreCase(DefaultValue.COLOR_EXT)) {
                pathColors = pathAux;
                addWindow(pathColors, pathColorsOld);
                pathColorsOld = pathColors;
            } else if (fileManager.extensionFile(pathAux).equalsIgnoreCase(DefaultValue.PAINT_EXT)) {
                pathPaint = pathAux;
                addWindow(pathPaint, pathPaintOld);
                pathPaintOld = pathPaint;
            }
//        try {
//            pathCanvas = "/home/angel/Documents/pruebaImagenEditor/prueba.canvas";
//            codeEditor canvasWindows = new codeEditor(pathCanvas);
//            canvasWindows.setText(fileManager.lecturaArchivo(pathCanvas));
//            proyectTabsTabbedPane.add(fileManager.nameFile(pathCanvas), canvasWindows);
//
//            pathColors = "/home/angel/Documents/pruebaImagenEditor/prueba.clrs";
//            codeEditor colorsWindows = new codeEditor(pathColors);
//            colorsWindows.setText(fileManager.lecturaArchivo(pathColors));
//            proyectTabsTabbedPane.add(fileManager.nameFile(pathColors), colorsWindows);
//
//            pathPaint = "/home/angel/Documents/pruebaImagenEditor/prueba.pnt";
//            codeEditor paintWindows = new codeEditor(pathPaint);
//            paintWindows.setText(fileManager.lecturaArchivo(pathPaint));
//            proyectTabsTabbedPane.add(fileManager.nameFile(pathPaint), paintWindows);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
        }
    }//GEN-LAST:event_abrirMenuItemActionPerformed

    private void guardarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarMenuItemActionPerformed
        if (needToSave()) {
            saveChanges();
        }
    }//GEN-LAST:event_guardarMenuItemActionPerformed

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        if (needToSave()) {
            int confirm = JOptionPane.showOptionDialog(null, "Desea salir sin guardar los cambios?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (confirm == 0) {
                System.exit(0);
            } else {
                saveChanges();
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_salirMenuItemActionPerformed

    private void analizarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarMenuItemActionPerformed
        clearList();
        errors.clearList();

        try {
            lex.yyreset(new StringReader(fileManager.lecturaArchivo(pathCanvas)));
            this.canvasSi.parse();
            canvasStr.setPath(pathCanvas);
            System.out.println("parse canvas");
        } catch (Exception e) {
            System.out.println("Error-> " + e);
            errors.addCanvasError("(Canvas)Error: " + e);
            generarMenu.setEnabled(false);
        }

        try {
            lex2.yyreset(new StringReader(fileManager.lecturaArchivo(pathColors)));
            this.colorSi.parse();
            colorStr.setPath(pathColors);
            System.out.println("parse colors");
        } catch (Exception e) {
            System.out.println("Error=> " + e);
            errors.addColorError("(Colors)Error: " + e);
            generarMenu.setEnabled(false);
        }

        try {
            lex3.yyreset(new StringReader(fileManager.lecturaArchivo(pathPaint)));
            this.paintSi.parse();
            paintSrt.setPath(pathPaint);
            System.out.println("parse paint");

            generarMenu.setEnabled(true);
            errorWindows.setText("Exelente! No hay Errores");
        } catch (Exception e) {
            System.out.println("Error->> " + e);
            errors.addPaintError("(Paint)Error: " + e);
            e.printStackTrace();
            generarMenu.setEnabled(false);
            clearList();
        }

        if ((errors.getCanvasError().size() > 0) || (errors.getColorError().size() > 0) || (errors.getPaintError().size() > 0)) {
            String erroresText = "";
            for (String canvasError : errors.getCanvasError()) {
                erroresText += (canvasError + "\n");
            }
            erroresText += ("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n");

            for (String colorError : errors.getColorError()) {
                erroresText += (colorError + "\n");
            }
            erroresText += ("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n");

            for (String paintError : errors.getPaintError()) {
                erroresText += (paintError + "\n");
            }
            errorWindows.setText(erroresText);
        }
    }//GEN-LAST:event_analizarMenuItemActionPerformed

    private void editorGraficoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorGraficoMenuItemActionPerformed
        this.editor.setVisible(true);
        this.setVisible(false);
        generarMenu.setEnabled(false);
    }//GEN-LAST:event_editorGraficoMenuItemActionPerformed

    private void generarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarMenuItemActionPerformed
        JFileChooser dialogo = new JFileChooser();
        dialogo.setDialogTitle("Elegir carpeta destino");
        dialogo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (dialogo.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            String pathImg = dialogo.getSelectedFile().getAbsolutePath();
            System.out.println("Path:" + pathImg);
            for (lienzoObj lienzo : canvasStr.getLienzos()) {
                if (imageManager.crearImagen(pathImg, lienzo, colorStr.findColorObject(lienzo.getId()), paintSrt.findIsntruccionsP(lienzo.getId()).getPaintlist())) {
                    JOptionPane.showMessageDialog(this, "Imagen " + lienzo.getId() + "." + lienzo.getTipo() + " creada exitosamente", "Imagen", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se creo la imagen " + lienzo.getId() + "." + lienzo.getTipo(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_generarMenuItemActionPerformed

    private void manualUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualUsuarioMenuItemActionPerformed
        try {
            File file = new File("ManualdeUsuario-ImageEditorAlphaV1.pdf");
//            File file = new File("/home/angel/NetBeansProjects/ProyectoIPC2-IE/imagenEditor/ManualdeUsuario-ImageEditorAlphaV1.pdf");
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            System.out.println("Error al abrir el manual");
        }
    }//GEN-LAST:event_manualUsuarioMenuItemActionPerformed

    private void manualTecnicoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualTecnicoMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manualTecnicoMenuItemActionPerformed

    private void acercaDeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeMenuItemActionPerformed
        JOptionPane.showMessageDialog(this, "Angel Racancoj\nCarnet: 201631547\nProyecto Compiladores 1\nEditor de Imagenes V0.1", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_acercaDeMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirMenuItem;
    private javax.swing.JMenuItem acercaDeMenuItem;
    private javax.swing.JMenu analisisMenu;
    private javax.swing.JMenuItem analizarMenuItem;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenu ayudaMenu;
    private javax.swing.JMenuItem canvasMenuItem;
    private javax.swing.JMenuItem coloresMenuItem;
    private javax.swing.JMenuItem editorGraficoMenuItem;
    private javax.swing.JMenu generarMenu;
    private javax.swing.JMenuItem generarMenuItem;
    private javax.swing.JMenuItem guardarMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem manualTecnicoMenuItem;
    private javax.swing.JMenuItem manualUsuarioMenuItem;
    private javax.swing.JMenu nuevoMenu;
    private javax.swing.JMenuItem pintarMenuItem;
    private javax.swing.JTabbedPane proyectTabsTabbedPane;
    private javax.swing.JMenuItem salirMenuItem;
    // End of variables declaration//GEN-END:variables

    public void clearList() {
        canvasStr.clear();
        colorStr.clear();
        paintSrt.clear();
        errorWindows.setText("");
    }

    private void saveChanges() {
        try {
            if (!pathCanvas.equals("")) {
                int indexCanvas = proyectTabsTabbedPane.indexOfTab(fileManager.nameFile(pathCanvas));
                codeEditor temp = (codeEditor) proyectTabsTabbedPane.getComponentAt(indexCanvas);
                if (!temp.returnText().equals(fileManager.lecturaArchivo(pathCanvas))) {
                    temp.saveProgress();
                }
            }
            if (!pathColors.equals("")) {
                int indexColors = proyectTabsTabbedPane.indexOfTab(fileManager.nameFile(pathColors));
                codeEditor temp = (codeEditor) proyectTabsTabbedPane.getComponentAt(indexColors);
                if (!temp.returnText().equals(fileManager.lecturaArchivo(pathColors))) {
                    temp.saveProgress();
                }
            }
            if (!pathPaint.equals("")) {
                int indexPaint = proyectTabsTabbedPane.indexOfTab(fileManager.nameFile(pathPaint));
                codeEditor temp = (codeEditor) proyectTabsTabbedPane.getComponentAt(indexPaint);
                if (!temp.returnText().equals(fileManager.lecturaArchivo(pathPaint))) {
                    temp.saveProgress();
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean needSave(String path) {
        boolean save = false;
        try {
            if (!path.equals("")) {
                int index = proyectTabsTabbedPane.indexOfTab(fileManager.nameFile(path));
                codeEditor temp = (codeEditor) proyectTabsTabbedPane.getComponentAt(index);
                if (!temp.returnText().equals(fileManager.lecturaArchivo(path))) {
                    save = true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return save;
    }

    private boolean needToSave() {

        return (needSave(pathCanvas) || needSave(pathColors) || needSave(pathPaint));
    }

    public void actualizarTexto() {
        try {
            if (!pathCanvas.equals("")) {
                int indexCanvas = proyectTabsTabbedPane.indexOfTab(fileManager.nameFile(pathCanvas));
                codeEditor temp = (codeEditor) proyectTabsTabbedPane.getComponentAt(indexCanvas);
                temp.setText(fileManager.lecturaArchivo(pathCanvas));
            }
            if (!pathColors.equals("")) {
                int indexColors = proyectTabsTabbedPane.indexOfTab(fileManager.nameFile(pathColors));
                codeEditor temp = (codeEditor) proyectTabsTabbedPane.getComponentAt(indexColors);
                temp.setText(fileManager.lecturaArchivo(pathColors));
            }
            if (!pathPaint.equals("")) {
                int indexPaint = proyectTabsTabbedPane.indexOfTab(fileManager.nameFile(pathPaint));
                codeEditor temp = (codeEditor) proyectTabsTabbedPane.getComponentAt(indexPaint);
                temp.setText(fileManager.lecturaArchivo(pathPaint));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
