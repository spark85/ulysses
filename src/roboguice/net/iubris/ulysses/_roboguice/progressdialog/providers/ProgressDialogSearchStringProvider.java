/*******************************************************************************
 * Copyleft 2012 Massimiliano Leone - massimiliano.leone@iubris.net .
 * 
 * ProgressDialogSearchStringProvider.java is part of 'Ulysses'
 * 
 * 'Ulysses' is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ulysses is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with 'Ulysses' ; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301 USA
 ******************************************************************************/
package net.iubris.ulysses._roboguice.progressdialog.providers;

import net.iubris.ulysses.R;

import android.content.res.Resources;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ProgressDialogSearchStringProvider implements Provider<String> {

	private final Resources resources;
	
	@Inject
	public ProgressDialogSearchStringProvider(Resources resources) {
		this.resources = resources;
	}

	@Override
	public String get() {
		return resources.getString(R.string.searching);
	}
}