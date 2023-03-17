/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package com.rockyyu.geotools.gbase;

import static com.rockyyu.geotools.gbase.GBaseDataStoreFactory.STORAGE_ENGINE;

import java.util.Map;
import org.geotools.jdbc.JDBCJNDIDataStoreFactory;

/**
 * JNDI DataStoreFactory for mysql database.
 *
 * @author Christian Mueller
 */
// temporary work around, the factory parameters map will be fixed separately
@SuppressWarnings("unchecked")
public class GBaseJNDIDataStoreFactory extends JDBCJNDIDataStoreFactory {

    public GBaseJNDIDataStoreFactory() {
        super(new GBaseDataStoreFactory());
    }

    @Override
    protected void setupParameters(Map parameters) {
        super.setupParameters(parameters);
        parameters.put(STORAGE_ENGINE.key, STORAGE_ENGINE);
    }
}
