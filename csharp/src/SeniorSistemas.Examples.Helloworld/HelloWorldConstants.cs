namespace SeniorSistemas.Examples.Helloworld
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.

    ///<summary>
    /// TBD
    ///</summary>
    ///<remarks>Constants for examples/hello_world</remarks>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "25.1.4")]
    public class HelloWorldConstants
    {
        ///<summary>The service domain</summary>
        public const string Domain = "examples";
        ///<summary>The service name</summary>
        public const string Service = "hello_world";
        ///<summary>Primitives for commands in the hello_world service.</summary>
        public static class Commands
        {
            ///<summary>
            /// TBD
            /// <see cref="HelloWorldInput">the request payload</see>
            ///</summary>
            public const string HelloWorld = "helloWorld";
            /// <summary>
            /// The response primitive for helloWorld.
            /// </summary>
            ///
            /// <see cref="HelloWorld">the request primitive</see>
            /// <see cref="HelloWorldOutput">the response payload</see>
            public const string HelloWorldResponse = "helloWorldResponse";
            ///<summary>
            /// Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
            /// <see cref="GetMetadataInput">the request payload</see>
            ///</summary>
            public const string GetMetadata = "getMetadata";
            /// <summary>
            /// The response primitive for getMetadata.
            /// </summary>
            ///
            /// <see cref="GetMetadata">the request primitive</see>
            /// <see cref="GetMetadataOutput">the response payload</see>
            public const string GetMetadataResponse = "getMetadataResponse";
            ///<summary>
            /// TBD
            ///</summary>
            public const string Odata = "odata";
            /// <summary>
            /// The response primitive for odata.
            /// </summary>
            ///
            /// <see cref="Odata">the request primitive</see>
            public const string OdataResponse = "odataResponse";
            ///<summary>
            /// TBD
            /// <see cref="ImportClienteInput">the request payload</see>
            ///</summary>
            public const string ImportCliente = "importCliente";
            /// <summary>
            /// The response primitive for importCliente.
            /// </summary>
            ///
            /// <see cref="ImportCliente">the request primitive</see>
            /// <see cref="ImportClienteOutput">the response payload</see>
            public const string ImportClienteResponse = "importClienteResponse";
            ///<summary>
            /// TBD
            /// <see cref="ExportClienteInput">the request payload</see>
            ///</summary>
            public const string ExportCliente = "exportCliente";
            /// <summary>
            /// The response primitive for exportCliente.
            /// </summary>
            ///
            /// <see cref="ExportCliente">the request primitive</see>
            /// <see cref="ExportClienteOutput">the response payload</see>
            public const string ExportClienteResponse = "exportClienteResponse";
            ///<summary>
            /// The 'create' request primitive for the Cliente entity.
            /// <see cref="Cliente">the request payload</see>
            ///</summary>
            public const string CreateCliente = "createCliente";
            /// <summary>
            /// The response primitive for createCliente.
            /// </summary>
            ///
            /// <see cref="CreateCliente">the request primitive</see>
            public const string CreateClienteResponse = "createClienteResponse";
            ///<summary>
            /// The 'createBulk' request primitive for the Cliente entity.
            /// <see cref="CreateBulkClienteInput">the request payload</see>
            ///</summary>
            public const string CreateBulkCliente = "createBulkCliente";
            /// <summary>
            /// The response primitive for createBulkCliente.
            /// </summary>
            ///
            /// <see cref="CreateBulkCliente">the request primitive</see>
            /// <see cref="CreateBulkClienteOutput">the response payload</see>
            public const string CreateBulkClienteResponse = "createBulkClienteResponse";
            ///<summary>
            /// The 'createMerge' request primitive for the Cliente entity.
            /// <see cref="Cliente">the request payload</see>
            ///</summary>
            public const string CreateMergeCliente = "createMergeCliente";
            /// <summary>
            /// The response primitive for createMergeCliente.
            /// </summary>
            ///
            /// <see cref="CreateMergeCliente">the request primitive</see>
            public const string CreateMergeClienteResponse = "createMergeClienteResponse";
            ///<summary>
            /// The 'retrieve' request primitive for the Cliente entity.
            /// <see cref="Cliente.Id">the request payload</see>
            ///</summary>
            public const string RetrieveCliente = "retrieveCliente";
            /// <summary>
            /// The response primitive for retrieveCliente.
            /// </summary>
            ///
            /// <see cref="RetrieveCliente">the request primitive</see>
            public const string RetrieveClienteResponse = "retrieveClienteResponse";
            ///<summary>
            /// The 'update' request primitive for the Cliente entity.
            /// <see cref="Cliente">the request payload</see>
            ///</summary>
            public const string UpdateCliente = "updateCliente";
            /// <summary>
            /// The response primitive for updateCliente.
            /// </summary>
            ///
            /// <see cref="UpdateCliente">the request primitive</see>
            public const string UpdateClienteResponse = "updateClienteResponse";
            ///<summary>
            /// The 'updateMerge' request primitive for the Cliente entity.
            /// <see cref="Cliente">the request payload</see>
            ///</summary>
            public const string UpdateMergeCliente = "updateMergeCliente";
            /// <summary>
            /// The response primitive for updateMergeCliente.
            /// </summary>
            ///
            /// <see cref="UpdateMergeCliente">the request primitive</see>
            public const string UpdateMergeClienteResponse = "updateMergeClienteResponse";
            ///<summary>
            /// The 'delete' request primitive for the Cliente entity.
            /// <see cref="Cliente.Id">the request payload</see>
            ///</summary>
            public const string DeleteCliente = "deleteCliente";
            /// <summary>
            /// The response primitive for deleteCliente.
            /// </summary>
            ///
            /// <see cref="DeleteCliente">the request primitive</see>
            public const string DeleteClienteResponse = "deleteClienteResponse";
            ///<summary>
            /// The 'list' request primitive for the Cliente entity.
            /// <see cref="cliente.pageRequest">the request payload</see>
            ///</summary>
            public const string ListCliente = "listCliente";
            /// <summary>
            /// The response primitive for listCliente.
            /// </summary>
            ///
            /// <see cref="ListCliente">the request primitive</see>
            /// <see cref="Cliente.PagedResults">the response payload</see>
            public const string ListClienteResponse = "listClienteResponse";
            ///<summary>
            /// Returns a list with all dependencies from this service, along with their respective versions
            ///</summary>
            public const string GetDependencies = "getDependencies";
            /// <summary>
            /// The response primitive for getDependencies.
            /// </summary>
            ///
            /// <see cref="GetDependencies">the request primitive</see>
            /// <see cref="GetDependenciesOutput">the response payload</see>
            public const string GetDependenciesResponse = "getDependenciesResponse";
            
        }
        /// <summary>Primitives for events in the hello_world service.</summary>
        public static class Events
        {
            ///<summary>
            /// Default 'serviceStarted' event.
            ///</summary>
            public const string ServiceStarted = "serviceStarted";
            ///<summary>
            /// Default 'notifyUser' event.
            ///</summary>
            public const string NotifyUserEvent = "notifyUserEvent";
            ///<summary>
            /// TBD
            ///</summary>
            public const string ImportClienteEvent = "importClienteEvent";
            ///<summary>
            /// TBD
            ///</summary>
            public const string ExportClienteEvent = "exportClienteEvent";
        }
    }
}
