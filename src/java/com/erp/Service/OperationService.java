
package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;

import com.erp.DAO.OperationDAO;
import com.erp.Model.Operation;

@Service
public class OperationService  {
	@Autowired
	private OperationDAO operationDAO;

	Response response = new Response();
	
	
/*	-------------Create District---------------*/
	public Response adddistrict(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.adddistrict(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIddistrict(String district_name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIddistrict(district_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAlldistrict() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAlldistrict();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response removedistrict(String district_name)
	{
		response.setSuccessful(false);
		operationDAO.removedistrict(district_name);
		response.setSuccessful(true);
		response.setResponseObject(district_name);
		return response;
	}	
	public Response updateDatadistrict(Operation user)
	{
		response.setSuccessful(false);
		operationDAO.updateDatadistrict(user);
		response.setSuccessful(true);
		response.setResponseObject(user);
		return response;
	}
	
	
	
	
	
	
	
	
	
	
	/*	-------------Create Itemgroup---------------*/
	public Response additemgroup(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.additemgroup(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIditemgroup(String item_name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIditemgroup(item_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAllitemgroup() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAllitemgroup();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response removeitemgroup(String item_name)
	{
		response.setSuccessful(false);
		operationDAO.removeitemgroup(item_name);
		response.setSuccessful(true);
		response.setResponseObject(item_name);
		return response;
	}
    public Response updateDataitemgroup(Operation group)
	{
		response.setSuccessful(false);
		operationDAO.updateDataitemgroup(group);
		response.setSuccessful(true);
		response.setResponseObject(group);
		return response;
	}
	
	
	
	
	/*	-------------Create Item Name---------------*/
    public Response getItemgroups()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list =operationDAO.getItemgroups();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response additemname(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.additemname(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIditemname(String item_name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIditemname(item_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAllitemname() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAllitemname();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response removeitemname(String item_name)
	{
		response.setSuccessful(false);
		operationDAO.removeitemname(item_name);
		response.setSuccessful(true);
		response.setResponseObject(item_name);
		return response;
	}
	public Response updateDataitemname(Operation item)
	{
		response.setSuccessful(false);
		operationDAO.updateDataitemname(item);
		response.setSuccessful(true);
		response.setResponseObject(item);
		return response;
	}
	
	
	
	/*	-------------Create Constituency---------------*/
	
	
	public Response getdistricts()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list =operationDAO.getdistricts();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response addconstituency(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.addconstituency(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIdconstituency(String name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIdconstituency(name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAllconstituency() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAllconstituency();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response removeconstituency(String name)
	{
		response.setSuccessful(false);
		operationDAO.removeconstituency(name);
		response.setSuccessful(true);
		response.setResponseObject(name);
		return response;
	}
	public Response updateDataconstituency(Operation cons)
	{
		response.setSuccessful(false);
		operationDAO.updateDataconstituency(cons);
		response.setSuccessful(true);
		response.setResponseObject(cons);
		return response;
	}
	
	
	/*	-------------Create Mandal---------------*/
	
	public Response getConstituencys()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list =operationDAO.getConstituencys();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response addmandal(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.addmandal(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIdmandal(String mandal_name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIdmandal(mandal_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAllmandal() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAllmandal();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response removemandal(String mandal_name)
	{
		response.setSuccessful(false);
		operationDAO.removemandal(mandal_name);
		response.setSuccessful(true);
		response.setResponseObject(mandal_name);
		return response;
	}	
	public Response updateDatamandal(Operation mandal)
	{
		response.setSuccessful(false);
		operationDAO.updateDatamandal(mandal);
		response.setSuccessful(true);
		response.setResponseObject(mandal);
		return response;
	}
	
	

	/*	-------------Create Location---------------*/
	
	public Response getMandals() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getMandals();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response addlocation(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.addlocation(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIdlocation(String location_name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIdlocation(location_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAlllocation() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAlllocation();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response removelocation(String location_name)
	{
		response.setSuccessful(false);
		operationDAO.removelocation(location_name);
		response.setSuccessful(true);
		response.setResponseObject(location_name);
		return response;
	}	
	public Response updateDatalocation(Operation location)
	{
		response.setSuccessful(false);
		operationDAO.updateDatalocation(location);
		response.setSuccessful(true);
		response.setResponseObject(location);
		return response;
	}
	
	
	
	/*	-------------Create Ledger Head---------------*/
	public Response addledgerhead(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.addledgerhead(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIdledgerhead(String group_name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIdledgerhead(group_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAllledgerhead() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAllledgerhead();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response removeledgerhead(String group_name)
	{
		response.setSuccessful(false);
		operationDAO.removeledgerhead(group_name);
		response.setSuccessful(true);
		response.setResponseObject(group_name);
		return response;
	}
	public Response updateDataledgerhead(Operation group_name)
	{
		response.setSuccessful(false);
		operationDAO.updateDataledgerhead(group_name);
		response.setSuccessful(true);
		response.setResponseObject(group_name);
		return response;
	}
	
	/*	-------------Create Asset Class---------------*/
	public Response addassetclass(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.addassetclass(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIdassetclass(String name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIdassetclass(name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAllassetclass() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAllassetclass();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response removeassetclass(String name)
	{
		response.setSuccessful(false);
		operationDAO.removeassetclass(name);
		response.setSuccessful(true);
		response.setResponseObject(name);
		return response;
	}
	public Response updateDataassetclass(Operation name)
	{
		response.setSuccessful(false);
		operationDAO.updateDataassetclass(name);
		response.setSuccessful(true);
		response.setResponseObject(name);
		return response;
	}
	
	
	/*	-------------Create Asset Name---------------*/
	public Response getglaccounts()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list =operationDAO.getglaccounts();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response addassetname(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.addassetname(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIdassetname(String asset_name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIdassetname(asset_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAllassetname() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAllassetname();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response removeassetname(String asset_name)
	{
		response.setSuccessful(false);
		operationDAO.removeassetname(asset_name);
		response.setSuccessful(true);
		response.setResponseObject(asset_name);
		return response;
	}
	public Response updateDataassetname(Operation name)
	{
		response.setSuccessful(false);
		operationDAO.updateDataassetname(name);
		response.setSuccessful(true);
		response.setResponseObject(name);
		return response;
	}
	
	/*	-------------Create Asset Nature---------------*/
	public Response getassetclass()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list =operationDAO.getassetclass();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response addassetnature(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.addassetnature(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIdassetnature(String name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIdassetnature(name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAllassetnature() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAllassetnature();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response removeassetnature(String name)
	{
		response.setSuccessful(false);
		operationDAO.removeassetnature(name);
		response.setSuccessful(true);
		response.setResponseObject(name);
		return response;
	}
	public Response updateDataassetnature(Operation name)
	{
		response.setSuccessful(false);
		operationDAO.updateDataassetnature(name);
		response.setSuccessful(true);
		response.setResponseObject(name);
		return response;
	}
	
	
	/*	-------------Create Asset Group---------------*/
	public Response getassetnature()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list =operationDAO.getassetnature();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response addassetgroup(Operation operationModel) {
		response.setSuccessful(false);
		operationDAO.addassetgroup(operationModel);
		response.setSuccessful(true);
		response.setResponseObject(operationModel);
		return response;
	}
	public Response getByIdassetgroup(String group_name)
	{
		response.setSuccessful(false);
		Operation singleuserdetails = operationDAO.getByIdassetgroup(group_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAllassetgroup() {
		response.setSuccessful(false);
		List<Operation> userdetails = operationDAO.getAllassetgroup();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response removeassetgroup(String group_name)
	{
		response.setSuccessful(false);
		operationDAO.removeassetgroup(group_name);
		response.setSuccessful(true);
		response.setResponseObject(group_name);
		return response;
	}
	public Response updateDataassetgroup(Operation name)
	{
		response.setSuccessful(false);
		operationDAO.updateDataassetgroup(name);
		response.setSuccessful(true);
		response.setResponseObject(name);
		return response;
	}
	
	              
	
	           
}