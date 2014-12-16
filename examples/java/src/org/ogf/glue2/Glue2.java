
package org.ogf.glue2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * A GLUE 2 document
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "AccessPolicy",
    "Activity",
    "AdminDomain",
    "ApplicationEnvironment",
    "ApplicationHandle",
    "Benchmark",
    "ComputingActivity",
    "ComputingEndpoint",
    "ComputingManager",
    "ComputingService",
    "ComputingShare",
    "Contact",
    "DataStore",
    "Domain",
    "Endpoint",
    "Entity",
    "ExecutionEnvironment",
    "Location",
    "Manager",
    "MappingPolicy",
    "Policy",
    "Resource",
    "Service",
    "Share",
    "StorageAccessProtocol",
    "StorageEndpoint",
    "StorageManager",
    "StorageService",
    "StorageServiceCapacity",
    "StorageShare",
    "StorageShareCapacity",
    "ToComputingService",
    "ToStorageService",
    "UserDomain"
})
public class Glue2 {

    @JsonProperty("AccessPolicy")
    private List<org.ogf.glue2.AccessPolicy> AccessPolicy = new ArrayList<org.ogf.glue2.AccessPolicy>();
    @JsonProperty("Activity")
    private List<org.ogf.glue2.Activity> Activity = new ArrayList<org.ogf.glue2.Activity>();
    @JsonProperty("AdminDomain")
    private List<org.ogf.glue2.AdminDomain> AdminDomain = new ArrayList<org.ogf.glue2.AdminDomain>();
    @JsonProperty("ApplicationEnvironment")
    private List<org.ogf.glue2.ApplicationEnvironment> ApplicationEnvironment = new ArrayList<org.ogf.glue2.ApplicationEnvironment>();
    @JsonProperty("ApplicationHandle")
    private List<org.ogf.glue2.ApplicationHandle> ApplicationHandle = new ArrayList<org.ogf.glue2.ApplicationHandle>();
    @JsonProperty("Benchmark")
    private List<org.ogf.glue2.Benchmark> Benchmark = new ArrayList<org.ogf.glue2.Benchmark>();
    @JsonProperty("ComputingActivity")
    private List<org.ogf.glue2.ComputingActivity> ComputingActivity = new ArrayList<org.ogf.glue2.ComputingActivity>();
    @JsonProperty("ComputingEndpoint")
    private List<org.ogf.glue2.ComputingEndpoint> ComputingEndpoint = new ArrayList<org.ogf.glue2.ComputingEndpoint>();
    @JsonProperty("ComputingManager")
    private List<org.ogf.glue2.ComputingManager> ComputingManager = new ArrayList<org.ogf.glue2.ComputingManager>();
    @JsonProperty("ComputingService")
    private List<org.ogf.glue2.ComputingService> ComputingService = new ArrayList<org.ogf.glue2.ComputingService>();
    @JsonProperty("ComputingShare")
    private List<org.ogf.glue2.ComputingShare> ComputingShare = new ArrayList<org.ogf.glue2.ComputingShare>();
    @JsonProperty("Contact")
    private List<org.ogf.glue2.Contact> Contact = new ArrayList<org.ogf.glue2.Contact>();
    @JsonProperty("DataStore")
    private List<org.ogf.glue2.DataStore> DataStore = new ArrayList<org.ogf.glue2.DataStore>();
    @JsonProperty("Domain")
    private List<org.ogf.glue2.Domain> Domain = new ArrayList<org.ogf.glue2.Domain>();
    @JsonProperty("Endpoint")
    private List<org.ogf.glue2.Endpoint> Endpoint = new ArrayList<org.ogf.glue2.Endpoint>();
    @JsonProperty("Entity")
    private List<org.ogf.glue2.Entity> Entity = new ArrayList<org.ogf.glue2.Entity>();
    @JsonProperty("ExecutionEnvironment")
    private List<org.ogf.glue2.ExecutionEnvironment> ExecutionEnvironment = new ArrayList<org.ogf.glue2.ExecutionEnvironment>();
    @JsonProperty("Location")
    private List<org.ogf.glue2.Location> Location = new ArrayList<org.ogf.glue2.Location>();
    @JsonProperty("Manager")
    private List<org.ogf.glue2.Manager> Manager = new ArrayList<org.ogf.glue2.Manager>();
    @JsonProperty("MappingPolicy")
    private List<org.ogf.glue2.MappingPolicy> MappingPolicy = new ArrayList<org.ogf.glue2.MappingPolicy>();
    @JsonProperty("Policy")
    private List<org.ogf.glue2.Policy> Policy = new ArrayList<org.ogf.glue2.Policy>();
    @JsonProperty("Resource")
    private List<org.ogf.glue2.Resource> Resource = new ArrayList<org.ogf.glue2.Resource>();
    @JsonProperty("Service")
    private List<org.ogf.glue2.Service> Service = new ArrayList<org.ogf.glue2.Service>();
    @JsonProperty("Share")
    private List<org.ogf.glue2.Share> Share = new ArrayList<org.ogf.glue2.Share>();
    @JsonProperty("StorageAccessProtocol")
    private List<org.ogf.glue2.StorageAccessProtocol> StorageAccessProtocol = new ArrayList<org.ogf.glue2.StorageAccessProtocol>();
    @JsonProperty("StorageEndpoint")
    private List<org.ogf.glue2.StorageEndpoint> StorageEndpoint = new ArrayList<org.ogf.glue2.StorageEndpoint>();
    @JsonProperty("StorageManager")
    private List<org.ogf.glue2.StorageManager> StorageManager = new ArrayList<org.ogf.glue2.StorageManager>();
    @JsonProperty("StorageService")
    private List<org.ogf.glue2.StorageService> StorageService = new ArrayList<org.ogf.glue2.StorageService>();
    @JsonProperty("StorageServiceCapacity")
    private List<org.ogf.glue2.StorageServiceCapacity> StorageServiceCapacity = new ArrayList<org.ogf.glue2.StorageServiceCapacity>();
    @JsonProperty("StorageShare")
    private List<org.ogf.glue2.StorageShare> StorageShare = new ArrayList<org.ogf.glue2.StorageShare>();
    @JsonProperty("StorageShareCapacity")
    private List<org.ogf.glue2.StorageShareCapacity> StorageShareCapacity = new ArrayList<org.ogf.glue2.StorageShareCapacity>();
    @JsonProperty("ToComputingService")
    private List<org.ogf.glue2.ToComputingService> ToComputingService = new ArrayList<org.ogf.glue2.ToComputingService>();
    @JsonProperty("ToStorageService")
    private List<org.ogf.glue2.ToStorageService> ToStorageService = new ArrayList<org.ogf.glue2.ToStorageService>();
    @JsonProperty("UserDomain")
    private List<org.ogf.glue2.UserDomain> UserDomain = new ArrayList<org.ogf.glue2.UserDomain>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The AccessPolicy
     */
    @JsonProperty("AccessPolicy")
    public List<org.ogf.glue2.AccessPolicy> getAccessPolicy() {
        return AccessPolicy;
    }

