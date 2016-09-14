/**
 *  jsonでリクエストする。
 * @param url
 * @param data
 * @param success
 * @param error
 * @returns
 */
function json(url,data,success,error){
	$.ajax({
	    type:"post",                
	    url:url,        
	    data:JSON.stringify(data), 
	    contentType: 'application/json', 
	    dataType: "json",           
	    success: function(data) {success(data);},
	    error: function(XMLHttpRequest, textStatus, errorThrown) {error(XMLHttpRequest,textStatus,errorThrown);}});
}

/**
 * toastを表示する。
 * http://kdemos.github.io/jquery-toast-plugin
 */
function showToast(type,text,afterHidden){
	var bgcolor = "";
	if("warning"==type){
		bgcolor = "#FF8B00";
	}else if("error"==type){
		bgcolor = "#FA5858";
	}else if("info"==type){
		bgcolor = "#333";
	}

	$.toast({ 
		text : text, 
		icon: type,
		showHideTransition : 'fade',  
		bgColor : bgcolor,  
		textColor : '#fff',
		allowToastClose : true, 
		hideAfter : 2000,
		stack : false,  
		textAlign : 'left',  
		position : 'mid-center',
		afterHidden:afterHidden
	});
}
	
/**
 * 反映を実行する。（画面リフレッシュ）
 */
function apply(call){
	setTimeout(call, 0);
}