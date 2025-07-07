package com.erp.Service;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.andromeda.commons.model.Response;
import com.andromeda.commons.security.model.Employee;
import com.andromeda.commons.security.model.Login;
import com.andromeda.commons.util.IDGenerator;
import com.erp.DAO.SegmentDAO;
import com.erp.Model.Segment;

@Service
public class SegmentService {
	@Autowired
	private SegmentDAO segmentDAO;

	Response response = new Response();
	public Response add(Segment segmentModel) {
		response.setSuccessful(false);
		segmentDAO.add(segmentModel);
		response.setSuccessful(true);
		response.setResponseObject(segmentModel);
		return response;
	}
	public Response getById(String segment_name)
	{
		response.setSuccessful(false);
		Segment singleuserdetails = segmentDAO.getById(segment_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAll() {
		response.setSuccessful(false);
		List<Segment> userdetails = segmentDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response remove(String segment_name)
	{
		response.setSuccessful(false);
		segmentDAO.remove(segment_name);
		response.setSuccessful(true);
		response.setResponseObject(segment_name);
		return response;
	}

	
	public Response updateData(Segment segment)
	{
		response.setSuccessful(false);
		 segmentDAO.updateData( segment);
		response.setSuccessful(true);
		response.setResponseObject( segment);
		return response;
	}
	                 
}