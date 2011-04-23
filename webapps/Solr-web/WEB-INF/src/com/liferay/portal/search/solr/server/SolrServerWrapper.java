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

package com.liferay.portal.search.solr.server;

import org.apache.solr.client.solrj.SolrServer;

/**
 * @author Bruno Farache
 */
public class SolrServerWrapper {

	public SolrServerWrapper(String id, SolrServer solrServer) {
		_id = id;
		_solrServer = solrServer;
	}

	public String getId() {
		return _id;
	}

	public SolrServer getServer() {
		return _solrServer;
	}

	private String _id;
	private SolrServer _solrServer;

}