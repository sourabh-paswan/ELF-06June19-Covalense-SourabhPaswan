window.onload = function(){
    
};

/* function validateForm(){
    let myEmail = document.forms[0].email.value;
    console.log(myEmail);
} */

function validateForm(){

    let myEmail = document.forms[0].email.value;
    let myPassword = document.forms[0].password.value;
    let mycPassword = document.forms[0].confirmpassword.value;


    if(mycPassword.length>6 &&myEmail.length>6 &&myPassword.length>6 &&(mycPassword===myPassword ){
        document.getElementById("myButton").disabled = false;
    }else{
        document.getElementById("myButton").disabled = true;
    }
}