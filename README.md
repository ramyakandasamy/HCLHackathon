# HCLHackathonHackathon 


 


 


 

List of API’s


 

1.Newconnection  :Post -sireesha


 

Table name : user details 


 

Table columns


 

Request id - primary key (it should be sequence Id)


 


	
Email -not null
	Mobile number -not null
	FirstName
	LastName
	Request status
	Address
	SSN Number



 


 

2.GetPlan : GET -Ramya


 

Return : return the hardcoded plan details


 


 


 


 

Plan 1 : $50 unlimited plan

Plan 2 : $20 limited plan


 

Plan details 


 

Column


 

Plan id-primary key

Plan description 

Plan name 


 


 


 

Get the plan details 


 


 

Primary key : 


 


 


 


 

3.TrackRequest :GET :Ravi


 

Input parameter : request Id


 

Table : user table ,retrieve the status 


 

Return : Status: in progress , rejected ,approved 


 


 

4.AdminAPI :GET  -yazhi


 

Login -authentication 


 

This API should be only accessible to Admin


 

Method 1:getallNewRequest();


 

Method2 : getRequestId(requested);


 

Input parameter :request id 


 

Return : all the details in the user details -pending status


 


 


 


 

5.GetDocument or validate :GET -Rashmi


 

Validate the document and get the credit history 


 


 


 


 


 

6  changeStatus : PUT -sireesha


 

Input parameter : 


 

requestId

Status :

Comments


 


 

Return values :status (Approve ,rejected etc )


 


 


 


 


 

7.scheduler :Assign Mobile Number


 

Input parameter :requestID


 

Assign a mobile number 


 


 

8.AssignmobileNumber : 


 

Scheduler will assign  a mobile number 


 

Multithreading to improve performance .


 

Calling a external API ,get the mobile number and activate the mobile number.


 

Set the final status to “connection enabled”.


 


 

Table :plandetails 


 

Column 


 

requestId 

planID

mobileNumber
