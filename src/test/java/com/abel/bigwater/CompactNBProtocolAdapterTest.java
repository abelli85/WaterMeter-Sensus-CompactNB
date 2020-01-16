package com.abel.bigwater;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class CompactNBProtocolAdapterTest {

    @Test
    public void decode() throws Exception {
        CompactNBProtocolAdapter cpa = new CompactNBProtocolAdapter();
        ObjectNode node = cpa.decode(new byte[]{1, 2, 3, 4, 5, 6, 7, 8});
        lgr.info("decode demo: {}", node);
    }

    @Test
    public void encode() {
    }

    private static final Logger lgr = LoggerFactory.getLogger(CompactNBProtocolAdapterTest.class);
}