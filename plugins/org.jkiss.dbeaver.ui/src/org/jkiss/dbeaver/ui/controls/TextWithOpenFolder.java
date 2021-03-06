/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2017 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.controls;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;

/**
 * TextWithOpenFolder
 */
public class TextWithOpenFolder extends TextWithOpen
{
    private String title;

    public TextWithOpenFolder(Composite parent, String title) {
        super(parent);
        this.title = title;
    }

    protected void openBrowser() {
        DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.NONE);
        if (title != null) {
            dialog.setText(title);
        }
        dialog.setFilterPath(getText());
        String selected = dialog.open();
        if (selected != null) {
            setText(selected);
        }
    }

}