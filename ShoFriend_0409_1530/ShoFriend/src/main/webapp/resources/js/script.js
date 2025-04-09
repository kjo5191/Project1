
function check_ok(){
				const p_pattern = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,15}$/;
				const e_pattern = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;

				if(reg_frm.name.value==""){
					alert("이름을 써주세요.");
					reg_frm.name.focus();
					return;
				}
				if(reg_frm.email.value.length == 0){
					alert("Email을 써주세요");
					reg_frm.email.focus();
					return;
				}if(false === e_pattern.test(reg_frm.email.value)){
					alert("유효한 이메일이 아닙니다.");
					reg_frm.email.focus();
					return;
				
				}if(reg_frm.password.value == 0){
					alert("비밀번호을 써주세요");
					reg_frm.password.focus();
					return;
						
				}if(false === p_pattern.test(reg_frm.password.value)){
					alert("비밀번호는 8자 이상이어야 하며, 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.");
					reg_frm.password.focus();
					return;
						
				}if(reg_frm.password.value != reg_frm.password_check.value){
					alert("패스워드가 일치하지 않습니다.");
					reg_frm.password_check.focus();
					return;
				
				}if(reg_frm.phone.value.length ==0){
					alert("연락처를 써주세요.");
					reg_frm.phone.focus();
					return;
				}if(reg_frm.address.value.length ==0){
					alert("주소를 써주세요.");
					reg_frm.address.focus();
					return;		
					}
					document.reg_frm.submit();
		}

function check_ok2(){
				const p_pattern = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,15}$/;
				const e_pattern = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;

				if(reg_frm2.name.value==""){
					alert("이름을 써주세요.");
					reg_frm2.name.focus();
					return;
				}
				if(reg_frm2.email.value.length == 0){
					alert("Email을 써주세요");
					reg_frm2.email.focus();
					return;
				}if(false === e_pattern.test(reg_frm2.email.value)){
					alert("유효한 이메일이 아닙니다.");
					reg_frm2.email.focus();
					return;
						
				}if(reg_frm2.password.value == 0){
					alert("비밀번호을 써주세요");
					reg_frm2.password.focus();
					return;
						
				}if(false === p_pattern.test(reg_frm2.password.value)){
					alert("비밀번호는 8자 이상이어야 하며, 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.");
					reg_frm2.password.focus();
					return;
						
				}if(reg_frm2.password.value != reg_frm2.password_check.value){
					alert("패스워드가 일치하지 않습니다.");
					reg_frm2.password_check.focus();
					return;
				
				}if(reg_frm2.phone.value.length ==0){
					alert("연락처를 써주세요.");
					reg_frm2.phone.focus();
					return;
				}
					document.reg_frm2.submit();
		}
		
function check_pwd() {
    if (pwd_frm.input_pwd.value.length == 0) {
        alert("비밀번호를 입력해주세요.");
        pwd_frm.input_pwd.focus();
        return;
    }
    document.pwd_frm.submit();
}



