package gipsy.GEE.IDP.DemandGenerator.ws;
import gipsy.Configuration;
import gipsy.GEE.IDP.DMSException;
import gipsy.GEE.IDP.ITransportAgent;
import gipsy.GEE.IDP.demands.DemandSignature;
import gipsy.GEE.IDP.demands.IDemand;

public interface IWSTransportAgent extends ITransportAgent {
	/**
	 * To get Demand stored in IDemand Object
	 *   
	 * @return IDemand object
	 * @throws RemoteException, DMSException 
	 */
	public IDemand fetchDemand()
	throws DMSException;
	
	/**
	 * To get Demand if it Exists in IDemand Object
	 *   
	 * @return IDemand object
	 * @throws RemoteException, DMSException 
	 */
	public IDemand fetchDemandIfExists() 
	throws DMSException;

	/**
	 * To get Demand by providing the name of it
	 *   
	 * @param pstrDestination
	 * @return IDemand object 
	 * @throws RemoteException, DMSException 
	 */
	public IDemand fetchDemand(String pstrDestination) 
	throws DMSException;

	/**
	 * To get the result
	 * 
	 * @param poSignature
	 * @return IDemand object
	 * @throws RemoteException, DMSException 
	 */
	public IDemand fetchResult(DemandSignature poSignature)
	throws DMSException;

	/**
	 * To get the result if it exists
	 * 
	 * @param poSignature
	 * @return IDemand object
	 * @throws RemoteException, DMSException 
	 */
	public IDemand fetchResultIfExists(DemandSignature poSignature)
	throws DMSException;

	/**
	 * Carries the demand
	 * 
	 * @param poDemand
	 * @return DemandSignature object
	 * @throws RemoteException, DMSException 
	 */
	public DemandSignature carryDemand(IDemand poDemand)
	throws DMSException;

	/**
	 * Carries the demand result
	 * 
	 * @param poResult
	 * @return DemandSignature object
	 * @throws RemoteException, DMSException 
	 */
    public DemandSignature carryResult(IDemand poResult) 
	throws DMSException;    
	
	/**
	 * Get the configuration 
	 * 
	 */
	public Configuration getConfiguration();
}
