function doChange(){
	  $("#myTable tr td:nth-child(5)").each(function (key, value) {  
			var twovalue = $(this).text();
			//alert(twovalue);
     		var onevalue = $("#mySelect").val();
 
     		//alert("twovalue:"+twovalue);
     		//alert(onevalue);
     		if( twovalue!=  onevalue){
     		    var n = $(this).parents("tr").index()+1;  // 获取checkbox所在行的顺序
     
              $("#myTable").find("tr:eq("+n+")").hide(); 
				//this.style.display = 'none'; 
			}
			else
			{
			    var n = $(this).parents("tr").index()+1;  // 获取checkbox所在行的顺序
              $("#myTable").find("tr:eq("+n+")").show(); 
              //alert("no");
			}
			

		});  

}
