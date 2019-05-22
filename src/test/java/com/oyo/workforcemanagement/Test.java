package com.oyo.workforcemanagement;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@EntityScan
@SpringBootTest
public class Test {
    @Autowired
    MetaData metaData;
    @org.junit.Test
    public void testGettingDestination() {
        metaData.listPackageDestinations();
    }

}
