/*******************************************************************************
 * Copyright 2013 Sprachliche Informationsverarbeitung, University of Cologne
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.uni_koeln.spinfo.maalr.webapp.ui.editor.client.entry.list.column;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.user.cellview.client.Column;

import de.uni_koeln.spinfo.maalr.common.shared.LemmaVersion;
import de.uni_koeln.spinfo.maalr.webapp.ui.editor.client.entry.list.wrapper.ICellWrapper;
import de.uni_koeln.spinfo.maalr.webapp.ui.editor.client.entry.list.wrapper.LemmaVersionCellWrapper;


public class LemmaVersionColumn extends Column<LemmaVersion, ICellWrapper> {

	public LemmaVersionColumn(Cell<ICellWrapper> cell) {
		super(cell);
	}

	@Override
	public ICellWrapper getValue(LemmaVersion object) {
		return new LemmaVersionCellWrapper(object);
	}

}
