namespace SeniorSistemas.Examples.Helloworld
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.

    ///<summary>
    /// TBD
    ///</summary>
    ///<remarks>Constants for examples/hello_world</remarks>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "25.1.1")]
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
        }
    }
}
