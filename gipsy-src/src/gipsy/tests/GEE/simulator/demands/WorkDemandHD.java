package gipsy.tests.GEE.simulator.demands;

import gipsy.GEE.IDP.demands.DemandSignature;
import gipsy.GEE.IDP.demands.DemandState;
import gipsy.GEE.IDP.demands.IDemand;
import gipsy.GEE.IDP.demands.ProceduralDemand;
import gipsy.GEE.IDP.demands.TimeLine;
import gipsy.util.NetUtils;


/**
 * Class WorkDemandHD.
 * 
 * @author Emil Vassev
 * @author Serguei Mokhov
 * @since 1.0.0
 * @version 2.0.0, $Id: WorkDemandHD.java,v 1.14 2010/02/18 18:07:20 mokhov Exp $
 */
public class WorkDemandHD
extends ProceduralDemand
{
	/*
	 * ---------
	 * Constants
	 * ---------
	 */

	/**
	 * XXX: update with serialver.
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * ------------
	 * Data Members
	 * ------------
	 */

	/**
	 * XXX.
	 */
	private String strCreatorAddress;

//***************************************************************
//**** object lifetime
	
	/**
	 * Constructor by default.
	 * XXX.
	 */
	public WorkDemandHD() 
	{
	   this(null);
	}

   	/**
   	 * XXX.
   	 * @param poSignature XXX
   	 */
	public WorkDemandHD(DemandSignature poSignature) 
	{
		super(poSignature);

		addTimeLine("DGT");
		
		this.strCreatorAddress = NetUtils.getLocalIPAddress();
   	}

//***************************************************************
//**** local methods

//***************************************************************
//**** IDemand methods

   	@Override
	public void addTimeLine(TimeLine poTimeLine)
	{
   		// XXX: add to itself?
		poTimeLine.addTimeLine(poTimeLine);
	}

   	@Override
	public double getSize()
	{
		return 1;
	}
	
   	@Override
	public IDemand execute()
	{
		WorkResultHD oResult = new WorkResultHD(getSignature(), this.strCreatorAddress);
		oResult.setType(getType());
		oResult.setState(DemandState.COMPUTED);
		   
		oResult.setAccessNumber(getAccessNumber());
		oResult.addAccess();
		   
		oResult.addTimeLine(this.oTimeLine);
		oResult.addTimeLine("DWT");

		this.oWorkResult = oResult.getResult();
		return oResult;
	}
}

// EOF
