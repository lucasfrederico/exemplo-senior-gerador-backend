/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.examples.helloworld;

import java.util.concurrent.CompletableFuture;

import br.com.senior.examples.helloworld.HelloWorldInput;
import br.com.senior.examples.helloworld.HelloWorldOutput;
import br.com.senior.examples.helloworld.GetMetadataInput;
import br.com.senior.examples.helloworld.GetMetadataOutput;
import br.com.senior.examples.helloworld.ImportClienteInput;
import br.com.senior.examples.helloworld.ImportClienteOutput;
import br.com.senior.examples.helloworld.ExportClienteInput;
import br.com.senior.examples.helloworld.ExportClienteOutput;
import br.com.senior.examples.helloworld.Cliente;
import br.com.senior.examples.helloworld.CreateBulkClienteInput;
import br.com.senior.examples.helloworld.CreateBulkClienteOutput;
import br.com.senior.examples.helloworld.GetDependenciesOutput;
import br.com.senior.examples.helloworld.ServiceStartedPayload;
import br.com.senior.examples.helloworld.NotifyUserEventPayload;
import br.com.senior.examples.helloworld.ImportClienteEventPayload;
import br.com.senior.examples.helloworld.ExportClienteEventPayload;

/**
* 
*/
public interface HelloWorldStub {

	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	HelloWorldOutput helloWorld(HelloWorldInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void helloWorld(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona
	 */
	void getMetadata(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportClienteOutput importCliente(ImportClienteInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importCliente(ImportClienteInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportClienteOutput> importClienteRequest(ImportClienteInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportClienteOutput exportCliente(ExportClienteInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportCliente(ExportClienteInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportClienteOutput> exportClienteRequest(ExportClienteInput input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente createCliente(Cliente input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void createCliente(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> createClienteRequest(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void createBulkCliente(CreateBulkClienteInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkClienteOutput> createBulkClienteRequest(CreateBulkClienteInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente createMergeCliente(Cliente input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void createMergeCliente(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> createMergeClienteRequest(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente retrieveCliente(Cliente.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void retrieveCliente(Cliente.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> retrieveClienteRequest(Cliente.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente updateCliente(Cliente input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void updateCliente(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> updateClienteRequest(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente updateMergeCliente(Cliente input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void updateMergeCliente(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> updateMergeClienteRequest(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteCliente(Cliente.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void deleteCliente(Cliente.Id input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente.PagedResults listCliente(Cliente.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void listCliente(Cliente.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente.PagedResults> listClienteRequest(Cliente.PageRequest input);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona
	 */
	void getDependencies();
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	


	/**
	* Chamada assíncrona para o método publishServiceStarted 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportClienteEvent 
	* This is a public operation
	*/
	void publishImportClienteEvent( ImportClienteEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportClienteEvent 
	* This is a public operation
	*/
	void publishExportClienteEvent( ExportClienteEventPayload input );
			
	

}
