/*******************************************************************************
 * Copyleft 2012 Massimiliano Leone - massimiliano.leone@iubris.net .
 * 
 * UlyssesCacheSearcherDelegate.java is part of 'Ulysses'.
 * 
 * 'Ulysses' is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * 
 * 'Ulysses' is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with 'Ulysses' ; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301 USA
 ******************************************************************************/
package net.iubris.ulysses.controller.delegates.cacheaware;

import java.util.ArrayList;
import java.util.List;

import net.iubris.diane.searcher.exceptions.SearchException;
import net.iubris.diane.searcher.locationaware.exceptions.search.LocationNullException;
import net.iubris.ulysses.model.PlaceHere;
import android.location.Location;

public class UlyssesCacheSearcherDelegate implements IUlyssesCacheSearcherDelegate {

	private List<PlaceHere> result = new ArrayList<PlaceHere>();
	
	@Override
	public Void search(Location location) throws LocationNullException {
		return null;
	}

	@Override
	public List<PlaceHere> getSearchResult() {
		return result;
	}

	@Override
	public Void search() throws SearchException {
		return null;
	}

}