    /**
     * 
     * @param AccessPolicy
     *     The AccessPolicy
     */
    @JsonProperty("AccessPolicy")
    public void setAccessPolicy(List<org.ogf.glue2.AccessPolicy> AccessPolicy) {
        this.AccessPolicy = AccessPolicy;
    }

    /**
     * 
     * @return
     *     The Activity
     */
    @JsonProperty("Activity")
    public List<org.ogf.glue2.Activity> getActivity() {
        return Activity;
    }

    /**
     * 
     * @param Activity
     *     The Activity
     */
    @JsonProperty("Activity")
    public void setActivity(List<org.ogf.glue2.Activity> Activity) {
        this.Activity = Activity;
    }

    /**
     * 
     * @return
     *     The AdminDomain
     */
    @JsonProperty("AdminDomain")
    public List<org.ogf.glue2.AdminDomain> getAdminDomain() {
        return AdminDomain;
    }

    /**
     * 
     * @param AdminDomain
     *     The AdminDomain
     */
    @JsonProperty("AdminDomain")
    public void setAdminDomain(List<org.ogf.glue2.AdminDomain> AdminDomain) {
        this.AdminDomain = AdminDomain;
    }

    /**
     * 
     * @return
     *     The ApplicationEnvironment
     */
    @JsonProperty("ApplicationEnvironment")
    public List<org.ogf.glue2.ApplicationEnvironment> getApplicationEnvironment() {
        return ApplicationEnvironment;
    }

