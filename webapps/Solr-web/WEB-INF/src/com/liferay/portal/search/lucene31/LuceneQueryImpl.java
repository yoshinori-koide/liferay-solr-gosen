/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.search.lucene31;

import com.liferay.portal.kernel.search.Query;

/**
 * @author Bruno Farache
 */
public class LuceneQueryImpl implements Query {

	public LuceneQueryImpl(org.apache.lucene.search.Query query) {
		_query = query;
	}

	public org.apache.lucene.search.Query getQuery() {
		return _query;
	}

	public String toString() {
		return _query.toString();
	}

	private org.apache.lucene.search.Query _query;

}