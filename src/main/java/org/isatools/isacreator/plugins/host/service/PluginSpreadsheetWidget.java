package org.isatools.isacreator.plugins.host.service;

import javax.swing.table.TableCellEditor;
import java.util.Set;

/**
 * This plugin will allow any implementing classes to act as a new editor in the Spreadsheet component.
 */
public interface PluginSpreadsheetWidget {

    void registerCellEditor();

    void deregisterCellEditor();

    Set<String> targetColumns();


}
