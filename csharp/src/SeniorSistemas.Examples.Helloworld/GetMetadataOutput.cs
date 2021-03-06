namespace SeniorSistemas.Examples.Helloworld
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Output payload for command getMetadata
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "25.1.4")]
    public class GetMetadataOutput
    {
        
        ///<summary>
        /// TBD
        ///</summary>
        public string Metadata { get; set; }
        
        /// <summary>
        /// Constructor for GetMetadataOutput
        /// </summary>
        /// <param name="metadata">
        ///<summary>
        /// TBD
        ///</summary>
        /// </param>
        public GetMetadataOutput(string metadata)
        {
            this.Metadata = metadata;
        }
        
        public virtual void Validate()
        {
        	Validate(new ArrayList());
        }
        
        internal virtual void Validate(IList validated)
        {
            HelloWorldValidator.Validate(this, validated);
        }
    }
}
