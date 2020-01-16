/**
 * 
 */
package com.abel.bigwater;

import com.fasterxml.jackson.databind.node.ObjectNode;

import hddz.plugs.iot.ProtocolAdapter;

/**
 * @author Abel
 *
 */
public class CapdataProtocolAdaptor extends ProtocolAdapter {
    /* (non-Javadoc)
     * @see hddz.plugs.iot.ProtocolAdapter#decode(byte[])
     */
    @Override
    public ObjectNode decode(byte[] binaryData) throws Exception {
        // TODO Auto-generated method stub
        return super.decode(binaryData);
    }

    /* (non-Javadoc)
     * @see hddz.plugs.iot.ProtocolAdapter#encode(com.fasterxml.jackson.databind.node.ObjectNode)
     */
    @Override
    public byte[] encode(ObjectNode input) throws Exception {
        // TODO Auto-generated method stub
        return super.encode(input);
    }

    /* (non-Javadoc)
     * @see hddz.plugs.iot.ProtocolAdapter#formatLimitAnalog(java.lang.String)
     */
    @Override
    public String formatLimitAnalog(String val) {
        // TODO Auto-generated method stub
        return super.formatLimitAnalog(val);
    }

    /* (non-Javadoc)
     * @see hddz.plugs.iot.ProtocolAdapter#getDefaultDataNode(byte[])
     */
    @Override
    public ObjectNode getDefaultDataNode(byte[] binaryData) {
        // TODO Auto-generated method stub
        return super.getDefaultDataNode(binaryData);
    }

    /* (non-Javadoc)
     * @see hddz.plugs.iot.ProtocolAdapter#getManufacturerId()
     */
    @Override
    public String getManufacturerId() {
        // TODO Auto-generated method stub
        return "ZNSW";
    }

    /* (non-Javadoc)
     * @see hddz.plugs.iot.ProtocolAdapter#getModel()
     */
    @Override
    public String getModel() {
        // TODO Auto-generated method stub
        return "CAPDATA";
    }

}
