package com.rockyyu.geotools.gbase;

import java.util.ServiceLoader;
import org.geotools.data.DataStoreFactorySpi;

public class Main {

    public static void main(String[] args) throws Exception {
        ServiceLoader<DataStoreFactorySpi> services = ServiceLoader.load(DataStoreFactorySpi.class);
    }
}
