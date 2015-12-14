
 function validation()
 {
	var msg = null;
	var contactname=document.enq.name.value;
	var name_exp=/^[A-Za-z\s]+$/;
	if(contactname=='')
	{
		document.enq.name.focus();
		msg = document.getElementsByClassName("name-error")[0];
		msg.style.display = "inline";
		return false;
	}
	else if(!contactname.match(name_exp))
	{
		document.enq.name.focus();
		msg = document.getElementsByClassName("name-error")[0];
		msg.style.display = "inline";
		return false;
	}
	
	var email=document.enq.email.value;
	//var email_exp=/^[A-Za-z0-9\.-_\$]+@[A-Za-z]+\.[a-z]{2,4}$/;
	var email_exp=/^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	if(email=='')
	{
		document.enq.email.focus();
		msg = document.getElementsByClassName("email-error")[0];
		msg.style.display = "inline";
		return false;
	}
	else if(!email.match(email_exp))
	{
		document.enq.email.focus();
		msg = document.getElementsByClassName("email-error")[0];
		msg.style.display = "inline";
		return false;
	}
	
	var message=document.enq.message.value;
	if(message=='')
	{
		document.enq.message.focus();
		msg = document.getElementsByClassName("comment-error")[0];
		msg.style.display = "inline";
		return false;
	}
    return true;
 }
