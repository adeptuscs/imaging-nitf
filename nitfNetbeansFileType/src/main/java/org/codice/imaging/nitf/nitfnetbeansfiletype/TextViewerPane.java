/*
 * Copyright (c) Codice Foundation
 *
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 *
 */
package org.codice.imaging.nitf.nitfnetbeansfiletype;

import org.openide.awt.ActionID;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;

/**
 * Text Segment View for the editor compartment.
 */
@TopComponent.Description(
        preferredID = "TextSegmentView",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(
        mode = "editor",
        openAtStartup = false)
@ActionID(
        category = "Window",
        id = "org.codice.imaging.nitf.nitfnetbeansfiletype.TextViewerPane")
@TopComponent.OpenActionRegistration(
        displayName = "CTL_TextViewerPane")
@NbBundle.Messages({
    "CTL_TextViewerPane=Text Viewer"
})
public class TextViewerPane extends TopComponent {

    // CSOFF: MagicNumber
    // CSOFF: WhitespaceAround
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setText(org.openide.util.NbBundle.getMessage(TextViewerPane.class, "TextViewerPane.textArea.text")); // NOI18N
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // CSON: MagicNumber
    // CSON: WhitespaceAround

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form TextSegmentViewer.
     */
    public TextViewerPane() {
        initComponents();
    }

    final void setText(final String text) {
        textArea.setText(text);
        textArea.setCaretPosition(0);
    }
}
