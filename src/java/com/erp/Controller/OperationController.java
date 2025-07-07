
package com.erp.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;      
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.erp.Model.Operation;
import com.erp.Service.OperationService;
@RestController
@RequestMapping("/operation")
public class OperationController {

	@Autowired
	private OperationService operationService;
	
	/*<-----------------Create District------------------>*/
	@ResponseBody
	@RequestMapping(value = "adddistrict", method = { RequestMethod.POST })
	public Response adddistrict(@RequestBody Operation operationModel)
	{
		return operationService.adddistrict(operationModel);
	} 
	@ResponseBody
	@RequestMapping(value = "getAlldistrict", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAlldistrict()
	{
		return operationService.getAlldistrict();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIddistrict", method = { RequestMethod.POST })
	public Response getByIddistrict(@RequestBody String district_name)  
	{
		return operationService.getByIddistrict(district_name);
	}	
	@ResponseBody
	@RequestMapping(value = "removeDatadistrict", method = { RequestMethod.POST })
	public Response removedistrict(@RequestBody String district_name)
	{
		return operationService.removedistrict( district_name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDatadistrict", method = { RequestMethod.POST })
	public Response updateDatadistrict(@RequestBody Operation user)
	{
		return operationService.updateDatadistrict(user);
	}
	
	
	
	
	
	
	
	
	
	
	

	/*<-----------------Create Item Group------------------>*/
	@ResponseBody
	@RequestMapping(value = "additemgroup", method = { RequestMethod.POST })
	public Response additemgroup(@RequestBody Operation operationModel)
	{
		return operationService.additemgroup(operationModel);
	}	 
	@ResponseBody
	@RequestMapping(value = "getAllitemgroup", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllitemgroup()
	{
		return operationService.getAllitemgroup();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIditemgroup", method = { RequestMethod.POST })
	public Response getByIditemgroup(@RequestBody String group_name)  
	{
		return operationService.getByIditemgroup(group_name);
	}
	@ResponseBody
	@RequestMapping(value = "removeDataitemgroup", method = { RequestMethod.POST })
	public Response removeitemgroup(@RequestBody String group_name)
	{
		return operationService.removeitemgroup(group_name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataitemgroup", method = { RequestMethod.POST })
	public Response updateDataitemgroup(@RequestBody Operation  group)
	{
		return operationService.updateDataitemgroup(group);
	}

	
	
	/*<-----------------Create Item Name------------------>*/
	@ResponseBody
	@RequestMapping(value = "additemname", method = { RequestMethod.POST })
	public Response additemname(@RequestBody Operation operationModel)
	{
		return operationService.additemname(operationModel);
	}	 
	@ResponseBody
	@RequestMapping(value = "getAllitemname", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllitemname()
	{
		return operationService.getAllitemname();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIditemname", method = { RequestMethod.POST })
	public Response getByIditemname(@RequestBody String item_name)  
	{
		return operationService.getByIditemname(item_name);
	}	
	@ResponseBody
	@RequestMapping(value = "removeDataitemname", method = { RequestMethod.POST })
	public Response removeitemname(@RequestBody String item_name)
	{
		return operationService.removeitemname(item_name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataitemname", method = { RequestMethod.POST })
	public Response updateDataitemname(@RequestBody Operation item)
	{
		return operationService.updateDataitemname(item);
	}

	@ResponseBody
	@RequestMapping(value = "getItemgroups", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getItemgroups()
	{
		return operationService.getItemgroups();
	}
	
	
	
	
	
	/*<-----------------Create constituency------------------>*/
	
	
	@ResponseBody
	@RequestMapping(value = "getdistricts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getdistricts()
	{
		return operationService.getdistricts();
	}
	
	@ResponseBody
	@RequestMapping(value = "addconstituency", method = { RequestMethod.POST })
	public Response addconstituency(@RequestBody Operation operationModel)
	{
		return operationService.addconstituency(operationModel);
	}
	@ResponseBody
	@RequestMapping(value = "getAllconstituency", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllconstituency()
	{
		return operationService.getAllconstituency();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIdconstituency", method = { RequestMethod.POST })
	public Response getByIdconstituency(@RequestBody String name)  
	{
		return operationService.getByIdconstituency(name);
	}
	@ResponseBody
	@RequestMapping(value = "removeDataconstituency", method = { RequestMethod.POST })
	public Response removeconstituency(@RequestBody String name)
	{
		return operationService.removeconstituency(name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataconstituency", method = { RequestMethod.POST })
	public Response updateDataconstituency(@RequestBody Operation cons)
	{
		return operationService.updateDataconstituency(cons);
	}

	
	/*<-----------------Create Mandal------------------>*/
	
	@ResponseBody
	@RequestMapping(value = "getConstituencys", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getConstituencys()
	{
		return operationService.getConstituencys();
	}
	@ResponseBody
	@RequestMapping(value = "addmandal", method = { RequestMethod.POST })
	public Response addmandal(@RequestBody Operation operationModel)
	{
		return operationService.addmandal(operationModel);
	}	 
	@ResponseBody
	@RequestMapping(value = "getAllmandal", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllmandal()
	{
		return operationService.getAllmandal();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIdmandal", method = { RequestMethod.POST })
	public Response getByIdmandal(@RequestBody String mandal_name)  
	{
		return operationService.getByIdmandal(mandal_name);
	}
	@ResponseBody
	@RequestMapping(value = "removeDatamandal", method = { RequestMethod.POST })
	public Response removemandal(@RequestBody String mandal_name)
	{
		return operationService.removemandal(mandal_name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDatamandal", method = { RequestMethod.POST })
	public Response updateDatamandal(@RequestBody Operation  mandal)
	{
		return operationService.updateDatamandal(mandal);
	}

	
	
	
	/*<-----------------Create Location------------------>*/
	@ResponseBody
	@RequestMapping(value = "getMandals", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMandals()
	{
		return operationService.getMandals();
	}  
	@ResponseBody
	@RequestMapping(value = "addlocation", method = { RequestMethod.POST })
	public Response addlocation(@RequestBody Operation operationModel)
	{
		return operationService.addlocation(operationModel);
	}
	@ResponseBody
	@RequestMapping(value = "getAlllocation", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAlllocation()
	{
		return operationService.getAlllocation();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIdlocation", method = { RequestMethod.POST })
	public Response getByIdlocation(@RequestBody String location_name)  
	{
		return operationService.getByIdlocation(location_name);
	}
	@ResponseBody
	@RequestMapping(value = "removeDatalocation", method = { RequestMethod.POST })
	public Response removelocation(@RequestBody String location_name)
	{
		return operationService.removelocation(location_name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDatalocation", method = { RequestMethod.POST })
	public Response updateDatalocation(@RequestBody Operation  location)
	{
		return operationService.updateDatalocation(location);
	}

	
	

	/*<-----------------Create Ledger Heads------------------>*/
	@ResponseBody
	@RequestMapping(value = "addledgerhead", method = { RequestMethod.POST })
	public Response addledgerhead(@RequestBody Operation operationModel)
	{
		return operationService.addledgerhead(operationModel);
	} 
	@ResponseBody
	@RequestMapping(value = "getAllledgerhead", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllledgerhead()
	{
		return operationService.getAllledgerhead();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIdledgerhead", method = { RequestMethod.POST })
	public Response getByIdledgerhead(@RequestBody String name)  
	{
		return operationService.getByIdledgerhead(name);
	}	
	@ResponseBody
	@RequestMapping(value = "removeDataledgerhead", method = { RequestMethod.POST })
	public Response removeledgerhead(@RequestBody String name)
	{
		return operationService.removeledgerhead(name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataledgerhead", method = { RequestMethod.POST })
	public Response updateDataledgerhead(@RequestBody Operation user)
	{
		return operationService.updateDataledgerhead(user);
	}

	
	

	/*<-----------------Create Asset Class------------------>*/
	@ResponseBody
	@RequestMapping(value = "getglaccounts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getglaccounts()
	{
		return operationService.getglaccounts();
	}	
	@ResponseBody
	@RequestMapping(value = "addassetclass", method = { RequestMethod.POST })
	public Response addassetclass(@RequestBody Operation operationModel)
	{
		return operationService.addassetclass(operationModel);
	} 
	@ResponseBody
	@RequestMapping(value = "getAllassetclass", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllassetclass()
	{
		return operationService.getAllassetclass();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIdassetclass", method = { RequestMethod.POST })
	public Response getByIdassetclass(@RequestBody String name)  
	{
		return operationService.getByIdassetclass(name);
	}	
	@ResponseBody
	@RequestMapping(value = "removeDatassetclass", method = { RequestMethod.POST })
	public Response removeassetclass(@RequestBody String name)
	{
		return operationService.removeassetclass(name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataassetclass", method = { RequestMethod.POST })
	public Response updateDataassetclass(@RequestBody Operation name)
	{
		return operationService.updateDataassetclass(name);
	}

	
	/*<-----------------Create Asset Name------------------>*/
	
	@ResponseBody
	@RequestMapping(value = "getassetclass", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getassetclass()
	{
		return operationService.getassetclass();
	}	
	@ResponseBody
	@RequestMapping(value = "addassetname", method = { RequestMethod.POST })
	public Response addassetname(@RequestBody Operation operationModel)
	{
		return operationService.addassetname(operationModel);
	} 
	@ResponseBody
	@RequestMapping(value = "getAllassetname", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllassetname()
	{
		return operationService.getAllassetname();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIdassetname", method = { RequestMethod.POST })
	public Response getByIdassetname(@RequestBody String asset_name)  
	{
		return operationService.getByIdassetname(asset_name);
	}	
	@ResponseBody
	@RequestMapping(value = "removeDatassetname", method = { RequestMethod.POST })
	public Response removeassetname(@RequestBody String asset_name)
	{
		return operationService.removeassetname(asset_name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataassetname", method = { RequestMethod.POST })
	public Response updateDataassetname(@RequestBody Operation name)
	{
		return operationService.updateDataassetname(name);
	}

	
	/*<-----------------Create Asset Nature------------------>*/

	
	@ResponseBody
	@RequestMapping(value = "addassetnature", method = { RequestMethod.POST })
	public Response addassetnature(@RequestBody Operation operationModel)
	{
		return operationService.addassetnature(operationModel);
	} 
	@ResponseBody
	@RequestMapping(value = "getAllassetnature", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllassetnature()
	{
		return operationService.getAllassetnature();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIdassetnature", method = { RequestMethod.POST })
	public Response getByIdassetnature(@RequestBody String name)  
	{
		return operationService.getByIdassetnature(name);
	}	
	@ResponseBody
	@RequestMapping(value = "removeDatassetnature", method = { RequestMethod.POST })
	public Response removeassetnature(@RequestBody String name)
	{
		return operationService.removeassetnature(name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataassetnature", method = { RequestMethod.POST })
	public Response updateDataassetnature(@RequestBody Operation name)
	{
		return operationService.updateDataassetnature(name);
	}


	/*<-----------------Create Asset Group------------------>*/
	
	@ResponseBody
	@RequestMapping(value = "getassetnature", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getassetnature()
	{
		return operationService.getassetnature();
	}	
	@ResponseBody
	@RequestMapping(value = "addassetgroup", method = { RequestMethod.POST })
	public Response addassetgroup(@RequestBody Operation operationModel)
	{
		return operationService.addassetgroup(operationModel);
	} 
	@ResponseBody
	@RequestMapping(value = "getAllassetgroup", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllassetgroup()
	{
		return operationService.getAllassetgroup();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIdassetgroup", method = { RequestMethod.POST })
	public Response getByIdassetgroup(@RequestBody String group_name)  
	{
		return operationService.getByIdassetgroup(group_name);
	}	
	@ResponseBody
	@RequestMapping(value = "removeDatassetgroup", method = { RequestMethod.POST })
	public Response removeassetgroup(@RequestBody String group_name)
	{
		return operationService.removeassetgroup(group_name);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataassetgroup", method = { RequestMethod.POST })
	public Response updateDataassetgroup(@RequestBody Operation name)
	{
		return operationService.updateDataassetgroup(name);
	}

	
	}