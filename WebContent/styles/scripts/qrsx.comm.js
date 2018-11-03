 /**left aboutus*/
 function stepUserCenterAction(step){
	   $(".grey_bg").find('a').each(function(){
	      var flag = $(this).attr('objflag');
		  if(step == flag){
			   $(this).parent().removeClass('grey_bg');
			   $(this).parent().addClass('orange_bg');
		  }
	  });
	   $(".left_sub").find('a').each(function(){
		      var flag = $(this).attr('objflag');
			  if(step == flag){
				   $(this).parent().removeClass('left_sub_bg');
				   $(this).parent().addClass('left_sub_bg');
			  }
		  });
  } 
