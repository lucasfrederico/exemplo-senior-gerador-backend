/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.examples.helloworld;

import java.util.function.Supplier;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

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

import br.com.senior.examples.helloworld.HelloWorldException;
import br.com.senior.examples.helloworld.HelloWorldConstants;

/**
* 
*/
public class HelloWorldStubImpl  implements HelloWorldStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #HelloWorldStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public HelloWorldStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public HelloWorldStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		br.com.senior.examples.helloworld.impl.HelloWorldImpl impl = new br.com.senior.examples.helloworld.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void helloWorld(HelloWorldInput input) {
		br.com.senior.examples.helloworld.impl.HelloWorldImpl impl = new br.com.senior.examples.helloworld.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		br.com.senior.examples.helloworld.impl.HelloWorldImpl impl = new br.com.senior.examples.helloworld.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.examples.helloworld.impl.GetMetadataImpl impl = new br.com.senior.examples.helloworld.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.examples.helloworld.impl.GetMetadataImpl impl = new br.com.senior.examples.helloworld.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		br.com.senior.examples.helloworld.impl.GetMetadataImpl impl = new br.com.senior.examples.helloworld.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input);
	}
	/**
	 * Chamada síncrona para o método importCliente
	 * This is a public operation
	 * 
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportClienteOutput importCliente(ImportClienteInput input, long timeout) {
		br.com.senior.examples.helloworld.impl.ImportClienteImpl impl = new br.com.senior.examples.helloworld.impl.ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.importCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importCliente
	 * This is a public operation
	 * 
	 */
	@Override
	public void importCliente(ImportClienteInput input) {
		br.com.senior.examples.helloworld.impl.ImportClienteImpl impl = new br.com.senior.examples.helloworld.impl.ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.importCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método importCliente
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportClienteOutput> importClienteRequest(ImportClienteInput input) {
		br.com.senior.examples.helloworld.impl.ImportClienteImpl impl = new br.com.senior.examples.helloworld.impl.ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.importClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportCliente
	 * This is a public operation
	 * 
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportClienteOutput exportCliente(ExportClienteInput input, long timeout) {
		br.com.senior.examples.helloworld.impl.ExportClienteImpl impl = new br.com.senior.examples.helloworld.impl.ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportCliente
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportCliente(ExportClienteInput input) {
		br.com.senior.examples.helloworld.impl.ExportClienteImpl impl = new br.com.senior.examples.helloworld.impl.ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.exportCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportCliente
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportClienteOutput> exportClienteRequest(ExportClienteInput input) {
		br.com.senior.examples.helloworld.impl.ExportClienteImpl impl = new br.com.senior.examples.helloworld.impl.ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método createCliente
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente createCliente(Cliente input, long timeout) {
		br.com.senior.examples.helloworld.impl.CreateClienteImpl impl = new br.com.senior.examples.helloworld.impl.CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createCliente
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 */
	@Override
	public void createCliente(Cliente input) {
		br.com.senior.examples.helloworld.impl.CreateClienteImpl impl = new br.com.senior.examples.helloworld.impl.CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método createCliente
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> createClienteRequest(Cliente input) {
		br.com.senior.examples.helloworld.impl.CreateClienteImpl impl = new br.com.senior.examples.helloworld.impl.CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkCliente
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput input, long timeout) {
		br.com.senior.examples.helloworld.impl.CreateBulkClienteImpl impl = new br.com.senior.examples.helloworld.impl.CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkCliente
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 */
	@Override
	public void createBulkCliente(CreateBulkClienteInput input) {
		br.com.senior.examples.helloworld.impl.CreateBulkClienteImpl impl = new br.com.senior.examples.helloworld.impl.CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkCliente
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<CreateBulkClienteOutput> createBulkClienteRequest(CreateBulkClienteInput input) {
		br.com.senior.examples.helloworld.impl.CreateBulkClienteImpl impl = new br.com.senior.examples.helloworld.impl.CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeCliente
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente createMergeCliente(Cliente input, long timeout) {
		br.com.senior.examples.helloworld.impl.CreateMergeClienteImpl impl = new br.com.senior.examples.helloworld.impl.CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeCliente
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 */
	@Override
	public void createMergeCliente(Cliente input) {
		br.com.senior.examples.helloworld.impl.CreateMergeClienteImpl impl = new br.com.senior.examples.helloworld.impl.CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeCliente
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> createMergeClienteRequest(Cliente input) {
		br.com.senior.examples.helloworld.impl.CreateMergeClienteImpl impl = new br.com.senior.examples.helloworld.impl.CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveCliente
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente retrieveCliente(Cliente.Id input, long timeout) {
		br.com.senior.examples.helloworld.impl.RetrieveClienteImpl impl = new br.com.senior.examples.helloworld.impl.RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveCliente
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 */
	@Override
	public void retrieveCliente(Cliente.Id input) {
		br.com.senior.examples.helloworld.impl.RetrieveClienteImpl impl = new br.com.senior.examples.helloworld.impl.RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveCliente
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> retrieveClienteRequest(Cliente.Id input) {
		br.com.senior.examples.helloworld.impl.RetrieveClienteImpl impl = new br.com.senior.examples.helloworld.impl.RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateCliente
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente updateCliente(Cliente input, long timeout) {
		br.com.senior.examples.helloworld.impl.UpdateClienteImpl impl = new br.com.senior.examples.helloworld.impl.UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateCliente
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 */
	@Override
	public void updateCliente(Cliente input) {
		br.com.senior.examples.helloworld.impl.UpdateClienteImpl impl = new br.com.senior.examples.helloworld.impl.UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.updateCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateCliente
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> updateClienteRequest(Cliente input) {
		br.com.senior.examples.helloworld.impl.UpdateClienteImpl impl = new br.com.senior.examples.helloworld.impl.UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeCliente
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente updateMergeCliente(Cliente input, long timeout) {
		br.com.senior.examples.helloworld.impl.UpdateMergeClienteImpl impl = new br.com.senior.examples.helloworld.impl.UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeCliente
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 */
	@Override
	public void updateMergeCliente(Cliente input) {
		br.com.senior.examples.helloworld.impl.UpdateMergeClienteImpl impl = new br.com.senior.examples.helloworld.impl.UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeCliente
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> updateMergeClienteRequest(Cliente input) {
		br.com.senior.examples.helloworld.impl.UpdateMergeClienteImpl impl = new br.com.senior.examples.helloworld.impl.UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteCliente
	 * This is a public operation
	 * The 'delete' request primitive for the Cliente entity.
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteCliente(Cliente.Id input, long timeout) {
		br.com.senior.examples.helloworld.impl.DeleteClienteImpl impl = new br.com.senior.examples.helloworld.impl.DeleteClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteCliente
	 * This is a public operation
	 * The 'delete' request primitive for the Cliente entity.
	 */
	@Override
	public void deleteCliente(Cliente.Id input) {
		br.com.senior.examples.helloworld.impl.DeleteClienteImpl impl = new br.com.senior.examples.helloworld.impl.DeleteClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteCliente(input);
	}
	
	/**
	 * Chamada síncrona para o método listCliente
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente.PagedResults listCliente(Cliente.PageRequest input, long timeout) {
		br.com.senior.examples.helloworld.impl.ListClienteImpl impl = new br.com.senior.examples.helloworld.impl.ListClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.listCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listCliente
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 */
	@Override
	public void listCliente(Cliente.PageRequest input) {
		br.com.senior.examples.helloworld.impl.ListClienteImpl impl = new br.com.senior.examples.helloworld.impl.ListClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.listCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método listCliente
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente.PagedResults> listClienteRequest(Cliente.PageRequest input) {
		br.com.senior.examples.helloworld.impl.ListClienteImpl impl = new br.com.senior.examples.helloworld.impl.ListClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.listClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws HelloWorldMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.examples.helloworld.impl.GetDependenciesImpl impl = new br.com.senior.examples.helloworld.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.examples.helloworld.impl.GetDependenciesImpl impl = new br.com.senior.examples.helloworld.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		br.com.senior.examples.helloworld.impl.GetDependenciesImpl impl = new br.com.senior.examples.helloworld.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest();
	}

	
	private Message createMessage(ExportClienteEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				HelloWorldConstants.DOMAIN, //
				HelloWorldConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
			}
		return  new Message(userId.getTenant(), // 
			HelloWorldConstants.DOMAIN, // 
			HelloWorldConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ServiceStartedPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				HelloWorldConstants.DOMAIN, //
				HelloWorldConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
			}
		return  new Message(userId.getTenant(), // 
			HelloWorldConstants.DOMAIN, // 
			HelloWorldConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportClienteEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				HelloWorldConstants.DOMAIN, //
				HelloWorldConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
			}
		return  new Message(userId.getTenant(), // 
			HelloWorldConstants.DOMAIN, // 
			HelloWorldConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(NotifyUserEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				HelloWorldConstants.DOMAIN, //
				HelloWorldConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
			}
		return  new Message(userId.getTenant(), // 
			HelloWorldConstants.DOMAIN, // 
			HelloWorldConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	

	/**
	* Chamada assíncrona para o método publishServiceStarted
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishServiceStarted( ServiceStartedPayload input ) {
		Message message = createMessage(input, HelloWorldConstants.Events.SERVICE_STARTED);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new HelloWorldException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
		Message message = createMessage(input, HelloWorldConstants.Events.NOTIFY_USER_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new HelloWorldException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportClienteEvent
	* This is a public operation
	*/
	public void publishImportClienteEvent( ImportClienteEventPayload input ) {
		Message message = createMessage(input, HelloWorldConstants.Events.IMPORT_CLIENTE_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new HelloWorldException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportClienteEvent
	* This is a public operation
	*/
	public void publishExportClienteEvent( ExportClienteEventPayload input ) {
		Message message = createMessage(input, HelloWorldConstants.Events.EXPORT_CLIENTE_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new HelloWorldException("Erro ao enviar a mensagem", e);
		}
	}
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
