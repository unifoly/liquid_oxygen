const container = document.getElementsByClassName('container')[0];
const signIn = document.getElementById('sign-in');
const signUp = document.getElementById('sign-up');


signUp.onclick = function() {
    container.classList.add('active');
}

signIn.onclick = function() {
    container.classList.remove('active');
}

function Check(){
    var username = document.getElementById("username_register");
    var password = document.getElementById("password_register");
    var email = document.getElementById("email_register");
    if(username.value==""){
        alert("会不会打字");
        username.focus();
    }
    if(password.value==""){
        alert("密码都不输入？");
        password.focus();
    }
    if (email.value==""){
        alert("666，没邮箱去查看《信息技术》教材");
        email.focus();
    }
    if(username.value.indexOf(" ")!=-1){
        alert("演我呢！用户名留空格？");
        username.focus();
    }
    if(password.value.indexOf(" ")!=-1){
        alert("演我呢！密码留空格？");
        password.focus();
    }
    if(email.value.indexOf(" ")!=-1){
        alert("演我呢！邮箱留空格？");
       email.focus();
    }

    var check=/^[a-zA-Z0-9_-]+@([a-zA-Z0-9]+\.)+(com|cn|net|org)$/;
    if(check.test(email.value)){
        return true;
    }else{
        alert("你这邮箱什么格式啊（恼)");
        return false;
    }
}