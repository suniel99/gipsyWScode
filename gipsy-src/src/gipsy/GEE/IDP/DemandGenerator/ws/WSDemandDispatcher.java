package gipsy.GEE.IDP.DemandGenerator.ws;

import gipsy.GEE.IDP.DMSException;
import gipsy.GEE.IDP.ITransportAgent;
import gipsy.GEE.IDP.DemandDispatcher.DemandDispatcher;
import gipsy.GEE.IDP.DemandDispatcher.DemandDispatcherException;

import gipsy.GEE.IDP.demands.DemandSignature;
import gipsy.GEE.IDP.demands.DemandState;
import gipsy.GEE.IDP.demands.IDemand;
import gipsy.util.NetUtils;
import gipsy.util.Trace;

import java.io.Serializable;

import marf.util.Debug;
import net.jini.core.lease.Lease;
import net.jini.id.Uuid;
import net.jini.id.UuidFactory;
import net.jini.space.JavaSpace;

public class WSDemandDispatcher 
extends DemandDispatcher 
implements IWSDemandDispatcher
{

}
