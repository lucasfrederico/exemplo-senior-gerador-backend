/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.examples.helloworld;

import java.util.Map;

import br.com.senior.messaging.Message;

/**
 * Normalizers for payloads accepted/produced by endpoints in hello_world.
 */
public class HelloWorldNormalizer {
    
    /**
     * Normalizes the Cliente payload.
     */
    public static void normalize(Cliente toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Cliente.Id payload.
     */
    public static void normalize(Cliente.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    
}
