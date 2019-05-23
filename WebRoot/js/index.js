$(function(){
	    $("#login_submit").click(function(){
	      if(checkInput()){
	        $("form").action("../../src/LoginServlet");
	      }else{
	        return false;
	      }
	    });
	  });