    /**
     * 
     * @param ApplicationEnvironment
     *     The ApplicationEnvironment
     */
    @JsonProperty("ApplicationEnvironment")
    public void setApplicationEnvironment(List<org.ogf.glue2.ApplicationEnvironment> ApplicationEnvironment) {
        this.ApplicationEnvironment = ApplicationEnvironment;
    }

    /**
     * 
     * @return
     *     The ApplicationHandle
     */
    @JsonProperty("ApplicationHandle")
    public List<org.ogf.glue2.ApplicationHandle> getApplicationHandle() {
        return ApplicationHandle;
    }

    /**
     * 
     * @param ApplicationHandle
     *     The ApplicationHandle
     */
    @JsonProperty("ApplicationHandle")
    public void setApplicationHandle(List<org.ogf.glue2.ApplicationHandle> ApplicationHandle) {
        this.ApplicationHandle = ApplicationHandle;
    }

    /**
     * 
     * @return
     *     The Benchmark
     */
    @JsonProperty("Benchmark")
    public List<org.ogf.glue2.Benchmark> getBenchmark() {
        return Benchmark;
    }

    /**
     * 
     * @param Benchmark
     *     The Benchmark
     */
    @JsonProperty("Benchmark")
    public void setBenchmark(List<org.ogf.glue2.Benchmark> Benchmark) {
        this.Benchmark = Benchmark;
    }

    /**
     * 
     * @return
     *     The ComputingActivity
     */
    @JsonProperty("ComputingActivity")
    public List<org.ogf.glue2.ComputingActivity> getComputingActivity() {
        return ComputingActivity;
    }

    /**
     * 
     * @param ComputingActivity
     *     The ComputingActivity
     */
    @JsonProperty("ComputingActivity")
    public void setComputingActivity(List<org.ogf.glue2.ComputingActivity> ComputingActivity) {
        this.ComputingActivity = ComputingActivity;
    }

    /**
     * 
     * @return
     *     The ComputingEndpoint
     */
    @JsonProperty("ComputingEndpoint")
    public List<org.ogf.glue2.ComputingEndpoint> getComputingEndpoint() {
        return ComputingEndpoint;
    }

    /**
     * 
     * @param ComputingEndpoint
     *     The ComputingEndpoint
     */
    @JsonProperty("ComputingEndpoint")
    public void setComputingEndpoint(List<org.ogf.glue2.ComputingEndpoint> ComputingEndpoint) {
        this.ComputingEndpoint = ComputingEndpoint;
    }

    /**
     * 
     * @return
     *     The ComputingManager
     */
    @JsonProperty("ComputingManager")
    public List<org.ogf.glue2.ComputingManager> getComputingManager() {
        return ComputingManager;
    }

    /**
     * 
     * @param ComputingManager
     *     The ComputingManager
     */
    @JsonProperty("ComputingManager")
    public void setComputingManager(List<org.ogf.glue2.ComputingManager> ComputingManager) {
        this.ComputingManager = ComputingManager;
    }

    /**
     * 
     * @return
     *     The ComputingService
     */
    @JsonProperty("ComputingService")
    public List<org.ogf.glue2.ComputingService> getComputingService() {
        return ComputingService;
    }

    /**
     * 
     * @param ComputingService
     *     The ComputingService
     */
    @JsonProperty("ComputingService")
    public void setComputingService(List<org.ogf.glue2.ComputingService> ComputingService) {
        this.ComputingService = ComputingService;
    }

    /**
     * 
     * @return
     *     The ComputingShare
     */
    @JsonProperty("ComputingShare")
    public List<org.ogf.glue2.ComputingShare> getComputingShare() {
        return ComputingShare;
    }

    /**
     * 
     * @param ComputingShare
     *     The ComputingShare
     */
    @JsonProperty("ComputingShare")
    public void setComputingShare(List<org.ogf.glue2.ComputingShare> ComputingShare) {
        this.ComputingShare = ComputingShare;
    }

    /**
     * 
     * @return
     *     The Contact
     */
    @JsonProperty("Contact")
    public List<org.ogf.glue2.Contact> getContact() {
        return Contact;
    }

    /**
     * 
     * @param Contact
     *     The Contact
     */
    @JsonProperty("Contact")
    public void setContact(List<org.ogf.glue2.Contact> Contact) {
        this.Contact = Contact;
    }

