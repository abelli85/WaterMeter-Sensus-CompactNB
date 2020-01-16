package com.abel.bigwater;

import com.Test.NBIoTDevice.WaterMeter.Utilty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huawei.m2m.cig.tup.modules.protocol_adapter.IProtocolAdapter;

public class CompactNBProtocolAdapter implements IProtocolAdapter {
    public static final String MANU_ID = "Sensus";

    public static final String THIS_MODEL = "CompactNB";

    @Override
    public String getManufacturerId() {
        return MANU_ID;
    }

    @Override
    public String getModel() {
        return THIS_MODEL;
    }

    @Override
    public ObjectNode decode(byte[] bytes) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        ObjectNode root = null;
        root = mapper.createObjectNode();
        root.put("identifier", "123456789");

        root.put("msgType", "deviceReq");
        root.put("hasMore", 0);

        ArrayNode data = mapper.createArrayNode();
        ObjectNode watermeter = mapper.createObjectNode();
        watermeter.put("serviceId", "WaterMeter");
        ObjectNode meterData = mapper.createObjectNode();
        meterData.put("source", Utilty.parseByte2HexStr(bytes));
        watermeter.set("serviceData", meterData);
        data.add(watermeter);
        root.set("data", data);

        return root;
    }

    @Override
    public byte[] encode(ObjectNode objectNode) throws Exception {
        return new byte[0];
    }
}
