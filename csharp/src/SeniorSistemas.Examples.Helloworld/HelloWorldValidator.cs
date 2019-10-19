namespace SeniorSistemas.Examples.Helloworld
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    
    ///<summary>Validators for payloads accepted/produced by endpoints in hello_world</summary>
    public class HelloWorldValidator
    {
        public static void Validate(HelloWorldInput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(HelloWorldInput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Who == null)
            {
                throw new ArgumentException("Who is required");
            }
        }
        public static void Validate(HelloWorldOutput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(HelloWorldOutput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.HelloWorldMessage == null)
            {
                throw new ArgumentException("HelloWorldMessage is required");
            }
        }
        public static void Validate(Cliente toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(Cliente toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Nome == null)
            {
                throw new ArgumentException("Nome is required");
            }
            if (toValidate.DataNascimento == null)
            {
                throw new ArgumentException("DataNascimento is required");
            }
            if (toValidate.Cpf == null)
            {
                throw new ArgumentException("Cpf is required");
            }
        }
        public static void Validate(ServiceStartedPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ServiceStartedPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Domain == null)
            {
                throw new ArgumentException("Domain is required");
            }
            if (toValidate.Service == null)
            {
                throw new ArgumentException("Service is required");
            }
        }
        public static void Validate(NotifyUserEventPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(NotifyUserEventPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.NotificationKind == null)
            {
                throw new ArgumentException("NotificationKind is required");
            }
            if (toValidate.NotificationPriority == null)
            {
                throw new ArgumentException("NotificationPriority is required");
            }
            if (toValidate.NotificationSubject == null)
            {
                throw new ArgumentException("NotificationSubject is required");
            }
            if (toValidate.NotificationContent == null)
            {
                throw new ArgumentException("NotificationContent is required");
            }
            if (toValidate.SourceDomain == null)
            {
                throw new ArgumentException("SourceDomain is required");
            }
            if (toValidate.SourceService == null)
            {
                throw new ArgumentException("SourceService is required");
            }
            if (toValidate.DestinationUser == null)
            {
                throw new ArgumentException("DestinationUser is required");
            }
        }
        public static void Validate(EmailNotifyUserEventPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(EmailNotifyUserEventPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.NotificationKind == null)
            {
                throw new ArgumentException("NotificationKind is required");
            }
            if (toValidate.NotificationPriority == null)
            {
                throw new ArgumentException("NotificationPriority is required");
            }
            if (toValidate.NotificationSubject == null)
            {
                throw new ArgumentException("NotificationSubject is required");
            }
            if (toValidate.NotificationContent == null)
            {
                throw new ArgumentException("NotificationContent is required");
            }
            if (toValidate.SourceDomain == null)
            {
                throw new ArgumentException("SourceDomain is required");
            }
            if (toValidate.SourceService == null)
            {
                throw new ArgumentException("SourceService is required");
            }
            if (toValidate.DestinationUser == null)
            {
                throw new ArgumentException("DestinationUser is required");
            }
            if (toValidate.From == null)
            {
                throw new ArgumentException("From is required");
            }
        }
        public static void Validate(PushNotifyUserEventPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(PushNotifyUserEventPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.NotificationKind == null)
            {
                throw new ArgumentException("NotificationKind is required");
            }
            if (toValidate.NotificationPriority == null)
            {
                throw new ArgumentException("NotificationPriority is required");
            }
            if (toValidate.NotificationSubject == null)
            {
                throw new ArgumentException("NotificationSubject is required");
            }
            if (toValidate.NotificationContent == null)
            {
                throw new ArgumentException("NotificationContent is required");
            }
            if (toValidate.SourceDomain == null)
            {
                throw new ArgumentException("SourceDomain is required");
            }
            if (toValidate.SourceService == null)
            {
                throw new ArgumentException("SourceService is required");
            }
            if (toValidate.DestinationUser == null)
            {
                throw new ArgumentException("DestinationUser is required");
            }
            if (toValidate.ApplicationId == null)
            {
                throw new ArgumentException("ApplicationId is required");
            }
        }
        public static void Validate(GetMetadataInput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(GetMetadataInput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            // no validation required
        }
        public static void Validate(GetMetadataOutput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(GetMetadataOutput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Metadata == null)
            {
                throw new ArgumentException("Metadata is required");
            }
        }
        public static void Validate(BlobReference toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(BlobReference toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.TargetObjectId == null)
            {
                throw new ArgumentException("TargetObjectId is required");
            }
        }
        public static void Validate(BasicErrorPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(BasicErrorPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            // no validation required
        }
        public static void Validate(ImportError toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ImportError toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.ErrorType == null)
            {
                throw new ArgumentException("ErrorType is required");
            }
            if (toValidate.LineNumber == null)
            {
                throw new ArgumentException("LineNumber is required");
            }
            if (toValidate.Bean == null)
            {
                throw new ArgumentException("Bean is required");
            }
            if (toValidate.Message == null)
            {
                throw new ArgumentException("Message is required");
            }
            if (toValidate.ExceptionClass == null)
            {
                throw new ArgumentException("ExceptionClass is required");
            }
        }
        public static void Validate(Fielddto toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(Fielddto toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Id == null)
            {
                throw new ArgumentException("Id is required");
            }
            if (toValidate.Name == null)
            {
                throw new ArgumentException("Name is required");
            }
            if (toValidate.FieldType == null)
            {
                throw new ArgumentException("FieldType is required");
            }
        }
        public static void Validate(Hookdto toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(Hookdto toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.HookFunction == null)
            {
                throw new ArgumentException("HookFunction is required");
            }
            if (toValidate.Script == null)
            {
                throw new ArgumentException("Script is required");
            }
        }
        public static void Validate(Layoutdto toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(Layoutdto toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Id == null)
            {
                throw new ArgumentException("Id is required");
            }
            if (toValidate.Description == null)
            {
                throw new ArgumentException("Description is required");
            }
            if (toValidate.FileFormat == null)
            {
                throw new ArgumentException("FileFormat is required");
            }
            if (toValidate.ErrorStrategy == null)
            {
                throw new ArgumentException("ErrorStrategy is required");
            }
            if (toValidate.SkipLines == null)
            {
                throw new ArgumentException("SkipLines is required");
            }
            if (toValidate.Fields == null || toValidate.Fields.Count == 0)
            {
                throw new ArgumentException("Fields is required, at least one value must be present");
            }
            foreach (Fielddto it in toValidate.Fields)
            {
                it.Validate(validated);
            }
            if (toValidate.Hooks != null)
            {
                foreach (Hookdto it in toValidate.Hooks)
                {
                    it.Validate(validated);
                }
            }
        }
        public static void Validate(ImportReport toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ImportReport toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Id == null)
            {
                throw new ArgumentException("Id is required");
            }
            if (toValidate.StartTime == null)
            {
                throw new ArgumentException("StartTime is required");
            }
            if (toValidate.EndTime == null)
            {
                throw new ArgumentException("EndTime is required");
            }
            if (toValidate.Uri == null)
            {
                throw new ArgumentException("Uri is required");
            }
            if (toValidate.BeanClass == null)
            {
                throw new ArgumentException("BeanClass is required");
            }
            if (toValidate.ServiceClass == null)
            {
                throw new ArgumentException("ServiceClass is required");
            }
            if (toValidate.Layout == null)
            {
                throw new ArgumentException("Layout is required");
            }
            toValidate.Layout.Validate(validated);
            if (toValidate.SucessCount == null)
            {
                throw new ArgumentException("SucessCount is required");
            }
            if (toValidate.ErrorsCount == null)
            {
                throw new ArgumentException("ErrorsCount is required");
            }
            if (toValidate.FilteredCount == null)
            {
                throw new ArgumentException("FilteredCount is required");
            }
            if (toValidate.SkippedCount == null)
            {
                throw new ArgumentException("SkippedCount is required");
            }
            if (toValidate.ImportErrors != null)
            {
                foreach (ImportError it in toValidate.ImportErrors)
                {
                    it.Validate(validated);
                }
            }
        }
        public static void Validate(ExportEventStatus toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ExportEventStatus toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.ImporterId == null)
            {
                throw new ArgumentException("ImporterId is required");
            }
            if (toValidate.EventType == null)
            {
                throw new ArgumentException("EventType is required");
            }
            if (toValidate.RecordCount == null)
            {
                throw new ArgumentException("RecordCount is required");
            }
        }
        public static void Validate(ImportEventStatus toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ImportEventStatus toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.ImporterId == null)
            {
                throw new ArgumentException("ImporterId is required");
            }
            if (toValidate.EventType == null)
            {
                throw new ArgumentException("EventType is required");
            }
            if (toValidate.Status == null)
            {
                throw new ArgumentException("Status is required");
            }
            if (toValidate.RecordCount == null)
            {
                throw new ArgumentException("RecordCount is required");
            }
            if (toValidate.ImportReport != null)
            {
                toValidate.ImportReport.Validate(validated);
            }
        }
        public static void Validate(ExportConfig toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ExportConfig toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Uri == null)
            {
                throw new ArgumentException("Uri is required");
            }
            if (toValidate.Layout == null)
            {
                throw new ArgumentException("Layout is required");
            }
            toValidate.Layout.Validate(validated);
            if (toValidate.Async == null)
            {
                throw new ArgumentException("Async is required");
            }
            if (toValidate.ErrorStrategy == null)
            {
                throw new ArgumentException("ErrorStrategy is required");
            }
        }
        public static void Validate(ImportConfig toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ImportConfig toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Uri == null)
            {
                throw new ArgumentException("Uri is required");
            }
            if (toValidate.Layout == null)
            {
                throw new ArgumentException("Layout is required");
            }
            toValidate.Layout.Validate(validated);
            if (toValidate.Async == null)
            {
                throw new ArgumentException("Async is required");
            }
            if (toValidate.BatchSize == null)
            {
                throw new ArgumentException("BatchSize is required");
            }
            if (toValidate.ErrorStrategy == null)
            {
                throw new ArgumentException("ErrorStrategy is required");
            }
        }
        public static void Validate(ImportClienteInput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ImportClienteInput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Config == null)
            {
                throw new ArgumentException("Config is required");
            }
            toValidate.Config.Validate(validated);
        }
        public static void Validate(ImportClienteOutput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ImportClienteOutput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.ImportJobId == null)
            {
                throw new ArgumentException("ImportJobId is required");
            }
        }
        public static void Validate(ExportClienteInput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ExportClienteInput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Config == null)
            {
                throw new ArgumentException("Config is required");
            }
            toValidate.Config.Validate(validated);
        }
        public static void Validate(ExportClienteOutput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ExportClienteOutput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.ExportJobId == null)
            {
                throw new ArgumentException("ExportJobId is required");
            }
        }
        public static void Validate(ImportClienteEventPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ImportClienteEventPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Eventpl == null)
            {
                throw new ArgumentException("Eventpl is required");
            }
            toValidate.Eventpl.Validate(validated);
        }
        public static void Validate(ExportClienteEventPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ExportClienteEventPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Eventpl == null)
            {
                throw new ArgumentException("Eventpl is required");
            }
            toValidate.Eventpl.Validate(validated);
        }
        public static void Validate(CreateBulkClienteInput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(CreateBulkClienteInput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Entities == null || toValidate.Entities.Count == 0)
            {
                throw new ArgumentException("Entities is required, at least one value must be present");
            }
        }
        public static void Validate(CreateBulkClienteOutput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(CreateBulkClienteOutput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            // no validation required
        }
        public static void Validate(Dependency toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(Dependency toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Domain == null)
            {
                throw new ArgumentException("Domain is required");
            }
            if (toValidate.Service == null)
            {
                throw new ArgumentException("Service is required");
            }
            if (toValidate.Version == null)
            {
                throw new ArgumentException("Version is required");
            }
        }
        public static void Validate(GetDependenciesOutput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(GetDependenciesOutput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Dependencies == null || toValidate.Dependencies.Count == 0)
            {
                throw new ArgumentException("Dependencies is required, at least one value must be present");
            }
            foreach (Dependency it in toValidate.Dependencies)
            {
                it.Validate(validated);
            }
        }
    }
}
