/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.examples.helloworld;

public interface HelloWorldConstants {
    String DOMAIN = "examples";
    String SERVICE = "hello_world";
    
    interface Commands {
    	/**
    	 * @see HelloWorldInput the request payload
    	 */
    	String HELLO_WORLD = "helloWorld";
    	/**
    	 * The success response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 * @see HelloWorldOutput the response payload
    	 */
    	String HELLO_WORLD_RESPONSE = "helloWorldResponse";
    	/**
    	 * An error response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 */
    	String HELLO_WORLD_ERROR = "helloWorldError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	String ODATA = "odata";
    	/**
    	 * The success response primitive for odata.
    	 *
    	 * @see #ODATA the request primitive
    	 */
    	String ODATA_RESPONSE = "odataResponse";
    	/**
    	 * An error response primitive for odata.
    	 *
    	 * @see #ODATA the request primitive
    	 */
    	String ODATA_ERROR = "odataError";
    	/**
    	 * @see ImportClienteInput the request payload
    	 */
    	String IMPORT_CLIENTE = "importCliente";
    	/**
    	 * The success response primitive for importCliente.
    	 *
    	 * @see #IMPORT_CLIENTE the request primitive
    	 * @see ImportClienteOutput the response payload
    	 */
    	String IMPORT_CLIENTE_RESPONSE = "importClienteResponse";
    	/**
    	 * An error response primitive for importCliente.
    	 *
    	 * @see #IMPORT_CLIENTE the request primitive
    	 */
    	String IMPORT_CLIENTE_ERROR = "importClienteError";
    	/**
    	 * @see ExportClienteInput the request payload
    	 */
    	String EXPORT_CLIENTE = "exportCliente";
    	/**
    	 * The success response primitive for exportCliente.
    	 *
    	 * @see #EXPORT_CLIENTE the request primitive
    	 * @see ExportClienteOutput the response payload
    	 */
    	String EXPORT_CLIENTE_RESPONSE = "exportClienteResponse";
    	/**
    	 * An error response primitive for exportCliente.
    	 *
    	 * @see #EXPORT_CLIENTE the request primitive
    	 */
    	String EXPORT_CLIENTE_ERROR = "exportClienteError";
    	/**
    	 * The 'create' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String CREATE_CLIENTE = "createCliente";
    	/**
    	 * The success response primitive for createCliente.
    	 *
    	 * @see #CREATE_CLIENTE the request primitive
    	 */
    	String CREATE_CLIENTE_RESPONSE = "createClienteResponse";
    	/**
    	 * An error response primitive for createCliente.
    	 *
    	 * @see #CREATE_CLIENTE the request primitive
    	 */
    	String CREATE_CLIENTE_ERROR = "createClienteError";
    	/**
    	 * The 'createBulk' request primitive for the Cliente entity.
    	 * @see CreateBulkClienteInput the request payload
    	 */
    	String CREATE_BULK_CLIENTE = "createBulkCliente";
    	/**
    	 * The success response primitive for createBulkCliente.
    	 *
    	 * @see #CREATE_BULK_CLIENTE the request primitive
    	 * @see CreateBulkClienteOutput the response payload
    	 */
    	String CREATE_BULK_CLIENTE_RESPONSE = "createBulkClienteResponse";
    	/**
    	 * An error response primitive for createBulkCliente.
    	 *
    	 * @see #CREATE_BULK_CLIENTE the request primitive
    	 */
    	String CREATE_BULK_CLIENTE_ERROR = "createBulkClienteError";
    	/**
    	 * The 'createMerge' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String CREATE_MERGE_CLIENTE = "createMergeCliente";
    	/**
    	 * The success response primitive for createMergeCliente.
    	 *
    	 * @see #CREATE_MERGE_CLIENTE the request primitive
    	 */
    	String CREATE_MERGE_CLIENTE_RESPONSE = "createMergeClienteResponse";
    	/**
    	 * An error response primitive for createMergeCliente.
    	 *
    	 * @see #CREATE_MERGE_CLIENTE the request primitive
    	 */
    	String CREATE_MERGE_CLIENTE_ERROR = "createMergeClienteError";
    	/**
    	 * The 'retrieve' request primitive for the Cliente entity.
    	 * @see Cliente.Id the request payload
    	 */
    	String RETRIEVE_CLIENTE = "retrieveCliente";
    	/**
    	 * The success response primitive for retrieveCliente.
    	 *
    	 * @see #RETRIEVE_CLIENTE the request primitive
    	 */
    	String RETRIEVE_CLIENTE_RESPONSE = "retrieveClienteResponse";
    	/**
    	 * An error response primitive for retrieveCliente.
    	 *
    	 * @see #RETRIEVE_CLIENTE the request primitive
    	 */
    	String RETRIEVE_CLIENTE_ERROR = "retrieveClienteError";
    	/**
    	 * The 'update' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String UPDATE_CLIENTE = "updateCliente";
    	/**
    	 * The success response primitive for updateCliente.
    	 *
    	 * @see #UPDATE_CLIENTE the request primitive
    	 */
    	String UPDATE_CLIENTE_RESPONSE = "updateClienteResponse";
    	/**
    	 * An error response primitive for updateCliente.
    	 *
    	 * @see #UPDATE_CLIENTE the request primitive
    	 */
    	String UPDATE_CLIENTE_ERROR = "updateClienteError";
    	/**
    	 * The 'updateMerge' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String UPDATE_MERGE_CLIENTE = "updateMergeCliente";
    	/**
    	 * The success response primitive for updateMergeCliente.
    	 *
    	 * @see #UPDATE_MERGE_CLIENTE the request primitive
    	 */
    	String UPDATE_MERGE_CLIENTE_RESPONSE = "updateMergeClienteResponse";
    	/**
    	 * An error response primitive for updateMergeCliente.
    	 *
    	 * @see #UPDATE_MERGE_CLIENTE the request primitive
    	 */
    	String UPDATE_MERGE_CLIENTE_ERROR = "updateMergeClienteError";
    	/**
    	 * The 'delete' request primitive for the Cliente entity.
    	 * @see Cliente.Id the request payload
    	 */
    	String DELETE_CLIENTE = "deleteCliente";
    	/**
    	 * The success response primitive for deleteCliente.
    	 *
    	 * @see #DELETE_CLIENTE the request primitive
    	 */
    	String DELETE_CLIENTE_RESPONSE = "deleteClienteResponse";
    	/**
    	 * An error response primitive for deleteCliente.
    	 *
    	 * @see #DELETE_CLIENTE the request primitive
    	 */
    	String DELETE_CLIENTE_ERROR = "deleteClienteError";
    	/**
    	 * The 'list' request primitive for the Cliente entity.
    	 * @see cliente.pageRequest the request payload
    	 */
    	String LIST_CLIENTE = "listCliente";
    	/**
    	 * The success response primitive for listCliente.
    	 *
    	 * @see #LIST_CLIENTE the request primitive
    	 * @see Cliente.PagedResults the response payload
    	 */
    	String LIST_CLIENTE_RESPONSE = "listClienteResponse";
    	/**
    	 * An error response primitive for listCliente.
    	 *
    	 * @see #LIST_CLIENTE the request primitive
    	 */
    	String LIST_CLIENTE_ERROR = "listClienteError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    }
    
    interface Events {
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    	String IMPORT_CLIENTE_EVENT = "importClienteEvent";
    	String EXPORT_CLIENTE_EVENT = "exportClienteEvent";
    }
    
}
