
    /**
    OsciPrime an Open Source Android Oscilloscope
    Copyright (C) 2012  Manuel Di Cerbo, Nexus-Computing GmbH Switzerland
    Copyright (C) 2012  Andreas Rudolf, Nexus-Computing GmbH Switzerland

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    */

package ch.nexuscomputing.android.osciprimeics.news;

import java.io.Serializable;

public class News implements Serializable{
	private static final long serialVersionUID = 3515039782445202111L;
	
	private final String mTitle;
	private final long mIssue;
	private final String mLinkUrl;
	private final String mImageUrl;
	private final String mExtended;
	private final String mText;
	
	
	public News(String title, long issue, String linkUrl, String imageUrl,
			String extended, String text) {
		super();
		this.mTitle = title;
		this.mIssue = issue;
		this.mLinkUrl = linkUrl;
		this.mImageUrl = imageUrl;
		this.mExtended = extended;
		this.mText = text;
	}
	
	
	public String getTitle() {
		return mTitle;
	}
	public long getIssue() {
		return mIssue;
	}
	public String getLinkUrl() {
		return mLinkUrl;
	}
	public String getImageUrl() {
		return mImageUrl;
	}
	public String getExtended() {
		return mExtended;
	}
	
	public String getText(){
		return mText;
	}
	
}