    /**
     * 
     * @return
     *     The DataStore
     */
    @JsonProperty("DataStore")
    public List<org.ogf.glue2.DataStore> getDataStore() {
        return DataStore;
    }

    /**
     * 
     * @param DataStore
     *     The DataStore
     */
    @JsonProperty("DataStore")
    public void setDataStore(List<org.ogf.glue2.DataStore> DataStore) {
        this.DataStore = DataStore;
    }

    /**
     * 
     * @return
     *     The Domain
     */
    @JsonProperty("Domain")
    public List<org.ogf.glue2.Domain> getDomain() {
        return Domain;
    }

    /**
     * 
     * @param Domain
     *     The Domain
     */
    @JsonProperty("Domain")
    public void setDomain(List<org.ogf.glue2.Domain> Domain) {
        this.Domain = Domain;
    }

    /**
     * 
     * @return
     *     The Endpoint
     */
    @JsonProperty("Endpoint")
    public List<org.ogf.glue2.Endpoint> getEndpoint() {
        return Endpoint;
    }

    /**
     * 
     * @param Endpoint
     *     The Endpoint
     */
    @JsonProperty("Endpoint")
    public void setEndpoint(List<org.ogf.glue2.Endpoint> Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * 
     * @return
     *     The Entity
     */
    @JsonProperty("Entity")
    public List<org.ogf.glue2.Entity> getEntity() {
        return Entity;
    }

    /**
     * 
     * @param Entity
     *     The Entity
     */
    @JsonProperty("Entity")
    public void setEntity(List<org.ogf.glue2.Entity> Entity) {
        this.Entity = Entity;
    }

    /**
     * 
     * @return
     *     The ExecutionEnvironment
     */
    @JsonProperty("ExecutionEnvironment")
    public List<org.ogf.glue2.ExecutionEnvironment> getExecutionEnvironment() {
        return ExecutionEnvironment;
    }

    /**
     * 
     * @param ExecutionEnvironment
     *     The ExecutionEnvironment
     */
    @JsonProperty("ExecutionEnvironment")
    public void setExecutionEnvironment(List<org.ogf.glue2.ExecutionEnvironment> ExecutionEnvironment) {
        this.ExecutionEnvironment = ExecutionEnvironment;
    }

    /**
     * 
     * @return
     *     The Location
     */
    @JsonProperty("Location")
    public List<org.ogf.glue2.Location> getLocation() {
        return Location;
    }

    /**
     * 
     * @param Location
     *     The Location
     */
    @JsonProperty("Location")
    public void setLocation(List<org.ogf.glue2.Location> Location) {
        this.Location = Location;
    }

    /**
     * 
     * @return
     *     The Manager
     */
    @JsonProperty("Manager")
    public List<org.ogf.glue2.Manager> getManager() {
        return Manager;
    }

    /**
     * 
     * @param Manager
     *     The Manager
     */
    @JsonProperty("Manager")
    public void setManager(List<org.ogf.glue2.Manager> Manager) {
        this.Manager = Manager;
    }

    /**
     * 
     * @return
     *     The MappingPolicy
     */
    @JsonProperty("MappingPolicy")
    public List<org.ogf.glue2.MappingPolicy> getMappingPolicy() {
        return MappingPolicy;
    }

    /**
     * 
     * @param MappingPolicy
     *     The MappingPolicy
     */
    @JsonProperty("MappingPolicy")
    public void setMappingPolicy(List<org.ogf.glue2.MappingPolicy> MappingPolicy) {
        this.MappingPolicy = MappingPolicy;
    }

    /**
     * 
     * @return
     *     The Policy
     */
    @JsonProperty("Policy")
    public List<org.ogf.glue2.Policy> getPolicy() {
        return Policy;
    }

    /**
     * 
     * @param Policy
     *     The Policy
     */
    @JsonProperty("Policy")
    public void setPolicy(List<org.ogf.glue2.Policy> Policy) {
        this.Policy = Policy;
    }

    /**
     * 
     * @return
     *     The Resource
     */
    @JsonProperty("Resource")
    public List<org.ogf.glue2.Resource> getResource() {
        return Resource;
    }

    /**
     * 
     * @param Resource
     *     The Resource
     */
    @JsonProperty("Resource")
    public void setResource(List<org.ogf.glue2.Resource> Resource) {
        this.Resource = Resource;
    }

    /**
     * 
     * @return
     *     The Service
     */
    @JsonProperty("Service")
    public List<org.ogf.glue2.Service> getService() {
        return Service;
    }

    /**
     * 
     * @param Service
     *     The Service
     */
    @JsonProperty("Service")
    public void setService(List<org.ogf.glue2.Service> Service) {
        this.Service = Service;
    }

    /**
     * 
     * @return
     *     The Share
     */
    @JsonProperty("Share")
    public List<org.ogf.glue2.Share> getShare() {
        return Share;
    }

    /**
     * 
     * @param Share
     *     The Share
     */
    @JsonProperty("Share")
    public void setShare(List<org.ogf.glue2.Share> Share) {
        this.Share = Share;
    }

    /**
     * 
     * @return
     *     The StorageAccessProtocol
     */
    @JsonProperty("StorageAccessProtocol")
    public List<org.ogf.glue2.StorageAccessProtocol> getStorageAccessProtocol() {
        return StorageAccessProtocol;
    }

    /**
     * 
     * @param StorageAccessProtocol
     *     The StorageAccessProtocol
     */
    @JsonProperty("StorageAccessProtocol")
    public void setStorageAccessProtocol(List<org.ogf.glue2.StorageAccessProtocol> StorageAccessProtocol) {
        this.StorageAccessProtocol = StorageAccessProtocol;
    }

    /**
     * 
     * @return
     *     The StorageEndpoint
     */
    @JsonProperty("StorageEndpoint")
    public List<org.ogf.glue2.StorageEndpoint> getStorageEndpoint() {
        return StorageEndpoint;
    }

    /**
     * 
     * @param StorageEndpoint
     *     The StorageEndpoint
     */
    @JsonProperty("StorageEndpoint")
    public void setStorageEndpoint(List<org.ogf.glue2.StorageEndpoint> StorageEndpoint) {
        this.StorageEndpoint = StorageEndpoint;
    }

    /**
     * 
     * @return
     *     The StorageManager
     */
    @JsonProperty("StorageManager")
    public List<org.ogf.glue2.StorageManager> getStorageManager() {
        return StorageManager;
    }

    /**
     * 
     * @param StorageManager
     *     The StorageManager
     */
    @JsonProperty("StorageManager")
    public void setStorageManager(List<org.ogf.glue2.StorageManager> StorageManager) {
        this.StorageManager = StorageManager;
    }

    /**
     * 
     * @return
     *     The StorageService
     */
    @JsonProperty("StorageService")
    public List<org.ogf.glue2.StorageService> getStorageService() {
        return StorageService;
    }

    /**
     * 
     * @param StorageService
     *     The StorageService
     */
    @JsonProperty("StorageService")
    public void setStorageService(List<org.ogf.glue2.StorageService> StorageService) {
        this.StorageService = StorageService;
    }

    /**
     * 
     * @return
     *     The StorageServiceCapacity
     */
    @JsonProperty("StorageServiceCapacity")
    public List<org.ogf.glue2.StorageServiceCapacity> getStorageServiceCapacity() {
        return StorageServiceCapacity;
    }

    /**
     * 
     * @param StorageServiceCapacity
     *     The StorageServiceCapacity
     */
    @JsonProperty("StorageServiceCapacity")
    public void setStorageServiceCapacity(List<org.ogf.glue2.StorageServiceCapacity> StorageServiceCapacity) {
        this.StorageServiceCapacity = StorageServiceCapacity;
    }

    /**
     * 
     * @return
     *     The StorageShare
     */
    @JsonProperty("StorageShare")
    public List<org.ogf.glue2.StorageShare> getStorageShare() {
        return StorageShare;
    }

    /**
     * 
     * @param StorageShare
     *     The StorageShare
     */
    @JsonProperty("StorageShare")
    public void setStorageShare(List<org.ogf.glue2.StorageShare> StorageShare) {
        this.StorageShare = StorageShare;
    }

    /**
     * 
     * @return
     *     The StorageShareCapacity
     */
    @JsonProperty("StorageShareCapacity")
    public List<org.ogf.glue2.StorageShareCapacity> getStorageShareCapacity() {
        return StorageShareCapacity;
    }

    /**
     * 
     * @param StorageShareCapacity
     *     The StorageShareCapacity
     */
    @JsonProperty("StorageShareCapacity")
    public void setStorageShareCapacity(List<org.ogf.glue2.StorageShareCapacity> StorageShareCapacity) {
        this.StorageShareCapacity = StorageShareCapacity;
    }

    /**
     * 
     * @return
     *     The ToComputingService
     */
    @JsonProperty("ToComputingService")
    public List<org.ogf.glue2.ToComputingService> getToComputingService() {
        return ToComputingService;
    }

    /**
     * 
     * @param ToComputingService
     *     The ToComputingService
     */
    @JsonProperty("ToComputingService")
    public void setToComputingService(List<org.ogf.glue2.ToComputingService> ToComputingService) {
        this.ToComputingService = ToComputingService;
    }

    /**
     * 
     * @return
     *     The ToStorageService
     */
    @JsonProperty("ToStorageService")
    public List<org.ogf.glue2.ToStorageService> getToStorageService() {
        return ToStorageService;
    }

    /**
     * 
     * @param ToStorageService
     *     The ToStorageService
     */
    @JsonProperty("ToStorageService")
    public void setToStorageService(List<org.ogf.glue2.ToStorageService> ToStorageService) {
        this.ToStorageService = ToStorageService;
    }

    /**
     * 
     * @return
     *     The UserDomain
     */
    @JsonProperty("UserDomain")
    public List<org.ogf.glue2.UserDomain> getUserDomain() {
        return UserDomain;
    }

    /**
     * 
     * @param UserDomain
     *     The UserDomain
     */
    @JsonProperty("UserDomain")
    public void setUserDomain(List<org.ogf.glue2.UserDomain> UserDomain) {
        this.UserDomain = UserDomain;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(AccessPolicy).append(Activity).append(AdminDomain).append(ApplicationEnvironment).append(ApplicationHandle).append(Benchmark).append(ComputingActivity).append(ComputingEndpoint).append(ComputingManager).append(ComputingService).append(ComputingShare).append(Contact).append(DataStore).append(Domain).append(Endpoint).append(Entity).append(ExecutionEnvironment).append(Location).append(Manager).append(MappingPolicy).append(Policy).append(Resource).append(Service).append(Share).append(StorageAccessProtocol).append(StorageEndpoint).append(StorageManager).append(StorageService).append(StorageServiceCapacity).append(StorageShare).append(StorageShareCapacity).append(ToComputingService).append(ToStorageService).append(UserDomain).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Glue2) == false) {
            return false;
        }
        Glue2 rhs = ((Glue2) other);
        return new EqualsBuilder().append(AccessPolicy, rhs.AccessPolicy).append(Activity, rhs.Activity).append(AdminDomain, rhs.AdminDomain).append(ApplicationEnvironment, rhs.ApplicationEnvironment).append(ApplicationHandle, rhs.ApplicationHandle).append(Benchmark, rhs.Benchmark).append(ComputingActivity, rhs.ComputingActivity).append(ComputingEndpoint, rhs.ComputingEndpoint).append(ComputingManager, rhs.ComputingManager).append(ComputingService, rhs.ComputingService).append(ComputingShare, rhs.ComputingShare).append(Contact, rhs.Contact).append(DataStore, rhs.DataStore).append(Domain, rhs.Domain).append(Endpoint, rhs.Endpoint).append(Entity, rhs.Entity).append(ExecutionEnvironment, rhs.ExecutionEnvironment).append(Location, rhs.Location).append(Manager, rhs.Manager).append(MappingPolicy, rhs.MappingPolicy).append(Policy, rhs.Policy).append(Resource, rhs.Resource).append(Service, rhs.Service).append(Share, rhs.Share).append(StorageAccessProtocol, rhs.StorageAccessProtocol).append(StorageEndpoint, rhs.StorageEndpoint).append(StorageManager, rhs.StorageManager).append(StorageService, rhs.StorageService).append(StorageServiceCapacity, rhs.StorageServiceCapacity).append(StorageShare, rhs.StorageShare).append(StorageShareCapacity, rhs.StorageShareCapacity).append(ToComputingService, rhs.ToComputingService).append(ToStorageService, rhs.ToStorageService).append(UserDomain, rhs.UserDomain).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
