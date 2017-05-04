
$(function() {
	var date = new Date();
    var d = date.getDate(),
            m = date.getMonth(),
            y = date.getFullYear();
            var mm; var dd;
    if(m+1<10)
    {
    	mm='0'+(m+1);
    }
    else
    {
    	mm=m+1;
    }
    if(d<10)
    {
    	dd='0'+d;
    }
    else
    {
    	dd=d;
    }
    
    $.ajax({  
            	url:"<%=request.getContextPath()%>/budget/showBudget",  
            	type:'post',  
           	    dataType: 'json',  
					data:'date='+mm+"/"+dd+"/"+y,
					//alert(data);
    			success:function(data){
     			if (data) 
     			{
						var n=0;
						$(data.data).each(function(index, row) {
						var start=row.budgetStart;
						var end =row.budgetEnd;
						var width=parseInt(row.budgetRate/row.budgetMoney*100);
						if(row.budgetRate>row.budgetMoney)
						   width=100;
						var percent=parseInt(row.budgetRate/row.budgetMoney*100);
						var color;
						var newRow;
						if(percent>=100)
						{
							//color=progress-bar-red;
							 newRow='<li><a href="#"><h3>'+row.categoryName+'<small class="pull-right">'+percent+'%</small></h3><div class="progress xs"><div class="progress-bar progress-bar-red" style="width:'+width+'%" role="progressbar" aria-valuenow="'+width+'" aria-valuemin="0" aria-valuemax="100"><span class="sr-only">'+width+'% Complete</span></div></div></a></li>';
						}
						else if(percent>=70)
						{
							newRow='<li><a href="#"><h3>'+row.categoryName+'<small class="pull-right">'+percent+'%</small></h3><div class="progress xs"><div class="progress-bar progress-bar-yellow" style="width:'+width+'%" role="progressbar" aria-valuenow="'+width+'" aria-valuemin="0" aria-valuemax="100"><span class="sr-only">'+width+'% Complete</span></div></div></a></li>';
							//color=progress-bar-yellow;
						}
						else
						{
							newRow='<li><a href="#"><h3>'+row.categoryName+'<small class="pull-right">'+percent+'%</small></h3><div class="progress xs"><div class="progress-bar progress-bar-aqua" style="width:'+width+'%" role="progressbar" aria-valuenow="'+width+'" aria-valuemin="0" aria-valuemax="100"><span class="sr-only">'+width+'% Complete</span></div></div></a></li>';
							//color=progress-bar-aqua;
						}
//var newRow='<tr><td>'+row.categoryName+'</td><td>'+start+'</td><td>'+end+'</td><td>'+row.budgetMoney+'</td><td>'+row.budgetRate+'</td><td><div class="progress progress-xs"><div class="progress-bar progress-bar-success" style="width:'+width+'%"></div></div></td><td><span class="badge bg-green">'+percent+'%</span></td></tr>';		
//			           $("#tablea").append(newRow);
						

						$("#todaybudget").append(newRow);
						n=n+1;
        				//alert(row.budgetRate);
        				// start: UnixToDate(row.budgetStart,true),
        				// end: UnixToDate(row.budgetEnd,false),
        				// backgroundColor: row.budgetColor, //yellow
                		// borderColor: row.budgetColor}; //yellow}
        				// event1.push(eventdata);
        				 //alert(UnixToDate(row.budgetEnd));
        				 //alert(UnixToDate(row.budgetStart));
        				 //alert(row.budgetColor);
        				////alert(row.budgetTitle);
    				});
    				$("#budgetnumber").html(n);
    				
     			}
    		 	else
     			{
     		  		alert("添加失败");   
     			}  
    			},        
   			 	error:function(data){              
    			} 
    		});     
});

