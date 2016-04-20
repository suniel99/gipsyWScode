package gipsy.GEE.IDP.DemandGenerator.ws;

import gipsy.GEE.IDP.DemandDispatcher.IDispatcherEntry;
import gipsy.GEE.IDP.demands.DemandSignature;
import gipsy.GEE.IDP.demands.DemandState;
import gipsy.GEE.IDP.demands.IDemand;

import java.io.Serializable;

import net.jini.entry.AbstractEntry;
import net.jini.id.Uuid;

public class WSDispatcherEntry extends AbstractEntry
implements IDispatcherEntry{/*
	 * ------------
	 * Data Members
	 * ------------
	 */

	@Deprecated // Replaced by DemandSignature
	public Uuid oUniqueID = null;
	
	// Properties for template matching
	public DemandSignature oSignature = null;
	public DemandState oDemandState = null;
	public String strDestination = null;
	
	/**
	 * The demand wrapped in thie entry
	 */
	public Serializable oDemand = null; 
	/*
	 * ---------------
	 * Object Lifetime
	 * ---------------
	 */

	/**
	 * Constructor.
	 */
	public WSDispatcherEntry() 
	{
		this.oSignature = null;
		this.oDemandState = null;
		this.strDestination = null;
		this.oDemand = null;
	}
    
	/**
	 * @param poID
	 */
	public WSDispatcherEntry(Uuid poID) 
	{
		this(poID, null);
	}
   
	/**
	 * @param poID
	 * @param poDemand
	 */
	public WSDispatcherEntry(Uuid poID, Serializable poDemand) 
	{
		// The demand's state is pending at par.
		this(poID, poDemand, DemandState.PENDING);
	}
   
	public WSDispatcherEntry(Uuid poID, Serializable poDemand, DemandState poDemandState) 
	{
		this.oUniqueID = poID;
		this.oDemand = poDemand;
		this.oDemandState = poDemandState;
	}
   
   /**
    * To be added after re-engineering.
    * XXX: UUID *is* the signature!
    * @param pstrSignature
    * @param poState
    */
   public WSDispatcherEntry(DemandSignature pstrSignature, DemandState poState)
   {
	   this.oSignature = pstrSignature;
	   this.oDemand = null;
	   this.oUniqueID = null;
	   this.oDemandState = poState;
   }
   
   /**
    * To be added after re-engineering.
    * XXX: UUID *is* the signature!
    * @param poDemand
    * @param poState
    */
   public WSDispatcherEntry(IDemand poDemand, DemandState poState)
   {
	   this.oUniqueID = null;
	   this.oDemand = poDemand;
	   this.oDemandState = poState;

	   if(poDemand != null)
	   {
		   this.oSignature = poDemand.getSignature();
	   }
	   else
	   {
		   this.oSignature = null;
	   }
   }

	@Override
	public String getDestination() 
	{
		//
		return null;
	}

	@Override
	public void setDestination(String pstrDestination) 
	{
		//
	}

}
